package typings.atPulumiAws.typesInputMod.eksNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterIdentity extends js.Object {
  /**
    * Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster.
    */
  var oidcs: js.UndefOr[Input[js.Array[Input[ClusterIdentityOidc]]]] = js.undefined
}

object ClusterIdentity {
  @scala.inline
  def apply(oidcs: Input[js.Array[Input[ClusterIdentityOidc]]] = null): ClusterIdentity = {
    val __obj = js.Dynamic.literal()
    if (oidcs != null) __obj.updateDynamic("oidcs")(oidcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterIdentity]
  }
}

