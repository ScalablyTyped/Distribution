package typings.reactNativeMaps.mod

import typings.react.mod.BaseSyntheticEvent
import typings.reactNative.mod.NodeHandle
import typings.reactNativeMaps.anon.CoordinateAccuracy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventUserLocation
  extends StObject
     with BaseSyntheticEvent[js.Object, NodeHandle, NodeHandle] {
  
  @JSName("nativeEvent")
  var nativeEvent_EventUserLocation: CoordinateAccuracy
}
object EventUserLocation {
  
  inline def apply(
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
  
  extension [Self <: EventUserLocation](x: Self) {
    
    inline def setNativeEvent(value: CoordinateAccuracy): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
