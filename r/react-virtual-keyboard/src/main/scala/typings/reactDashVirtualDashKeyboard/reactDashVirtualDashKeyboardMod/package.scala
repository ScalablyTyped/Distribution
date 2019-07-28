package typings.reactDashVirtualDashKeyboard

import typings.react.reactMod.Component
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashVirtualDashKeyboardMod {
  type Keyboard = Component[KeyboardProps, KeyboardState, js.Any]
  type kbEvents = js.Function3[
    /* event */ js.UndefOr[String | Event], 
    /* keyboard */ js.UndefOr[Element], 
    /* el */ js.UndefOr[Element], 
    Unit
  ]
}
