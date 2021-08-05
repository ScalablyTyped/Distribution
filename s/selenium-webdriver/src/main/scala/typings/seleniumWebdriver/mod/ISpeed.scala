package typings.seleniumWebdriver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISpeed extends StObject {
  
  var xspeed: Double
  
  var yspeed: Double
}
object ISpeed {
  
  inline def apply(xspeed: Double, yspeed: Double): ISpeed = {
    val __obj = js.Dynamic.literal(xspeed = xspeed.asInstanceOf[js.Any], yspeed = yspeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpeed]
  }
  
  extension [Self <: ISpeed](x: Self) {
    
    inline def setXspeed(value: Double): Self = StObject.set(x, "xspeed", value.asInstanceOf[js.Any])
    
    inline def setYspeed(value: Double): Self = StObject.set(x, "yspeed", value.asInstanceOf[js.Any])
  }
}
