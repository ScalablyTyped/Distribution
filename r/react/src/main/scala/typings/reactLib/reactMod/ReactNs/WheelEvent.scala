package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WheelEvent[T]
  extends MouseEvent[T, reactLib.NativeWheelEvent] {
  var deltaMode: scala.Double
  var deltaX: scala.Double
  var deltaY: scala.Double
  var deltaZ: scala.Double
}

object WheelEvent {
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
    deltaMode: scala.Double,
    deltaX: scala.Double,
    deltaY: scala.Double,
    deltaZ: scala.Double,
    eventPhase: scala.Double,
    getModifierState: js.Function1[java.lang.String, scala.Boolean],
    isDefaultPrevented: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    isTrusted: scala.Boolean,
    metaKey: scala.Boolean,
    movementX: scala.Double,
    movementY: scala.Double,
    nativeEvent: reactLib.NativeWheelEvent,
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
  ): WheelEvent[T] = {
    val __obj = js.Dynamic.literal(altKey = altKey, bubbles = bubbles, button = button, buttons = buttons, cancelable = cancelable, clientX = clientX, clientY = clientY, ctrlKey = ctrlKey, currentTarget = currentTarget, defaultPrevented = defaultPrevented, deltaMode = deltaMode, deltaX = deltaX, deltaY = deltaY, deltaZ = deltaZ, eventPhase = eventPhase, getModifierState = getModifierState, isDefaultPrevented = isDefaultPrevented, isPropagationStopped = isPropagationStopped, isTrusted = isTrusted, metaKey = metaKey, movementX = movementX, movementY = movementY, nativeEvent = nativeEvent, pageX = pageX, pageY = pageY, persist = persist, preventDefault = preventDefault, relatedTarget = relatedTarget, screenX = screenX, screenY = screenY, shiftKey = shiftKey, stopPropagation = stopPropagation, target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WheelEvent[T]]
  }
}

