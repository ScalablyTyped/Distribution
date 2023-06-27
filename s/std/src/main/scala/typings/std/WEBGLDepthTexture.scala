package typings.std

import typings.std.stdInts.`0x84FA`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The WEBGL_depth_texture extension is part of the WebGL API and defines 2D depth and depth-stencil textures.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_depth_texture)
  */
trait WEBGLDepthTexture extends StObject {
  
  /* standard dom */
  val UNSIGNED_INT_24_8_WEBGL: `0x84FA`
}
object WEBGLDepthTexture {
  
  inline def apply(): WEBGLDepthTexture = {
    val __obj = js.Dynamic.literal(UNSIGNED_INT_24_8_WEBGL = 0x84FA)
    __obj.asInstanceOf[WEBGLDepthTexture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WEBGLDepthTexture] (val x: Self) extends AnyVal {
    
    inline def setUNSIGNED_INT_24_8_WEBGL(value: `0x84FA`): Self = StObject.set(x, "UNSIGNED_INT_24_8_WEBGL", value.asInstanceOf[js.Any])
  }
}
