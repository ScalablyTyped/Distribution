package typings.atSemanticDashUiDashReactEventDashStack.libTypesLibEventPoolMod

import typings.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.EventListeners
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventPool extends js.Object {
  val handlerSets: js.Any
  val poolName: js.Any
  def addHandlers(eventType: String, eventHandlers: EventListeners): EventPool
  def dispatchEvent(eventType: String, event: Event): Unit
  def hasHandlers(): Boolean
  def removeHandlers(eventType: String, eventHandlers: EventListeners): EventPool
}

object EventPool {
  @scala.inline
  def apply(
    addHandlers: (String, EventListeners) => EventPool,
    dispatchEvent: (String, Event) => Unit,
    handlerSets: js.Any,
    hasHandlers: () => Boolean,
    poolName: js.Any,
    removeHandlers: (String, EventListeners) => EventPool
  ): EventPool = {
    val __obj = js.Dynamic.literal(addHandlers = js.Any.fromFunction2(addHandlers), dispatchEvent = js.Any.fromFunction2(dispatchEvent), handlerSets = handlerSets.asInstanceOf[js.Any], hasHandlers = js.Any.fromFunction0(hasHandlers), poolName = poolName.asInstanceOf[js.Any], removeHandlers = js.Any.fromFunction2(removeHandlers))
  
    __obj.asInstanceOf[EventPool]
  }
}

