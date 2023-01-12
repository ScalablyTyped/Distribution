package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Part of the WebGL API and represents the information returned by calling the WebGLRenderingContext.getShaderPrecisionFormat() method. */
trait WebGLShaderPrecisionFormat extends StObject {
  
  /* standard dom */
  val precision: GLint
  
  /* standard dom */
  val rangeMax: GLint
  
  /* standard dom */
  val rangeMin: GLint
}
object WebGLShaderPrecisionFormat {
  
  inline def apply(precision: GLint, rangeMax: GLint, rangeMin: GLint): WebGLShaderPrecisionFormat = {
    val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any], rangeMax = rangeMax.asInstanceOf[js.Any], rangeMin = rangeMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLShaderPrecisionFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGLShaderPrecisionFormat] (val x: Self) extends AnyVal {
    
    inline def setPrecision(value: GLint): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setRangeMax(value: GLint): Self = StObject.set(x, "rangeMax", value.asInstanceOf[js.Any])
    
    inline def setRangeMin(value: GLint): Self = StObject.set(x, "rangeMin", value.asInstanceOf[js.Any])
  }
}
