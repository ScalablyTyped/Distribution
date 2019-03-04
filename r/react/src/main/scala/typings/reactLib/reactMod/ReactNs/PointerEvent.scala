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
    val __obj = js.Dynamic.literal(altKey = altKey, bubbles = bubbles, button = button, buttons = buttons, cancelable = cancelable, clientX = clientX, clientY = clientY, ctrlKey = ctrlKey, currentTarget = currentTarget, defaultPrevented = defaultPrevented, eventPhase = eventPhase, getModifierState = getModifierState, height = height, isDefaultPrevented = isDefaultPrevented, isPrimary = isPrimary, isPropagationStopped = isPropagationStopped, isTrusted = isTrusted, metaKey = metaKey, movementX = movementX, movementY = movementY, nativeEvent = nativeEvent, pageX = pageX, pageY = pageY, persist = persist, pointerId = pointerId, pointerType = pointerType.asInstanceOf[js.Any], pressure = pressure, preventDefault = preventDefault, relatedTarget = relatedTarget, screenX = screenX, screenY = screenY, shiftKey = shiftKey, stopPropagation = stopPropagation, target = target, tiltX = tiltX, tiltY = tiltY, timeStamp = timeStamp, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PointerEvent[T]]
  }
}

