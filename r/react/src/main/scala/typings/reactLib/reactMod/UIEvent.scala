package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIEvent[T]
  extends BaseSyntheticEvent[reactLib.NativeUIEvent, reactLib.EventTarget with T, reactLib.EventTarget] {
  var detail: scala.Double
  var view: AbstractView
}

object UIEvent {
  @scala.inline
  def apply[T](
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: reactLib.EventTarget with T,
    defaultPrevented: scala.Boolean,
    detail: scala.Double,
    eventPhase: scala.Double,
    isDefaultPrevented: () => scala.Boolean,
    isPropagationStopped: () => scala.Boolean,
    isTrusted: scala.Boolean,
    nativeEvent: reactLib.NativeUIEvent,
    persist: () => scala.Unit,
    preventDefault: () => scala.Unit,
    stopPropagation: () => scala.Unit,
    target: reactLib.EventTarget,
    timeStamp: scala.Double,
    `type`: java.lang.String,
    view: AbstractView
  ): UIEvent[T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, currentTarget = currentTarget, defaultPrevented = defaultPrevented, detail = detail, eventPhase = eventPhase, isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted, nativeEvent = nativeEvent, persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target, timeStamp = timeStamp, view = view)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UIEvent[T]]
  }
}

