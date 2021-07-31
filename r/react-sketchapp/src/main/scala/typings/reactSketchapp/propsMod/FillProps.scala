package typings.reactSketchapp.propsMod

import typings.reactSketchapp.reactSketchappStrings.evenodd
import typings.reactSketchapp.reactSketchappStrings.nonzero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillProps extends StObject {
  
  var fill: js.UndefOr[String] = js.undefined
  
  var fillOpacity: js.UndefOr[NumberProp] = js.undefined
  
  var fillRule: js.UndefOr[evenodd | nonzero] = js.undefined
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
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacity(value: NumberProp): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setFillRule(value: evenodd | nonzero): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
