package typings.reduxDashAction.reduxDashActionMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-action", "createReducer")
@js.native
object createReducer extends js.Object {
  def apply[State](defaultState: State, handlers: ReducerHandlers[State]): Reducer[State, AnyAction] = js.native
}

