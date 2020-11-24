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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rbx/elements/form/input", "INPUT_DEFAULTS")
@js.native
object INPUT_DEFAULTS extends js.Object {
  
  var sizes: js.Tuple3[small, medium, large] = js.native
  
  var states: js.Tuple2[focused, hovered] = js.native
  
  var types: js.Tuple9[text, email, tel, password, number, search, color, date, time] = js.native
}
