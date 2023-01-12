package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WEBGLCompressedTextureS3tcSrgb extends StObject {
  
  /* standard dom */
  val COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT: GLenum
  
  /* standard dom */
  val COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT: GLenum
  
  /* standard dom */
  val COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT: GLenum
  
  /* standard dom */
  val COMPRESSED_SRGB_S3TC_DXT1_EXT: GLenum
}
object WEBGLCompressedTextureS3tcSrgb {
  
  inline def apply(
    COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT: GLenum,
    COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT: GLenum,
    COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT: GLenum,
    COMPRESSED_SRGB_S3TC_DXT1_EXT: GLenum
  ): WEBGLCompressedTextureS3tcSrgb = {
    val __obj = js.Dynamic.literal(COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT = COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT.asInstanceOf[js.Any], COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT = COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT.asInstanceOf[js.Any], COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT = COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT.asInstanceOf[js.Any], COMPRESSED_SRGB_S3TC_DXT1_EXT = COMPRESSED_SRGB_S3TC_DXT1_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLCompressedTextureS3tcSrgb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WEBGLCompressedTextureS3tcSrgb] (val x: Self) extends AnyVal {
    
    inline def setCOMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT(value: GLenum): Self = StObject.set(x, "COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT(value: GLenum): Self = StObject.set(x, "COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT(value: GLenum): Self = StObject.set(x, "COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_SRGB_S3TC_DXT1_EXT(value: GLenum): Self = StObject.set(x, "COMPRESSED_SRGB_S3TC_DXT1_EXT", value.asInstanceOf[js.Any])
  }
}
