package typings.reactNativeWindows.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedX extends StObject {
  
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object AnimatedX {
  
  inline def apply(): AnimatedX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatedX]
  }
  
  extension [Self <: AnimatedX](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
