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

@js.native
trait InputVariablesDefaults extends js.Object {
  var sizes: small | medium | large = js.native
  var states: focused | hovered = js.native
  var types: text | email | tel | password | number | search | color | date | time = js.native
}

object InputVariablesDefaults {
  @scala.inline
  def apply(
    sizes: small | medium | large,
    states: focused | hovered,
    types: text | email | tel | password | number | search | color | date | time
  ): InputVariablesDefaults = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputVariablesDefaults]
  }
  @scala.inline
  implicit class InputVariablesDefaultsOps[Self <: InputVariablesDefaults] (val x: Self) extends AnyVal {
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
    def setStates(value: focused | hovered): Self = this.set("states", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypes(value: text | email | tel | password | number | search | color | date | time): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}

