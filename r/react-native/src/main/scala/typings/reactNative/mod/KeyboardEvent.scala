package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardEvent extends StObject {
  
  var duration: Double = js.native
  
  var easing: KeyboardEventEasing = js.native
  
  var endCoordinates: ScreenRect = js.native
  
  var isEventFromThisApp: Boolean = js.native
  
  var startCoordinates: ScreenRect = js.native
}
object KeyboardEvent {
  
  @scala.inline
  def apply(
    duration: Double,
    easing: KeyboardEventEasing,
    endCoordinates: ScreenRect,
    isEventFromThisApp: Boolean,
    startCoordinates: ScreenRect
  ): KeyboardEvent = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], endCoordinates = endCoordinates.asInstanceOf[js.Any], isEventFromThisApp = isEventFromThisApp.asInstanceOf[js.Any], startCoordinates = startCoordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEvent]
  }
  
  @scala.inline
  implicit class KeyboardEventMutableBuilder[Self <: KeyboardEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: KeyboardEventEasing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCoordinates(value: ScreenRect): Self = StObject.set(x, "endCoordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEventFromThisApp(value: Boolean): Self = StObject.set(x, "isEventFromThisApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartCoordinates(value: ScreenRect): Self = StObject.set(x, "startCoordinates", value.asInstanceOf[js.Any])
  }
}
