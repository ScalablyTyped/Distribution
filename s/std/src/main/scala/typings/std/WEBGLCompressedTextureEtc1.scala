package typings.std

import typings.std.stdInts.`0x8D64`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_compressed_texture_etc1) */
trait WEBGLCompressedTextureEtc1 extends StObject {
  
  /* standard dom */
  val COMPRESSED_RGB_ETC1_WEBGL: `0x8D64`
}
object WEBGLCompressedTextureEtc1 {
  
  inline def apply(): WEBGLCompressedTextureEtc1 = {
    val __obj = js.Dynamic.literal(COMPRESSED_RGB_ETC1_WEBGL = 0x8D64)
    __obj.asInstanceOf[WEBGLCompressedTextureEtc1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WEBGLCompressedTextureEtc1] (val x: Self) extends AnyVal {
    
    inline def setCOMPRESSED_RGB_ETC1_WEBGL(value: `0x8D64`): Self = StObject.set(x, "COMPRESSED_RGB_ETC1_WEBGL", value.asInstanceOf[js.Any])
  }
}
