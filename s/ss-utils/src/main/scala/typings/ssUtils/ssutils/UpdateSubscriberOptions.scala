package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSubscriberOptions extends StObject {
  
  var SubscribeChannels: js.UndefOr[String] = js.undefined
  
  var UnsubscribeChannels: js.UndefOr[String] = js.undefined
}
object UpdateSubscriberOptions {
  
  @scala.inline
  def apply(): UpdateSubscriberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSubscriberOptions]
  }
  
  @scala.inline
  implicit class UpdateSubscriberOptionsMutableBuilder[Self <: UpdateSubscriberOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscribeChannels(value: String): Self = StObject.set(x, "SubscribeChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribeChannelsUndefined: Self = StObject.set(x, "SubscribeChannels", js.undefined)
    
    @scala.inline
    def setUnsubscribeChannels(value: String): Self = StObject.set(x, "UnsubscribeChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsubscribeChannelsUndefined: Self = StObject.set(x, "UnsubscribeChannels", js.undefined)
  }
}
