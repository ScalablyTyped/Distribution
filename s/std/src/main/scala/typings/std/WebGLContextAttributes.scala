package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLContextAttributes extends StObject {
  
  /* standard dom */
  var alpha: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var antialias: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var depth: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var desynchronized: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var failIfMajorPerformanceCaveat: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var powerPreference: js.UndefOr[WebGLPowerPreference] = js.undefined
  
  /* standard dom */
  var premultipliedAlpha: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var preserveDrawingBuffer: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var stencil: js.UndefOr[scala.Boolean] = js.undefined
}
object WebGLContextAttributes {
  
  inline def apply(): WebGLContextAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLContextAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGLContextAttributes] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: scala.Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setAntialias(value: scala.Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    inline def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    inline def setDepth(value: scala.Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setDesynchronized(value: scala.Boolean): Self = StObject.set(x, "desynchronized", value.asInstanceOf[js.Any])
    
    inline def setDesynchronizedUndefined: Self = StObject.set(x, "desynchronized", js.undefined)
    
    inline def setFailIfMajorPerformanceCaveat(value: scala.Boolean): Self = StObject.set(x, "failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
    
    inline def setFailIfMajorPerformanceCaveatUndefined: Self = StObject.set(x, "failIfMajorPerformanceCaveat", js.undefined)
    
    inline def setPowerPreference(value: WebGLPowerPreference): Self = StObject.set(x, "powerPreference", value.asInstanceOf[js.Any])
    
    inline def setPowerPreferenceUndefined: Self = StObject.set(x, "powerPreference", js.undefined)
    
    inline def setPremultipliedAlpha(value: scala.Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
    
    inline def setPremultipliedAlphaUndefined: Self = StObject.set(x, "premultipliedAlpha", js.undefined)
    
    inline def setPreserveDrawingBuffer(value: scala.Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    inline def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
    
    inline def setStencil(value: scala.Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
    
    inline def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
  }
}
