package typings.std

import typings.std.stdInts.`0x8C00`
import typings.std.stdInts.`0x8C01`
import typings.std.stdInts.`0x8C02`
import typings.std.stdInts.`0x8C03`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_compressed_texture_pvrtc) */
trait WEBGLCompressedTexturePvrtc extends StObject {
  
  /* standard dom */
  val COMPRESSED_RGBA_PVRTC_2BPPV1_IMG: `0x8C03`
  
  /* standard dom */
  val COMPRESSED_RGBA_PVRTC_4BPPV1_IMG: `0x8C02`
  
  /* standard dom */
  val COMPRESSED_RGB_PVRTC_2BPPV1_IMG: `0x8C01`
  
  /* standard dom */
  val COMPRESSED_RGB_PVRTC_4BPPV1_IMG: `0x8C00`
}
object WEBGLCompressedTexturePvrtc {
  
  inline def apply(): WEBGLCompressedTexturePvrtc = {
    val __obj = js.Dynamic.literal(COMPRESSED_RGBA_PVRTC_2BPPV1_IMG = 0x8C03, COMPRESSED_RGBA_PVRTC_4BPPV1_IMG = 0x8C02, COMPRESSED_RGB_PVRTC_2BPPV1_IMG = 0x8C01, COMPRESSED_RGB_PVRTC_4BPPV1_IMG = 0x8C00)
    __obj.asInstanceOf[WEBGLCompressedTexturePvrtc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WEBGLCompressedTexturePvrtc] (val x: Self) extends AnyVal {
    
    inline def setCOMPRESSED_RGBA_PVRTC_2BPPV1_IMG(value: `0x8C03`): Self = StObject.set(x, "COMPRESSED_RGBA_PVRTC_2BPPV1_IMG", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGBA_PVRTC_4BPPV1_IMG(value: `0x8C02`): Self = StObject.set(x, "COMPRESSED_RGBA_PVRTC_4BPPV1_IMG", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGB_PVRTC_2BPPV1_IMG(value: `0x8C01`): Self = StObject.set(x, "COMPRESSED_RGB_PVRTC_2BPPV1_IMG", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGB_PVRTC_4BPPV1_IMG(value: `0x8C00`): Self = StObject.set(x, "COMPRESSED_RGB_PVRTC_4BPPV1_IMG", value.asInstanceOf[js.Any])
  }
}
