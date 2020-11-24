package typings.sipml.anon

import typings.sipml.SIPml.Stack.Event
import typings.sipml.SIPml.Stack.EventSubscriptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Listener extends js.Object {
  
  var events: EventSubscriptionType | js.Array[EventSubscriptionType] = js.native
  
  def listener(e: Event): Unit = js.native
}
object Listener {
  
  @scala.inline
  def apply(events: EventSubscriptionType | js.Array[EventSubscriptionType], listener: Event => Unit): Listener = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], listener = js.Any.fromFunction1(listener))
    __obj.asInstanceOf[Listener]
  }
  
  @scala.inline
  implicit class ListenerOps[Self <: Listener] (val x: Self) extends AnyVal {
    
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
    def setEventsVarargs(value: EventSubscriptionType*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: EventSubscriptionType | js.Array[EventSubscriptionType]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListener(value: Event => Unit): Self = this.set("listener", js.Any.fromFunction1(value))
  }
}
