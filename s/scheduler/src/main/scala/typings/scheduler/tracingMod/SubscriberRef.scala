package typings.scheduler.tracingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriberRef extends js.Object {
  
  var current: Subscriber | Null = js.native
}
object SubscriberRef {
  
  @scala.inline
  def apply(): SubscriberRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriberRef]
  }
  
  @scala.inline
  implicit class SubscriberRefOps[Self <: SubscriberRef] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: Subscriber): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentNull: Self = this.set("current", null)
  }
}
