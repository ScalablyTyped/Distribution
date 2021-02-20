package typings.pubnub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeSocketKeepAliveTimeout extends StObject {
  
  var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.native
  
  var keepAliveMsecs: js.UndefOr[Double] = js.native
  
  var maxFreeSockets: js.UndefOr[Double] = js.native
  
  var maxSockets: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object FreeSocketKeepAliveTimeout {
  
  @scala.inline
  def apply(): FreeSocketKeepAliveTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeSocketKeepAliveTimeout]
  }
  
  @scala.inline
  implicit class FreeSocketKeepAliveTimeoutMutableBuilder[Self <: FreeSocketKeepAliveTimeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFreeSocketKeepAliveTimeout(value: Double): Self = StObject.set(x, "freeSocketKeepAliveTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeSocketKeepAliveTimeoutUndefined: Self = StObject.set(x, "freeSocketKeepAliveTimeout", js.undefined)
    
    @scala.inline
    def setKeepAliveMsecs(value: Double): Self = StObject.set(x, "keepAliveMsecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAliveMsecsUndefined: Self = StObject.set(x, "keepAliveMsecs", js.undefined)
    
    @scala.inline
    def setMaxFreeSockets(value: Double): Self = StObject.set(x, "maxFreeSockets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFreeSocketsUndefined: Self = StObject.set(x, "maxFreeSockets", js.undefined)
    
    @scala.inline
    def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
