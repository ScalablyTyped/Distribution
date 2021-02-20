package typings.ptomasroosReactNativeMultiSlider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BorderRadius extends StObject {
    
    var borderRadius: Double = js.native
    
    var height: Double = js.native
    
    var slipDisplacement: Double = js.native
    
    var width: Double = js.native
  }
  object BorderRadius {
    
    @scala.inline
    def apply(borderRadius: Double, height: Double, slipDisplacement: Double, width: Double): BorderRadius = {
      val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], slipDisplacement = slipDisplacement.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BorderRadius]
    }
    
    @scala.inline
    implicit class BorderRadiusMutableBuilder[Self <: BorderRadius] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlipDisplacement(value: Double): Self = StObject.set(x, "slipDisplacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
