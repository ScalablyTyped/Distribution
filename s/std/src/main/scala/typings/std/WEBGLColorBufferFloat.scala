package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WEBGLColorBufferFloat extends StObject {
  
  /* standard dom */
  val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: GLenum
  
  /* standard dom */
  val RGBA32F_EXT: GLenum
  
  /* standard dom */
  val UNSIGNED_NORMALIZED_EXT: GLenum
}
object WEBGLColorBufferFloat {
  
  inline def apply(
    FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: GLenum,
    RGBA32F_EXT: GLenum,
    UNSIGNED_NORMALIZED_EXT: GLenum
  ): WEBGLColorBufferFloat = {
    val __obj = js.Dynamic.literal(FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT = FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT.asInstanceOf[js.Any], RGBA32F_EXT = RGBA32F_EXT.asInstanceOf[js.Any], UNSIGNED_NORMALIZED_EXT = UNSIGNED_NORMALIZED_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLColorBufferFloat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WEBGLColorBufferFloat] (val x: Self) extends AnyVal {
    
    inline def setFRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT(value: GLenum): Self = StObject.set(x, "FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT", value.asInstanceOf[js.Any])
    
    inline def setRGBA32F_EXT(value: GLenum): Self = StObject.set(x, "RGBA32F_EXT", value.asInstanceOf[js.Any])
    
    inline def setUNSIGNED_NORMALIZED_EXT(value: GLenum): Self = StObject.set(x, "UNSIGNED_NORMALIZED_EXT", value.asInstanceOf[js.Any])
  }
}
