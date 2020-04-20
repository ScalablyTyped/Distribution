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

trait SelectContainerVariablesDefaults extends js.Object {
  var sizes: small | medium | large
  var states: focused | hovered | loading
}

object SelectContainerVariablesDefaults {
  @scala.inline
  def apply(sizes: small | medium | large, states: focused | hovered | loading): SelectContainerVariablesDefaults = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectContainerVariablesDefaults]
  }
}

