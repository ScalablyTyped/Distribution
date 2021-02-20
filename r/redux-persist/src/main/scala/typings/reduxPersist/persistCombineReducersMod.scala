package typings.reduxPersist

import typings.redux.mod.Action
import typings.redux.mod.Reducer
import typings.redux.mod.ReducersMapObject
import typings.reduxPersist.persistReducerMod.PersistPartial
import typings.reduxPersist.typesMod.PersistConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object persistCombineReducersMod {
  
  @JSImport("redux-persist/es/persistCombineReducers", JSImport.Default)
  @js.native
  def default[S, A /* <: Action[_] */](config: PersistConfig[S, _, _, _], reducers: ReducersMapObject[S, A]): Reducer[S with PersistPartial, A] = js.native
}
