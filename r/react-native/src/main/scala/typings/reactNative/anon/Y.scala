package typings.reactNative.anon

import typings.reactNative.mod.Animated.AnimatedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Y extends StObject {
  
  var x: Double | AnimatedValue
  
  var y: Double | AnimatedValue
}
object Y {
  
  inline def apply(x: Double | AnimatedValue, y: Double | AnimatedValue): Y = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y]
  }
  
  extension [Self <: Y](x: Self) {
    
    inline def setX(value: Double | AnimatedValue): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double | AnimatedValue): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
