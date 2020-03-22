package typings.reduxDoghouse

import typings.redux.mod.ActionCreator
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply[A, C /* <: ActionCreator[A] */](actionCreator: C, dispatch: Dispatch[AnyAction]): C = js.native
}

