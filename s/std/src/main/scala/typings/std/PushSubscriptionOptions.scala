package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushSubscriptionOptions extends StObject {
  
  val applicationServerKey: ArrayBuffer | Null
  
  val userVisibleOnly: scala.Boolean
}
object PushSubscriptionOptions {
  
  inline def apply(userVisibleOnly: scala.Boolean): PushSubscriptionOptions = {
    val __obj = js.Dynamic.literal(userVisibleOnly = userVisibleOnly.asInstanceOf[js.Any], applicationServerKey = null)
    __obj.asInstanceOf[PushSubscriptionOptions]
  }
  
  extension [Self <: PushSubscriptionOptions](x: Self) {
    
    inline def setApplicationServerKey(value: ArrayBuffer): Self = StObject.set(x, "applicationServerKey", value.asInstanceOf[js.Any])
    
    inline def setApplicationServerKeyNull: Self = StObject.set(x, "applicationServerKey", null)
    
    inline def setUserVisibleOnly(value: scala.Boolean): Self = StObject.set(x, "userVisibleOnly", value.asInstanceOf[js.Any])
  }
}
