package typings.reachPopover

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DirectionDown extends StObject {
    
    var directionDown: Boolean
    
    var directionLeft: Boolean
    
    var directionRight: Boolean
    
    var directionUp: Boolean
  }
  object DirectionDown {
    
    inline def apply(directionDown: Boolean, directionLeft: Boolean, directionRight: Boolean, directionUp: Boolean): DirectionDown = {
      val __obj = js.Dynamic.literal(directionDown = directionDown.asInstanceOf[js.Any], directionLeft = directionLeft.asInstanceOf[js.Any], directionRight = directionRight.asInstanceOf[js.Any], directionUp = directionUp.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectionDown]
    }
    
    extension [Self <: DirectionDown](x: Self) {
      
      inline def setDirectionDown(value: Boolean): Self = StObject.set(x, "directionDown", value.asInstanceOf[js.Any])
      
      inline def setDirectionLeft(value: Boolean): Self = StObject.set(x, "directionLeft", value.asInstanceOf[js.Any])
      
      inline def setDirectionRight(value: Boolean): Self = StObject.set(x, "directionRight", value.asInstanceOf[js.Any])
      
      inline def setDirectionUp(value: Boolean): Self = StObject.set(x, "directionUp", value.asInstanceOf[js.Any])
    }
  }
}
