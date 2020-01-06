package typings.reduxDashDoghouse

import typings.redux.reduxMod.ActionCreatorsMapObject
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_ActionCreator extends js.Object {
  def apply[A, M /* <: ActionCreatorsMapObject[A] */](actionCreators: M, dispatch: Dispatch[AnyAction]): M = js.native
}

