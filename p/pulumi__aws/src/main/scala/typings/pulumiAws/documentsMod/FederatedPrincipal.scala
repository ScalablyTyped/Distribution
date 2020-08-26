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
  @scala.inline
  implicit class FederatedPrincipalOps[Self <: FederatedPrincipal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFederatedVarargs(value: Input[String]*): Self = this.set("Federated", js.Array(value :_*))
    @scala.inline
    def setFederated(value: Input[js.Array[Input[String]] | String]): Self = this.set("Federated", value.asInstanceOf[js.Any])
  }
  
}

