package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Event System
// ----------------------------------------------------------------------
// TODO: change any to unknown when moving to TS v3
trait BaseSyntheticEvent[E, C, T] extends js.Object {
  var bubbles: scala.Boolean
  var cancelable: scala.Boolean
  var currentTarget: C
  var defaultPrevented: scala.Boolean
  var eventPhase: scala.Double
  var isTrusted: scala.Boolean
  var nativeEvent: E
  var target: T
  var timeStamp: scala.Double
  var `type`: java.lang.String
  def isDefaultPrevented(): scala.Boolean
  def isPropagationStopped(): scala.Boolean
  def persist(): scala.Unit
  def preventDefault(): scala.Unit
  def stopPropagation(): scala.Unit
}

object BaseSyntheticEvent {
  @scala.inline
  def apply[E, C, T](
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: C,
    defaultPrevented: scala.Boolean,
    eventPhase: scala.Double,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    isTrusted: scala.Boolean,
    nativeEvent: E,
    persist: js.Function0[scala.Unit],
    preventDefault: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: T,
    timeStamp: scala.Double,
    `type`: java.lang.String
  ): BaseSyntheticEvent[E, C, T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented, eventPhase = eventPhase, isDefaultPrevented = isDefaultPrevented, isPropagationStopped = isPropagationStopped, isTrusted = isTrusted, nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = persist, preventDefault = preventDefault, stopPropagation = stopPropagation, target = target.asInstanceOf[js.Any], timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BaseSyntheticEvent[E, C, T]]
  }
}

