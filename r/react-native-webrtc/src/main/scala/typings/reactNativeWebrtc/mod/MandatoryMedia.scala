package typings.reactNativeWebrtc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MandatoryMedia extends StObject {
  
  var minFrameRate: Double
  
  var minHeight: Double
  
  var minWidth: Double
}
object MandatoryMedia {
  
  inline def apply(minFrameRate: Double, minHeight: Double, minWidth: Double): MandatoryMedia = {
    val __obj = js.Dynamic.literal(minFrameRate = minFrameRate.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[MandatoryMedia]
  }
  
  extension [Self <: MandatoryMedia](x: Self) {
    
    inline def setMinFrameRate(value: Double): Self = StObject.set(x, "minFrameRate", value.asInstanceOf[js.Any])
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
  }
}
