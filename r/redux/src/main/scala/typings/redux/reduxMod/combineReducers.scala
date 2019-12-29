package typings.redux.reduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux", "combineReducers")
@js.native
object combineReducers extends js.Object {
  def apply[M /* <: ReducersMapObject[_, _] */](reducers: M): Reducer[CombinedState[StateFromReducersMapObject[M]], ActionFromReducersMapObject[M]] = js.native
  def apply[S](reducers: ReducersMapObject[S, _]): Reducer[CombinedState[S], AnyAction] = js.native
}

