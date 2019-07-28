package typings.reactDashReduxDashI18n.reactDashReduxDashI18nMod

import typings.redux.reduxMod.Action
import typings.redux.reduxMod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatchCallback[S /* <: Action[_] */] extends js.Object {
  def apply(): js.Any = js.native
  def apply(dispatch: Dispatch[S]): js.Any = js.native
  def apply(dispatch: Dispatch[S], getState: js.Function0[S]): js.Any = js.native
}

