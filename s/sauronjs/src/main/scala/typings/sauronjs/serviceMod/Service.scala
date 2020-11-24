package typings.sauronjs.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Service extends js.Object {
  
  def broadcast(event: String, data: js.Any): Unit = js.native
  
  var broadcastSubject: js.Any = js.native
}
object Service {
  
  @scala.inline
  def apply(broadcast: (String, js.Any) => Unit, broadcastSubject: js.Any): Service = {
    val __obj = js.Dynamic.literal(broadcast = js.Any.fromFunction2(broadcast), broadcastSubject = broadcastSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
    
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
    def setBroadcast(value: (String, js.Any) => Unit): Self = this.set("broadcast", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBroadcastSubject(value: js.Any): Self = this.set("broadcastSubject", value.asInstanceOf[js.Any])
  }
}
