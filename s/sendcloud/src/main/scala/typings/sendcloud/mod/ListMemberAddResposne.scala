package typings.sendcloud.mod

import typings.sendcloud.sendcloudStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMemberAddResposne extends StObject {
  
  var message: success
  
  var total_counts: Double
}
object ListMemberAddResposne {
  
  inline def apply(total_counts: Double): ListMemberAddResposne = {
    val __obj = js.Dynamic.literal(message = "success", total_counts = total_counts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberAddResposne]
  }
  
  extension [Self <: ListMemberAddResposne](x: Self) {
    
    inline def setMessage(value: success): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTotal_counts(value: Double): Self = StObject.set(x, "total_counts", value.asInstanceOf[js.Any])
  }
}
