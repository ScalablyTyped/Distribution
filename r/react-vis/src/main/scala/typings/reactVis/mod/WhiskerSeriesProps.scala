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
  
  inline def apply(): WhiskerSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhiskerSeriesProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WhiskerSeriesProps] (val x: Self) extends AnyVal {
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
