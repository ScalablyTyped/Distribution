package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardEvent[T]
  extends BaseSyntheticEvent[reactLib.NativeKeyboardEvent, reactLib.EventTarget with T, reactLib.EventTarget] {
  var altKey: scala.Boolean
  var charCode: scala.Double
  var ctrlKey: scala.Boolean
  /**
    * See the [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#named-key-attribute-values). for possible values
    */
  var key: java.lang.String
  var keyCode: scala.Double
  var locale: java.lang.String
  var location: scala.Double
  var metaKey: scala.Boolean
  var repeat: scala.Boolean
  var shiftKey: scala.Boolean
  var which: scala.Double
  /**
    * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
    */
  def getModifierState(key: java.lang.String): scala.Boolean
}

object KeyboardEvent {
  @scala.inline
  def apply[T](
    altKey: scala.Boolean,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    charCode: scala.Double,
    ctrlKey: scala.Boolean,
    currentTarget: reactLib.EventTarget with T,
    defaultPrevented: scala.Boolean,
    eventPhase: scala.Double,
    getModifierState: java.lang.String => scala.Boolean,
    isDefaultPrevented: () => scala.Boolean,
    isPropagationStopped: () => scala.Boolean,
    isTrusted: scala.Boolean,
    key: java.lang.String,
    keyCode: scala.Double,
    locale: java.lang.String,
    location: scala.Double,
    metaKey: scala.Boolean,
    nativeEvent: reactLib.NativeKeyboardEvent,
    persist: () => scala.Unit,
    preventDefault: () => scala.Unit,
    repeat: scala.Boolean,
    shiftKey: scala.Boolean,
    stopPropagation: () => scala.Unit,
    target: reactLib.EventTarget,
    timeStamp: scala.Double,
    `type`: java.lang.String,
    which: scala.Double
  ): KeyboardEvent[T] = {
    val __obj = js.Dynamic.literal(altKey = altKey, bubbles = bubbles, cancelable = cancelable, charCode = charCode, ctrlKey = ctrlKey, currentTarget = currentTarget, defaultPrevented = defaultPrevented, eventPhase = eventPhase, getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted, key = key, keyCode = keyCode, locale = locale, location = location, metaKey = metaKey, nativeEvent = nativeEvent, persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), repeat = repeat, shiftKey = shiftKey, stopPropagation = js.Any.fromFunction0(stopPropagation), target = target, timeStamp = timeStamp, which = which)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[KeyboardEvent[T]]
  }
}

