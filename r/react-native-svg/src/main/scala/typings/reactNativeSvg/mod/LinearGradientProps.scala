package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinearGradientProps extends StObject {
  
  var gradientTransform: js.UndefOr[ColumnMajorTransformMatrix | String] = js.native
  
  var gradientUnits: js.UndefOr[Units] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var x1: js.UndefOr[NumberProp] = js.native
  
  var x2: js.UndefOr[NumberProp] = js.native
  
  var y1: js.UndefOr[NumberProp] = js.native
  
  var y2: js.UndefOr[NumberProp] = js.native
}
object LinearGradientProps {
  
  @scala.inline
  def apply(): LinearGradientProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGradientProps]
  }
  
  @scala.inline
  implicit class LinearGradientPropsMutableBuilder[Self <: LinearGradientProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGradientTransform(value: ColumnMajorTransformMatrix | String): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientTransformUndefined: Self = StObject.set(x, "gradientTransform", js.undefined)
    
    @scala.inline
    def setGradientUnits(value: Units): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setX1(value: NumberProp): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    @scala.inline
    def setX2(value: NumberProp): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    @scala.inline
    def setY1(value: NumberProp): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    
    @scala.inline
    def setY2(value: NumberProp): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
  }
}
