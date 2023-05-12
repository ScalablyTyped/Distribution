package typings.reactSpringCore.mod

import typings.reactSpringTypes.mod.Lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionState[Item, State /* <: Lookup[scala.Any] */] extends StObject {
  
  var ctrl: Controller[State]
  
  var expirationId: js.UndefOr[Double] = js.undefined
  
  var expired: js.UndefOr[Boolean] = js.undefined
  
  var item: Item
  
  var key: scala.Any
  
  var phase: TransitionPhase
}
object TransitionState {
  
  inline def apply[Item, State /* <: Lookup[scala.Any] */](ctrl: Controller[State], item: Item, key: scala.Any, phase: TransitionPhase): TransitionState[Item, State] = {
    val __obj = js.Dynamic.literal(ctrl = ctrl.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionState[Item, State]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitionState[?, ?], Item, State /* <: Lookup[scala.Any] */] (val x: Self & (TransitionState[Item, State])) extends AnyVal {
    
    inline def setCtrl(value: Controller[State]): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
    
    inline def setExpirationId(value: Double): Self = StObject.set(x, "expirationId", value.asInstanceOf[js.Any])
    
    inline def setExpirationIdUndefined: Self = StObject.set(x, "expirationId", js.undefined)
    
    inline def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
    
    inline def setExpiredUndefined: Self = StObject.set(x, "expired", js.undefined)
    
    inline def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setKey(value: scala.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: TransitionPhase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
  }
}
