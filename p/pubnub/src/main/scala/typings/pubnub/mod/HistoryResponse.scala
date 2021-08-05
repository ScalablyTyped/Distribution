package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryResponse extends StObject {
  
  var endTimeToken: js.UndefOr[String | Double] = js.undefined
  
  var messages: js.Array[HistoryMessage]
  
  var startTimeToken: js.UndefOr[String | Double] = js.undefined
}
object HistoryResponse {
  
  inline def apply(messages: js.Array[HistoryMessage]): HistoryResponse = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryResponse]
  }
  
  extension [Self <: HistoryResponse](x: Self) {
    
    inline def setEndTimeToken(value: String | Double): Self = StObject.set(x, "endTimeToken", value.asInstanceOf[js.Any])
    
    inline def setEndTimeTokenUndefined: Self = StObject.set(x, "endTimeToken", js.undefined)
    
    inline def setMessages(value: js.Array[HistoryMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: HistoryMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    inline def setStartTimeToken(value: String | Double): Self = StObject.set(x, "startTimeToken", value.asInstanceOf[js.Any])
    
    inline def setStartTimeTokenUndefined: Self = StObject.set(x, "startTimeToken", js.undefined)
  }
}
