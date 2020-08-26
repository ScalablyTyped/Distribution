package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class RaphaelCartesianCurvePointOps[Self <: RaphaelCartesianCurvePoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
  }
  
}

