package typings
package reactDashVirtualDashKeyboardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashVirtualDashKeyboardMod {
  type Keyboard = reactLib.reactMod.Component[KeyboardProps, KeyboardState, js.Any]
  type kbEvents = js.Function3[
    /* event */ js.UndefOr[java.lang.String | stdLib.Event], 
    /* keyboard */ js.UndefOr[stdLib.Element], 
    /* el */ js.UndefOr[stdLib.Element], 
    scala.Unit
  ]
}
