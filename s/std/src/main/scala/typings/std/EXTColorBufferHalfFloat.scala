package typings.std

import typings.std.stdInts.`0x8211`
import typings.std.stdInts.`0x881A`
import typings.std.stdInts.`0x881B`
import typings.std.stdInts.`0x8C17`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EXT_color_buffer_half_float) */
trait EXTColorBufferHalfFloat extends StObject {
  
  /* standard dom */
  val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: `0x8211`
  
  /* standard dom */
  val RGB16F_EXT: `0x881B`
  
  /* standard dom */
  val RGBA16F_EXT: `0x881A`
  
  /* standard dom */
  val UNSIGNED_NORMALIZED_EXT: `0x8C17`
}
object EXTColorBufferHalfFloat {
  
  inline def apply(): EXTColorBufferHalfFloat = {
    val __obj = js.Dynamic.literal(FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT = 0x8211, RGB16F_EXT = 0x881B, RGBA16F_EXT = 0x881A, UNSIGNED_NORMALIZED_EXT = 0x8C17)
    __obj.asInstanceOf[EXTColorBufferHalfFloat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EXTColorBufferHalfFloat] (val x: Self) extends AnyVal {
    
    inline def setFRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT(value: `0x8211`): Self = StObject.set(x, "FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT", value.asInstanceOf[js.Any])
    
    inline def setRGB16F_EXT(value: `0x881B`): Self = StObject.set(x, "RGB16F_EXT", value.asInstanceOf[js.Any])
    
    inline def setRGBA16F_EXT(value: `0x881A`): Self = StObject.set(x, "RGBA16F_EXT", value.asInstanceOf[js.Any])
    
    inline def setUNSIGNED_NORMALIZED_EXT(value: `0x8C17`): Self = StObject.set(x, "UNSIGNED_NORMALIZED_EXT", value.asInstanceOf[js.Any])
  }
}
