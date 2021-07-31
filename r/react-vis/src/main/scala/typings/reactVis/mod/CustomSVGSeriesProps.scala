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
  
  @scala.inline
  def apply(): CustomSVGSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomSVGSeriesProps]
  }
  
  @scala.inline
  implicit class CustomSVGSeriesPropsMutableBuilder[Self <: CustomSVGSeriesProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomComponent(value: String | (js.Function1[/* row */ js.Any, js.Any])): Self = StObject.set(x, "customComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomComponentFunction1(value: /* row */ js.Any => js.Any): Self = StObject.set(x, "customComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomComponentUndefined: Self = StObject.set(x, "customComponent", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    @scala.inline
    def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
  }
}
