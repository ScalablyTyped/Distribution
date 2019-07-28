package typings.react.reactMod

import typings.react.EventTarget
import typings.react.NativeTouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchEvent[T] extends BaseSyntheticEvent[NativeTouchEvent, EventTarget with T, EventTarget] {
  var altKey: Boolean
  var changedTouches: typings.react.reactMod.TouchList
  var ctrlKey: Boolean
  var metaKey: Boolean
  var shiftKey: Boolean
  var targetTouches: typings.react.reactMod.TouchList
  var touches: typings.react.reactMod.TouchList
  /**
    * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
    */
  def getModifierState(key: String): Boolean
}

object TouchEvent {
  @scala.inline
  def apply[T](
    altKey: Boolean,
    bubbles: Boolean,
    cancelable: Boolean,
    changedTouches: typings.react.reactMod.TouchList,
    ctrlKey: Boolean,
    currentTarget: EventTarget with T,
    defaultPrevented: Boolean,
    eventPhase: Double,
    getModifierState: String => Boolean,
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    metaKey: Boolean,
    nativeEvent: NativeTouchEvent,
    persist: () => Unit,
    preventDefault: () => Unit,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    target: EventTarget,
    targetTouches: typings.react.reactMod.TouchList,
    timeStamp: Double,
    touches: typings.react.reactMod.TouchList,
    `type`: String
  ): TouchEvent[T] = {
    val __obj = js.Dynamic.literal(altKey = altKey, bubbles = bubbles, cancelable = cancelable, changedTouches = changedTouches, ctrlKey = ctrlKey, currentTarget = currentTarget, defaultPrevented = defaultPrevented, eventPhase = eventPhase, getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted, metaKey = metaKey, nativeEvent = nativeEvent, persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey, stopPropagation = js.Any.fromFunction0(stopPropagation), target = target, targetTouches = targetTouches, timeStamp = timeStamp, touches = touches)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TouchEvent[T]]
  }
}

