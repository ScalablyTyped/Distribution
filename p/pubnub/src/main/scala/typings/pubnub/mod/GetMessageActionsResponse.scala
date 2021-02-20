package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMessageActionsResponse extends StObject {
  
  var data: js.Array[MessageAction] = js.native
  
  var end: js.UndefOr[String] = js.native
  
  var start: js.UndefOr[String] = js.native
}
object GetMessageActionsResponse {
  
  @scala.inline
  def apply(data: js.Array[MessageAction]): GetMessageActionsResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMessageActionsResponse]
  }
  
  @scala.inline
  implicit class GetMessageActionsResponseMutableBuilder[Self <: GetMessageActionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[MessageAction]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: MessageAction*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
