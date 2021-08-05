package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearGradientProps extends StObject {
  
  var gradientTransform: js.UndefOr[ColumnMajorTransformMatrix | String] = js.undefined
  
  var gradientUnits: js.UndefOr[Units] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var x1: js.UndefOr[NumberProp] = js.undefined
  
  var x2: js.UndefOr[NumberProp] = js.undefined
  
  var y1: js.UndefOr[NumberProp] = js.undefined
  
  var y2: js.UndefOr[NumberProp] = js.undefined
}
object LinearGradientProps {
  
  inline def apply(): LinearGradientProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGradientProps]
  }
  
  extension [Self <: LinearGradientProps](x: Self) {
    
    inline def setGradientTransform(value: ColumnMajorTransformMatrix | String): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
    
    inline def setGradientTransformUndefined: Self = StObject.set(x, "gradientTransform", js.undefined)
    
    inline def setGradientUnits(value: Units): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
    
    inline def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setX1(value: NumberProp): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    inline def setX2(value: NumberProp): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    inline def setY1(value: NumberProp): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    
    inline def setY2(value: NumberProp): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
  }
}
