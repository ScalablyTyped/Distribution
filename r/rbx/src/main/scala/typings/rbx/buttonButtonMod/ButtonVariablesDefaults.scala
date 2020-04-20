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

trait ButtonVariablesDefaults extends js.Object {
  var sizes: small | normal | medium | large
  var states: hovered | focused | active | loading
}

object ButtonVariablesDefaults {
  @scala.inline
  def apply(sizes: small | normal | medium | large, states: hovered | focused | active | loading): ButtonVariablesDefaults = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonVariablesDefaults]
  }
}

