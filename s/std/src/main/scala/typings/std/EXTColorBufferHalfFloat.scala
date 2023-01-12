package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EXTColorBufferHalfFloat extends StObject {
  
  /* standard dom */
  val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: GLenum
  
  /* standard dom */
  val RGB16F_EXT: GLenum
  
  /* standard dom */
  val RGBA16F_EXT: GLenum
  
  /* standard dom */
  val UNSIGNED_NORMALIZED_EXT: GLenum
}
object EXTColorBufferHalfFloat {
  
  inline def apply(
    FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: GLenum,
    RGB16F_EXT: GLenum,
    RGBA16F_EXT: GLenum,
    UNSIGNED_NORMALIZED_EXT: GLenum
  ): EXTColorBufferHalfFloat = {
    val __obj = js.Dynamic.literal(FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT = FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT.asInstanceOf[js.Any], RGB16F_EXT = RGB16F_EXT.asInstanceOf[js.Any], RGBA16F_EXT = RGBA16F_EXT.asInstanceOf[js.Any], UNSIGNED_NORMALIZED_EXT = UNSIGNED_NORMALIZED_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTColorBufferHalfFloat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EXTColorBufferHalfFloat] (val x: Self) extends AnyVal {
    
    inline def setFRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT(value: GLenum): Self = StObject.set(x, "FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT", value.asInstanceOf[js.Any])
    
    inline def setRGB16F_EXT(value: GLenum): Self = StObject.set(x, "RGB16F_EXT", value.asInstanceOf[js.Any])
    
    inline def setRGBA16F_EXT(value: GLenum): Self = StObject.set(x, "RGBA16F_EXT", value.asInstanceOf[js.Any])
    
    inline def setUNSIGNED_NORMALIZED_EXT(value: GLenum): Self = StObject.set(x, "UNSIGNED_NORMALIZED_EXT", value.asInstanceOf[js.Any])
  }
}
