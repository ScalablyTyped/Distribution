package typings.smtpapi.mod

import typings.smtpapi.smtpapiStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Header extends js.Object {
  
  var asm_group_id: Double = js.native
  
  var category: js.Array[String] = js.native
  
  var filters: js.Object = js.native
  
  var ip_pool: String = js.native
  
  var section: js.Object = js.native
  
  var send_at: _empty | Double = js.native
  
  var send_each_at: js.Array[Double] = js.native
  
  var sub: js.Object = js.native
  
  var to: js.Array[String] = js.native
  
  var unique_args: js.Object = js.native
}
object Header {
  
  @scala.inline
  def apply(
    asm_group_id: Double,
    category: js.Array[String],
    filters: js.Object,
    ip_pool: String,
    section: js.Object,
    send_at: _empty | Double,
    send_each_at: js.Array[Double],
    sub: js.Object,
    to: js.Array[String],
    unique_args: js.Object
  ): Header = {
    val __obj = js.Dynamic.literal(asm_group_id = asm_group_id.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], ip_pool = ip_pool.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], send_at = send_at.asInstanceOf[js.Any], send_each_at = send_each_at.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], unique_args = unique_args.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  
  @scala.inline
  implicit class HeaderOps[Self <: Header] (val x: Self) extends AnyVal {
    
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
    def setAsm_group_id(value: Double): Self = this.set("asm_group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryVarargs(value: String*): Self = this.set("category", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: js.Array[String]): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: js.Object): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp_pool(value: String): Self = this.set("ip_pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: js.Object): Self = this.set("section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend_at(value: _empty | Double): Self = this.set("send_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend_each_atVarargs(value: Double*): Self = this.set("send_each_at", js.Array(value :_*))
    
    @scala.inline
    def setSend_each_at(value: js.Array[Double]): Self = this.set("send_each_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSub(value: js.Object): Self = this.set("sub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToVarargs(value: String*): Self = this.set("to", js.Array(value :_*))
    
    @scala.inline
    def setTo(value: js.Array[String]): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique_args(value: js.Object): Self = this.set("unique_args", value.asInstanceOf[js.Any])
  }
}
