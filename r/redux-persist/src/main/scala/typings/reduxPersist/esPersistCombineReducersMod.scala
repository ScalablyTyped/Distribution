package typings.reduxPersist

import typings.redux.mod.Action
import typings.redux.mod.Reducer
import typings.redux.mod.ReducersMapObject
import typings.reduxPersist.esPersistReducerMod.PersistPartial
import typings.reduxPersist.esTypesMod.PersistConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPersistCombineReducersMod {
  
  @JSImport("redux-persist/es/persistCombineReducers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S, A /* <: Action[Any] */](config: PersistConfig[S, Any, Any, Any], reducers: ReducersMapObject[S, A]): Reducer[S & PersistPartial, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any], reducers.asInstanceOf[js.Any])).asInstanceOf[Reducer[S & PersistPartial, A]]
}
