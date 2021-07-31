package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoronoiPoint
  extends StObject
     with AbstractSeriesPoint {
  
  var x: Double
  
  var y: Double
}
object VoronoiPoint {
  
  @scala.inline
  def apply(x: Double, y: Double): VoronoiPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoronoiPoint]
  }
  
  @scala.inline
  implicit class VoronoiPointMutableBuilder[Self <: VoronoiPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
