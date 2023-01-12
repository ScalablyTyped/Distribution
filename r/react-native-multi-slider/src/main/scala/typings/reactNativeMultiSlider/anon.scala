package typings.reactNativeMultiSlider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BorderRadius extends StObject {
    
    var borderRadius: Double
    
    var height: Double
    
    var slipDisplacement: Double
    
    var width: Double
  }
  object BorderRadius {
    
    inline def apply(borderRadius: Double, height: Double, slipDisplacement: Double, width: Double): BorderRadius = {
      val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], slipDisplacement = slipDisplacement.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BorderRadius]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BorderRadius] (val x: Self) extends AnyVal {
      
      inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSlipDisplacement(value: Double): Self = StObject.set(x, "slipDisplacement", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
