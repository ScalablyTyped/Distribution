package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutAnimationTypes extends StObject {
  
  var easeIn: String
  
  var easeInEaseOut: String
  
  var easeOut: String
  
  var keyboard: String
  
  var linear: String
  
  var spring: String
}
object LayoutAnimationTypes {
  
  inline def apply(
    easeIn: String,
    easeInEaseOut: String,
    easeOut: String,
    keyboard: String,
    linear: String,
    spring: String
  ): LayoutAnimationTypes = {
    val __obj = js.Dynamic.literal(easeIn = easeIn.asInstanceOf[js.Any], easeInEaseOut = easeInEaseOut.asInstanceOf[js.Any], easeOut = easeOut.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], spring = spring.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutAnimationTypes]
  }
  
  extension [Self <: LayoutAnimationTypes](x: Self) {
    
    inline def setEaseIn(value: String): Self = StObject.set(x, "easeIn", value.asInstanceOf[js.Any])
    
    inline def setEaseInEaseOut(value: String): Self = StObject.set(x, "easeInEaseOut", value.asInstanceOf[js.Any])
    
    inline def setEaseOut(value: String): Self = StObject.set(x, "easeOut", value.asInstanceOf[js.Any])
    
    inline def setKeyboard(value: String): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setLinear(value: String): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    inline def setSpring(value: String): Self = StObject.set(x, "spring", value.asInstanceOf[js.Any])
  }
}
