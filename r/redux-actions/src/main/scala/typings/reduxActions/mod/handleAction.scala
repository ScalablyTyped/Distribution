package typings.reduxActions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-actions", "handleAction")
@js.native
object handleAction extends js.Object {
  
  def apply[State, Payload](actionType: String, reducer: ReducerNextThrow[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = js.native
  def apply[State, Payload](actionType: String, reducer: Reducer[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = js.native
  def apply[State, Payload](
    actionType: ActionFunctions[Payload],
    reducer: ReducerNextThrow[State, Payload],
    initialState: State
  ): ReduxCompatibleReducer[State, Payload] = js.native
  def apply[State, Payload](actionType: ActionFunctions[Payload], reducer: Reducer[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = js.native
  def apply[State, Payload](actionType: CombinedActionType, reducer: ReducerNextThrow[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = js.native
  def apply[State, Payload](actionType: CombinedActionType, reducer: Reducer[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = js.native
  def apply[State, Payload, Meta](actionType: String, reducer: ReducerNextThrowMeta[State, Payload, Meta], initialState: State): ReduxCompatibleReducerMeta[State, Payload, Meta] = js.native
  def apply[State, Payload, Meta](
    actionType: ActionWithMetaFunctions[Payload, Meta],
    reducer: ReducerNextThrowMeta[State, Payload, Meta],
    initialState: State
  ): ReduxCompatibleReducerMeta[State, Payload, Meta] = js.native
  def apply[State, Payload, Meta](
    actionType: CombinedActionType,
    reducer: ReducerNextThrowMeta[State, Payload, Meta],
    initialState: State
  ): ReduxCompatibleReducerMeta[State, Payload, Meta] = js.native
}
