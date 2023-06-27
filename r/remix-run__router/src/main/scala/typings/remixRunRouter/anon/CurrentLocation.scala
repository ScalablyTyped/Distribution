package typings.remixRunRouter.anon

import typings.remixRunRouter.distHistoryMod.Action
import typings.remixRunRouter.distHistoryMod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentLocation extends StObject {
  
  var currentLocation: Location
  
  var historyAction: Action
  
  var nextLocation: Location
}
object CurrentLocation {
  
  inline def apply(currentLocation: Location, historyAction: Action, nextLocation: Location): CurrentLocation = {
    val __obj = js.Dynamic.literal(currentLocation = currentLocation.asInstanceOf[js.Any], historyAction = historyAction.asInstanceOf[js.Any], nextLocation = nextLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurrentLocation] (val x: Self) extends AnyVal {
    
    inline def setCurrentLocation(value: Location): Self = StObject.set(x, "currentLocation", value.asInstanceOf[js.Any])
    
    inline def setHistoryAction(value: Action): Self = StObject.set(x, "historyAction", value.asInstanceOf[js.Any])
    
    inline def setNextLocation(value: Location): Self = StObject.set(x, "nextLocation", value.asInstanceOf[js.Any])
  }
}
