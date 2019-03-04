package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchEvent[T]
  extends BaseSyntheticEvent[reactLib.NativeTouchEvent, reactLib.EventTarget with T, reactLib.EventTarget] {
  var altKey: scala.Boolean
  var changedTouches: TouchList
  var ctrlKey: scala.Boolean
  var metaKey: scala.Boolean
  var shiftKey: scala.Boolean
  var targetTouches: TouchList
  var touches: TouchList
  /**
    * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
    */
  def getModifierState(key: java.lang.String): scala.Boolean
}

object TouchEvent {
  @scala.inline
  def apply[T](
    altKey: scala.Boolean,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    changedTouches: TouchList,
    ctrlKey: scala.Boolean,
    currentTarget: reactLib.EventTarget with T,
    defaultPrevented: scala.Boolean,
    eventPhase: scala.Double,
    getModifierState: js.Function1[java.lang.String, scala.Boolean],
    isDefaultPrevented: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    isTrusted: scala.Boolean,
    metaKey: scala.Boolean,
    nativeEvent: reactLib.NativeTouchEvent,
    persist: js.Function0[scala.Unit],
    preventDefault: js.Function0[scala.Unit],
    shiftKey: scala.Boolean,
    stopPropagation: js.Function0[scala.Unit],
    target: reactLib.EventTarget,
    targetTouches: TouchList,
    timeStamp: scala.Double,
    touches: TouchList,
    `type`: java.lang.String
  ): TouchEvent[T] = {
    val __obj = js.Dynamic.literal(altKey = altKey, bubbles = bubbles, cancelable = cancelable, changedTouches = changedTouches, ctrlKey = ctrlKey, currentTarget = currentTarget, defaultPrevented = defaultPrevented, eventPhase = eventPhase, getModifierState = getModifierState, isDefaultPrevented = isDefaultPrevented, isPropagationStopped = isPropagationStopped, isTrusted = isTrusted, metaKey = metaKey, nativeEvent = nativeEvent, persist = persist, preventDefault = preventDefault, shiftKey = shiftKey, stopPropagation = stopPropagation, target = target, targetTouches = targetTouches, timeStamp = timeStamp, touches = touches)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TouchEvent[T]]
  }
}

