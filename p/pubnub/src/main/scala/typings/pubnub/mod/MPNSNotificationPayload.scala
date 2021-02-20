package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MPNSNotificationPayload extends BaseNotificationPayload {
  
  var backContent: js.UndefOr[String] = js.native
  
  var backTitle: js.UndefOr[String] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object MPNSNotificationPayload {
  
  @scala.inline
  def apply(payload: js.Object): MPNSNotificationPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[MPNSNotificationPayload]
  }
  
  @scala.inline
  implicit class MPNSNotificationPayloadMutableBuilder[Self <: MPNSNotificationPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackContent(value: String): Self = StObject.set(x, "backContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackContentUndefined: Self = StObject.set(x, "backContent", js.undefined)
    
    @scala.inline
    def setBackTitle(value: String): Self = StObject.set(x, "backTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackTitleUndefined: Self = StObject.set(x, "backTitle", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
