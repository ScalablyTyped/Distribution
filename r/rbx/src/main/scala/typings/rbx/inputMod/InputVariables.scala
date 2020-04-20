package typings.rbx.inputMod

import typings.rbx.rbxStrings.color
import typings.rbx.rbxStrings.date
import typings.rbx.rbxStrings.email
import typings.rbx.rbxStrings.focused
import typings.rbx.rbxStrings.hovered
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.number
import typings.rbx.rbxStrings.password
import typings.rbx.rbxStrings.search
import typings.rbx.rbxStrings.small
import typings.rbx.rbxStrings.tel
import typings.rbx.rbxStrings.text
import typings.rbx.rbxStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/form/input.InputVariablesOverrides, rbx.rbx/elements/form/input.InputVariablesDefaults> */
trait InputVariables extends js.Object {
  var sizes: small | medium | large
  var states: focused | hovered
  var types: text | email | tel | password | number | search | color | date | time
}

object InputVariables {
  @scala.inline
  def apply(
    sizes: small | medium | large,
    states: focused | hovered,
    types: text | email | tel | password | number | search | color | date | time
  ): InputVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputVariables]
  }
}

