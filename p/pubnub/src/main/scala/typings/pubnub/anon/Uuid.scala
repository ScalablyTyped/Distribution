package typings.pubnub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Uuid extends js.Object {
  
  var channel: Id = js.native
  
  var uuid: Id = js.native
}
object Uuid {
  
  @scala.inline
  def apply(channel: Id, uuid: Id): Uuid = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uuid]
  }
  
  @scala.inline
  implicit class UuidOps[Self <: Uuid] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: Id): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: Id): Self = this.set("uuid", value.asInstanceOf[js.Any])
  }
}
