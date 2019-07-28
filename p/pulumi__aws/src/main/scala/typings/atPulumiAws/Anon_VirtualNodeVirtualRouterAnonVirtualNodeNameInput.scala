package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_VirtualNodeVirtualRouterAnonVirtualNodeNameInput extends js.Object {
  var virtualNode: js.UndefOr[Input[Anon_VirtualNodeNameInput]] = js.undefined
  var virtualRouter: js.UndefOr[Input[Anon_VirtualRouterNameInput]] = js.undefined
}

object Anon_VirtualNodeVirtualRouterAnonVirtualNodeNameInput {
  @scala.inline
  def apply(
    virtualNode: Input[Anon_VirtualNodeNameInput] = null,
    virtualRouter: Input[Anon_VirtualRouterNameInput] = null
  ): Anon_VirtualNodeVirtualRouterAnonVirtualNodeNameInput = {
    val __obj = js.Dynamic.literal()
    if (virtualNode != null) __obj.updateDynamic("virtualNode")(virtualNode.asInstanceOf[js.Any])
    if (virtualRouter != null) __obj.updateDynamic("virtualRouter")(virtualRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_VirtualNodeVirtualRouterAnonVirtualNodeNameInput]
  }
}

