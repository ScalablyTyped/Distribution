package typings.atPulumiAws.typesInputMod.mskNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterClientAuthentication extends js.Object {
  /**
    * Configuration block for specifying TLS client authentication. See below.
    */
  var tls: js.UndefOr[Input[ClusterClientAuthenticationTls]] = js.undefined
}

object ClusterClientAuthentication {
  @scala.inline
  def apply(tls: Input[ClusterClientAuthenticationTls] = null): ClusterClientAuthentication = {
    val __obj = js.Dynamic.literal()
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterClientAuthentication]
  }
}

