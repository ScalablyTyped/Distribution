package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineSeriesCanvasProps
  extends StObject
     with AbstractSeriesProps[LineSeriesPoint] {
  
  var strokeWidth: js.UndefOr[Double] = js.undefined
}
object LineSeriesCanvasProps {
  
  inline def apply(): LineSeriesCanvasProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineSeriesCanvasProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineSeriesCanvasProps] (val x: Self) extends AnyVal {
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
