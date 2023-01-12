package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSubscriberOptions extends StObject {
  
  var SubscribeChannels: js.UndefOr[String] = js.undefined
  
  var UnsubscribeChannels: js.UndefOr[String] = js.undefined
}
object UpdateSubscriberOptions {
  
  inline def apply(): UpdateSubscriberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSubscriberOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSubscriberOptions] (val x: Self) extends AnyVal {
    
    inline def setSubscribeChannels(value: String): Self = StObject.set(x, "SubscribeChannels", value.asInstanceOf[js.Any])
    
    inline def setSubscribeChannelsUndefined: Self = StObject.set(x, "SubscribeChannels", js.undefined)
    
    inline def setUnsubscribeChannels(value: String): Self = StObject.set(x, "UnsubscribeChannels", value.asInstanceOf[js.Any])
    
    inline def setUnsubscribeChannelsUndefined: Self = StObject.set(x, "UnsubscribeChannels", js.undefined)
  }
}
