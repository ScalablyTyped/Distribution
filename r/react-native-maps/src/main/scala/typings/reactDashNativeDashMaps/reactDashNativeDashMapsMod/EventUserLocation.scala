package typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod

import typings.react.reactMod.BaseSyntheticEvent
import typings.reactDashNative.NodeHandle
import typings.reactDashNativeDashMaps.Anon_CoordinateAnonAccuracy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventUserLocation
  extends BaseSyntheticEvent[js.Object, NodeHandle, NodeHandle] {
  @JSName("nativeEvent")
  var nativeEvent_EventUserLocation: Anon_CoordinateAnonAccuracy
}

object EventUserLocation {
  @scala.inline
  def apply(
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: NodeHandle,
    defaultPrevented: Boolean,
    eventPhase: Double,
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    nativeEvent: Anon_CoordinateAnonAccuracy,
    persist: () => Unit,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: NodeHandle,
    timeStamp: Double,
    `type`: String
  ): EventUserLocation = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, currentTarget = currentTarget, defaultPrevented = defaultPrevented, eventPhase = eventPhase, isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted, nativeEvent = nativeEvent, persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EventUserLocation]
  }
}

