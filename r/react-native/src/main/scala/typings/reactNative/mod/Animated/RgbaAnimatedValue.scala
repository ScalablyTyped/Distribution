package typings.reactNative.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RgbaAnimatedValue extends StObject {
  
  val a: AnimatedValue
  
  val b: AnimatedValue
  
  val g: AnimatedValue
  
  val r: AnimatedValue
}
object RgbaAnimatedValue {
  
  inline def apply(a: AnimatedValue, b: AnimatedValue, g: AnimatedValue, r: AnimatedValue): RgbaAnimatedValue = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[RgbaAnimatedValue]
  }
  
  extension [Self <: RgbaAnimatedValue](x: Self) {
    
    inline def setA(value: AnimatedValue): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: AnimatedValue): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setG(value: AnimatedValue): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setR(value: AnimatedValue): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
