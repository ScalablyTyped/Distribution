package typings.std

import typings.std.stdInts.`0x9270`
import typings.std.stdInts.`0x9271`
import typings.std.stdInts.`0x9272`
import typings.std.stdInts.`0x9273`
import typings.std.stdInts.`0x9274`
import typings.std.stdInts.`0x9275`
import typings.std.stdInts.`0x9276`
import typings.std.stdInts.`0x9277`
import typings.std.stdInts.`0x9278`
import typings.std.stdInts.`0x9279`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_compressed_texture_etc) */
trait WEBGLCompressedTextureEtc extends StObject {
  
  /* standard dom */
  val COMPRESSED_R11_EAC: `0x9270`
  
  /* standard dom */
  val COMPRESSED_RG11_EAC: `0x9272`
  
  /* standard dom */
  val COMPRESSED_RGB8_ETC2: `0x9274`
  
  /* standard dom */
  val COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2: `0x9276`
  
  /* standard dom */
  val COMPRESSED_RGBA8_ETC2_EAC: `0x9278`
  
  /* standard dom */
  val COMPRESSED_SIGNED_R11_EAC: `0x9271`
  
  /* standard dom */
  val COMPRESSED_SIGNED_RG11_EAC: `0x9273`
  
  /* standard dom */
  val COMPRESSED_SRGB8_ALPHA8_ETC2_EAC: `0x9279`
  
  /* standard dom */
  val COMPRESSED_SRGB8_ETC2: `0x9275`
  
  /* standard dom */
  val COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2: `0x9277`
}
object WEBGLCompressedTextureEtc {
  
  inline def apply(): WEBGLCompressedTextureEtc = {
    val __obj = js.Dynamic.literal(COMPRESSED_R11_EAC = 0x9270, COMPRESSED_RG11_EAC = 0x9272, COMPRESSED_RGB8_ETC2 = 0x9274, COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9276, COMPRESSED_RGBA8_ETC2_EAC = 0x9278, COMPRESSED_SIGNED_R11_EAC = 0x9271, COMPRESSED_SIGNED_RG11_EAC = 0x9273, COMPRESSED_SRGB8_ALPHA8_ETC2_EAC = 0x9279, COMPRESSED_SRGB8_ETC2 = 0x9275, COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9277)
    __obj.asInstanceOf[WEBGLCompressedTextureEtc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WEBGLCompressedTextureEtc] (val x: Self) extends AnyVal {
    
    inline def setCOMPRESSED_R11_EAC(value: `0x9270`): Self = StObject.set(x, "COMPRESSED_R11_EAC", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RG11_EAC(value: `0x9272`): Self = StObject.set(x, "COMPRESSED_RG11_EAC", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGB8_ETC2(value: `0x9274`): Self = StObject.set(x, "COMPRESSED_RGB8_ETC2", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2(value: `0x9276`): Self = StObject.set(x, "COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGBA8_ETC2_EAC(value: `0x9278`): Self = StObject.set(x, "COMPRESSED_RGBA8_ETC2_EAC", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_SIGNED_R11_EAC(value: `0x9271`): Self = StObject.set(x, "COMPRESSED_SIGNED_R11_EAC", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_SIGNED_RG11_EAC(value: `0x9273`): Self = StObject.set(x, "COMPRESSED_SIGNED_RG11_EAC", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_SRGB8_ALPHA8_ETC2_EAC(value: `0x9279`): Self = StObject.set(x, "COMPRESSED_SRGB8_ALPHA8_ETC2_EAC", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_SRGB8_ETC2(value: `0x9275`): Self = StObject.set(x, "COMPRESSED_SRGB8_ETC2", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2(value: `0x9277`): Self = StObject.set(x, "COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2", value.asInstanceOf[js.Any])
  }
}
