package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<react-native.react-native.KeyboardEventIOS> */
trait KeyboardEvent extends StObject {
  
  /**
    * Always set to 0 on Android.
    */
  var duration: Double
  
  /**
    * Always set to "keyboard" on Android.
    */
  var easing: KeyboardEventEasing
  
  var endCoordinates: ScreenRect
  
  var isEventFromThisApp: js.UndefOr[Boolean] = js.undefined
  
  var startCoordinates: js.UndefOr[ScreenRect] = js.undefined
}
object KeyboardEvent {
  
  inline def apply(duration: Double, easing: KeyboardEventEasing, endCoordinates: ScreenRect): KeyboardEvent = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], endCoordinates = endCoordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyboardEvent] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEasing(value: KeyboardEventEasing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEndCoordinates(value: ScreenRect): Self = StObject.set(x, "endCoordinates", value.asInstanceOf[js.Any])
    
    inline def setIsEventFromThisApp(value: Boolean): Self = StObject.set(x, "isEventFromThisApp", value.asInstanceOf[js.Any])
    
    inline def setIsEventFromThisAppUndefined: Self = StObject.set(x, "isEventFromThisApp", js.undefined)
    
    inline def setStartCoordinates(value: ScreenRect): Self = StObject.set(x, "startCoordinates", value.asInstanceOf[js.Any])
    
    inline def setStartCoordinatesUndefined: Self = StObject.set(x, "startCoordinates", js.undefined)
  }
}
