package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SVGTransform is the interface for one of the component transformations within an SVGTransformList; thus, an SVGTransform object corresponds to a single component (e.g., scale(…) or matrix(…)) within a transform attribute. */
trait SVGTransform extends js.Object {
  val SVG_TRANSFORM_MATRIX: scala.Double
  val SVG_TRANSFORM_ROTATE: scala.Double
  val SVG_TRANSFORM_SCALE: scala.Double
  val SVG_TRANSFORM_SKEWX: scala.Double
  val SVG_TRANSFORM_SKEWY: scala.Double
  val SVG_TRANSFORM_TRANSLATE: scala.Double
  val SVG_TRANSFORM_UNKNOWN: scala.Double
  val angle: scala.Double
  val matrix: SVGMatrix
  val `type`: scala.Double
  def setMatrix(matrix: SVGMatrix): scala.Unit
  def setRotate(angle: scala.Double, cx: scala.Double, cy: scala.Double): scala.Unit
  def setScale(sx: scala.Double, sy: scala.Double): scala.Unit
  def setSkewX(angle: scala.Double): scala.Unit
  def setSkewY(angle: scala.Double): scala.Unit
  def setTranslate(tx: scala.Double, ty: scala.Double): scala.Unit
}

@JSGlobal("SVGTransform")
@js.native
class SVGTransformCls () extends SVGTransform {
  /* CompleteClass */
  override val SVG_TRANSFORM_MATRIX: scala.Double = js.native
  /* CompleteClass */
  override val SVG_TRANSFORM_ROTATE: scala.Double = js.native
  /* CompleteClass */
  override val SVG_TRANSFORM_SCALE: scala.Double = js.native
  /* CompleteClass */
  override val SVG_TRANSFORM_SKEWX: scala.Double = js.native
  /* CompleteClass */
  override val SVG_TRANSFORM_SKEWY: scala.Double = js.native
  /* CompleteClass */
  override val SVG_TRANSFORM_TRANSLATE: scala.Double = js.native
  /* CompleteClass */
  override val SVG_TRANSFORM_UNKNOWN: scala.Double = js.native
  /* CompleteClass */
  override val angle: scala.Double = js.native
  /* CompleteClass */
  override val matrix: SVGMatrix = js.native
  /* CompleteClass */
  override val `type`: scala.Double = js.native
  /* CompleteClass */
  override def setMatrix(matrix: SVGMatrix): scala.Unit = js.native
  /* CompleteClass */
  override def setRotate(angle: scala.Double, cx: scala.Double, cy: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setScale(sx: scala.Double, sy: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setSkewX(angle: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setSkewY(angle: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setTranslate(tx: scala.Double, ty: scala.Double): scala.Unit = js.native
}

@JSGlobal("SVGTransform")
@js.native
object SVGTransform
  extends org.scalablytyped.runtime.Instantiable0[SVGTransform] {
  val SVG_TRANSFORM_MATRIX: scala.Double = js.native
  val SVG_TRANSFORM_ROTATE: scala.Double = js.native
  val SVG_TRANSFORM_SCALE: scala.Double = js.native
  val SVG_TRANSFORM_SKEWX: scala.Double = js.native
  val SVG_TRANSFORM_SKEWY: scala.Double = js.native
  val SVG_TRANSFORM_TRANSLATE: scala.Double = js.native
  val SVG_TRANSFORM_UNKNOWN: scala.Double = js.native
}

