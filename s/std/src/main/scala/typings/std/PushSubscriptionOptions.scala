package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait PushSubscriptionOptions extends StObject {
  
  /* standard dom */
  val applicationServerKey: js.typedarray.ArrayBuffer | Null
  
  /* standard dom */
  val userVisibleOnly: scala.Boolean
}
object PushSubscriptionOptions {
  
  inline def apply(userVisibleOnly: scala.Boolean): PushSubscriptionOptions = {
    val __obj = js.Dynamic.literal(userVisibleOnly = userVisibleOnly.asInstanceOf[js.Any], applicationServerKey = null)
    __obj.asInstanceOf[PushSubscriptionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PushSubscriptionOptions] (val x: Self) extends AnyVal {
    
    inline def setApplicationServerKey(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "applicationServerKey", value.asInstanceOf[js.Any])
    
    inline def setApplicationServerKeyNull: Self = StObject.set(x, "applicationServerKey", null)
    
    inline def setUserVisibleOnly(value: scala.Boolean): Self = StObject.set(x, "userVisibleOnly", value.asInstanceOf[js.Any])
  }
}
