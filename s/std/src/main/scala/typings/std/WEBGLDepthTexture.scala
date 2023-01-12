package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The WEBGL_depth_texture extension is part of the WebGL API and defines 2D depth and depth-stencil textures. */
trait WEBGLDepthTexture extends StObject {
  
  /* standard dom */
  val UNSIGNED_INT_24_8_WEBGL: GLenum
}
object WEBGLDepthTexture {
  
  inline def apply(UNSIGNED_INT_24_8_WEBGL: GLenum): WEBGLDepthTexture = {
    val __obj = js.Dynamic.literal(UNSIGNED_INT_24_8_WEBGL = UNSIGNED_INT_24_8_WEBGL.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLDepthTexture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WEBGLDepthTexture] (val x: Self) extends AnyVal {
    
    inline def setUNSIGNED_INT_24_8_WEBGL(value: GLenum): Self = StObject.set(x, "UNSIGNED_INT_24_8_WEBGL", value.asInstanceOf[js.Any])
  }
}
