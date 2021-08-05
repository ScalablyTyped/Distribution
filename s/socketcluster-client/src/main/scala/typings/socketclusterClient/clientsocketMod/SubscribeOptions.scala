package typings.socketclusterClient.clientsocketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribeOptions extends StObject {
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var waitForAuth: js.UndefOr[Boolean] = js.undefined
}
object SubscribeOptions {
  
  inline def apply(): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeOptions]
  }
  
  extension [Self <: SubscribeOptions](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setWaitForAuth(value: Boolean): Self = StObject.set(x, "waitForAuth", value.asInstanceOf[js.Any])
    
    inline def setWaitForAuthUndefined: Self = StObject.set(x, "waitForAuth", js.undefined)
  }
}
