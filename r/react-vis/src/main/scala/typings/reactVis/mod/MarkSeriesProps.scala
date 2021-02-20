package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkSeriesProps extends AbstractSeriesProps[MarkSeriesPoint] {
  
  var getNull: js.UndefOr[RVGetNull[MarkSeriesPoint]] = js.native
  
  var strokeWidth: js.UndefOr[Double] = js.native
}
object MarkSeriesProps {
  
  @scala.inline
  def apply(): MarkSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkSeriesProps]
  }
  
  @scala.inline
  implicit class MarkSeriesPropsMutableBuilder[Self <: MarkSeriesProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetNull(value: MarkSeriesPoint => js.Any): Self = StObject.set(x, "getNull", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNullUndefined: Self = StObject.set(x, "getNull", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
