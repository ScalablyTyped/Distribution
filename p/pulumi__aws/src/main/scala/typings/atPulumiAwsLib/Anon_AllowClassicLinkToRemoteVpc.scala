package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowClassicLinkToRemoteVpc extends js.Object {
  var allowClassicLinkToRemoteVpc: js.UndefOr[scala.Boolean] = js.undefined
  var allowRemoteVpcDnsResolution: js.UndefOr[scala.Boolean] = js.undefined
  var allowVpcToRemoteClassicLink: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AllowClassicLinkToRemoteVpc {
  @scala.inline
  def apply(
    allowClassicLinkToRemoteVpc: js.UndefOr[scala.Boolean] = js.undefined,
    allowRemoteVpcDnsResolution: js.UndefOr[scala.Boolean] = js.undefined,
    allowVpcToRemoteClassicLink: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AllowClassicLinkToRemoteVpc = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClassicLinkToRemoteVpc)) __obj.updateDynamic("allowClassicLinkToRemoteVpc")(allowClassicLinkToRemoteVpc)
    if (!js.isUndefined(allowRemoteVpcDnsResolution)) __obj.updateDynamic("allowRemoteVpcDnsResolution")(allowRemoteVpcDnsResolution)
    if (!js.isUndefined(allowVpcToRemoteClassicLink)) __obj.updateDynamic("allowVpcToRemoteClassicLink")(allowVpcToRemoteClassicLink)
    __obj.asInstanceOf[Anon_AllowClassicLinkToRemoteVpc]
  }
}

