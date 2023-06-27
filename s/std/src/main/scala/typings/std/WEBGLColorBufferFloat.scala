package typings.std

import typings.std.stdInts.`0x8211`
import typings.std.stdInts.`0x8814`
import typings.std.stdInts.`0x8C17`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_color_buffer_float) */
trait WEBGLColorBufferFloat extends StObject {
  
  /* standard dom */
  val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: `0x8211`
  
  /* standard dom */
  val RGBA32F_EXT: `0x8814`
  
  /* standard dom */
  val UNSIGNED_NORMALIZED_EXT: `0x8C17`
}
object WEBGLColorBufferFloat {
  
  inline def apply(): WEBGLColorBufferFloat = {
    val __obj = js.Dynamic.literal(FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT = 0x8211, RGBA32F_EXT = 0x8814, UNSIGNED_NORMALIZED_EXT = 0x8C17)
    __obj.asInstanceOf[WEBGLColorBufferFloat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WEBGLColorBufferFloat] (val x: Self) extends AnyVal {
    
    inline def setFRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT(value: `0x8211`): Self = StObject.set(x, "FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT", value.asInstanceOf[js.Any])
    
    inline def setRGBA32F_EXT(value: `0x8814`): Self = StObject.set(x, "RGBA32F_EXT", value.asInstanceOf[js.Any])
    
    inline def setUNSIGNED_NORMALIZED_EXT(value: `0x8C17`): Self = StObject.set(x, "UNSIGNED_NORMALIZED_EXT", value.asInstanceOf[js.Any])
  }
}
