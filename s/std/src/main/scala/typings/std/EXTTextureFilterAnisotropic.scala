package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The EXT_texture_filter_anisotropic extension is part of the WebGL API and exposes two constants for anisotropic filtering (AF). */
trait EXTTextureFilterAnisotropic extends StObject {
  
  /* standard dom */
  val MAX_TEXTURE_MAX_ANISOTROPY_EXT: GLenum
  
  /* standard dom */
  val TEXTURE_MAX_ANISOTROPY_EXT: GLenum
}
object EXTTextureFilterAnisotropic {
  
  inline def apply(MAX_TEXTURE_MAX_ANISOTROPY_EXT: GLenum, TEXTURE_MAX_ANISOTROPY_EXT: GLenum): EXTTextureFilterAnisotropic = {
    val __obj = js.Dynamic.literal(MAX_TEXTURE_MAX_ANISOTROPY_EXT = MAX_TEXTURE_MAX_ANISOTROPY_EXT.asInstanceOf[js.Any], TEXTURE_MAX_ANISOTROPY_EXT = TEXTURE_MAX_ANISOTROPY_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTTextureFilterAnisotropic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EXTTextureFilterAnisotropic] (val x: Self) extends AnyVal {
    
    inline def setMAX_TEXTURE_MAX_ANISOTROPY_EXT(value: GLenum): Self = StObject.set(x, "MAX_TEXTURE_MAX_ANISOTROPY_EXT", value.asInstanceOf[js.Any])
    
    inline def setTEXTURE_MAX_ANISOTROPY_EXT(value: GLenum): Self = StObject.set(x, "TEXTURE_MAX_ANISOTROPY_EXT", value.asInstanceOf[js.Any])
  }
}
