package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleYTransform extends StObject {
  
  var scaleY: Double
}
object ScaleYTransform {
  
  inline def apply(scaleY: Double): ScaleYTransform = {
    val __obj = js.Dynamic.literal(scaleY = scaleY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleYTransform]
  }
  
  extension [Self <: ScaleYTransform](x: Self) {
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
  }
}
