package typings.pulumiAws.documentsMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FederatedPrincipal extends Principal {
  var Federated: Input[js.Array[Input[String]] | String] = js.native
}

object FederatedPrincipal {
  @scala.inline
  def apply(Federated: Input[js.Array[Input[String]] | String]): FederatedPrincipal = {
    val __obj = js.Dynamic.literal(Federated = Federated.asInstanceOf[js.Any])
    __obj.asInstanceOf[FederatedPrincipal]
  }
}

