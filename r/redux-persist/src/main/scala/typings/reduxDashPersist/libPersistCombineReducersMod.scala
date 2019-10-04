package typings.reduxDashPersist

import typings.redux.reduxMod.Action
import typings.redux.reduxMod.Reducer
import typings.redux.reduxMod.ReducersMapObject
import typings.reduxDashPersist.esPersistReducerMod.PersistPartial
import typings.reduxDashPersist.esTypesMod.PersistConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/lib/persistCombineReducers", JSImport.Namespace)
@js.native
object libPersistCombineReducersMod extends js.Object {
  def default[S, A /* <: Action[_] */](config: PersistConfig[S, _, _, _], reducers: ReducersMapObject[S, A]): Reducer[S with PersistPartial, A] = js.native
}

