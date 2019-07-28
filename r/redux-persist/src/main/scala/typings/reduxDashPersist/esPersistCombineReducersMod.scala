package typings.reduxDashPersist

import typings.redux.reduxMod.Action
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Reducer
import typings.redux.reduxMod.ReducersMapObject
import typings.reduxDashPersist.esTypesMod.PersistConfig
import typings.reduxDashPersist.esTypesMod.PersistedState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/es/persistCombineReducers", JSImport.Namespace)
@js.native
object esPersistCombineReducersMod extends js.Object {
  def persistCombineReducers[S](config: PersistConfig, reducers: ReducersMapObject[_, Action[_]]): Reducer[S with PersistedState, AnyAction] = js.native
}

