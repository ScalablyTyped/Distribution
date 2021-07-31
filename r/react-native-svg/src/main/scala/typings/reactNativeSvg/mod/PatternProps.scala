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
  
  @scala.inline
  def apply(): PatternProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatternProps]
  }
  
  @scala.inline
  implicit class PatternPropsMutableBuilder[Self <: PatternProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPatternContentUnits(value: Units): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternContentUnitsUndefined: Self = StObject.set(x, "patternContentUnits", js.undefined)
    
    @scala.inline
    def setPatternTransform(value: ColumnMajorTransformMatrix | String): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", js.undefined)
    
    @scala.inline
    def setPatternUnits(value: Units): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUnitsUndefined: Self = StObject.set(x, "patternUnits", js.undefined)
    
    @scala.inline
    def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
    
    @scala.inline
    def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    
    @scala.inline
    def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: NumberProp): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: NumberProp): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
