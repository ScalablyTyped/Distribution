package typings.react.reactMod

import typings.react.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseEvent[T, E] extends BaseSyntheticEvent[E, EventTarget with T, EventTarget] {
  var altKey: Boolean
  var button: Double
  var buttons: Double
  var clientX: Double
  var clientY: Double
  var ctrlKey: Boolean
  var metaKey: Boolean
  var movementX: Double
  var movementY: Double
  var pageX: Double
  var pageY: Double
  var relatedTarget: EventTarget
  var screenX: Double
  var screenY: Double
  var shiftKey: Boolean
  /**
    * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
    */
  def getModifierState(key: String): Boolean
}

object MouseEvent {
  @scala.inline
  def apply[T, E](
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
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    metaKey: Boolean,
    movementX: Double,
    movementY: Double,
    nativeEvent: E,
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
  ): MouseEvent[T, E] = {
    val __obj = js.Dynamic.literal(altKey = altKey, bubbles = bubbles, button = button, buttons = buttons, cancelable = cancelable, clientX = clientX, clientY = clientY, ctrlKey = ctrlKey, currentTarget = currentTarget, defaultPrevented = defaultPrevented, eventPhase = eventPhase, getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted, metaKey = metaKey, movementX = movementX, movementY = movementY, nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX, pageY = pageY, persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget, screenX = screenX, screenY = screenY, shiftKey = shiftKey, stopPropagation = js.Any.fromFunction0(stopPropagation), target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MouseEvent[T, E]]
  }
}

