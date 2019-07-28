package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowClassicLinkToRemoteVpcAllowRemoteVpcDnsResolution extends js.Object {
  var allowClassicLinkToRemoteVpc: js.UndefOr[Input[Boolean]] = js.undefined
  var allowRemoteVpcDnsResolution: js.UndefOr[Input[Boolean]] = js.undefined
  var allowVpcToRemoteClassicLink: js.UndefOr[Input[Boolean]] = js.undefined
}

object Anon_AllowClassicLinkToRemoteVpcAllowRemoteVpcDnsResolution {
  @scala.inline
  def apply(
    allowClassicLinkToRemoteVpc: Input[Boolean] = null,
    allowRemoteVpcDnsResolution: Input[Boolean] = null,
    allowVpcToRemoteClassicLink: Input[Boolean] = null
  ): Anon_AllowClassicLinkToRemoteVpcAllowRemoteVpcDnsResolution = {
    val __obj = js.Dynamic.literal()
    if (allowClassicLinkToRemoteVpc != null) __obj.updateDynamic("allowClassicLinkToRemoteVpc")(allowClassicLinkToRemoteVpc.asInstanceOf[js.Any])
    if (allowRemoteVpcDnsResolution != null) __obj.updateDynamic("allowRemoteVpcDnsResolution")(allowRemoteVpcDnsResolution.asInstanceOf[js.Any])
    if (allowVpcToRemoteClassicLink != null) __obj.updateDynamic("allowVpcToRemoteClassicLink")(allowVpcToRemoteClassicLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowClassicLinkToRemoteVpcAllowRemoteVpcDnsResolution]
  }
}

