package typings.sendcloud.mod

import typings.sendcloud.anon.Createdat
import typings.sendcloud.sendcloudStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailListCreateResponse extends StObject {
  
  var list: Createdat
  
  var message: success
}
object EmailListCreateResponse {
  
  inline def apply(list: Createdat): EmailListCreateResponse = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], message = "success")
    __obj.asInstanceOf[EmailListCreateResponse]
  }
  
  extension [Self <: EmailListCreateResponse](x: Self) {
    
    inline def setList(value: Createdat): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: success): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
