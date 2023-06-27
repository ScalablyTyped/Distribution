package typings.std

import typings.std.stdInts.`0x84FE`
import typings.std.stdInts.`0x84FF`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The EXT_texture_filter_anisotropic extension is part of the WebGL API and exposes two constants for anisotropic filtering (AF).
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EXT_texture_filter_anisotropic)
  */
trait EXTTextureFilterAnisotropic extends StObject {
  
  /* standard dom */
  val MAX_TEXTURE_MAX_ANISOTROPY_EXT: `0x84FF`
  
  /* standard dom */
  val TEXTURE_MAX_ANISOTROPY_EXT: `0x84FE`
}
object EXTTextureFilterAnisotropic {
  
  inline def apply(): EXTTextureFilterAnisotropic = {
    val __obj = js.Dynamic.literal(MAX_TEXTURE_MAX_ANISOTROPY_EXT = 0x84FF, TEXTURE_MAX_ANISOTROPY_EXT = 0x84FE)
    __obj.asInstanceOf[EXTTextureFilterAnisotropic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EXTTextureFilterAnisotropic] (val x: Self) extends AnyVal {
    
    inline def setMAX_TEXTURE_MAX_ANISOTROPY_EXT(value: `0x84FF`): Self = StObject.set(x, "MAX_TEXTURE_MAX_ANISOTROPY_EXT", value.asInstanceOf[js.Any])
    
    inline def setTEXTURE_MAX_ANISOTROPY_EXT(value: `0x84FE`): Self = StObject.set(x, "TEXTURE_MAX_ANISOTROPY_EXT", value.asInstanceOf[js.Any])
  }
}
