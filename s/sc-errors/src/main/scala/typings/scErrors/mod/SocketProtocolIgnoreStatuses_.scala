package typings.scErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketProtocolIgnoreStatuses_ extends js.Object {
  
  var `1000`: String = js.native
  
  var `1001`: String = js.native
}
object SocketProtocolIgnoreStatuses_ {
  
  @scala.inline
  def apply(`1000`: String, `1001`: String): SocketProtocolIgnoreStatuses_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1000")(`1000`.asInstanceOf[js.Any])
    __obj.updateDynamic("1001")(`1001`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketProtocolIgnoreStatuses_]
  }
  
  @scala.inline
  implicit class SocketProtocolIgnoreStatuses_Ops[Self <: SocketProtocolIgnoreStatuses_] (val x: Self) extends AnyVal {
    
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
    def set1000(value: String): Self = this.set("1000", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set1001(value: String): Self = this.set("1001", value.asInstanceOf[js.Any])
  }
}
