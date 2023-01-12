package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryParameters extends StObject {
  
  var channel: String
  
  var count: Double
  
  // timetoken
  var end: js.UndefOr[String | Double] = js.undefined
  
  // timetoken
  var includeMeta: js.UndefOr[Boolean] = js.undefined
  
  var includeTimetoken: js.UndefOr[Boolean] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var start: js.UndefOr[String | Double] = js.undefined
  
  var stringifiedTimeToken: js.UndefOr[Boolean] = js.undefined
}
object HistoryParameters {
  
  inline def apply(channel: String, count: Double): HistoryParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HistoryParameters] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: String | Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setIncludeMeta(value: Boolean): Self = StObject.set(x, "includeMeta", value.asInstanceOf[js.Any])
    
    inline def setIncludeMetaUndefined: Self = StObject.set(x, "includeMeta", js.undefined)
    
    inline def setIncludeTimetoken(value: Boolean): Self = StObject.set(x, "includeTimetoken", value.asInstanceOf[js.Any])
    
    inline def setIncludeTimetokenUndefined: Self = StObject.set(x, "includeTimetoken", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setStart(value: String | Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStringifiedTimeToken(value: Boolean): Self = StObject.set(x, "stringifiedTimeToken", value.asInstanceOf[js.Any])
    
    inline def setStringifiedTimeTokenUndefined: Self = StObject.set(x, "stringifiedTimeToken", js.undefined)
  }
}
