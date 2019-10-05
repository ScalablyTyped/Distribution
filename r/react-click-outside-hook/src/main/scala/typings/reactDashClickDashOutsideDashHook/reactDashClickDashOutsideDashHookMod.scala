package typings.reactDashClickDashOutsideDashHook

import typings.reactDashClickDashOutsideDashHook.reactDashClickDashOutsideDashHookMod.HookReturnTuple
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-click-outside-hook", JSImport.Namespace)
@js.native
object reactDashClickDashOutsideDashHookMod extends js.Object {
  def useClickOutside(): HookReturnTuple = js.native
  type HookReturnTuple = js.Tuple2[js.Function1[/* node */ js.UndefOr[Element | Null], Unit], Boolean]
}

