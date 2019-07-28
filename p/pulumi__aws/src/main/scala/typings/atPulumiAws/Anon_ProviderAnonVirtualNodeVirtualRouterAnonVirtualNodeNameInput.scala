package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProviderAnonVirtualNodeVirtualRouterAnonVirtualNodeNameInput extends js.Object {
  var provider: js.UndefOr[Input[Anon_VirtualNodeVirtualRouterAnonVirtualNodeNameInput]] = js.undefined
}

object Anon_ProviderAnonVirtualNodeVirtualRouterAnonVirtualNodeNameInput {
  @scala.inline
  def apply(provider: Input[Anon_VirtualNodeVirtualRouterAnonVirtualNodeNameInput] = null): Anon_ProviderAnonVirtualNodeVirtualRouterAnonVirtualNodeNameInput = {
    val __obj = js.Dynamic.literal()
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ProviderAnonVirtualNodeVirtualRouterAnonVirtualNodeNameInput]
  }
}

