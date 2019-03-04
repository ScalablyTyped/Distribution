package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationEvent[T]
  extends BaseSyntheticEvent[reactLib.NativeAnimationEvent, reactLib.EventTarget with T, reactLib.EventTarget] {
  var animationName: java.lang.String
  var elapsedTime: scala.Double
  var pseudoElement: java.lang.String
}

object AnimationEvent {
  @scala.inline
  def apply[T](
    animationName: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: reactLib.EventTarget with T,
    defaultPrevented: scala.Boolean,
    elapsedTime: scala.Double,
    eventPhase: scala.Double,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    isTrusted: scala.Boolean,
    nativeEvent: reactLib.NativeAnimationEvent,
    persist: js.Function0[scala.Unit],
    preventDefault: js.Function0[scala.Unit],
    pseudoElement: java.lang.String,
    stopPropagation: js.Function0[scala.Unit],
    target: reactLib.EventTarget,
    timeStamp: scala.Double,
    `type`: java.lang.String
  ): AnimationEvent[T] = {
    val __obj = js.Dynamic.literal(animationName = animationName, bubbles = bubbles, cancelable = cancelable, currentTarget = currentTarget, defaultPrevented = defaultPrevented, elapsedTime = elapsedTime, eventPhase = eventPhase, isDefaultPrevented = isDefaultPrevented, isPropagationStopped = isPropagationStopped, isTrusted = isTrusted, nativeEvent = nativeEvent, persist = persist, preventDefault = preventDefault, pseudoElement = pseudoElement, stopPropagation = stopPropagation, target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnimationEvent[T]]
  }
}

