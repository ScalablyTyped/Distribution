package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerEvent[T]
  extends MouseEvent[T, reactLib.NativePointerEvent] {
  var height: scala.Double
  var isPrimary: scala.Boolean
  var pointerId: scala.Double
  var pointerType: reactLib.reactLibStrings.mouse | reactLib.reactLibStrings.pen | reactLib.reactLibStrings.touch
  var pressure: scala.Double
  var tiltX: scala.Double
  var tiltY: scala.Double
  var width: scala.Double
}

object PointerEvent {
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
    defaultPrevented: scala.Boolean,
    eventPhase: scala.Double,
    getModifierState: js.Function1[java.lang.String, scala.Boolean],
    height: scala.Double,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isPrimary: scala.Boolean,
    isPropagationStopped: js.Function0[scala.Boolean],
    isTrusted: scala.Boolean,
    metaKey: scala.Boolean,
    movementX: scala.Double,
    movementY: scala.Double,
    nativeEvent: reactLib.NativePointerEvent,
    pageX: scala.Double,
    pageY: scala.Double,
    persist: js.Function0[scala.Unit],
    pointerId: scala.Double,
    pointerType: reactLib.reactLibStrings.mouse | reactLib.reactLibStrings.pen | reactLib.reactLibStrings.touch,
    pressure: scala.Double,
    preventDefault: js.Function0[scala.Unit],
    relatedTarget: reactLib.EventTarget,
    screenX: scala.Double,
    screenY: scala.Double,
    shiftKey: scala.Boolean,
    stopPropagation: js.Function0[scala.Unit],
    target: reactLib.EventTarget,
    tiltX: scala.Double,
    tiltY: scala.Double,
    timeStamp: scala.Double,
    `type`: java.lang.String,
    width: scala.Double
  ): PointerEvent[T] = {
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
    __obj.updateDynamic("defaultPrevented")(defaultPrevented)
    __obj.updateDynamic("eventPhase")(eventPhase)
    __obj.updateDynamic("getModifierState")(getModifierState)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("isPrimary")(isPrimary)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped)
    __obj.updateDynamic("isTrusted")(isTrusted)
    __obj.updateDynamic("metaKey")(metaKey)
    __obj.updateDynamic("movementX")(movementX)
    __obj.updateDynamic("movementY")(movementY)
    __obj.updateDynamic("nativeEvent")(nativeEvent)
    __obj.updateDynamic("pageX")(pageX)
    __obj.updateDynamic("pageY")(pageY)
    __obj.updateDynamic("persist")(persist)
    __obj.updateDynamic("pointerId")(pointerId)
    __obj.updateDynamic("pointerType")(pointerType.asInstanceOf[js.Any])
    __obj.updateDynamic("pressure")(pressure)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("relatedTarget")(relatedTarget)
    __obj.updateDynamic("screenX")(screenX)
    __obj.updateDynamic("screenY")(screenY)
    __obj.updateDynamic("shiftKey")(shiftKey)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("tiltX")(tiltX)
    __obj.updateDynamic("tiltY")(tiltY)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[PointerEvent[T]]
  }
}

