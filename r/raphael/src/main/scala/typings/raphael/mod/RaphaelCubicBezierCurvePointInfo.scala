package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class RaphaelCubicBezierCurvePointInfoOps[Self <: RaphaelCubicBezierCurvePointInfo] (val x: Self) extends AnyVal {
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
    def setEnd(value: RaphaelCartesianPoint): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setM(value: RaphaelCartesianPoint): Self = this.set("m", value.asInstanceOf[js.Any])
    @scala.inline
    def setN(value: RaphaelCartesianPoint): Self = this.set("n", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: RaphaelCartesianPoint): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

