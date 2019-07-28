package typings.atPulumiAws.iamDocumentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FederatedPrincipal extends Principal {
  var Federated: String | js.Array[String]
}

object FederatedPrincipal {
  @scala.inline
  def apply(Federated: String | js.Array[String]): FederatedPrincipal = {
    val __obj = js.Dynamic.literal(Federated = Federated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FederatedPrincipal]
  }
}

