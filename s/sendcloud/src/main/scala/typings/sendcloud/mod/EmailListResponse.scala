package typings.sendcloud.mod

import typings.sendcloud.anon.Address
import typings.sendcloud.sendcloudStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailListResponse extends js.Object {
  
  var count: Double = js.native
  
  var lists: js.Array[Address] = js.native
  
  var message: success = js.native
}
object EmailListResponse {
  
  @scala.inline
  def apply(count: Double, lists: js.Array[Address], message: success): EmailListResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailListResponse]
  }
  
  @scala.inline
  implicit class EmailListResponseOps[Self <: EmailListResponse] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListsVarargs(value: Address*): Self = this.set("lists", js.Array(value :_*))
    
    @scala.inline
    def setLists(value: js.Array[Address]): Self = this.set("lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: success): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
