package typings.reduxPersist

import typings.redux.mod.Action
import typings.redux.mod.Reducer
import typings.reduxPersist.typesMod.PersistConfig
import typings.reduxPersist.typesMod.PersistState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object persistReducerMod {
  
  @JSImport("redux-persist/es/persistReducer", JSImport.Default)
  @js.native
  def default[S, A /* <: Action[_] */](config: PersistConfig[S, _, _, _], baseReducer: Reducer[S, A]): Reducer[S with PersistPartial, A] = js.native
  
  @js.native
  trait PersistPartial extends StObject {
    
    var _persist: PersistState = js.native
  }
  object PersistPartial {
    
    @scala.inline
    def apply(_persist: PersistState): PersistPartial = {
      val __obj = js.Dynamic.literal(_persist = _persist.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistPartial]
    }
    
    @scala.inline
    implicit class PersistPartialMutableBuilder[Self <: PersistPartial] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_persist(value: PersistState): Self = StObject.set(x, "_persist", value.asInstanceOf[js.Any])
    }
  }
}
