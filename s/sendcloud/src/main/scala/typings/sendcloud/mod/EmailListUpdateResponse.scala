package typings.sendcloud.mod

import typings.sendcloud.anon.Description
import typings.sendcloud.sendcloudStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailListUpdateResponse extends StObject {
  
  var list: Description
  
  var message: success
}
object EmailListUpdateResponse {
  
  inline def apply(list: Description): EmailListUpdateResponse = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], message = "success")
    __obj.asInstanceOf[EmailListUpdateResponse]
  }
  
  extension [Self <: EmailListUpdateResponse](x: Self) {
    
    inline def setList(value: Description): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: success): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
