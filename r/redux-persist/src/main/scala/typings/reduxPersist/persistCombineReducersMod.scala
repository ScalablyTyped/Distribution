package typings.reduxPersist

import typings.redux.mod.Action
import typings.redux.mod.Reducer
import typings.redux.mod.ReducersMapObject
import typings.reduxPersist.persistReducerMod.PersistPartial
import typings.reduxPersist.typesMod.PersistConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-persist/es/persistCombineReducers", JSImport.Namespace)
@js.native
object persistCombineReducersMod extends js.Object {
  
  def default[S, A /* <: Action[_] */](config: PersistConfig[S, _, _, _], reducers: ReducersMapObject[S, A]): Reducer[S with PersistPartial, A] = js.native
}
