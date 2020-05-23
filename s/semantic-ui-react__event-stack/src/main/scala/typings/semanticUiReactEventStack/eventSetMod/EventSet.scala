package typings.semanticUiReactEventStack.eventSetMod

import typings.semanticUiReactEventStack.typesMod.EventListeners
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSet extends js.Object {
  val handlers: js.Any
  /**
    * @see https://jsperf.com/suir-eventset-addhandlers
    */
  def addHandlers(additionalHandlers: EventListeners): EventSet
  /**
    * @see https://jsperf.com/suir-eventset-dispatchsingle
    * @see https://jsperf.com/suir-eventset-dispatchmultiple2
    */
  def dispatchEvent(event: Event, dispatchAll: Boolean): Unit
  def hasHandlers(): Boolean
  /**
    * @see https://jsperf.com/suir-eventset-removehandlers
    */
  def removeHandlers(removalHandlers: EventListeners): EventSet
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
}

