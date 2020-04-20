package typings.rbx.buttonButtonMod

import typings.rbx.rbxStrings.active
import typings.rbx.rbxStrings.focused
import typings.rbx.rbxStrings.hovered
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.loading
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.normal
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/button/button.ButtonVariablesOverrides, rbx.rbx/elements/button/button.ButtonVariablesDefaults> */
trait ButtonVariables extends js.Object {
  var sizes: small | normal | medium | large
  var states: hovered | focused | active | loading
}

object ButtonVariables {
  @scala.inline
  def apply(sizes: small | normal | medium | large, states: hovered | focused | active | loading): ButtonVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonVariables]
  }
}

