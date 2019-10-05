package typings.redux.reduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux", "combineReducers")
@js.native
object combineReducers extends js.Object {
  def apply[S](reducers: ReducersMapObject[S, _]): Reducer[S, AnyAction] = js.native
}

