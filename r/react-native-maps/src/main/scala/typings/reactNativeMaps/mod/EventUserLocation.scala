package typings.reactNativeMaps.mod

import typings.react.mod.BaseSyntheticEvent
import typings.reactNative.mod.NodeHandle
import typings.reactNativeMaps.anon.CoordinateAccuracy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventUserLocation
  extends BaseSyntheticEvent[js.Object, NodeHandle, NodeHandle] {
  @JSName("nativeEvent")
  var nativeEvent_EventUserLocation: CoordinateAccuracy = js.native
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
    nativeEvent: CoordinateAccuracy,
    persist: () => Unit,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: NodeHandle,
    timeStamp: Double,
    `type`: String
  ): EventUserLocation = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventUserLocation]
  }
  @scala.inline
  implicit class EventUserLocationOps[Self <: EventUserLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNativeEvent(value: CoordinateAccuracy): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
  }
  
}

