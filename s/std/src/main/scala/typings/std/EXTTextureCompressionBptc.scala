package typings.std

import typings.std.stdInts.`0x8E8C`
import typings.std.stdInts.`0x8E8D`
import typings.std.stdInts.`0x8E8E`
import typings.std.stdInts.`0x8E8F`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EXT_texture_compression_bptc) */
trait EXTTextureCompressionBptc extends StObject {
  
  /* standard dom */
  val COMPRESSED_RGBA_BPTC_UNORM_EXT: `0x8E8C`
  
  /* standard dom */
  val COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT: `0x8E8E`
  
  /* standard dom */
  val COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT: `0x8E8F`
  
  /* standard dom */
  val COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT: `0x8E8D`
}
object EXTTextureCompressionBptc {
  
  inline def apply(): EXTTextureCompressionBptc = {
    val __obj = js.Dynamic.literal(COMPRESSED_RGBA_BPTC_UNORM_EXT = 0x8E8C, COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT = 0x8E8E, COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT = 0x8E8F, COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT = 0x8E8D)
    __obj.asInstanceOf[EXTTextureCompressionBptc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EXTTextureCompressionBptc] (val x: Self) extends AnyVal {
    
    inline def setCOMPRESSED_RGBA_BPTC_UNORM_EXT(value: `0x8E8C`): Self = StObject.set(x, "COMPRESSED_RGBA_BPTC_UNORM_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT(value: `0x8E8E`): Self = StObject.set(x, "COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT(value: `0x8E8F`): Self = StObject.set(x, "COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT(value: `0x8E8D`): Self = StObject.set(x, "COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT", value.asInstanceOf[js.Any])
  }
}
