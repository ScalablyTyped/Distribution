package typings
package reactDashReduxDashI18nLib.reactDashReduxDashI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatchCallback[S /* <: reduxLib.reduxMod.Action[_] */] extends js.Object {
  def apply(): js.Any = js.native
  def apply(dispatch: reduxLib.reduxMod.Dispatch[S]): js.Any = js.native
  def apply(dispatch: reduxLib.reduxMod.Dispatch[S], getState: js.Function0[S]): js.Any = js.native
}

