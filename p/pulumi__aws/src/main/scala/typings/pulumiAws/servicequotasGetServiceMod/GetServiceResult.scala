package typings.pulumiAws.servicequotasGetServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Code of the service.
    */
  val serviceCode: String = js.native
  val serviceName: String = js.native
}

object GetServiceResult {
  @scala.inline
  def apply(id: String, serviceCode: String, serviceName: String): GetServiceResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceResult]
  }
}

