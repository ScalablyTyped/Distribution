package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SVGTransform is the interface for one of the component transformations within an SVGTransformList; thus, an SVGTransform object corresponds to a single component (e.g., scale(…) or matrix(…)) within a transform attribute. */
trait SVGTransform extends js.Object {
  val SVG_TRANSFORM_MATRIX: Double
  val SVG_TRANSFORM_ROTATE: Double
  val SVG_TRANSFORM_SCALE: Double
  val SVG_TRANSFORM_SKEWX: Double
  val SVG_TRANSFORM_SKEWY: Double
  val SVG_TRANSFORM_TRANSLATE: Double
  val SVG_TRANSFORM_UNKNOWN: Double
  val angle: Double
  val matrix: SVGMatrix
  val `type`: Double
  def setMatrix(matrix: SVGMatrix): Unit
  def setRotate(angle: Double, cx: Double, cy: Double): Unit
  def setScale(sx: Double, sy: Double): Unit
  def setSkewX(angle: Double): Unit
  def setSkewY(angle: Double): Unit
  def setTranslate(tx: Double, ty: Double): Unit
}

@JSGlobal("SVGTransform")
@js.native
object SVGTransform extends Instantiable0[SVGTransform] {
  val SVG_TRANSFORM_MATRIX: Double = js.native
  val SVG_TRANSFORM_ROTATE: Double = js.native
  val SVG_TRANSFORM_SCALE: Double = js.native
  val SVG_TRANSFORM_SKEWX: Double = js.native
  val SVG_TRANSFORM_SKEWY: Double = js.native
  val SVG_TRANSFORM_TRANSLATE: Double = js.native
  val SVG_TRANSFORM_UNKNOWN: Double = js.native
}

