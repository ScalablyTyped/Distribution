package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EXTTextureNorm16 extends StObject {
  
  /* standard dom */
  val R16_EXT: GLenum
  
  /* standard dom */
  val R16_SNORM_EXT: GLenum
  
  /* standard dom */
  val RG16_EXT: GLenum
  
  /* standard dom */
  val RG16_SNORM_EXT: GLenum
  
  /* standard dom */
  val RGB16_EXT: GLenum
  
  /* standard dom */
  val RGB16_SNORM_EXT: GLenum
  
  /* standard dom */
  val RGBA16_EXT: GLenum
  
  /* standard dom */
  val RGBA16_SNORM_EXT: GLenum
}
object EXTTextureNorm16 {
  
  inline def apply(
    R16_EXT: GLenum,
    R16_SNORM_EXT: GLenum,
    RG16_EXT: GLenum,
    RG16_SNORM_EXT: GLenum,
    RGB16_EXT: GLenum,
    RGB16_SNORM_EXT: GLenum,
    RGBA16_EXT: GLenum,
    RGBA16_SNORM_EXT: GLenum
  ): EXTTextureNorm16 = {
    val __obj = js.Dynamic.literal(R16_EXT = R16_EXT.asInstanceOf[js.Any], R16_SNORM_EXT = R16_SNORM_EXT.asInstanceOf[js.Any], RG16_EXT = RG16_EXT.asInstanceOf[js.Any], RG16_SNORM_EXT = RG16_SNORM_EXT.asInstanceOf[js.Any], RGB16_EXT = RGB16_EXT.asInstanceOf[js.Any], RGB16_SNORM_EXT = RGB16_SNORM_EXT.asInstanceOf[js.Any], RGBA16_EXT = RGBA16_EXT.asInstanceOf[js.Any], RGBA16_SNORM_EXT = RGBA16_SNORM_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTTextureNorm16]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EXTTextureNorm16] (val x: Self) extends AnyVal {
    
    inline def setR16_EXT(value: GLenum): Self = StObject.set(x, "R16_EXT", value.asInstanceOf[js.Any])
    
    inline def setR16_SNORM_EXT(value: GLenum): Self = StObject.set(x, "R16_SNORM_EXT", value.asInstanceOf[js.Any])
    
    inline def setRG16_EXT(value: GLenum): Self = StObject.set(x, "RG16_EXT", value.asInstanceOf[js.Any])
    
    inline def setRG16_SNORM_EXT(value: GLenum): Self = StObject.set(x, "RG16_SNORM_EXT", value.asInstanceOf[js.Any])
    
    inline def setRGB16_EXT(value: GLenum): Self = StObject.set(x, "RGB16_EXT", value.asInstanceOf[js.Any])
    
    inline def setRGB16_SNORM_EXT(value: GLenum): Self = StObject.set(x, "RGB16_SNORM_EXT", value.asInstanceOf[js.Any])
    
    inline def setRGBA16_EXT(value: GLenum): Self = StObject.set(x, "RGBA16_EXT", value.asInstanceOf[js.Any])
    
    inline def setRGBA16_SNORM_EXT(value: GLenum): Self = StObject.set(x, "RGBA16_SNORM_EXT", value.asInstanceOf[js.Any])
  }
}
