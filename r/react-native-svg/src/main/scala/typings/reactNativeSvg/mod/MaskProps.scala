package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskProps extends CommonPathProps {
  
  var height: js.UndefOr[NumberProp] = js.native
  
  var maskContentUnits: js.UndefOr[TMaskUnits] = js.native
  
  var maskTransform: js.UndefOr[ColumnMajorTransformMatrix | String] = js.native
  
  var maskUnits: js.UndefOr[TMaskUnits] = js.native
  
  var width: js.UndefOr[NumberProp] = js.native
  
  @JSName("x")
  var x_MaskProps: js.UndefOr[NumberProp] = js.native
  
  @JSName("y")
  var y_MaskProps: js.UndefOr[NumberProp] = js.native
}
object MaskProps {
  
  @scala.inline
  def apply(): MaskProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskProps]
  }
  
  @scala.inline
  implicit class MaskPropsMutableBuilder[Self <: MaskProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMaskContentUnits(value: TMaskUnits): Self = StObject.set(x, "maskContentUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskContentUnitsUndefined: Self = StObject.set(x, "maskContentUnits", js.undefined)
    
    @scala.inline
    def setMaskTransform(value: ColumnMajorTransformMatrix | String): Self = StObject.set(x, "maskTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskTransformUndefined: Self = StObject.set(x, "maskTransform", js.undefined)
    
    @scala.inline
    def setMaskUnits(value: TMaskUnits): Self = StObject.set(x, "maskUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUnitsUndefined: Self = StObject.set(x, "maskUnits", js.undefined)
    
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
