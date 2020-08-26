package typings.rcSwitch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SwitchChangeEventHandler = js.Function2[
    /* checked */ scala.Boolean, 
    /* event */ (typings.react.mod.MouseEvent[typings.std.HTMLButtonElement, typings.react.mod.NativeMouseEvent]) | typings.react.mod.KeyboardEvent[typings.std.HTMLButtonElement], 
    scala.Unit
  ]
  type SwitchClickEventHandler = typings.rcSwitch.mod.SwitchChangeEventHandler
}
