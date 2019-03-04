package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusEvent[T]
  extends BaseSyntheticEvent[reactLib.NativeFocusEvent, reactLib.EventTarget with T, reactLib.EventTarget] {
  var relatedTarget: reactLib.EventTarget
  @JSName("target")
  var target_FocusEvent: reactLib.EventTarget with T
}

object FocusEvent {
  @scala.inline
  def apply[T](
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: reactLib.EventTarget with T,
    defaultPrevented: scala.Boolean,
    eventPhase: scala.Double,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    isTrusted: scala.Boolean,
    nativeEvent: reactLib.NativeFocusEvent,
    persist: js.Function0[scala.Unit],
    preventDefault: js.Function0[scala.Unit],
    relatedTarget: reactLib.EventTarget,
    stopPropagation: js.Function0[scala.Unit],
    target: reactLib.EventTarget with T,
    timeStamp: scala.Double,
    `type`: java.lang.String
  ): FocusEvent[T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, currentTarget = currentTarget, defaultPrevented = defaultPrevented, eventPhase = eventPhase, isDefaultPrevented = isDefaultPrevented, isPropagationStopped = isPropagationStopped, isTrusted = isTrusted, nativeEvent = nativeEvent, persist = persist, preventDefault = preventDefault, relatedTarget = relatedTarget, stopPropagation = stopPropagation, target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FocusEvent[T]]
  }
}

