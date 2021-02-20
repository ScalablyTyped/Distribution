package typings.reactSketchapp.propsMod

import typings.reactSketchapp.reactSketchappStrings.bevel
import typings.reactSketchapp.reactSketchappStrings.butt
import typings.reactSketchapp.reactSketchappStrings.miter
import typings.reactSketchapp.reactSketchappStrings.round
import typings.reactSketchapp.reactSketchappStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrokeProps extends StObject {
  
  var stroke: js.UndefOr[String] = js.native
  
  var strokeDasharray: js.UndefOr[NumberArrayProp] = js.native
  
  var strokeDashoffset: js.UndefOr[NumberProp] = js.native
  
  var strokeLinecap: js.UndefOr[butt | square | round] = js.native
  
  var strokeLinejoin: js.UndefOr[miter | bevel | round] = js.native
  
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
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDasharray(value: NumberArrayProp): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
    
    @scala.inline
    def setStrokeDasharrayVarargs(value: NumberProp*): Self = StObject.set(x, "strokeDasharray", js.Array(value :_*))
    
    @scala.inline
    def setStrokeDashoffset(value: NumberProp): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
    
    @scala.inline
    def setStrokeLinecap(value: butt | square | round): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
    
    @scala.inline
    def setStrokeLinejoin(value: miter | bevel | round): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
    
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
    def setStrokeWidth(value: NumberProp): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
