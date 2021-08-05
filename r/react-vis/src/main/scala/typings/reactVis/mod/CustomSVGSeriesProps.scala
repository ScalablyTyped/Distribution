package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomSVGSeriesProps
  extends StObject
     with AbstractSeriesProps[CustomSVGSeriesPoint] {
  
  var customComponent: js.UndefOr[String | (js.Function1[/* row */ js.Any, js.Any])] = js.undefined
  
  // default: 'circle'
  var marginLeft: js.UndefOr[Double] = js.undefined
  
  var marginTop: js.UndefOr[Double] = js.undefined
}
object CustomSVGSeriesProps {
  
  inline def apply(): CustomSVGSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomSVGSeriesProps]
  }
  
  extension [Self <: CustomSVGSeriesProps](x: Self) {
    
    inline def setCustomComponent(value: String | (js.Function1[/* row */ js.Any, js.Any])): Self = StObject.set(x, "customComponent", value.asInstanceOf[js.Any])
    
    inline def setCustomComponentFunction1(value: /* row */ js.Any => js.Any): Self = StObject.set(x, "customComponent", js.Any.fromFunction1(value))
    
    inline def setCustomComponentUndefined: Self = StObject.set(x, "customComponent", js.undefined)
    
    inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
  }
}
