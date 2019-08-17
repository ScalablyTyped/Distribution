package typings.reactDashBlessed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashBlessedMod {
  import typings.blessed.blessedMod.WidgetsNs.Screen
  import typings.react.reactMod.Component
  import typings.react.reactMod.Global.JSXNs.Element

  type Callback = js.Function0[js.UndefOr[Unit | Null]]
  type renderer = js.Function3[
    /* c */ Element, 
    /* s */ Screen, 
    /* callback */ js.UndefOr[Callback], 
    (Component[js.Any, js.Any, js.Any]) | Null
  ]
}
