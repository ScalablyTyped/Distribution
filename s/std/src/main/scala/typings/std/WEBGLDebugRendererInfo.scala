package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The WEBGL_debug_renderer_info extension is part of the WebGL API and exposes two constants with information about the graphics driver for debugging purposes. */
trait WEBGLDebugRendererInfo extends StObject {
  
  val UNMASKED_RENDERER_WEBGL: GLenum
  
  val UNMASKED_VENDOR_WEBGL: GLenum
}
object WEBGLDebugRendererInfo {
  
  @scala.inline
  def apply(UNMASKED_RENDERER_WEBGL: GLenum, UNMASKED_VENDOR_WEBGL: GLenum): WEBGLDebugRendererInfo = {
    val __obj = js.Dynamic.literal(UNMASKED_RENDERER_WEBGL = UNMASKED_RENDERER_WEBGL.asInstanceOf[js.Any], UNMASKED_VENDOR_WEBGL = UNMASKED_VENDOR_WEBGL.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLDebugRendererInfo]
  }
  
  @scala.inline
  implicit class WEBGLDebugRendererInfoMutableBuilder[Self <: WEBGLDebugRendererInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUNMASKED_RENDERER_WEBGL(value: GLenum): Self = StObject.set(x, "UNMASKED_RENDERER_WEBGL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNMASKED_VENDOR_WEBGL(value: GLenum): Self = StObject.set(x, "UNMASKED_VENDOR_WEBGL", value.asInstanceOf[js.Any])
  }
}
