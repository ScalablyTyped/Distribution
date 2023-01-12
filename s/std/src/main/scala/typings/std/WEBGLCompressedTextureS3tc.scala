package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The WEBGL_compressed_texture_s3tc extension is part of the WebGL API and exposes four S3TC compressed texture formats. */
trait WEBGLCompressedTextureS3tc extends StObject {
  
  /* standard dom */
  val COMPRESSED_RGBA_S3TC_DXT1_EXT: GLenum
  
  /* standard dom */
  val COMPRESSED_RGBA_S3TC_DXT3_EXT: GLenum
  
  /* standard dom */
  val COMPRESSED_RGBA_S3TC_DXT5_EXT: GLenum
  
  /* standard dom */
  val COMPRESSED_RGB_S3TC_DXT1_EXT: GLenum
}
object WEBGLCompressedTextureS3tc {
  
  inline def apply(
    COMPRESSED_RGBA_S3TC_DXT1_EXT: GLenum,
    COMPRESSED_RGBA_S3TC_DXT3_EXT: GLenum,
    COMPRESSED_RGBA_S3TC_DXT5_EXT: GLenum,
    COMPRESSED_RGB_S3TC_DXT1_EXT: GLenum
  ): WEBGLCompressedTextureS3tc = {
    val __obj = js.Dynamic.literal(COMPRESSED_RGBA_S3TC_DXT1_EXT = COMPRESSED_RGBA_S3TC_DXT1_EXT.asInstanceOf[js.Any], COMPRESSED_RGBA_S3TC_DXT3_EXT = COMPRESSED_RGBA_S3TC_DXT3_EXT.asInstanceOf[js.Any], COMPRESSED_RGBA_S3TC_DXT5_EXT = COMPRESSED_RGBA_S3TC_DXT5_EXT.asInstanceOf[js.Any], COMPRESSED_RGB_S3TC_DXT1_EXT = COMPRESSED_RGB_S3TC_DXT1_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLCompressedTextureS3tc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WEBGLCompressedTextureS3tc] (val x: Self) extends AnyVal {
    
    inline def setCOMPRESSED_RGBA_S3TC_DXT1_EXT(value: GLenum): Self = StObject.set(x, "COMPRESSED_RGBA_S3TC_DXT1_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGBA_S3TC_DXT3_EXT(value: GLenum): Self = StObject.set(x, "COMPRESSED_RGBA_S3TC_DXT3_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGBA_S3TC_DXT5_EXT(value: GLenum): Self = StObject.set(x, "COMPRESSED_RGBA_S3TC_DXT5_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGB_S3TC_DXT1_EXT(value: GLenum): Self = StObject.set(x, "COMPRESSED_RGB_S3TC_DXT1_EXT", value.asInstanceOf[js.Any])
  }
}
