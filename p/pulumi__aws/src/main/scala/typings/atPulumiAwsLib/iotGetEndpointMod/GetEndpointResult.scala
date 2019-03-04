package typings
package atPulumiAwsLib.iotGetEndpointMod

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
  val endpointAddress: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
}

object GetEndpointResult {
  @scala.inline
  def apply(endpointAddress: java.lang.String, id: java.lang.String): GetEndpointResult = {
    val __obj = js.Dynamic.literal(endpointAddress = endpointAddress, id = id)
  
    __obj.asInstanceOf[GetEndpointResult]
  }
}

