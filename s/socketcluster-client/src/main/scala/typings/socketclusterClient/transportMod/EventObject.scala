package typings.socketclusterClient.transportMod

import typings.node.NodeJS.Timer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventObject extends js.Object {
  
  var callback: js.UndefOr[EventObjectCallback] = js.native
  
  var cid: js.UndefOr[Double] = js.native
  
  var data: js.Any = js.native
  
  var event: String = js.native
  
  var timeout: js.UndefOr[Timer] = js.native
}
object EventObject {
  
  @scala.inline
  def apply(data: js.Any, event: String): EventObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObject]
  }
  
  @scala.inline
  implicit class EventObjectOps[Self <: EventObject] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallback(value: (/* error */ Error, /* eventObject */ EventObject) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCid(value: Double): Self = this.set("cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCid: Self = this.set("cid", js.undefined)
    
    @scala.inline
    def setTimeout(value: Timer): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
