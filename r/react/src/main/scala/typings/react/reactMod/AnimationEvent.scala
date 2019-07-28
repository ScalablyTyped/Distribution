package typings.react.reactMod

import typings.react.EventTarget
import typings.react.NativeAnimationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationEvent[T] extends BaseSyntheticEvent[NativeAnimationEvent, EventTarget with T, EventTarget] {
  var animationName: String
  var elapsedTime: Double
  var pseudoElement: String
}

object AnimationEvent {
  @scala.inline
  def apply[T](
    animationName: String,
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: EventTarget with T,
    defaultPrevented: Boolean,
    elapsedTime: Double,
    eventPhase: Double,
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    nativeEvent: NativeAnimationEvent,
    persist: () => Unit,
    preventDefault: () => Unit,
    pseudoElement: String,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: String
  ): AnimationEvent[T] = {
    val __obj = js.Dynamic.literal(animationName = animationName, bubbles = bubbles, cancelable = cancelable, currentTarget = currentTarget, defaultPrevented = defaultPrevented, elapsedTime = elapsedTime, eventPhase = eventPhase, isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted, nativeEvent = nativeEvent, persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), pseudoElement = pseudoElement, stopPropagation = js.Any.fromFunction0(stopPropagation), target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnimationEvent[T]]
  }
}

