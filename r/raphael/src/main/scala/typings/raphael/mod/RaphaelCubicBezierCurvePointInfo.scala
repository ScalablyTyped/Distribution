package typings.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelCubicBezierCurvePointInfo extends RaphaelCartesianCurvePoint {
  
  /**
    * The end point of the cubic bezier curve.
    */
  var end: RaphaelCartesianPoint = js.native
  
  /**
    * The left anchor point of the cubic bezier curve.
    */
  var m: RaphaelCartesianPoint = js.native
  
  /**
    * The right anchor point of the cubic bezier curve.
    */
  var n: RaphaelCartesianPoint = js.native
  
  /**
    * The start point of the cubic bezier curve.
    */
  var start: RaphaelCartesianPoint = js.native
}
object RaphaelCubicBezierCurvePointInfo {
  
  @scala.inline
  def apply(
    alpha: Double,
    end: RaphaelCartesianPoint,
    m: RaphaelCartesianPoint,
    n: RaphaelCartesianPoint,
    start: RaphaelCartesianPoint,
    x: Double,
    y: Double
  ): RaphaelCubicBezierCurvePointInfo = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelCubicBezierCurvePointInfo]
  }
  
  @scala.inline
  implicit class RaphaelCubicBezierCurvePointInfoMutableBuilder[Self <: RaphaelCubicBezierCurvePointInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: RaphaelCartesianPoint): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM(value: RaphaelCartesianPoint): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: RaphaelCartesianPoint): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: RaphaelCartesianPoint): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
