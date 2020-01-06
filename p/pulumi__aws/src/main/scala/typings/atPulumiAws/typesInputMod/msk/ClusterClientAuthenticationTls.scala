package typings.atPulumiAws.typesInputMod.msk

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterClientAuthenticationTls extends js.Object {
  /**
    * List of ACM Certificate Authority Amazon Resource Names (ARNs).
    */
  var certificateAuthorityArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object ClusterClientAuthenticationTls {
  @scala.inline
  def apply(certificateAuthorityArns: Input[js.Array[Input[String]]] = null): ClusterClientAuthenticationTls = {
    val __obj = js.Dynamic.literal()
    if (certificateAuthorityArns != null) __obj.updateDynamic("certificateAuthorityArns")(certificateAuthorityArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterClientAuthenticationTls]
  }
}

