package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineSeriesCanvasProps extends AbstractSeriesProps[LineSeriesPoint] {
  
  var strokeWidth: js.UndefOr[Double] = js.native
}
object LineSeriesCanvasProps {
  
  @scala.inline
  def apply(): LineSeriesCanvasProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineSeriesCanvasProps]
  }
  
  @scala.inline
  implicit class LineSeriesCanvasPropsMutableBuilder[Self <: LineSeriesCanvasProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
