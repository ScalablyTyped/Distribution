package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragEvent[T]
  extends MouseEvent[T, reactLib.NativeDragEvent] {
  var dataTransfer: reactLib.DataTransfer
}

object DragEvent {
  @scala.inline
  def apply[T](
    altKey: scala.Boolean,
    bubbles: scala.Boolean,
    button: scala.Double,
    buttons: scala.Double,
    cancelable: scala.Boolean,
    clientX: scala.Double,
    clientY: scala.Double,
    ctrlKey: scala.Boolean,
    currentTarget: reactLib.EventTarget with T,
    dataTransfer: reactLib.DataTransfer,
    defaultPrevented: scala.Boolean,
    eventPhase: scala.Double,
    getModifierState: js.Function1[java.lang.String, scala.Boolean],
    isDefaultPrevented: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    isTrusted: scala.Boolean,
    metaKey: scala.Boolean,
    movementX: scala.Double,
    movementY: scala.Double,
    nativeEvent: reactLib.NativeDragEvent,
    pageX: scala.Double,
    pageY: scala.Double,
    persist: js.Function0[scala.Unit],
    preventDefault: js.Function0[scala.Unit],
    relatedTarget: reactLib.EventTarget,
    screenX: scala.Double,
    screenY: scala.Double,
    shiftKey: scala.Boolean,
    stopPropagation: js.Function0[scala.Unit],
    target: reactLib.EventTarget,
    timeStamp: scala.Double,
    `type`: java.lang.String
  ): DragEvent[T] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("altKey")(altKey)
    __obj.updateDynamic("bubbles")(bubbles)
    __obj.updateDynamic("button")(button)
    __obj.updateDynamic("buttons")(buttons)
    __obj.updateDynamic("cancelable")(cancelable)
    __obj.updateDynamic("clientX")(clientX)
    __obj.updateDynamic("clientY")(clientY)
    __obj.updateDynamic("ctrlKey")(ctrlKey)
    __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.updateDynamic("dataTransfer")(dataTransfer)
    __obj.updateDynamic("defaultPrevented")(defaultPrevented)
    __obj.updateDynamic("eventPhase")(eventPhase)
    __obj.updateDynamic("getModifierState")(getModifierState)
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped)
    __obj.updateDynamic("isTrusted")(isTrusted)
    __obj.updateDynamic("metaKey")(metaKey)
    __obj.updateDynamic("movementX")(movementX)
    __obj.updateDynamic("movementY")(movementY)
    __obj.updateDynamic("nativeEvent")(nativeEvent)
    __obj.updateDynamic("pageX")(pageX)
    __obj.updateDynamic("pageY")(pageY)
    __obj.updateDynamic("persist")(persist)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("relatedTarget")(relatedTarget)
    __obj.updateDynamic("screenX")(screenX)
    __obj.updateDynamic("screenY")(screenY)
    __obj.updateDynamic("shiftKey")(shiftKey)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.asInstanceOf[DragEvent[T]]
  }
}

