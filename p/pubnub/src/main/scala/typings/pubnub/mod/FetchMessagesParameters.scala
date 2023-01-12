package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchMessagesParameters extends StObject {
  
  var channels: js.Array[String]
  
  var count: js.UndefOr[Double] = js.undefined
  
  // timetoken
  var end: js.UndefOr[String | Double] = js.undefined
  
  var includeMessageActions: js.UndefOr[Boolean] = js.undefined
  
  var includeMessageType: js.UndefOr[Boolean] = js.undefined
  
  var includeMeta: js.UndefOr[Boolean] = js.undefined
  
  var includeUUID: js.UndefOr[Boolean] = js.undefined
  
  var start: js.UndefOr[String | Double] = js.undefined
  
  var stringifiedTimeToken: js.UndefOr[Boolean] = js.undefined
  
  // timetoken
  var withMessageActions: js.UndefOr[Boolean] = js.undefined
}
object FetchMessagesParameters {
  
  inline def apply(channels: js.Array[String]): FetchMessagesParameters = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchMessagesParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchMessagesParameters] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setEnd(value: String | Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setIncludeMessageActions(value: Boolean): Self = StObject.set(x, "includeMessageActions", value.asInstanceOf[js.Any])
    
    inline def setIncludeMessageActionsUndefined: Self = StObject.set(x, "includeMessageActions", js.undefined)
    
    inline def setIncludeMessageType(value: Boolean): Self = StObject.set(x, "includeMessageType", value.asInstanceOf[js.Any])
    
    inline def setIncludeMessageTypeUndefined: Self = StObject.set(x, "includeMessageType", js.undefined)
    
    inline def setIncludeMeta(value: Boolean): Self = StObject.set(x, "includeMeta", value.asInstanceOf[js.Any])
    
    inline def setIncludeMetaUndefined: Self = StObject.set(x, "includeMeta", js.undefined)
    
    inline def setIncludeUUID(value: Boolean): Self = StObject.set(x, "includeUUID", value.asInstanceOf[js.Any])
    
    inline def setIncludeUUIDUndefined: Self = StObject.set(x, "includeUUID", js.undefined)
    
    inline def setStart(value: String | Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStringifiedTimeToken(value: Boolean): Self = StObject.set(x, "stringifiedTimeToken", value.asInstanceOf[js.Any])
    
    inline def setStringifiedTimeTokenUndefined: Self = StObject.set(x, "stringifiedTimeToken", js.undefined)
    
    inline def setWithMessageActions(value: Boolean): Self = StObject.set(x, "withMessageActions", value.asInstanceOf[js.Any])
    
    inline def setWithMessageActionsUndefined: Self = StObject.set(x, "withMessageActions", js.undefined)
  }
}
