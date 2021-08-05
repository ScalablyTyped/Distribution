package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatternProps extends StObject {
  
  var height: js.UndefOr[NumberProp] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var patternContentUnits: js.UndefOr[Units] = js.undefined
  
  var patternTransform: js.UndefOr[ColumnMajorTransformMatrix | String] = js.undefined
  
  var patternUnits: js.UndefOr[Units] = js.undefined
  
  var preserveAspectRatio: js.UndefOr[String] = js.undefined
  
  var viewBox: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[NumberProp] = js.undefined
  
  var x: js.UndefOr[NumberProp] = js.undefined
  
  var y: js.UndefOr[NumberProp] = js.undefined
}
object PatternProps {
  
  inline def apply(): PatternProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatternProps]
  }
  
  extension [Self <: PatternProps](x: Self) {
    
    inline def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPatternContentUnits(value: Units): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
    
    inline def setPatternContentUnitsUndefined: Self = StObject.set(x, "patternContentUnits", js.undefined)
    
    inline def setPatternTransform(value: ColumnMajorTransformMatrix | String): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
    
    inline def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", js.undefined)
    
    inline def setPatternUnits(value: Units): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
    
    inline def setPatternUnitsUndefined: Self = StObject.set(x, "patternUnits", js.undefined)
    
    inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
    
    inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    
    inline def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: NumberProp): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: NumberProp): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
