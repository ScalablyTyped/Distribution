package typings.sendcloud.mod

import typings.sendcloud.sendcloudStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessResp extends StObject {
  
  var email_id_list: js.Array[String]
  
  var message: success
}
object SuccessResp {
  
  inline def apply(email_id_list: js.Array[String]): SuccessResp = {
    val __obj = js.Dynamic.literal(email_id_list = email_id_list.asInstanceOf[js.Any], message = "success")
    __obj.asInstanceOf[SuccessResp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuccessResp] (val x: Self) extends AnyVal {
    
    inline def setEmail_id_list(value: js.Array[String]): Self = StObject.set(x, "email_id_list", value.asInstanceOf[js.Any])
    
    inline def setEmail_id_listVarargs(value: String*): Self = StObject.set(x, "email_id_list", js.Array(value*))
    
    inline def setMessage(value: success): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
