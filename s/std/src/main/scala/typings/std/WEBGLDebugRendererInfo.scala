package typings.std

import typings.std.stdInts.`0x9245`
import typings.std.stdInts.`0x9246`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The WEBGL_debug_renderer_info extension is part of the WebGL API and exposes two constants with information about the graphics driver for debugging purposes.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_debug_renderer_info)
  */
trait WEBGLDebugRendererInfo extends StObject {
  
  /* standard dom */
  val UNMASKED_RENDERER_WEBGL: `0x9246`
  
  /* standard dom */
  val UNMASKED_VENDOR_WEBGL: `0x9245`
}
object WEBGLDebugRendererInfo {
  
  inline def apply(): WEBGLDebugRendererInfo = {
    val __obj = js.Dynamic.literal(UNMASKED_RENDERER_WEBGL = 0x9246, UNMASKED_VENDOR_WEBGL = 0x9245)
    __obj.asInstanceOf[WEBGLDebugRendererInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WEBGLDebugRendererInfo] (val x: Self) extends AnyVal {
    
    inline def setUNMASKED_RENDERER_WEBGL(value: `0x9246`): Self = StObject.set(x, "UNMASKED_RENDERER_WEBGL", value.asInstanceOf[js.Any])
    
    inline def setUNMASKED_VENDOR_WEBGL(value: `0x9245`): Self = StObject.set(x, "UNMASKED_VENDOR_WEBGL", value.asInstanceOf[js.Any])
  }
}
