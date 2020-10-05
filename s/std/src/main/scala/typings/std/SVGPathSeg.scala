package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathSeg extends js.Object {
  val PATHSEG_ARC_ABS: Double = js.native
  val PATHSEG_ARC_REL: Double = js.native
  val PATHSEG_CLOSEPATH: Double = js.native
  val PATHSEG_CURVETO_CUBIC_ABS: Double = js.native
  val PATHSEG_CURVETO_CUBIC_REL: Double = js.native
  val PATHSEG_CURVETO_CUBIC_SMOOTH_ABS: Double = js.native
  val PATHSEG_CURVETO_CUBIC_SMOOTH_REL: Double = js.native
  val PATHSEG_CURVETO_QUADRATIC_ABS: Double = js.native
  val PATHSEG_CURVETO_QUADRATIC_REL: Double = js.native
  val PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS: Double = js.native
  val PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL: Double = js.native
  val PATHSEG_LINETO_ABS: Double = js.native
  val PATHSEG_LINETO_HORIZONTAL_ABS: Double = js.native
  val PATHSEG_LINETO_HORIZONTAL_REL: Double = js.native
  val PATHSEG_LINETO_REL: Double = js.native
  val PATHSEG_LINETO_VERTICAL_ABS: Double = js.native
  val PATHSEG_LINETO_VERTICAL_REL: Double = js.native
  val PATHSEG_MOVETO_ABS: Double = js.native
  val PATHSEG_MOVETO_REL: Double = js.native
  val PATHSEG_UNKNOWN: Double = js.native
  val pathSegType: Double = js.native
  val pathSegTypeAsLetter: java.lang.String = js.native
}

object SVGPathSeg {
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
    pathSegTypeAsLetter: java.lang.String
  ): SVGPathSeg = {
    val __obj = js.Dynamic.literal(PATHSEG_ARC_ABS = PATHSEG_ARC_ABS.asInstanceOf[js.Any], PATHSEG_ARC_REL = PATHSEG_ARC_REL.asInstanceOf[js.Any], PATHSEG_CLOSEPATH = PATHSEG_CLOSEPATH.asInstanceOf[js.Any], PATHSEG_CURVETO_CUBIC_ABS = PATHSEG_CURVETO_CUBIC_ABS.asInstanceOf[js.Any], PATHSEG_CURVETO_CUBIC_REL = PATHSEG_CURVETO_CUBIC_REL.asInstanceOf[js.Any], PATHSEG_CURVETO_CUBIC_SMOOTH_ABS = PATHSEG_CURVETO_CUBIC_SMOOTH_ABS.asInstanceOf[js.Any], PATHSEG_CURVETO_CUBIC_SMOOTH_REL = PATHSEG_CURVETO_CUBIC_SMOOTH_REL.asInstanceOf[js.Any], PATHSEG_CURVETO_QUADRATIC_ABS = PATHSEG_CURVETO_QUADRATIC_ABS.asInstanceOf[js.Any], PATHSEG_CURVETO_QUADRATIC_REL = PATHSEG_CURVETO_QUADRATIC_REL.asInstanceOf[js.Any], PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS = PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS.asInstanceOf[js.Any], PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL = PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL.asInstanceOf[js.Any], PATHSEG_LINETO_ABS = PATHSEG_LINETO_ABS.asInstanceOf[js.Any], PATHSEG_LINETO_HORIZONTAL_ABS = PATHSEG_LINETO_HORIZONTAL_ABS.asInstanceOf[js.Any], PATHSEG_LINETO_HORIZONTAL_REL = PATHSEG_LINETO_HORIZONTAL_REL.asInstanceOf[js.Any], PATHSEG_LINETO_REL = PATHSEG_LINETO_REL.asInstanceOf[js.Any], PATHSEG_LINETO_VERTICAL_ABS = PATHSEG_LINETO_VERTICAL_ABS.asInstanceOf[js.Any], PATHSEG_LINETO_VERTICAL_REL = PATHSEG_LINETO_VERTICAL_REL.asInstanceOf[js.Any], PATHSEG_MOVETO_ABS = PATHSEG_MOVETO_ABS.asInstanceOf[js.Any], PATHSEG_MOVETO_REL = PATHSEG_MOVETO_REL.asInstanceOf[js.Any], PATHSEG_UNKNOWN = PATHSEG_UNKNOWN.asInstanceOf[js.Any], pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSeg]
  }
  @scala.inline
  implicit class SVGPathSegOps[Self <: SVGPathSeg] (val x: Self) extends AnyVal {
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
    def setPATHSEG_ARC_ABS(value: Double): Self = this.set("PATHSEG_ARC_ABS", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATHSEG_ARC_REL(value: Double): Self = this.set("PATHSEG_ARC_REL", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATHSEG_CLOSEPATH(value: Double): Self = this.set("PATHSEG_CLOSEPATH", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATHSEG_CURVETO_CUBIC_ABS(value: Double): Self = this.set("PATHSEG_CURVETO_CUBIC_ABS", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATHSEG_CURVETO_CUBIC_REL(value: Double): Self = this.set("PATHSEG_CURVETO_CUBIC_REL", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATHSEG_CURVETO_CUBIC_SMOOTH_ABS(value: Double): Self = this.set("PATHSEG_CURVETO_CUBIC_SMOOTH_ABS", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATHSEG_CURVETO_CUBIC_SMOOTH_REL(value: Double): Self = this.set("PATHSEG_CURVETO_CUBIC_SMOOTH_REL", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATHSEG_CURVETO_QUADRATIC_ABS(value: Double): Self = this.set("PATHSEG_CURVETO_QUADRATIC_ABS", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATHSEG_CURVETO_QUADRATIC_REL(value: Double): Self = this.set("PATHSEG_CURVETO_QUADRATIC_REL", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS(value: Double): Self = this.set("PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATHSEG_CURVETO_QUADRATIC_SMOOTH_REL(value: Double): Self = this.set("PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATHSEG_LINETO_ABS(value: Double): Self = this.set("PATHSEG_LINETO_ABS", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATHSEG_LINETO_HORIZONTAL_ABS(value: Double): Self = this.set("PATHSEG_LINETO_HORIZONTAL_ABS", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATHSEG_LINETO_HORIZONTAL_REL(value: Double): Self = this.set("PATHSEG_LINETO_HORIZONTAL_REL", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATHSEG_LINETO_REL(value: Double): Self = this.set("PATHSEG_LINETO_REL", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATHSEG_LINETO_VERTICAL_ABS(value: Double): Self = this.set("PATHSEG_LINETO_VERTICAL_ABS", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATHSEG_LINETO_VERTICAL_REL(value: Double): Self = this.set("PATHSEG_LINETO_VERTICAL_REL", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATHSEG_MOVETO_ABS(value: Double): Self = this.set("PATHSEG_MOVETO_ABS", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATHSEG_MOVETO_REL(value: Double): Self = this.set("PATHSEG_MOVETO_REL", value.asInstanceOf[js.Any])
    @scala.inline
    def setPATHSEG_UNKNOWN(value: Double): Self = this.set("PATHSEG_UNKNOWN", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathSegType(value: Double): Self = this.set("pathSegType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathSegTypeAsLetter(value: java.lang.String): Self = this.set("pathSegTypeAsLetter", value.asInstanceOf[js.Any])
  }
  
}

