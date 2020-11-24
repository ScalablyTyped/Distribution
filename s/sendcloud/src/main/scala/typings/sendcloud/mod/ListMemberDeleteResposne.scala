package typings.sendcloud.mod

import typings.sendcloud.sendcloudStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMemberDeleteResposne extends js.Object {
  
  var del_count: Double = js.native
  
  var message: success = js.native
}
object ListMemberDeleteResposne {
  
  @scala.inline
  def apply(del_count: Double, message: success): ListMemberDeleteResposne = {
    val __obj = js.Dynamic.literal(del_count = del_count.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberDeleteResposne]
  }
  
  @scala.inline
  implicit class ListMemberDeleteResposneOps[Self <: ListMemberDeleteResposne] (val x: Self) extends AnyVal {
    
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
    def setDel_count(value: Double): Self = this.set("del_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: success): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
