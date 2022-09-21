package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryMessage extends StObject {
  
  var entry: Any
  
  var meta: js.UndefOr[js.Object] = js.undefined
  
  var timetoken: js.UndefOr[String | Double] = js.undefined
}
object HistoryMessage {
  
  inline def apply(entry: Any): HistoryMessage = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryMessage]
  }
  
  extension [Self <: HistoryMessage](x: Self) {
    
    inline def setEntry(value: Any): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setTimetoken(value: String | Double): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
    
    inline def setTimetokenUndefined: Self = StObject.set(x, "timetoken", js.undefined)
  }
}
