package typings.reduxDashDoghouse

import typings.redux.reduxMod.ActionCreator
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_ActionCreator extends js.Object {
  def apply[A /* <: ActionCreator[_] */, B /* <: ActionCreator[_] */](actionCreator: A, dispatch: Dispatch[AnyAction]): B = js.native
}

