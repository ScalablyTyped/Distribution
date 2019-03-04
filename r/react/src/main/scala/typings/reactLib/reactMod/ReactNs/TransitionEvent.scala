package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionEvent[T]
  extends BaseSyntheticEvent[reactLib.NativeTransitionEvent, reactLib.EventTarget with T, reactLib.EventTarget] {
  var elapsedTime: scala.Double
  var propertyName: java.lang.String
  var pseudoElement: java.lang.String
}

object TransitionEvent {
  @scala.inline
  def apply[T](
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: reactLib.EventTarget with T,
    defaultPrevented: scala.Boolean,
    elapsedTime: scala.Double,
    eventPhase: scala.Double,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    isTrusted: scala.Boolean,
    nativeEvent: reactLib.NativeTransitionEvent,
    persist: js.Function0[scala.Unit],
    preventDefault: js.Function0[scala.Unit],
    propertyName: java.lang.String,
    pseudoElement: java.lang.String,
    stopPropagation: js.Function0[scala.Unit],
    target: reactLib.EventTarget,
    timeStamp: scala.Double,
    `type`: java.lang.String
  ): TransitionEvent[T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, currentTarget = currentTarget, defaultPrevented = defaultPrevented, elapsedTime = elapsedTime, eventPhase = eventPhase, isDefaultPrevented = isDefaultPrevented, isPropagationStopped = isPropagationStopped, isTrusted = isTrusted, nativeEvent = nativeEvent, persist = persist, preventDefault = preventDefault, propertyName = propertyName, pseudoElement = pseudoElement, stopPropagation = stopPropagation, target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TransitionEvent[T]]
  }
}

