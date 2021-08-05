package typings.reduxPersist

import typings.redux.mod.Action
import typings.redux.mod.Reducer
import typings.reduxPersist.persistReducerMod.PersistPartial
import typings.reduxPersist.typesMod.PersistConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPersistReducerMod {
  
  @JSImport("redux-persist/lib/persistReducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S, A /* <: Action[js.Any] */](config: PersistConfig[S, js.Any, js.Any, js.Any], baseReducer: Reducer[S, A]): Reducer[S & PersistPartial, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any], baseReducer.asInstanceOf[js.Any])).asInstanceOf[Reducer[S & PersistPartial, A]]
}
