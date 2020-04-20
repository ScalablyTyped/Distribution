package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaphaelCartesianCurvePoint extends RaphaelCartesianPoint {
  /**
    * Angle of the curve derivative of the curve at the point.
    */
  var alpha: Double
}

object RaphaelCartesianCurvePoint {
  @scala.inline
  def apply(alpha: Double, x: Double, y: Double): RaphaelCartesianCurvePoint = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelCartesianCurvePoint]
  }
}

