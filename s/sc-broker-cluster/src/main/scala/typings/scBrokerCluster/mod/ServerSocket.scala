package typings.scBrokerCluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerSocket extends js.Object {
  
  def emit(eventName: String, args: js.Any*): Unit = js.native
  
  var id: String = js.native
}
object ServerSocket {
  
  @scala.inline
  def apply(emit: (String, /* repeated */ js.Any) => Unit, id: String): ServerSocket = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSocket]
  }
  
  @scala.inline
  implicit class ServerSocketOps[Self <: ServerSocket] (val x: Self) extends AnyVal {
    
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
    def setEmit(value: (String, /* repeated */ js.Any) => Unit): Self = this.set("emit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
