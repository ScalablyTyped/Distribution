package typings
package atPulumiAwsLib.iamDocumentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicePrincipal extends Principal {
  var Service: java.lang.String | js.Array[java.lang.String]
}

object ServicePrincipal {
  @scala.inline
  def apply(Service: java.lang.String | js.Array[java.lang.String]): ServicePrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Service")(Service.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicePrincipal]
  }
}

