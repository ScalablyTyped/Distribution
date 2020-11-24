package typings.stompjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Incoming extends js.Object {
  
  var incoming: Double = js.native
  
  var outgoing: Double = js.native
}
object Incoming {
  
  @scala.inline
  def apply(incoming: Double, outgoing: Double): Incoming = {
    val __obj = js.Dynamic.literal(incoming = incoming.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Incoming]
  }
  
  @scala.inline
  implicit class IncomingOps[Self <: Incoming] (val x: Self) extends AnyVal {
    
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
    def setIncoming(value: Double): Self = this.set("incoming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoing(value: Double): Self = this.set("outgoing", value.asInstanceOf[js.Any])
  }
}
