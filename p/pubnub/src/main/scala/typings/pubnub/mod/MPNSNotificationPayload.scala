package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MPNSNotificationPayload
  extends StObject
     with BaseNotificationPayload {
  
  var backContent: js.UndefOr[String] = js.undefined
  
  var backTitle: js.UndefOr[String] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object MPNSNotificationPayload {
  
  inline def apply(payload: js.Object): MPNSNotificationPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[MPNSNotificationPayload]
  }
  
  extension [Self <: MPNSNotificationPayload](x: Self) {
    
    inline def setBackContent(value: String): Self = StObject.set(x, "backContent", value.asInstanceOf[js.Any])
    
    inline def setBackContentUndefined: Self = StObject.set(x, "backContent", js.undefined)
    
    inline def setBackTitle(value: String): Self = StObject.set(x, "backTitle", value.asInstanceOf[js.Any])
    
    inline def setBackTitleUndefined: Self = StObject.set(x, "backTitle", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
