package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowClassicLinkToRemoteVpc extends js.Object {
  var allowClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.undefined
  var allowRemoteVpcDnsResolution: js.UndefOr[Boolean] = js.undefined
  var allowVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.undefined
}

object Anon_AllowClassicLinkToRemoteVpc {
  @scala.inline
  def apply(
    allowClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.undefined,
    allowRemoteVpcDnsResolution: js.UndefOr[Boolean] = js.undefined,
    allowVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.undefined
  ): Anon_AllowClassicLinkToRemoteVpc = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClassicLinkToRemoteVpc)) __obj.updateDynamic("allowClassicLinkToRemoteVpc")(allowClassicLinkToRemoteVpc)
    if (!js.isUndefined(allowRemoteVpcDnsResolution)) __obj.updateDynamic("allowRemoteVpcDnsResolution")(allowRemoteVpcDnsResolution)
    if (!js.isUndefined(allowVpcToRemoteClassicLink)) __obj.updateDynamic("allowVpcToRemoteClassicLink")(allowVpcToRemoteClassicLink)
    __obj.asInstanceOf[Anon_AllowClassicLinkToRemoteVpc]
  }
}

