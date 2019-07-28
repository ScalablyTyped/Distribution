package typings.atPulumiAws.iotGetEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEndpointResult extends js.Object {
  /**
    * The endpoint based on `endpoint_type`:
    * * No `endpoint_type`: Either `iot:Data` or `iot:Data-ATS` [depending on region](https://aws.amazon.com/blogs/iot/aws-iot-core-ats-endpoints/)
    * * `iot:CredentialsProvider`: `IDENTIFIER.credentials.iot.REGION.amazonaws.com`
    * * `iot:Data`: `IDENTIFIER.iot.REGION.amazonaws.com`
    * * `iot:Data-ATS`: `IDENTIFIER-ats.iot.REGION.amazonaws.com`
    * * `iot:Job`: `IDENTIFIER.jobs.iot.REGION.amazonaws.com`
    */
  val endpointAddress: String
  val endpointType: js.UndefOr[String] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
}

object GetEndpointResult {
  @scala.inline
  def apply(endpointAddress: String, id: String, endpointType: String = null): GetEndpointResult = {
    val __obj = js.Dynamic.literal(endpointAddress = endpointAddress, id = id)
    if (endpointType != null) __obj.updateDynamic("endpointType")(endpointType)
    __obj.asInstanceOf[GetEndpointResult]
  }
}

