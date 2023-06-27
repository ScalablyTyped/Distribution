package typings.std

import typings.std.stdInts.`0x8C4C`
import typings.std.stdInts.`0x8C4D`
import typings.std.stdInts.`0x8C4E`
import typings.std.stdInts.`0x8C4F`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_compressed_texture_s3tc_srgb) */
trait WEBGLCompressedTextureS3tcSrgb extends StObject {
  
  /* standard dom */
  val COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT: `0x8C4D`
  
  /* standard dom */
  val COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT: `0x8C4E`
  
  /* standard dom */
  val COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT: `0x8C4F`
  
  /* standard dom */
  val COMPRESSED_SRGB_S3TC_DXT1_EXT: `0x8C4C`
}
object WEBGLCompressedTextureS3tcSrgb {
  
  inline def apply(): WEBGLCompressedTextureS3tcSrgb = {
    val __obj = js.Dynamic.literal(COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT = 0x8C4D, COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT = 0x8C4E, COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT = 0x8C4F, COMPRESSED_SRGB_S3TC_DXT1_EXT = 0x8C4C)
    __obj.asInstanceOf[WEBGLCompressedTextureS3tcSrgb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WEBGLCompressedTextureS3tcSrgb] (val x: Self) extends AnyVal {
    
    inline def setCOMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT(value: `0x8C4D`): Self = StObject.set(x, "COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT(value: `0x8C4E`): Self = StObject.set(x, "COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT(value: `0x8C4F`): Self = StObject.set(x, "COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_SRGB_S3TC_DXT1_EXT(value: `0x8C4C`): Self = StObject.set(x, "COMPRESSED_SRGB_S3TC_DXT1_EXT", value.asInstanceOf[js.Any])
  }
}
