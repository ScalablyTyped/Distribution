package typings.sipml.SIPml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTarget[EventSubscriptionType /* <: String */, EventType /* <: Event */] extends js.Object {
  
  def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[/* e */ EventType, Unit]): Unit = js.native
  
  def removeEventListener(`type`: EventSubscriptionType): Unit = js.native
}
object EventTarget {
  
  @scala.inline
  def apply[EventSubscriptionType /* <: String */, EventType /* <: Event */](
    addEventListener: (EventSubscriptionType, js.Function1[/* e */ EventType, Unit]) => Unit,
    removeEventListener: EventSubscriptionType => Unit
  ): EventTarget[EventSubscriptionType, EventType] = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[EventTarget[EventSubscriptionType, EventType]]
  }
  
  @scala.inline
  implicit class EventTargetOps[Self <: EventTarget[_, _], EventSubscriptionType /* <: String */, EventType /* <: Event */] (val x: Self with (EventTarget[EventSubscriptionType, EventType])) extends AnyVal {
    
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
    def setAddEventListener(value: (EventSubscriptionType, js.Function1[/* e */ EventType, Unit]) => Unit): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveEventListener(value: EventSubscriptionType => Unit): Self = this.set("removeEventListener", js.Any.fromFunction1(value))
  }
}
