package typings.atPulumiAws.servicequotasGetServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * Code of the service.
    */
  val serviceCode: String
  val serviceName: String
}

object GetServiceResult {
  @scala.inline
  def apply(id: String, serviceCode: String, serviceName: String): GetServiceResult = {
    val __obj = js.Dynamic.literal(id = id, serviceCode = serviceCode, serviceName = serviceName)
  
    __obj.asInstanceOf[GetServiceResult]
  }
}

