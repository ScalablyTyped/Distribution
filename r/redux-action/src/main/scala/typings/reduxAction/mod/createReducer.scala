package typings.reduxAction.mod

import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-action", "createReducer")
@js.native
object createReducer extends js.Object {
  
  def apply[State](defaultState: State, handlers: ReducerHandlers[State]): Reducer[State, AnyAction] = js.native
}
