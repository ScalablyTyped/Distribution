package typings.sendcloud.mod

import typings.sendcloud.anon.Createdat
import typings.sendcloud.sendcloudStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailListResponse extends StObject {
  
  var count: Double
  
  var lists: js.Array[Createdat]
  
  var message: success
}
object EmailListResponse {
  
  inline def apply(count: Double, lists: js.Array[Createdat]): EmailListResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any], message = "success")
    __obj.asInstanceOf[EmailListResponse]
  }
  
  extension [Self <: EmailListResponse](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setLists(value: js.Array[Createdat]): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
    
    inline def setListsVarargs(value: Createdat*): Self = StObject.set(x, "lists", js.Array(value*))
    
    inline def setMessage(value: success): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
