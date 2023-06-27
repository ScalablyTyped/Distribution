package typings.std

import typings.std.stdInts.`0x8210`
import typings.std.stdInts.`0x8C40`
import typings.std.stdInts.`0x8C42`
import typings.std.stdInts.`0x8C43`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EXT_sRGB) */
trait EXTSRGB extends StObject {
  
  /* standard dom */
  val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT: `0x8210`
  
  /* standard dom */
  val SRGB8_ALPHA8_EXT: `0x8C43`
  
  /* standard dom */
  val SRGB_ALPHA_EXT: `0x8C42`
  
  /* standard dom */
  val SRGB_EXT: `0x8C40`
}
object EXTSRGB {
  
  inline def apply(): EXTSRGB = {
    val __obj = js.Dynamic.literal(FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT = 0x8210, SRGB8_ALPHA8_EXT = 0x8C43, SRGB_ALPHA_EXT = 0x8C42, SRGB_EXT = 0x8C40)
    __obj.asInstanceOf[EXTSRGB]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EXTSRGB] (val x: Self) extends AnyVal {
    
    inline def setFRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT(value: `0x8210`): Self = StObject.set(x, "FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT", value.asInstanceOf[js.Any])
    
    inline def setSRGB8_ALPHA8_EXT(value: `0x8C43`): Self = StObject.set(x, "SRGB8_ALPHA8_EXT", value.asInstanceOf[js.Any])
    
    inline def setSRGB_ALPHA_EXT(value: `0x8C42`): Self = StObject.set(x, "SRGB_ALPHA_EXT", value.asInstanceOf[js.Any])
    
    inline def setSRGB_EXT(value: `0x8C40`): Self = StObject.set(x, "SRGB_EXT", value.asInstanceOf[js.Any])
  }
}
