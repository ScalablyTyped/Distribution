package typings.pubnub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeSocketKeepAliveTimeout extends StObject {
  
  var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.undefined
  
  var keepAliveMsecs: js.UndefOr[Double] = js.undefined
  
  var maxFreeSockets: js.UndefOr[Double] = js.undefined
  
  var maxSockets: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object FreeSocketKeepAliveTimeout {
  
  inline def apply(): FreeSocketKeepAliveTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeSocketKeepAliveTimeout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FreeSocketKeepAliveTimeout] (val x: Self) extends AnyVal {
    
    inline def setFreeSocketKeepAliveTimeout(value: Double): Self = StObject.set(x, "freeSocketKeepAliveTimeout", value.asInstanceOf[js.Any])
    
    inline def setFreeSocketKeepAliveTimeoutUndefined: Self = StObject.set(x, "freeSocketKeepAliveTimeout", js.undefined)
    
    inline def setKeepAliveMsecs(value: Double): Self = StObject.set(x, "keepAliveMsecs", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveMsecsUndefined: Self = StObject.set(x, "keepAliveMsecs", js.undefined)
    
    inline def setMaxFreeSockets(value: Double): Self = StObject.set(x, "maxFreeSockets", value.asInstanceOf[js.Any])
    
    inline def setMaxFreeSocketsUndefined: Self = StObject.set(x, "maxFreeSockets", js.undefined)
    
    inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
    
    inline def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
