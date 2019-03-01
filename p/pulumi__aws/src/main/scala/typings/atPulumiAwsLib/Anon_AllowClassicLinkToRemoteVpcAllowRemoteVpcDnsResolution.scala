package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowClassicLinkToRemoteVpcAllowRemoteVpcDnsResolution extends js.Object {
  var allowClassicLinkToRemoteVpc: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var allowRemoteVpcDnsResolution: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var allowVpcToRemoteClassicLink: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object Anon_AllowClassicLinkToRemoteVpcAllowRemoteVpcDnsResolution {
  @scala.inline
  def apply(
    allowClassicLinkToRemoteVpc: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    allowRemoteVpcDnsResolution: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    allowVpcToRemoteClassicLink: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_AllowClassicLinkToRemoteVpcAllowRemoteVpcDnsResolution = {
    val __obj = js.Dynamic.literal()
    if (allowClassicLinkToRemoteVpc != null) __obj.updateDynamic("allowClassicLinkToRemoteVpc")(allowClassicLinkToRemoteVpc.asInstanceOf[js.Any])
    if (allowRemoteVpcDnsResolution != null) __obj.updateDynamic("allowRemoteVpcDnsResolution")(allowRemoteVpcDnsResolution.asInstanceOf[js.Any])
    if (allowVpcToRemoteClassicLink != null) __obj.updateDynamic("allowVpcToRemoteClassicLink")(allowVpcToRemoteClassicLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowClassicLinkToRemoteVpcAllowRemoteVpcDnsResolution]
  }
}

