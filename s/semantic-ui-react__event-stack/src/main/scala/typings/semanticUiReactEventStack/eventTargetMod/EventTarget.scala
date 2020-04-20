package typings.semanticUiReactEventStack.eventTargetMod

import typings.semanticUiReactEventStack.typesMod.EventListeners
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTarget extends js.Object {
  var addTargetHandler: js.Any
  var createEmitter: js.Any
  val handlers: js.Any
  val pools: js.Any
  var removeTargetHandler: js.Any
  val target: js.Any
  def addHandlers(poolName: String, eventType: String, eventHandlers: EventListeners): Unit
  def hasHandlers(): Boolean
  def removeHandlers(poolName: String, eventType: String, eventHandlers: EventListeners): Unit
}

object EventTarget {
  @scala.inline
  def apply(
    addHandlers: (String, String, EventListeners) => Unit,
    addTargetHandler: js.Any,
    createEmitter: js.Any,
    handlers: js.Any,
    hasHandlers: () => Boolean,
    pools: js.Any,
    removeHandlers: (String, String, EventListeners) => Unit,
    removeTargetHandler: js.Any,
    target: js.Any
  ): EventTarget = {
    val __obj = js.Dynamic.literal(addHandlers = js.Any.fromFunction3(addHandlers), addTargetHandler = addTargetHandler.asInstanceOf[js.Any], createEmitter = createEmitter.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any], hasHandlers = js.Any.fromFunction0(hasHandlers), pools = pools.asInstanceOf[js.Any], removeHandlers = js.Any.fromFunction3(removeHandlers), removeTargetHandler = removeTargetHandler.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTarget]
  }
}

