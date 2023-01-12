package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EXTTextureCompressionBptc extends StObject {
  
  /* standard dom */
  val COMPRESSED_RGBA_BPTC_UNORM_EXT: GLenum
  
  /* standard dom */
  val COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT: GLenum
  
  /* standard dom */
  val COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT: GLenum
  
  /* standard dom */
  val COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT: GLenum
}
object EXTTextureCompressionBptc {
  
  inline def apply(
    COMPRESSED_RGBA_BPTC_UNORM_EXT: GLenum,
    COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT: GLenum,
    COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT: GLenum,
    COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT: GLenum
  ): EXTTextureCompressionBptc = {
    val __obj = js.Dynamic.literal(COMPRESSED_RGBA_BPTC_UNORM_EXT = COMPRESSED_RGBA_BPTC_UNORM_EXT.asInstanceOf[js.Any], COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT = COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT.asInstanceOf[js.Any], COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT = COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT.asInstanceOf[js.Any], COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT = COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTTextureCompressionBptc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EXTTextureCompressionBptc] (val x: Self) extends AnyVal {
    
    inline def setCOMPRESSED_RGBA_BPTC_UNORM_EXT(value: GLenum): Self = StObject.set(x, "COMPRESSED_RGBA_BPTC_UNORM_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT(value: GLenum): Self = StObject.set(x, "COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT(value: GLenum): Self = StObject.set(x, "COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT(value: GLenum): Self = StObject.set(x, "COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT", value.asInstanceOf[js.Any])
  }
}
