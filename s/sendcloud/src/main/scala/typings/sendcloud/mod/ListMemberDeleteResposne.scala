package typings.sendcloud.mod

import typings.sendcloud.sendcloudStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMemberDeleteResposne extends StObject {
  
  var del_count: Double
  
  var message: success
}
object ListMemberDeleteResposne {
  
  inline def apply(del_count: Double): ListMemberDeleteResposne = {
    val __obj = js.Dynamic.literal(del_count = del_count.asInstanceOf[js.Any], message = "success")
    __obj.asInstanceOf[ListMemberDeleteResposne]
  }
  
  extension [Self <: ListMemberDeleteResposne](x: Self) {
    
    inline def setDel_count(value: Double): Self = StObject.set(x, "del_count", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: success): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
