package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardEventIOS extends StObject {
  
  /**
    * @platform ios
    */
  var isEventFromThisApp: Boolean
  
  /**
    * @platform ios
    */
  var startCoordinates: ScreenRect
}
object KeyboardEventIOS {
  
  inline def apply(isEventFromThisApp: Boolean, startCoordinates: ScreenRect): KeyboardEventIOS = {
    val __obj = js.Dynamic.literal(isEventFromThisApp = isEventFromThisApp.asInstanceOf[js.Any], startCoordinates = startCoordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEventIOS]
  }
  
  extension [Self <: KeyboardEventIOS](x: Self) {
    
    inline def setIsEventFromThisApp(value: Boolean): Self = StObject.set(x, "isEventFromThisApp", value.asInstanceOf[js.Any])
    
    inline def setStartCoordinates(value: ScreenRect): Self = StObject.set(x, "startCoordinates", value.asInstanceOf[js.Any])
  }
}
