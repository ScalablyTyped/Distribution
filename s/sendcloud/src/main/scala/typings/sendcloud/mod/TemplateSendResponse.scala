package typings.sendcloud.mod

import typings.sendcloud.sendcloudStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateSendResponse extends js.Object {
  
  var email_id_list: js.Array[String] = js.native
  
  var message: success = js.native
}
object TemplateSendResponse {
  
  @scala.inline
  def apply(email_id_list: js.Array[String], message: success): TemplateSendResponse = {
    val __obj = js.Dynamic.literal(email_id_list = email_id_list.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateSendResponse]
  }
  
  @scala.inline
  implicit class TemplateSendResponseOps[Self <: TemplateSendResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmail_id_listVarargs(value: String*): Self = this.set("email_id_list", js.Array(value :_*))
    
    @scala.inline
    def setEmail_id_list(value: js.Array[String]): Self = this.set("email_id_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: success): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
