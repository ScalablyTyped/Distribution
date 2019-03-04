package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositionEvent[T]
  extends BaseSyntheticEvent[reactLib.NativeCompositionEvent, reactLib.EventTarget with T, reactLib.EventTarget] {
  var data: java.lang.String
}

object CompositionEvent {
  @scala.inline
  def apply[T](
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: reactLib.EventTarget with T,
    data: java.lang.String,
    defaultPrevented: scala.Boolean,
    eventPhase: scala.Double,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    isTrusted: scala.Boolean,
    nativeEvent: reactLib.NativeCompositionEvent,
    persist: js.Function0[scala.Unit],
    preventDefault: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: reactLib.EventTarget,
    timeStamp: scala.Double,
    `type`: java.lang.String
  ): CompositionEvent[T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, currentTarget = currentTarget, data = data, defaultPrevented = defaultPrevented, eventPhase = eventPhase, isDefaultPrevented = isDefaultPrevented, isPropagationStopped = isPropagationStopped, isTrusted = isTrusted, nativeEvent = nativeEvent, persist = persist, preventDefault = preventDefault, stopPropagation = stopPropagation, target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CompositionEvent[T]]
  }
}

