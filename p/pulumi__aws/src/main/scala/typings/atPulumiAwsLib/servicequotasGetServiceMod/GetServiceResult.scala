package typings
package atPulumiAwsLib.servicequotasGetServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * Code of the service.
    */
  val serviceCode: java.lang.String
  val serviceName: java.lang.String
}

object GetServiceResult {
  @scala.inline
  def apply(id: java.lang.String, serviceCode: java.lang.String, serviceName: java.lang.String): GetServiceResult = {
    val __obj = js.Dynamic.literal(id = id, serviceCode = serviceCode, serviceName = serviceName)
  
    __obj.asInstanceOf[GetServiceResult]
  }
}

