package typings.atPulumiAws.iamDocumentsMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FederatedPrincipal extends Principal {
  var Federated: Input[js.Array[Input[String]] | String]
}

object FederatedPrincipal {
  @scala.inline
  def apply(Federated: Input[js.Array[Input[String]] | String]): FederatedPrincipal = {
    val __obj = js.Dynamic.literal(Federated = Federated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FederatedPrincipal]
  }
}

