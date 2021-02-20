package typings.reactVis.mod

import typings.react.mod.CSSProperties
import typings.reactVis.reactVisStrings.dashed
import typings.reactVis.reactVisStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineMarkSeriesProps extends AbstractSeriesProps[LineMarkSeriesPoint] {
  
  var curve: js.UndefOr[String | (js.Function1[/* x */ js.Any, _])] = js.native
  
  // default: null
  var getNull: js.UndefOr[RVGetNull[LineMarkSeriesPoint]] = js.native
  
  var lineStyle: js.UndefOr[CSSProperties] = js.native
  
  // default: {}
  var markStyle: js.UndefOr[CSSProperties] = js.native
  
  // default: {}
  var strokeStyle: js.UndefOr[dashed | solid] = js.native
}
object LineMarkSeriesProps {
  
  @scala.inline
  def apply(): LineMarkSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineMarkSeriesProps]
  }
  
  @scala.inline
  implicit class LineMarkSeriesPropsMutableBuilder[Self <: LineMarkSeriesProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurve(value: String | (js.Function1[/* x */ js.Any, _])): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveFunction1(value: /* x */ js.Any => _): Self = StObject.set(x, "curve", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    @scala.inline
    def setGetNull(value: LineMarkSeriesPoint => js.Any): Self = StObject.set(x, "getNull", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNullUndefined: Self = StObject.set(x, "getNull", js.undefined)
    
    @scala.inline
    def setLineStyle(value: CSSProperties): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    @scala.inline
    def setMarkStyle(value: CSSProperties): Self = StObject.set(x, "markStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkStyleUndefined: Self = StObject.set(x, "markStyle", js.undefined)
    
    @scala.inline
    def setStrokeStyle(value: dashed | solid): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
  }
}
