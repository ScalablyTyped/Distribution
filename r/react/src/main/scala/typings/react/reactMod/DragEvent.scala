package typings.react.reactMod

import typings.react.DataTransfer
import typings.react.EventTarget
import typings.react.NativeDragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragEvent[T]
  extends typings.react.reactMod.MouseEvent[T, NativeDragEvent] {
  var dataTransfer: DataTransfer
}

object DragEvent {
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
    dataTransfer: DataTransfer,
    defaultPrevented: Boolean,
    eventPhase: Double,
    getModifierState: String => Boolean,
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    metaKey: Boolean,
    movementX: Double,
    movementY: Double,
    nativeEvent: NativeDragEvent,
    pageX: Double,
    pageY: Double,
    persist: () => Unit,
    preventDefault: () => Unit,
    relatedTarget: EventTarget,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: String
  ): DragEvent[T] = {
    val __obj = js.Dynamic.literal(altKey = altKey, bubbles = bubbles, button = button, buttons = buttons, cancelable = cancelable, clientX = clientX, clientY = clientY, ctrlKey = ctrlKey, currentTarget = currentTarget, dataTransfer = dataTransfer, defaultPrevented = defaultPrevented, eventPhase = eventPhase, getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted, metaKey = metaKey, movementX = movementX, movementY = movementY, nativeEvent = nativeEvent, pageX = pageX, pageY = pageY, persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget, screenX = screenX, screenY = screenY, shiftKey = shiftKey, stopPropagation = js.Any.fromFunction0(stopPropagation), target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DragEvent[T]]
  }
}

