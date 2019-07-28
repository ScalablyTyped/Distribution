package typings.react.reactMod

import typings.react.EventTarget
import typings.react.NativeTransitionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionEvent[T] extends BaseSyntheticEvent[NativeTransitionEvent, EventTarget with T, EventTarget] {
  var elapsedTime: Double
  var propertyName: String
  var pseudoElement: String
}

object TransitionEvent {
  @scala.inline
  def apply[T](
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: EventTarget with T,
    defaultPrevented: Boolean,
    elapsedTime: Double,
    eventPhase: Double,
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    nativeEvent: NativeTransitionEvent,
    persist: () => Unit,
    preventDefault: () => Unit,
    propertyName: String,
    pseudoElement: String,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: String
  ): TransitionEvent[T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, currentTarget = currentTarget, defaultPrevented = defaultPrevented, elapsedTime = elapsedTime, eventPhase = eventPhase, isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted, nativeEvent = nativeEvent, persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), propertyName = propertyName, pseudoElement = pseudoElement, stopPropagation = js.Any.fromFunction0(stopPropagation), target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TransitionEvent[T]]
  }
}

