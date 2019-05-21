package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventUserLocation
  extends reactLib.reactMod.BaseSyntheticEvent[js.Object, reactDashNativeLib.NodeHandle, reactDashNativeLib.NodeHandle] {
  @JSName("nativeEvent")
  var nativeEvent_EventUserLocation: reactDashNativeDashMapsLib.Anon_CoordinateAnonAccuracy
}

object EventUserLocation {
  @scala.inline
  def apply(
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: reactDashNativeLib.NodeHandle,
    defaultPrevented: scala.Boolean,
    eventPhase: scala.Double,
    isDefaultPrevented: () => scala.Boolean,
    isPropagationStopped: () => scala.Boolean,
    isTrusted: scala.Boolean,
    nativeEvent: reactDashNativeDashMapsLib.Anon_CoordinateAnonAccuracy,
    persist: () => scala.Unit,
    preventDefault: () => scala.Unit,
    stopPropagation: () => scala.Unit,
    target: reactDashNativeLib.NodeHandle,
    timeStamp: scala.Double,
    `type`: java.lang.String
  ): EventUserLocation = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, currentTarget = currentTarget, defaultPrevented = defaultPrevented, eventPhase = eventPhase, isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted, nativeEvent = nativeEvent, persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EventUserLocation]
  }
}

