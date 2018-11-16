package typings
package reactDashBlessedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashBlessedMod {
  type Callback = js.Function0[js.UndefOr[scala.Unit | scala.Null]]
  type renderer = js.Function3[
    /* c */ reactLib.reactMod.Global.JSXNs.Element, 
    /* s */ blessedLib.blessedMod.WidgetsNs.Screen, 
    /* callback */ js.UndefOr[Callback], 
    (reactLib.reactMod.Component[js.Any, js.Any, js.Any]) | scala.Null
  ]
}
