package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SVGTransform is the interface for one of the component transformations within an SVGTransformList; thus, an SVGTransform object corresponds to a single component (e.g., scale(…) or matrix(…)) within a transform attribute. */
trait SVGTransform extends StObject {
  
  val SVG_TRANSFORM_MATRIX: Double
  
  val SVG_TRANSFORM_ROTATE: Double
  
  val SVG_TRANSFORM_SCALE: Double
  
  val SVG_TRANSFORM_SKEWX: Double
  
  val SVG_TRANSFORM_SKEWY: Double
  
  val SVG_TRANSFORM_TRANSLATE: Double
  
  val SVG_TRANSFORM_UNKNOWN: Double
  
  val angle: Double
  
  val matrix: SVGMatrix
  
  def setMatrix(matrix: SVGMatrix): Unit
  
  def setRotate(angle: Double, cx: Double, cy: Double): Unit
  
  def setScale(sx: Double, sy: Double): Unit
  
  def setSkewX(angle: Double): Unit
  
  def setSkewY(angle: Double): Unit
  
  def setTranslate(tx: Double, ty: Double): Unit
  
  val `type`: Double
}
object SVGTransform {
  
  @scala.inline
  def apply(
    SVG_TRANSFORM_MATRIX: Double,
    SVG_TRANSFORM_ROTATE: Double,
    SVG_TRANSFORM_SCALE: Double,
    SVG_TRANSFORM_SKEWX: Double,
    SVG_TRANSFORM_SKEWY: Double,
    SVG_TRANSFORM_TRANSLATE: Double,
    SVG_TRANSFORM_UNKNOWN: Double,
    angle: Double,
    matrix: SVGMatrix,
    setMatrix: SVGMatrix => Unit,
    setRotate: (Double, Double, Double) => Unit,
    setScale: (Double, Double) => Unit,
    setSkewX: Double => Unit,
    setSkewY: Double => Unit,
    setTranslate: (Double, Double) => Unit,
    `type`: Double
  ): SVGTransform = {
    val __obj = js.Dynamic.literal(SVG_TRANSFORM_MATRIX = SVG_TRANSFORM_MATRIX.asInstanceOf[js.Any], SVG_TRANSFORM_ROTATE = SVG_TRANSFORM_ROTATE.asInstanceOf[js.Any], SVG_TRANSFORM_SCALE = SVG_TRANSFORM_SCALE.asInstanceOf[js.Any], SVG_TRANSFORM_SKEWX = SVG_TRANSFORM_SKEWX.asInstanceOf[js.Any], SVG_TRANSFORM_SKEWY = SVG_TRANSFORM_SKEWY.asInstanceOf[js.Any], SVG_TRANSFORM_TRANSLATE = SVG_TRANSFORM_TRANSLATE.asInstanceOf[js.Any], SVG_TRANSFORM_UNKNOWN = SVG_TRANSFORM_UNKNOWN.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], setMatrix = js.Any.fromFunction1(setMatrix), setRotate = js.Any.fromFunction3(setRotate), setScale = js.Any.fromFunction2(setScale), setSkewX = js.Any.fromFunction1(setSkewX), setSkewY = js.Any.fromFunction1(setSkewY), setTranslate = js.Any.fromFunction2(setTranslate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTransform]
  }
  
  @scala.inline
  implicit class SVGTransformMutableBuilder[Self <: SVGTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrix(value: SVGMatrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVG_TRANSFORM_MATRIX(value: Double): Self = StObject.set(x, "SVG_TRANSFORM_MATRIX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVG_TRANSFORM_ROTATE(value: Double): Self = StObject.set(x, "SVG_TRANSFORM_ROTATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVG_TRANSFORM_SCALE(value: Double): Self = StObject.set(x, "SVG_TRANSFORM_SCALE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVG_TRANSFORM_SKEWX(value: Double): Self = StObject.set(x, "SVG_TRANSFORM_SKEWX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVG_TRANSFORM_SKEWY(value: Double): Self = StObject.set(x, "SVG_TRANSFORM_SKEWY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVG_TRANSFORM_TRANSLATE(value: Double): Self = StObject.set(x, "SVG_TRANSFORM_TRANSLATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVG_TRANSFORM_UNKNOWN(value: Double): Self = StObject.set(x, "SVG_TRANSFORM_UNKNOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetMatrix(value: SVGMatrix => Unit): Self = StObject.set(x, "setMatrix", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRotate(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setRotate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetScale(value: (Double, Double) => Unit): Self = StObject.set(x, "setScale", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSkewX(value: Double => Unit): Self = StObject.set(x, "setSkewX", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSkewY(value: Double => Unit): Self = StObject.set(x, "setSkewY", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTranslate(value: (Double, Double) => Unit): Self = StObject.set(x, "setTranslate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
