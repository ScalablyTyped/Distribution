package typings.rbx.buttonGroupMod

import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/button/button-group.ButtonGroupVariablesOverrides, rbx.rbx/elements/button/button-group.ButtonGroupVariablesDefaults> */
@js.native
trait ButtonGroupVariables extends js.Object {
  var alignments: centered | right = js.native
  var sizes: small | medium | large = js.native
}

object ButtonGroupVariables {
  @scala.inline
  def apply(alignments: centered | right, sizes: small | medium | large): ButtonGroupVariables = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupVariables]
  }
  @scala.inline
  implicit class ButtonGroupVariablesOps[Self <: ButtonGroupVariables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlignments(value: centered | right): Self = this.set("alignments", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizes(value: small | medium | large): Self = this.set("sizes", value.asInstanceOf[js.Any])
  }
  
}

