package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillProps extends StObject {
  
  var fill: js.UndefOr[Color] = js.undefined
  
  var fillOpacity: js.UndefOr[NumberProp] = js.undefined
  
  var fillRule: js.UndefOr[FillRule] = js.undefined
}
object FillProps {
  
  @scala.inline
  def apply(): FillProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillProps]
  }
  
  @scala.inline
  implicit class FillPropsMutableBuilder[Self <: FillProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: Color): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacity(value: NumberProp): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setFillRule(value: FillRule): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFillVarargs(value: Double*): Self = StObject.set(x, "fill", js.Array(value :_*))
  }
}
