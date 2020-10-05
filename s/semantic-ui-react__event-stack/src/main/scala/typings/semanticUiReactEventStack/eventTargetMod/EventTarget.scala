package typings.semanticUiReactEventStack.eventTargetMod

import typings.semanticUiReactEventStack.typesMod.EventListeners
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTarget extends js.Object {
  var addTargetHandler: js.Any = js.native
  var createEmitter: js.Any = js.native
  val handlers: js.Any = js.native
  val pools: js.Any = js.native
  var removeTargetHandler: js.Any = js.native
  val target: js.Any = js.native
  def addHandlers(poolName: String, eventType: String, eventHandlers: EventListeners): Unit = js.native
  def hasHandlers(): Boolean = js.native
  def removeHandlers(poolName: String, eventType: String, eventHandlers: EventListeners): Unit = js.native
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
  @scala.inline
  implicit class EventTargetOps[Self <: EventTarget] (val x: Self) extends AnyVal {
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
    def setAddHandlers(value: (String, String, EventListeners) => Unit): Self = this.set("addHandlers", js.Any.fromFunction3(value))
    @scala.inline
    def setAddTargetHandler(value: js.Any): Self = this.set("addTargetHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateEmitter(value: js.Any): Self = this.set("createEmitter", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandlers(value: js.Any): Self = this.set("handlers", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasHandlers(value: () => Boolean): Self = this.set("hasHandlers", js.Any.fromFunction0(value))
    @scala.inline
    def setPools(value: js.Any): Self = this.set("pools", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveHandlers(value: (String, String, EventListeners) => Unit): Self = this.set("removeHandlers", js.Any.fromFunction3(value))
    @scala.inline
    def setRemoveTargetHandler(value: js.Any): Self = this.set("removeTargetHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

