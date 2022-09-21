package typings.reactNativeElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementHeight extends StObject {
  
  var elementHeight: Double
  
  var elementWidth: Double
  
  var isVisible: Boolean
  
  var xOffset: Double
  
  var yOffset: Double
}
object ElementHeight {
  
  inline def apply(elementHeight: Double, elementWidth: Double, isVisible: Boolean, xOffset: Double, yOffset: Double): ElementHeight = {
    val __obj = js.Dynamic.literal(elementHeight = elementHeight.asInstanceOf[js.Any], elementWidth = elementWidth.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementHeight]
  }
  
  extension [Self <: ElementHeight](x: Self) {
    
    inline def setElementHeight(value: Double): Self = StObject.set(x, "elementHeight", value.asInstanceOf[js.Any])
    
    inline def setElementWidth(value: Double): Self = StObject.set(x, "elementWidth", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
    
    inline def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
  }
}
