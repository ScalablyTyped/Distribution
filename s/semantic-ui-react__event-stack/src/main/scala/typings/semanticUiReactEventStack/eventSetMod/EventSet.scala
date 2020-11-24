package typings.semanticUiReactEventStack.eventSetMod

import typings.semanticUiReactEventStack.typesMod.EventListeners
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSet extends js.Object {
  
  /**
    * @see https://jsperf.com/suir-eventset-addhandlers
    */
  def addHandlers(additionalHandlers: EventListeners): EventSet = js.native
  
  /**
    * @see https://jsperf.com/suir-eventset-dispatchsingle
    * @see https://jsperf.com/suir-eventset-dispatchmultiple2
    */
  def dispatchEvent(event: Event, dispatchAll: Boolean): Unit = js.native
  
  val handlers: js.Any = js.native
  
  def hasHandlers(): Boolean = js.native
  
  /**
    * @see https://jsperf.com/suir-eventset-removehandlers
    */
  def removeHandlers(removalHandlers: EventListeners): EventSet = js.native
}
object EventSet {
  
  @scala.inline
  def apply(
    addHandlers: EventListeners => EventSet,
    dispatchEvent: (Event, Boolean) => Unit,
    handlers: js.Any,
    hasHandlers: () => Boolean,
    removeHandlers: EventListeners => EventSet
  ): EventSet = {
    val __obj = js.Dynamic.literal(addHandlers = js.Any.fromFunction1(addHandlers), dispatchEvent = js.Any.fromFunction2(dispatchEvent), handlers = handlers.asInstanceOf[js.Any], hasHandlers = js.Any.fromFunction0(hasHandlers), removeHandlers = js.Any.fromFunction1(removeHandlers))
    __obj.asInstanceOf[EventSet]
  }
  
  @scala.inline
  implicit class EventSetOps[Self <: EventSet] (val x: Self) extends AnyVal {
    
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
    def setAddHandlers(value: EventListeners => EventSet): Self = this.set("addHandlers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDispatchEvent(value: (Event, Boolean) => Unit): Self = this.set("dispatchEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHandlers(value: js.Any): Self = this.set("handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasHandlers(value: () => Boolean): Self = this.set("hasHandlers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveHandlers(value: EventListeners => EventSet): Self = this.set("removeHandlers", js.Any.fromFunction1(value))
  }
}
