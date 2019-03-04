package typings
package atPulumiAwsLib.iamDocumentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FederatedPrincipal extends Principal {
  var Federated: java.lang.String | js.Array[java.lang.String]
}

object FederatedPrincipal {
  @scala.inline
  def apply(Federated: java.lang.String | js.Array[java.lang.String]): FederatedPrincipal = {
    val __obj = js.Dynamic.literal(Federated = Federated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FederatedPrincipal]
  }
}

