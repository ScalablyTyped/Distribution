package typings.reactSpringCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallId extends StObject {
  
  var callId: Double
  
  var cancel: Boolean
  
  var parentId: js.UndefOr[Double] = js.undefined
  
  var to: js.UndefOr[Any] = js.undefined
}
object CallId {
  
  inline def apply(callId: Double, cancel: Boolean): CallId = {
    val __obj = js.Dynamic.literal(callId = callId.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallId]
  }
  
  extension [Self <: CallId](x: Self) {
    
    inline def setCallId(value: Double): Self = StObject.set(x, "callId", value.asInstanceOf[js.Any])
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setParentId(value: Double): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setTo(value: Any): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
