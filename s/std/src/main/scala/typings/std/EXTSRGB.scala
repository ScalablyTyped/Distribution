package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EXTSRGB extends StObject {
  
  val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT: GLenum = js.native
  
  val SRGB8_ALPHA8_EXT: GLenum = js.native
  
  val SRGB_ALPHA_EXT: GLenum = js.native
  
  val SRGB_EXT: GLenum = js.native
}
object EXTSRGB {
  
  @scala.inline
  def apply(
    FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT: GLenum,
    SRGB8_ALPHA8_EXT: GLenum,
    SRGB_ALPHA_EXT: GLenum,
    SRGB_EXT: GLenum
  ): EXTSRGB = {
    val __obj = js.Dynamic.literal(FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT = FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT.asInstanceOf[js.Any], SRGB8_ALPHA8_EXT = SRGB8_ALPHA8_EXT.asInstanceOf[js.Any], SRGB_ALPHA_EXT = SRGB_ALPHA_EXT.asInstanceOf[js.Any], SRGB_EXT = SRGB_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTSRGB]
  }
  
  @scala.inline
  implicit class EXTSRGBMutableBuilder[Self <: EXTSRGB] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT(value: GLenum): Self = StObject.set(x, "FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSRGB8_ALPHA8_EXT(value: GLenum): Self = StObject.set(x, "SRGB8_ALPHA8_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSRGB_ALPHA_EXT(value: GLenum): Self = StObject.set(x, "SRGB_ALPHA_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSRGB_EXT(value: GLenum): Self = StObject.set(x, "SRGB_EXT", value.asInstanceOf[js.Any])
  }
}
