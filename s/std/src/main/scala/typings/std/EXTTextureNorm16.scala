package typings.std

import typings.std.stdInts.`0x8054`
import typings.std.stdInts.`0x805B`
import typings.std.stdInts.`0x822A`
import typings.std.stdInts.`0x822C`
import typings.std.stdInts.`0x8F98`
import typings.std.stdInts.`0x8F99`
import typings.std.stdInts.`0x8F9A`
import typings.std.stdInts.`0x8F9B`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EXT_texture_norm16) */
trait EXTTextureNorm16 extends StObject {
  
  /* standard dom */
  val R16_EXT: `0x822A`
  
  /* standard dom */
  val R16_SNORM_EXT: `0x8F98`
  
  /* standard dom */
  val RG16_EXT: `0x822C`
  
  /* standard dom */
  val RG16_SNORM_EXT: `0x8F99`
  
  /* standard dom */
  val RGB16_EXT: `0x8054`
  
  /* standard dom */
  val RGB16_SNORM_EXT: `0x8F9A`
  
  /* standard dom */
  val RGBA16_EXT: `0x805B`
  
  /* standard dom */
  val RGBA16_SNORM_EXT: `0x8F9B`
}
object EXTTextureNorm16 {
  
  inline def apply(): EXTTextureNorm16 = {
    val __obj = js.Dynamic.literal(R16_EXT = 0x822A, R16_SNORM_EXT = 0x8F98, RG16_EXT = 0x822C, RG16_SNORM_EXT = 0x8F99, RGB16_EXT = 0x8054, RGB16_SNORM_EXT = 0x8F9A, RGBA16_EXT = 0x805B, RGBA16_SNORM_EXT = 0x8F9B)
    __obj.asInstanceOf[EXTTextureNorm16]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EXTTextureNorm16] (val x: Self) extends AnyVal {
    
    inline def setR16_EXT(value: `0x822A`): Self = StObject.set(x, "R16_EXT", value.asInstanceOf[js.Any])
    
    inline def setR16_SNORM_EXT(value: `0x8F98`): Self = StObject.set(x, "R16_SNORM_EXT", value.asInstanceOf[js.Any])
    
    inline def setRG16_EXT(value: `0x822C`): Self = StObject.set(x, "RG16_EXT", value.asInstanceOf[js.Any])
    
    inline def setRG16_SNORM_EXT(value: `0x8F99`): Self = StObject.set(x, "RG16_SNORM_EXT", value.asInstanceOf[js.Any])
    
    inline def setRGB16_EXT(value: `0x8054`): Self = StObject.set(x, "RGB16_EXT", value.asInstanceOf[js.Any])
    
    inline def setRGB16_SNORM_EXT(value: `0x8F9A`): Self = StObject.set(x, "RGB16_SNORM_EXT", value.asInstanceOf[js.Any])
    
    inline def setRGBA16_EXT(value: `0x805B`): Self = StObject.set(x, "RGBA16_EXT", value.asInstanceOf[js.Any])
    
    inline def setRGBA16_SNORM_EXT(value: `0x8F9B`): Self = StObject.set(x, "RGBA16_SNORM_EXT", value.asInstanceOf[js.Any])
  }
}
