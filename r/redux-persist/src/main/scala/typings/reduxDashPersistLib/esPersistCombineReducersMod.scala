package typings
package reduxDashPersistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/es/persistCombineReducers", JSImport.Namespace)
@js.native
object esPersistCombineReducersMod extends js.Object {
  def persistCombineReducers[S](
    config: reduxDashPersistLib.esTypesMod.PersistConfig,
    reducers: reduxLib.reduxMod.ReducersMapObject[_, reduxLib.reduxMod.Action[_]]
  ): reduxLib.reduxMod.Reducer[S with reduxDashPersistLib.esTypesMod.PersistedState, reduxLib.reduxMod.AnyAction] = js.native
}

