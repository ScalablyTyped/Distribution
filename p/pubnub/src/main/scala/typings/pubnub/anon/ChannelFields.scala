package typings.pubnub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelFields extends StObject {
  
  var channelFields: js.UndefOr[Boolean] = js.undefined
  
  var customChannelFields: js.UndefOr[Boolean] = js.undefined
  
  var customFields: js.UndefOr[Boolean] = js.undefined
  
  var totalCount: js.UndefOr[Boolean] = js.undefined
}
object ChannelFields {
  
  inline def apply(): ChannelFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelFields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelFields] (val x: Self) extends AnyVal {
    
    inline def setChannelFields(value: Boolean): Self = StObject.set(x, "channelFields", value.asInstanceOf[js.Any])
    
    inline def setChannelFieldsUndefined: Self = StObject.set(x, "channelFields", js.undefined)
    
    inline def setCustomChannelFields(value: Boolean): Self = StObject.set(x, "customChannelFields", value.asInstanceOf[js.Any])
    
    inline def setCustomChannelFieldsUndefined: Self = StObject.set(x, "customChannelFields", js.undefined)
    
    inline def setCustomFields(value: Boolean): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    inline def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    inline def setTotalCount(value: Boolean): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
