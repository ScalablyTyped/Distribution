package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import typings.std.stdInts.`4`
import typings.std.stdInts.`5`
import typings.std.stdInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SVGTransform is the interface for one of the component transformations within an SVGTransformList; thus, an SVGTransform object corresponds to a single component (e.g., scale(…) or matrix(…)) within a transform attribute.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform)
  */
@js.native
trait SVGTransform extends StObject {
  
  /* standard dom */
  val SVG_TRANSFORM_MATRIX: `1` = js.native
  
  /* standard dom */
  val SVG_TRANSFORM_ROTATE: `4` = js.native
  
  /* standard dom */
  val SVG_TRANSFORM_SCALE: `3` = js.native
  
  /* standard dom */
  val SVG_TRANSFORM_SKEWX: `5` = js.native
  
  /* standard dom */
  val SVG_TRANSFORM_SKEWY: `6` = js.native
  
  /* standard dom */
  val SVG_TRANSFORM_TRANSLATE: `2` = js.native
  
  /* standard dom */
  val SVG_TRANSFORM_UNKNOWN: `0` = js.native
  
  /* standard dom */
  val angle: Double = js.native
  
  /* standard dom */
  val matrix: DOMMatrix = js.native
  
  /* standard dom */
  def setMatrix(): Unit = js.native
  def setMatrix(matrix: DOMMatrix2DInit): Unit = js.native
  
  /* standard dom */
  def setRotate(angle: Double, cx: Double, cy: Double): Unit = js.native
  
  /* standard dom */
  def setScale(sx: Double, sy: Double): Unit = js.native
  
  /* standard dom */
  def setSkewX(angle: Double): Unit = js.native
  
  /* standard dom */
  def setSkewY(angle: Double): Unit = js.native
  
  /* standard dom */
  def setTranslate(tx: Double, ty: Double): Unit = js.native
  
  /* standard dom */
  val `type`: Double = js.native
}
