package typings.reduxActions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-actions", "handleActions")
@js.native
object handleActions extends js.Object {
  def apply[StateAndPayload](reducerMap: ReducerMap[StateAndPayload, StateAndPayload], initialState: StateAndPayload): ReduxCompatibleReducer[StateAndPayload, StateAndPayload] = js.native
  def apply[StateAndPayload](
    reducerMap: ReducerMap[StateAndPayload, StateAndPayload],
    initialState: StateAndPayload,
    options: Options
  ): ReduxCompatibleReducer[StateAndPayload, StateAndPayload] = js.native
  def apply[State, Payload, Meta](reducerMap: ReducerMapMeta[State, Payload, Meta], initialState: State): ReduxCompatibleReducerMeta[State, Payload, Meta] = js.native
  def apply[State, Payload, Meta](reducerMap: ReducerMapMeta[State, Payload, Meta], initialState: State, options: Options): ReduxCompatibleReducerMeta[State, Payload, Meta] = js.native
}

