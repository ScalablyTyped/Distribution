package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathSegArcRel extends SVGPathSeg {
  var angle: Double = js.native
  var largeArcFlag: scala.Boolean = js.native
  var r1: Double = js.native
  var r2: Double = js.native
  var sweepFlag: scala.Boolean = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object SVGPathSegArcRel {
  @scala.inline
  def apply(
    PATHSEG_ARC_ABS: Double,
    PATHSEG_ARC_REL: Double,
    PATHSEG_CLOSEPATH: Double,
    PATHSEG_CURVETO_CUBIC_ABS: Double,
    PATHSEG_CURVETO_CUBIC_REL: Double,
    PATHSEG_CURVETO_CUBIC_SMOOTH_ABS: Double,
    PATHSEG_CURVETO_CUBIC_SMOOTH_REL: Double,
    PATHSEG_CURVETO_QUADRATIC_ABS: Double,
    PATHSEG_CURVETO_QUADRATIC_REL: Double,
    PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS: Double,
    PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL: Double,
    PATHSEG_LINETO_ABS: Double,
    PATHSEG_LINETO_HORIZONTAL_ABS: Double,
    PATHSEG_LINETO_HORIZONTAL_REL: Double,
    PATHSEG_LINETO_REL: Double,
    PATHSEG_LINETO_VERTICAL_ABS: Double,
    PATHSEG_LINETO_VERTICAL_REL: Double,
    PATHSEG_MOVETO_ABS: Double,
    PATHSEG_MOVETO_REL: Double,
    PATHSEG_UNKNOWN: Double,
    angle: Double,
    largeArcFlag: scala.Boolean,
    pathSegType: Double,
    pathSegTypeAsLetter: java.lang.String,
    r1: Double,
    r2: Double,
    sweepFlag: scala.Boolean,
    x: Double,
    y: Double
  ): SVGPathSegArcRel = {
    val __obj = js.Dynamic.literal(PATHSEG_ARC_ABS = PATHSEG_ARC_ABS.asInstanceOf[js.Any], PATHSEG_ARC_REL = PATHSEG_ARC_REL.asInstanceOf[js.Any], PATHSEG_CLOSEPATH = PATHSEG_CLOSEPATH.asInstanceOf[js.Any], PATHSEG_CURVETO_CUBIC_ABS = PATHSEG_CURVETO_CUBIC_ABS.asInstanceOf[js.Any], PATHSEG_CURVETO_CUBIC_REL = PATHSEG_CURVETO_CUBIC_REL.asInstanceOf[js.Any], PATHSEG_CURVETO_CUBIC_SMOOTH_ABS = PATHSEG_CURVETO_CUBIC_SMOOTH_ABS.asInstanceOf[js.Any], PATHSEG_CURVETO_CUBIC_SMOOTH_REL = PATHSEG_CURVETO_CUBIC_SMOOTH_REL.asInstanceOf[js.Any], PATHSEG_CURVETO_QUADRATIC_ABS = PATHSEG_CURVETO_QUADRATIC_ABS.asInstanceOf[js.Any], PATHSEG_CURVETO_QUADRATIC_REL = PATHSEG_CURVETO_QUADRATIC_REL.asInstanceOf[js.Any], PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS = PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS.asInstanceOf[js.Any], PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL = PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL.asInstanceOf[js.Any], PATHSEG_LINETO_ABS = PATHSEG_LINETO_ABS.asInstanceOf[js.Any], PATHSEG_LINETO_HORIZONTAL_ABS = PATHSEG_LINETO_HORIZONTAL_ABS.asInstanceOf[js.Any], PATHSEG_LINETO_HORIZONTAL_REL = PATHSEG_LINETO_HORIZONTAL_REL.asInstanceOf[js.Any], PATHSEG_LINETO_REL = PATHSEG_LINETO_REL.asInstanceOf[js.Any], PATHSEG_LINETO_VERTICAL_ABS = PATHSEG_LINETO_VERTICAL_ABS.asInstanceOf[js.Any], PATHSEG_LINETO_VERTICAL_REL = PATHSEG_LINETO_VERTICAL_REL.asInstanceOf[js.Any], PATHSEG_MOVETO_ABS = PATHSEG_MOVETO_ABS.asInstanceOf[js.Any], PATHSEG_MOVETO_REL = PATHSEG_MOVETO_REL.asInstanceOf[js.Any], PATHSEG_UNKNOWN = PATHSEG_UNKNOWN.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], largeArcFlag = largeArcFlag.asInstanceOf[js.Any], pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any], sweepFlag = sweepFlag.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegArcRel]
  }
  @scala.inline
  implicit class SVGPathSegArcRelOps[Self <: SVGPathSegArcRel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def setLargeArcFlag(value: scala.Boolean): Self = this.set("largeArcFlag", value.asInstanceOf[js.Any])
    @scala.inline
    def setR1(value: Double): Self = this.set("r1", value.asInstanceOf[js.Any])
    @scala.inline
    def setR2(value: Double): Self = this.set("r2", value.asInstanceOf[js.Any])
    @scala.inline
    def setSweepFlag(value: scala.Boolean): Self = this.set("sweepFlag", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

