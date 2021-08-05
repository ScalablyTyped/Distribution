package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushSubscriptionOptionsInit extends StObject {
  
  var applicationServerKey: js.UndefOr[BufferSource | java.lang.String | Null] = js.undefined
  
  var userVisibleOnly: js.UndefOr[scala.Boolean] = js.undefined
}
object PushSubscriptionOptionsInit {
  
  inline def apply(): PushSubscriptionOptionsInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushSubscriptionOptionsInit]
  }
  
  extension [Self <: PushSubscriptionOptionsInit](x: Self) {
    
    inline def setApplicationServerKey(value: BufferSource | java.lang.String): Self = StObject.set(x, "applicationServerKey", value.asInstanceOf[js.Any])
    
    inline def setApplicationServerKeyNull: Self = StObject.set(x, "applicationServerKey", null)
    
    inline def setApplicationServerKeyUndefined: Self = StObject.set(x, "applicationServerKey", js.undefined)
    
    inline def setUserVisibleOnly(value: scala.Boolean): Self = StObject.set(x, "userVisibleOnly", value.asInstanceOf[js.Any])
    
    inline def setUserVisibleOnlyUndefined: Self = StObject.set(x, "userVisibleOnly", js.undefined)
  }
}
