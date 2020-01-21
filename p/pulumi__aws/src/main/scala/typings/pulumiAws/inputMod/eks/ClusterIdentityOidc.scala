package typings.pulumiAws.inputMod.eks

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterIdentityOidc extends js.Object {
  /**
    * Issuer URL for the OpenID Connect identity provider.
    */
  var issuer: js.UndefOr[Input[String]] = js.native
}

object ClusterIdentityOidc {
  @scala.inline
  def apply(issuer: Input[String] = null): ClusterIdentityOidc = {
    val __obj = js.Dynamic.literal()
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterIdentityOidc]
  }
}

