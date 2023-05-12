package typings.remixRunRouter.anon

import typings.remixRunRouter.distHistoryMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentLocation extends StObject {
  
  var currentLocation: typings.remixRunRouter.distHistoryMod.Location
  
  var historyAction: Action
  
  var nextLocation: typings.remixRunRouter.distHistoryMod.Location
}
object CurrentLocation {
  
  inline def apply(
    currentLocation: typings.remixRunRouter.distHistoryMod.Location,
    historyAction: Action,
    nextLocation: typings.remixRunRouter.distHistoryMod.Location
  ): CurrentLocation = {
    val __obj = js.Dynamic.literal(currentLocation = currentLocation.asInstanceOf[js.Any], historyAction = historyAction.asInstanceOf[js.Any], nextLocation = nextLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurrentLocation] (val x: Self) extends AnyVal {
    
    inline def setCurrentLocation(value: typings.remixRunRouter.distHistoryMod.Location): Self = StObject.set(x, "currentLocation", value.asInstanceOf[js.Any])
    
    inline def setHistoryAction(value: Action): Self = StObject.set(x, "historyAction", value.asInstanceOf[js.Any])
    
    inline def setNextLocation(value: typings.remixRunRouter.distHistoryMod.Location): Self = StObject.set(x, "nextLocation", value.asInstanceOf[js.Any])
  }
}
