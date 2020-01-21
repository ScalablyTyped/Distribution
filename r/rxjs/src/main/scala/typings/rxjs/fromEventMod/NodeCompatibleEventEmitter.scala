package typings.rxjs.fromEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeCompatibleEventEmitter
  extends EventTargetLike[js.Any] {
  def addListener(eventName: String, handler: NodeEventHandler): Unit | js.Object
  def removeListener(eventName: String, handler: NodeEventHandler): Unit | js.Object
}

object NodeCompatibleEventEmitter {
  @scala.inline
  def apply(
    addListener: (String, NodeEventHandler) => Unit | js.Object,
    removeListener: (String, NodeEventHandler) => Unit | js.Object
  ): NodeCompatibleEventEmitter = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), removeListener = js.Any.fromFunction2(removeListener))
  
    __obj.asInstanceOf[NodeCompatibleEventEmitter]
  }
}

