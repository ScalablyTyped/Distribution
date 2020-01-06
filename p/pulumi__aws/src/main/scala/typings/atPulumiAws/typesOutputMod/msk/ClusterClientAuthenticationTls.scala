package typings.atPulumiAws.typesOutputMod.msk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterClientAuthenticationTls extends js.Object {
  /**
    * List of ACM Certificate Authority Amazon Resource Names (ARNs).
    */
  var certificateAuthorityArns: js.UndefOr[js.Array[String]] = js.native
}

object ClusterClientAuthenticationTls {
  @scala.inline
  def apply(certificateAuthorityArns: js.Array[String] = null): ClusterClientAuthenticationTls = {
    val __obj = js.Dynamic.literal()
    if (certificateAuthorityArns != null) __obj.updateDynamic("certificateAuthorityArns")(certificateAuthorityArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterClientAuthenticationTls]
  }
}

