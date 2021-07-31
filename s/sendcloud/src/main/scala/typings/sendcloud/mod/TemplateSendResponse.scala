package typings.sendcloud.mod

import typings.sendcloud.sendcloudStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateSendResponse extends StObject {
  
  var email_id_list: js.Array[String]
  
  var message: success
}
object TemplateSendResponse {
  
  @scala.inline
  def apply(email_id_list: js.Array[String]): TemplateSendResponse = {
    val __obj = js.Dynamic.literal(email_id_list = email_id_list.asInstanceOf[js.Any], message = "success")
    __obj.asInstanceOf[TemplateSendResponse]
  }
  
  @scala.inline
  implicit class TemplateSendResponseMutableBuilder[Self <: TemplateSendResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail_id_list(value: js.Array[String]): Self = StObject.set(x, "email_id_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail_id_listVarargs(value: String*): Self = StObject.set(x, "email_id_list", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: success): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
