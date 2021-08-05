package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskProps
  extends StObject
     with CommonPathProps {
  
  var height: js.UndefOr[NumberProp] = js.undefined
  
  var maskContentUnits: js.UndefOr[TMaskUnits] = js.undefined
  
  var maskTransform: js.UndefOr[ColumnMajorTransformMatrix | String] = js.undefined
  
  var maskUnits: js.UndefOr[TMaskUnits] = js.undefined
  
  var width: js.UndefOr[NumberProp] = js.undefined
  
  @JSName("x")
  var x_MaskProps: js.UndefOr[NumberProp] = js.undefined
  
  @JSName("y")
  var y_MaskProps: js.UndefOr[NumberProp] = js.undefined
}
object MaskProps {
  
  inline def apply(): MaskProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskProps]
  }
  
  extension [Self <: MaskProps](x: Self) {
    
    inline def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMaskContentUnits(value: TMaskUnits): Self = StObject.set(x, "maskContentUnits", value.asInstanceOf[js.Any])
    
    inline def setMaskContentUnitsUndefined: Self = StObject.set(x, "maskContentUnits", js.undefined)
    
    inline def setMaskTransform(value: ColumnMajorTransformMatrix | String): Self = StObject.set(x, "maskTransform", value.asInstanceOf[js.Any])
    
    inline def setMaskTransformUndefined: Self = StObject.set(x, "maskTransform", js.undefined)
    
    inline def setMaskUnits(value: TMaskUnits): Self = StObject.set(x, "maskUnits", value.asInstanceOf[js.Any])
    
    inline def setMaskUnitsUndefined: Self = StObject.set(x, "maskUnits", js.undefined)
    
    inline def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: NumberProp): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: NumberProp): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
