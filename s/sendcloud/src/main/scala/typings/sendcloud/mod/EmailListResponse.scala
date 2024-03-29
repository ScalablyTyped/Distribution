package typings.sendcloud.mod

import typings.sendcloud.anon.Address
import typings.sendcloud.sendcloudStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailListResponse extends StObject {
  
  var count: Double
  
  var lists: js.Array[Address]
  
  var message: success
}
object EmailListResponse {
  
  inline def apply(count: Double, lists: js.Array[Address]): EmailListResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any], message = "success")
    __obj.asInstanceOf[EmailListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailListResponse] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setLists(value: js.Array[Address]): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
    
    inline def setListsVarargs(value: Address*): Self = StObject.set(x, "lists", js.Array(value*))
    
    inline def setMessage(value: success): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
