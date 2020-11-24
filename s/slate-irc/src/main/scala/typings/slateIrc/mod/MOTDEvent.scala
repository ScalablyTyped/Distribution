package typings.slateIrc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MOTDEvent extends js.Object {
  
  var motd: js.Array[String] = js.native
}
object MOTDEvent {
  
  @scala.inline
  def apply(motd: js.Array[String]): MOTDEvent = {
    val __obj = js.Dynamic.literal(motd = motd.asInstanceOf[js.Any])
    __obj.asInstanceOf[MOTDEvent]
  }
  
  @scala.inline
  implicit class MOTDEventOps[Self <: MOTDEvent] (val x: Self) extends AnyVal {
    
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
    def setMotdVarargs(value: String*): Self = this.set("motd", js.Array(value :_*))
    
    @scala.inline
    def setMotd(value: js.Array[String]): Self = this.set("motd", value.asInstanceOf[js.Any])
  }
}
