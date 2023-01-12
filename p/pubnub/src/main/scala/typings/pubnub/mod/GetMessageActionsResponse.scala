package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMessageActionsResponse extends StObject {
  
  var data: js.Array[MessageAction]
  
  var end: js.UndefOr[String] = js.undefined
  
  var start: js.UndefOr[String] = js.undefined
}
object GetMessageActionsResponse {
  
  inline def apply(data: js.Array[MessageAction]): GetMessageActionsResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMessageActionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMessageActionsResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[MessageAction]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: MessageAction*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
