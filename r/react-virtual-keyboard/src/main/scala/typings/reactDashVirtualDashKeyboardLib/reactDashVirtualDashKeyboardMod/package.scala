package typings
package reactDashVirtualDashKeyboardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashVirtualDashKeyboardMod {
  type Keyboard = reactLib.reactMod.Component[KeyboardProps, KeyboardState, js.Any]
  type kbEvents = js.Function3[
    /* event */ js.UndefOr[java.lang.String | reactLib.Event], 
    /* keyboard */ js.UndefOr[reactLib.Element], 
    /* el */ js.UndefOr[reactLib.Element], 
    scala.Unit
  ]
}
