package typings.std

import typings.std.stdInts.`0x8DBB`
import typings.std.stdInts.`0x8DBC`
import typings.std.stdInts.`0x8DBD`
import typings.std.stdInts.`0x8DBE`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EXT_texture_compression_rgtc) */
trait EXTTextureCompressionRgtc extends StObject {
  
  /* standard dom */
  val COMPRESSED_RED_GREEN_RGTC2_EXT: `0x8DBD`
  
  /* standard dom */
  val COMPRESSED_RED_RGTC1_EXT: `0x8DBB`
  
  /* standard dom */
  val COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT: `0x8DBE`
  
  /* standard dom */
  val COMPRESSED_SIGNED_RED_RGTC1_EXT: `0x8DBC`
}
object EXTTextureCompressionRgtc {
  
  inline def apply(): EXTTextureCompressionRgtc = {
    val __obj = js.Dynamic.literal(COMPRESSED_RED_GREEN_RGTC2_EXT = 0x8DBD, COMPRESSED_RED_RGTC1_EXT = 0x8DBB, COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT = 0x8DBE, COMPRESSED_SIGNED_RED_RGTC1_EXT = 0x8DBC)
    __obj.asInstanceOf[EXTTextureCompressionRgtc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EXTTextureCompressionRgtc] (val x: Self) extends AnyVal {
    
    inline def setCOMPRESSED_RED_GREEN_RGTC2_EXT(value: `0x8DBD`): Self = StObject.set(x, "COMPRESSED_RED_GREEN_RGTC2_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RED_RGTC1_EXT(value: `0x8DBB`): Self = StObject.set(x, "COMPRESSED_RED_RGTC1_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT(value: `0x8DBE`): Self = StObject.set(x, "COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_SIGNED_RED_RGTC1_EXT(value: `0x8DBC`): Self = StObject.set(x, "COMPRESSED_SIGNED_RED_RGTC1_EXT", value.asInstanceOf[js.Any])
  }
}
