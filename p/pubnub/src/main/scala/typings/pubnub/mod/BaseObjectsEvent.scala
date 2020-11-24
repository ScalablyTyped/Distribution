package typings.pubnub.mod

import typings.pubnub.anon.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseObjectsEvent extends js.Object {
  
  var channel: String = js.native
  
  var message: EventType = js.native
  
  var publisher: js.UndefOr[String] = js.native
  
  var subscription: String | Null = js.native
  
  var timetoken: Double = js.native
}
object BaseObjectsEvent {
  
  @scala.inline
  def apply(channel: String, message: EventType, timetoken: Double): BaseObjectsEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseObjectsEvent]
  }
  
  @scala.inline
  implicit class BaseObjectsEventOps[Self <: BaseObjectsEvent] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: EventType): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimetoken(value: Double): Self = this.set("timetoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    
    @scala.inline
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionNull: Self = this.set("subscription", null)
  }
}
