package typings.atPulumiAws.iamDocumentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicePrincipal extends Principal {
  var Service: String | js.Array[String]
}

object ServicePrincipal {
  @scala.inline
  def apply(Service: String | js.Array[String]): ServicePrincipal = {
    val __obj = js.Dynamic.literal(Service = Service.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServicePrincipal]
  }
}

