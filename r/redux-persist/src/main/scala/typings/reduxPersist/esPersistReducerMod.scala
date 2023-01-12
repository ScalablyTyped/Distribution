package typings.reduxPersist

import typings.redux.mod.Action
import typings.redux.mod.Reducer
import typings.reduxPersist.esTypesMod.PersistConfig
import typings.reduxPersist.esTypesMod.PersistState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPersistReducerMod {
  
  @JSImport("redux-persist/es/persistReducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S, A /* <: Action[Any] */](config: PersistConfig[S, Any, Any, Any], baseReducer: Reducer[S, A]): Reducer[S & PersistPartial, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any], baseReducer.asInstanceOf[js.Any])).asInstanceOf[Reducer[S & PersistPartial, A]]
  
  trait PersistPartial extends StObject {
    
    var _persist: PersistState
  }
  object PersistPartial {
    
    inline def apply(_persist: PersistState): PersistPartial = {
      val __obj = js.Dynamic.literal(_persist = _persist.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistPartial]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PersistPartial] (val x: Self) extends AnyVal {
      
      inline def set_persist(value: PersistState): Self = StObject.set(x, "_persist", value.asInstanceOf[js.Any])
    }
  }
}
