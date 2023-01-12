package typings.reactNative.anon

import typings.reactNative.mod.LayoutAnimationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EaseInEaseOut extends StObject {
  
  var easeInEaseOut: LayoutAnimationConfig
  
  var linear: LayoutAnimationConfig
  
  var spring: LayoutAnimationConfig
}
object EaseInEaseOut {
  
  inline def apply(easeInEaseOut: LayoutAnimationConfig, linear: LayoutAnimationConfig, spring: LayoutAnimationConfig): EaseInEaseOut = {
    val __obj = js.Dynamic.literal(easeInEaseOut = easeInEaseOut.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], spring = spring.asInstanceOf[js.Any])
    __obj.asInstanceOf[EaseInEaseOut]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EaseInEaseOut] (val x: Self) extends AnyVal {
    
    inline def setEaseInEaseOut(value: LayoutAnimationConfig): Self = StObject.set(x, "easeInEaseOut", value.asInstanceOf[js.Any])
    
    inline def setLinear(value: LayoutAnimationConfig): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    inline def setSpring(value: LayoutAnimationConfig): Self = StObject.set(x, "spring", value.asInstanceOf[js.Any])
  }
}
