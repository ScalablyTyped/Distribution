package typings
package rxjsLib.internalObservableFromEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeCompatibleEventEmitter
  extends EventTargetLike[js.Any] {
  def addListener(eventName: java.lang.String, handler: NodeEventHandler): scala.Unit | js.Object
  def removeListener(eventName: java.lang.String, handler: NodeEventHandler): scala.Unit | js.Object
}

object NodeCompatibleEventEmitter {
  @scala.inline
  def apply(
    addListener: js.Function2[java.lang.String, NodeEventHandler, scala.Unit | js.Object],
    removeListener: js.Function2[java.lang.String, NodeEventHandler, scala.Unit | js.Object]
  ): NodeCompatibleEventEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(addListener)
    __obj.updateDynamic("removeListener")(removeListener)
    __obj.asInstanceOf[NodeCompatibleEventEmitter]
  }
}

