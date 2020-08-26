package typings.rbx.selectMod

import typings.rbx.rbxStrings.focused
import typings.rbx.rbxStrings.hovered
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.loading
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/form/select.SelectContainerVariablesOverrides, rbx.rbx/elements/form/select.SelectContainerVariablesDefaults> */
@js.native
trait SelectContainerVariables extends js.Object {
  var sizes: small | medium | large = js.native
  var states: focused | hovered | loading = js.native
}

object SelectContainerVariables {
  @scala.inline
  def apply(sizes: small | medium | large, states: focused | hovered | loading): SelectContainerVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectContainerVariables]
  }
  @scala.inline
  implicit class SelectContainerVariablesOps[Self <: SelectContainerVariables] (val x: Self) extends AnyVal {
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
    def setSizes(value: small | medium | large): Self = this.set("sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def setStates(value: focused | hovered | loading): Self = this.set("states", value.asInstanceOf[js.Any])
  }
  
}

