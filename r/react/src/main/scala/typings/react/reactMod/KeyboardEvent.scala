package typings.react.reactMod

import typings.react.EventTarget
import typings.react.NativeKeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardEvent[T] extends BaseSyntheticEvent[NativeKeyboardEvent, EventTarget with T, EventTarget] {
  var altKey: Boolean
  var charCode: Double
  var ctrlKey: Boolean
  /**
    * See the [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#named-key-attribute-values). for possible values
    */
  var key: String
  var keyCode: Double
  var locale: String
  var location: Double
  var metaKey: Boolean
  var repeat: Boolean
  var shiftKey: Boolean
  var which: Double
  /**
    * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
    */
  def getModifierState(key: String): Boolean
}

object KeyboardEvent {
  @scala.inline
  def apply[T](
    altKey: Boolean,
    bubbles: Boolean,
    cancelable: Boolean,
    charCode: Double,
    ctrlKey: Boolean,
    currentTarget: EventTarget with T,
    defaultPrevented: Boolean,
    eventPhase: Double,
    getModifierState: String => Boolean,
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    key: String,
    keyCode: Double,
    locale: String,
    location: Double,
    metaKey: Boolean,
    nativeEvent: NativeKeyboardEvent,
    persist: () => Unit,
    preventDefault: () => Unit,
    repeat: Boolean,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: String,
    which: Double
  ): KeyboardEvent[T] = {
    val __obj = js.Dynamic.literal(altKey = altKey, bubbles = bubbles, cancelable = cancelable, charCode = charCode, ctrlKey = ctrlKey, currentTarget = currentTarget, defaultPrevented = defaultPrevented, eventPhase = eventPhase, getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted, key = key, keyCode = keyCode, locale = locale, location = location, metaKey = metaKey, nativeEvent = nativeEvent, persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), repeat = repeat, shiftKey = shiftKey, stopPropagation = js.Any.fromFunction0(stopPropagation), target = target, timeStamp = timeStamp, which = which)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[KeyboardEvent[T]]
  }
}

