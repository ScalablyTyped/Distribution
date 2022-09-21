package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Friction extends StObject {
  
  var friction: Double
  
  var overshootFriction: Double
  
  var useNativeAnimations: Boolean
}
object Friction {
  
  inline def apply(friction: Double, overshootFriction: Double, useNativeAnimations: Boolean): Friction = {
    val __obj = js.Dynamic.literal(friction = friction.asInstanceOf[js.Any], overshootFriction = overshootFriction.asInstanceOf[js.Any], useNativeAnimations = useNativeAnimations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Friction]
  }
  
  extension [Self <: Friction](x: Self) {
    
    inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    inline def setOvershootFriction(value: Double): Self = StObject.set(x, "overshootFriction", value.asInstanceOf[js.Any])
    
    inline def setUseNativeAnimations(value: Boolean): Self = StObject.set(x, "useNativeAnimations", value.asInstanceOf[js.Any])
  }
}
