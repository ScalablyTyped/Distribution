package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrokeProps extends StObject {
  
  var stroke: js.UndefOr[Color] = js.native
  
  var strokeDasharray: js.UndefOr[js.Array[NumberProp] | NumberProp] = js.native
  
  var strokeDashoffset: js.UndefOr[NumberProp] = js.native
  
  var strokeLinecap: js.UndefOr[Linecap] = js.native
  
  var strokeLinejoin: js.UndefOr[Linejoin] = js.native
  
  var strokeMiterlimit: js.UndefOr[NumberProp] = js.native
  
  var strokeOpacity: js.UndefOr[NumberProp] = js.native
  
  var strokeWidth: js.UndefOr[NumberProp] = js.native
}
object StrokeProps {
  
  @scala.inline
  def apply(): StrokeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrokeProps]
  }
  
  @scala.inline
  implicit class StrokePropsMutableBuilder[Self <: StrokeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStroke(value: Color): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDasharray(value: js.Array[NumberProp] | NumberProp): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
    
    @scala.inline
    def setStrokeDasharrayVarargs(value: NumberProp*): Self = StObject.set(x, "strokeDasharray", js.Array(value :_*))
    
    @scala.inline
    def setStrokeDashoffset(value: NumberProp): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
    
    @scala.inline
    def setStrokeLinecap(value: Linecap): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
    
    @scala.inline
    def setStrokeLinejoin(value: Linejoin): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
    
    @scala.inline
    def setStrokeMiterlimit(value: NumberProp): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: NumberProp): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStrokeVarargs(value: Double*): Self = StObject.set(x, "stroke", js.Array(value :_*))
    
    @scala.inline
    def setStrokeWidth(value: NumberProp): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
