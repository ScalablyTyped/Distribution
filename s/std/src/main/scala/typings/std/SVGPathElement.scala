package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the <path> element. */
@js.native
trait SVGPathElement extends SVGGraphicsElement {
  /** @deprecated */
  val pathSegList: SVGPathSegList = js.native
  /** @deprecated */
  def createSVGPathSegArcAbs(
    x: Double,
    y: Double,
    r1: Double,
    r2: Double,
    angle: Double,
    largeArcFlag: scala.Boolean,
    sweepFlag: scala.Boolean
  ): SVGPathSegArcAbs = js.native
  /** @deprecated */
  def createSVGPathSegArcRel(
    x: Double,
    y: Double,
    r1: Double,
    r2: Double,
    angle: Double,
    largeArcFlag: scala.Boolean,
    sweepFlag: scala.Boolean
  ): SVGPathSegArcRel = js.native
  /** @deprecated */
  def createSVGPathSegClosePath(): SVGPathSegClosePath = js.native
  /** @deprecated */
  def createSVGPathSegCurvetoCubicAbs(x: Double, y: Double, x1: Double, y1: Double, x2: Double, y2: Double): SVGPathSegCurvetoCubicAbs = js.native
  /** @deprecated */
  def createSVGPathSegCurvetoCubicRel(x: Double, y: Double, x1: Double, y1: Double, x2: Double, y2: Double): SVGPathSegCurvetoCubicRel = js.native
  /** @deprecated */
  def createSVGPathSegCurvetoCubicSmoothAbs(x: Double, y: Double, x2: Double, y2: Double): SVGPathSegCurvetoCubicSmoothAbs = js.native
  /** @deprecated */
  def createSVGPathSegCurvetoCubicSmoothRel(x: Double, y: Double, x2: Double, y2: Double): SVGPathSegCurvetoCubicSmoothRel = js.native
  /** @deprecated */
  def createSVGPathSegCurvetoQuadraticAbs(x: Double, y: Double, x1: Double, y1: Double): SVGPathSegCurvetoQuadraticAbs = js.native
  /** @deprecated */
  def createSVGPathSegCurvetoQuadraticRel(x: Double, y: Double, x1: Double, y1: Double): SVGPathSegCurvetoQuadraticRel = js.native
  /** @deprecated */
  def createSVGPathSegCurvetoQuadraticSmoothAbs(x: Double, y: Double): SVGPathSegCurvetoQuadraticSmoothAbs = js.native
  /** @deprecated */
  def createSVGPathSegCurvetoQuadraticSmoothRel(x: Double, y: Double): SVGPathSegCurvetoQuadraticSmoothRel = js.native
  /** @deprecated */
  def createSVGPathSegLinetoAbs(x: Double, y: Double): SVGPathSegLinetoAbs = js.native
  /** @deprecated */
  def createSVGPathSegLinetoHorizontalAbs(x: Double): SVGPathSegLinetoHorizontalAbs = js.native
  /** @deprecated */
  def createSVGPathSegLinetoHorizontalRel(x: Double): SVGPathSegLinetoHorizontalRel = js.native
  /** @deprecated */
  def createSVGPathSegLinetoRel(x: Double, y: Double): SVGPathSegLinetoRel = js.native
  /** @deprecated */
  def createSVGPathSegLinetoVerticalAbs(y: Double): SVGPathSegLinetoVerticalAbs = js.native
  /** @deprecated */
  def createSVGPathSegLinetoVerticalRel(y: Double): SVGPathSegLinetoVerticalRel = js.native
  /** @deprecated */
  def createSVGPathSegMovetoAbs(x: Double, y: Double): SVGPathSegMovetoAbs = js.native
  /** @deprecated */
  def createSVGPathSegMovetoRel(x: Double, y: Double): SVGPathSegMovetoRel = js.native
  /** @deprecated */
  def getPathSegAtLength(distance: Double): Double = js.native
  def getPointAtLength(distance: Double): SVGPoint = js.native
  def getTotalLength(): Double = js.native
}

