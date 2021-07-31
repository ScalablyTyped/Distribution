package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhiskerSeriesProps
  extends StObject
     with AbstractSeriesProps[WhiskerSeriesPoint] {
  
  var strokeWidth: js.UndefOr[Double] = js.undefined
}
object WhiskerSeriesProps {
  
  @scala.inline
  def apply(): WhiskerSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhiskerSeriesProps]
  }
  
  @scala.inline
  implicit class WhiskerSeriesPropsMutableBuilder[Self <: WhiskerSeriesProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
