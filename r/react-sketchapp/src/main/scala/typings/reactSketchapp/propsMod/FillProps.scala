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
  
  inline def apply(): FillProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillProps]
  }
  
  extension [Self <: FillProps](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillOpacity(value: NumberProp): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setFillRule(value: evenodd | nonzero): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
