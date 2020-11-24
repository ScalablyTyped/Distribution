package typings.reactVirtualKeyboard.mod

import typings.virtualKeyboard.mod.KeyboardOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactKeyboardOptions extends KeyboardOptions {
  
  @JSName("accepted")
  var accepted_ReactKeyboardOptions: js.UndefOr[scala.Nothing] = js.native
}
object ReactKeyboardOptions {
  
  @scala.inline
  def apply(`type`: String): ReactKeyboardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactKeyboardOptions]
  }
}
