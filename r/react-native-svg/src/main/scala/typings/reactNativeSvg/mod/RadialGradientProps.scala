package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialGradientProps extends StObject {
  
  var cx: js.UndefOr[NumberProp] = js.undefined
  
  var cy: js.UndefOr[NumberProp] = js.undefined
  
  var fx: js.UndefOr[NumberProp] = js.undefined
  
  var fy: js.UndefOr[NumberProp] = js.undefined
  
  var gradientTransform: js.UndefOr[ColumnMajorTransformMatrix | String] = js.undefined
  
  var gradientUnits: js.UndefOr[Units] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var r: js.UndefOr[NumberProp] = js.undefined
  
  var rx: js.UndefOr[NumberProp] = js.undefined
  
  var ry: js.UndefOr[NumberProp] = js.undefined
}
object RadialGradientProps {
  
  @scala.inline
  def apply(): RadialGradientProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialGradientProps]
  }
  
  @scala.inline
  implicit class RadialGradientPropsMutableBuilder[Self <: RadialGradientProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCx(value: NumberProp): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    @scala.inline
    def setCy(value: NumberProp): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    @scala.inline
    def setFx(value: NumberProp): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
    
    @scala.inline
    def setFy(value: NumberProp): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFyUndefined: Self = StObject.set(x, "fy", js.undefined)
    
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
    def setR(value: NumberProp): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    @scala.inline
    def setRx(value: NumberProp): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
    
    @scala.inline
    def setRy(value: NumberProp): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
  }
}
