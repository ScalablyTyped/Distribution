package typings.sendcloud.mod

import typings.sendcloud.anon.Address
import typings.sendcloud.sendcloudStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailListCreateResponse extends StObject {
  
  var list: Address
  
  var message: success
}
object EmailListCreateResponse {
  
  inline def apply(list: Address): EmailListCreateResponse = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], message = "success")
    __obj.asInstanceOf[EmailListCreateResponse]
  }
  
  extension [Self <: EmailListCreateResponse](x: Self) {
    
    inline def setList(value: Address): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: success): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
