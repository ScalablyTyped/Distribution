package typings.pulumiAws.getEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEndpointResult extends js.Object {
  /**
    * The endpoint based on `endpointType`:
    * * No `endpointType`: Either `iot:Data` or `iot:Data-ATS` [depending on region](https://aws.amazon.com/blogs/iot/aws-iot-core-ats-endpoints/)
    * * `iot:CredentialsProvider`: `IDENTIFIER.credentials.iot.REGION.amazonaws.com`
    * * `iot:Data`: `IDENTIFIER.iot.REGION.amazonaws.com`
    * * `iot:Data-ATS`: `IDENTIFIER-ats.iot.REGION.amazonaws.com`
    * * `iot:Job`: `IDENTIFIER.jobs.iot.REGION.amazonaws.com`
    */
  val endpointAddress: String = js.native
  val endpointType: js.UndefOr[String] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
}

object GetEndpointResult {
  @scala.inline
  def apply(endpointAddress: String, id: String, endpointType: String = null): GetEndpointResult = {
    val __obj = js.Dynamic.literal(endpointAddress = endpointAddress.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (endpointType != null) __obj.updateDynamic("endpointType")(endpointType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEndpointResult]
  }
}

