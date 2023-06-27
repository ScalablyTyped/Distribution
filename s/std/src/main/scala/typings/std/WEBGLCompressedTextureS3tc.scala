package typings.std

import typings.std.stdInts.`0x83F0`
import typings.std.stdInts.`0x83F1`
import typings.std.stdInts.`0x83F2`
import typings.std.stdInts.`0x83F3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The WEBGL_compressed_texture_s3tc extension is part of the WebGL API and exposes four S3TC compressed texture formats.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_compressed_texture_s3tc)
  */
trait WEBGLCompressedTextureS3tc extends StObject {
  
  /* standard dom */
  val COMPRESSED_RGBA_S3TC_DXT1_EXT: `0x83F1`
  
  /* standard dom */
  val COMPRESSED_RGBA_S3TC_DXT3_EXT: `0x83F2`
  
  /* standard dom */
  val COMPRESSED_RGBA_S3TC_DXT5_EXT: `0x83F3`
  
  /* standard dom */
  val COMPRESSED_RGB_S3TC_DXT1_EXT: `0x83F0`
}
object WEBGLCompressedTextureS3tc {
  
  inline def apply(): WEBGLCompressedTextureS3tc = {
    val __obj = js.Dynamic.literal(COMPRESSED_RGBA_S3TC_DXT1_EXT = 0x83F1, COMPRESSED_RGBA_S3TC_DXT3_EXT = 0x83F2, COMPRESSED_RGBA_S3TC_DXT5_EXT = 0x83F3, COMPRESSED_RGB_S3TC_DXT1_EXT = 0x83F0)
    __obj.asInstanceOf[WEBGLCompressedTextureS3tc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WEBGLCompressedTextureS3tc] (val x: Self) extends AnyVal {
    
    inline def setCOMPRESSED_RGBA_S3TC_DXT1_EXT(value: `0x83F1`): Self = StObject.set(x, "COMPRESSED_RGBA_S3TC_DXT1_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGBA_S3TC_DXT3_EXT(value: `0x83F2`): Self = StObject.set(x, "COMPRESSED_RGBA_S3TC_DXT3_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGBA_S3TC_DXT5_EXT(value: `0x83F3`): Self = StObject.set(x, "COMPRESSED_RGBA_S3TC_DXT5_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGB_S3TC_DXT1_EXT(value: `0x83F0`): Self = StObject.set(x, "COMPRESSED_RGB_S3TC_DXT1_EXT", value.asInstanceOf[js.Any])
  }
}
