package typings.react.reactMod

import typings.react.EventTarget
import typings.react.NativePointerEvent
import typings.react.reactStrings.mouse
import typings.react.reactStrings.pen
import typings.react.reactStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerEvent[T]
  extends typings.react.reactMod.MouseEvent[T, NativePointerEvent] {
  var height: Double
  var isPrimary: Boolean
  var pointerId: Double
  var pointerType: mouse | pen | touch
  var pressure: Double
  var tiltX: Double
  var tiltY: Double
  var width: Double
}

object PointerEvent {
  @scala.inline
  def apply[T](
    altKey: Boolean,
    bubbles: Boolean,
    button: Double,
    buttons: Double,
    cancelable: Boolean,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    currentTarget: EventTarget with T,
    defaultPrevented: Boolean,
    eventPhase: Double,
    getModifierState: String => Boolean,
    height: Double,
    isDefaultPrevented: () => Boolean,
    isPrimary: Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    metaKey: Boolean,
    movementX: Double,
    movementY: Double,
    nativeEvent: NativePointerEvent,
    pageX: Double,
    pageY: Double,
    persist: () => Unit,
    pointerId: Double,
    pointerType: mouse | pen | touch,
    pressure: Double,
    preventDefault: () => Unit,
    relatedTarget: EventTarget,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    target: EventTarget,
    tiltX: Double,
    tiltY: Double,
    timeStamp: Double,
    `type`: String,
    width: Double
  ): PointerEvent[T] = {
    val __obj = js.Dynamic.literal(altKey = altKey, bubbles = bubbles, button = button, buttons = buttons, cancelable = cancelable, clientX = clientX, clientY = clientY, ctrlKey = ctrlKey, currentTarget = currentTarget, defaultPrevented = defaultPrevented, eventPhase = eventPhase, getModifierState = js.Any.fromFunction1(getModifierState), height = height, isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPrimary = isPrimary, isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted, metaKey = metaKey, movementX = movementX, movementY = movementY, nativeEvent = nativeEvent, pageX = pageX, pageY = pageY, persist = js.Any.fromFunction0(persist), pointerId = pointerId, pointerType = pointerType.asInstanceOf[js.Any], pressure = pressure, preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget, screenX = screenX, screenY = screenY, shiftKey = shiftKey, stopPropagation = js.Any.fromFunction0(stopPropagation), target = target, tiltX = tiltX, tiltY = tiltY, timeStamp = timeStamp, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PointerEvent[T]]
  }
}

