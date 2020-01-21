package typings.pulumiAws.outputMod.msk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterClientAuthentication extends js.Object {
  /**
    * Configuration block for specifying TLS client authentication. See below.
    */
  var tls: js.UndefOr[ClusterClientAuthenticationTls] = js.native
}

object ClusterClientAuthentication {
  @scala.inline
  def apply(tls: ClusterClientAuthenticationTls = null): ClusterClientAuthentication = {
    val __obj = js.Dynamic.literal()
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterClientAuthentication]
  }
}

