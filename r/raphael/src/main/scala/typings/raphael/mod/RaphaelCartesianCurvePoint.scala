package typings.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelCartesianCurvePoint extends RaphaelCartesianPoint {
  
  /**
    * Angle of the curve derivative of the curve at the point.
    */
  var alpha: Double = js.native
}
object RaphaelCartesianCurvePoint {
  
  @scala.inline
  def apply(alpha: Double, x: Double, y: Double): RaphaelCartesianCurvePoint = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelCartesianCurvePoint]
  }
  
  @scala.inline
  implicit class RaphaelCartesianCurvePointMutableBuilder[Self <: RaphaelCartesianCurvePoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
  }
}
