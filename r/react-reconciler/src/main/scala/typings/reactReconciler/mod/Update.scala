package typings.reactReconciler.mod

import typings.reactReconciler.reactReconcilerNumbers.`0`
import typings.reactReconciler.reactReconcilerNumbers.`1`
import typings.reactReconciler.reactReconcilerNumbers.`2`
import typings.reactReconciler.reactReconcilerNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// react-reconciler/ReactUpdateQueue
trait Update[State] extends StObject {
  
  var callback: js.Function0[js.Any] | Null
  
  var expirationTime: ExpirationTime
  
  var next: Update[State] | Null
  
  var nextEffect: Update[State] | Null
  
  var payload: js.Any
  
  var tag: `0` | `1` | `2` | `3`
}
object Update {
  
  inline def apply[State](expirationTime: ExpirationTime, payload: js.Any, tag: `0` | `1` | `2` | `3`): Update[State] = {
    val __obj = js.Dynamic.literal(expirationTime = expirationTime.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], callback = null, next = null, nextEffect = null)
    __obj.asInstanceOf[Update[State]]
  }
  
  extension [Self <: Update[?], State](x: Self & Update[State]) {
    
    inline def setCallback(value: () => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    inline def setCallbackNull: Self = StObject.set(x, "callback", null)
    
    inline def setExpirationTime(value: ExpirationTime): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setNext(value: Update[State]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextEffect(value: Update[State]): Self = StObject.set(x, "nextEffect", value.asInstanceOf[js.Any])
    
    inline def setNextEffectNull: Self = StObject.set(x, "nextEffect", null)
    
    inline def setNextNull: Self = StObject.set(x, "next", null)
    
    inline def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setTag(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
