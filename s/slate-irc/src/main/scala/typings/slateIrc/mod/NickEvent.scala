package typings.slateIrc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NickEvent extends js.Object {
  
  var hostmask: String = js.native
  
  var `new`: String = js.native
  
  var nick: String = js.native
}
object NickEvent {
  
  @scala.inline
  def apply(hostmask: String, `new`: String, nick: String): NickEvent = {
    val __obj = js.Dynamic.literal(hostmask = hostmask.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NickEvent]
  }
  
  @scala.inline
  implicit class NickEventOps[Self <: NickEvent] (val x: Self) extends AnyVal {
    
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
    def setHostmask(value: String): Self = this.set("hostmask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew(value: String): Self = this.set("new", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNick(value: String): Self = this.set("nick", value.asInstanceOf[js.Any])
  }
}
