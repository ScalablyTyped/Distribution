package typings
package atPulumiAwsLib.iotGetEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEndpointArgs extends js.Object {
  /**
    * Endpoint type. Valid values: `iot:CredentialProvider`, `iot:Data`, `iot:Data-ATS`, `iot:Job`.
    */
  val endpointType: js.UndefOr[java.lang.String] = js.undefined
}

object GetEndpointArgs {
  @scala.inline
  def apply(endpointType: java.lang.String = null): GetEndpointArgs = {
    val __obj = js.Dynamic.literal()
    if (endpointType != null) __obj.updateDynamic("endpointType")(endpointType)
    __obj.asInstanceOf[GetEndpointArgs]
  }
}

