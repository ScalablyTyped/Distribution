package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathSegCurvetoQuadraticRel extends SVGPathSeg {
  var x: Double = js.native
  var x1: Double = js.native
  var y: Double = js.native
  var y1: Double = js.native
}

object SVGPathSegCurvetoQuadraticRel {
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
    pathSegType: Double,
    pathSegTypeAsLetter: java.lang.String,
    x: Double,
    x1: Double,
    y: Double,
    y1: Double
  ): SVGPathSegCurvetoQuadraticRel = {
    val __obj = js.Dynamic.literal(PATHSEG_ARC_ABS = PATHSEG_ARC_ABS.asInstanceOf[js.Any], PATHSEG_ARC_REL = PATHSEG_ARC_REL.asInstanceOf[js.Any], PATHSEG_CLOSEPATH = PATHSEG_CLOSEPATH.asInstanceOf[js.Any], PATHSEG_CURVETO_CUBIC_ABS = PATHSEG_CURVETO_CUBIC_ABS.asInstanceOf[js.Any], PATHSEG_CURVETO_CUBIC_REL = PATHSEG_CURVETO_CUBIC_REL.asInstanceOf[js.Any], PATHSEG_CURVETO_CUBIC_SMOOTH_ABS = PATHSEG_CURVETO_CUBIC_SMOOTH_ABS.asInstanceOf[js.Any], PATHSEG_CURVETO_CUBIC_SMOOTH_REL = PATHSEG_CURVETO_CUBIC_SMOOTH_REL.asInstanceOf[js.Any], PATHSEG_CURVETO_QUADRATIC_ABS = PATHSEG_CURVETO_QUADRATIC_ABS.asInstanceOf[js.Any], PATHSEG_CURVETO_QUADRATIC_REL = PATHSEG_CURVETO_QUADRATIC_REL.asInstanceOf[js.Any], PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS = PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS.asInstanceOf[js.Any], PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL = PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL.asInstanceOf[js.Any], PATHSEG_LINETO_ABS = PATHSEG_LINETO_ABS.asInstanceOf[js.Any], PATHSEG_LINETO_HORIZONTAL_ABS = PATHSEG_LINETO_HORIZONTAL_ABS.asInstanceOf[js.Any], PATHSEG_LINETO_HORIZONTAL_REL = PATHSEG_LINETO_HORIZONTAL_REL.asInstanceOf[js.Any], PATHSEG_LINETO_REL = PATHSEG_LINETO_REL.asInstanceOf[js.Any], PATHSEG_LINETO_VERTICAL_ABS = PATHSEG_LINETO_VERTICAL_ABS.asInstanceOf[js.Any], PATHSEG_LINETO_VERTICAL_REL = PATHSEG_LINETO_VERTICAL_REL.asInstanceOf[js.Any], PATHSEG_MOVETO_ABS = PATHSEG_MOVETO_ABS.asInstanceOf[js.Any], PATHSEG_MOVETO_REL = PATHSEG_MOVETO_REL.asInstanceOf[js.Any], PATHSEG_UNKNOWN = PATHSEG_UNKNOWN.asInstanceOf[js.Any], pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoQuadraticRel]
  }
  @scala.inline
  implicit class SVGPathSegCurvetoQuadraticRelOps[Self <: SVGPathSegCurvetoQuadraticRel] (val x: Self) extends AnyVal {
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
  }
  
}

