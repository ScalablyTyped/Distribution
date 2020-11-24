package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The EXT_texture_filter_anisotropic extension is part of the WebGL API and exposes two constants for anisotropic filtering (AF). */
@js.native
trait EXTTextureFilterAnisotropic extends js.Object {
  
  val MAX_TEXTURE_MAX_ANISOTROPY_EXT: GLenum = js.native
  
  val TEXTURE_MAX_ANISOTROPY_EXT: GLenum = js.native
}
object EXTTextureFilterAnisotropic {
  
  @scala.inline
  def apply(MAX_TEXTURE_MAX_ANISOTROPY_EXT: GLenum, TEXTURE_MAX_ANISOTROPY_EXT: GLenum): EXTTextureFilterAnisotropic = {
    val __obj = js.Dynamic.literal(MAX_TEXTURE_MAX_ANISOTROPY_EXT = MAX_TEXTURE_MAX_ANISOTROPY_EXT.asInstanceOf[js.Any], TEXTURE_MAX_ANISOTROPY_EXT = TEXTURE_MAX_ANISOTROPY_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTTextureFilterAnisotropic]
  }
  
  @scala.inline
  implicit class EXTTextureFilterAnisotropicOps[Self <: EXTTextureFilterAnisotropic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMAX_TEXTURE_MAX_ANISOTROPY_EXT(value: GLenum): Self = this.set("MAX_TEXTURE_MAX_ANISOTROPY_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTEXTURE_MAX_ANISOTROPY_EXT(value: GLenum): Self = this.set("TEXTURE_MAX_ANISOTROPY_EXT", value.asInstanceOf[js.Any])
  }
}
