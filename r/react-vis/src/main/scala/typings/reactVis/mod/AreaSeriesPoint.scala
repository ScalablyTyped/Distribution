package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaSeriesPoint extends AbstractSeriesPoint {
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var y0: js.UndefOr[Double] = js.native
}
object AreaSeriesPoint {
  
  @scala.inline
  def apply(x: Double, y: Double): AreaSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaSeriesPoint]
  }
  
  @scala.inline
  implicit class AreaSeriesPointMutableBuilder[Self <: AreaSeriesPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
  }
}
