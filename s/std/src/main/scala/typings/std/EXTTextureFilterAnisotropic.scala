package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The EXT_texture_filter_anisotropic extension is part of the WebGL API and exposes two constants for anisotropic filtering (AF). */
trait EXTTextureFilterAnisotropic extends js.Object {
  val MAX_TEXTURE_MAX_ANISOTROPY_EXT: GLenum
  val TEXTURE_MAX_ANISOTROPY_EXT: GLenum
}

object EXTTextureFilterAnisotropic {
  @scala.inline
  def apply(MAX_TEXTURE_MAX_ANISOTROPY_EXT: GLenum, TEXTURE_MAX_ANISOTROPY_EXT: GLenum): EXTTextureFilterAnisotropic = {
    val __obj = js.Dynamic.literal(MAX_TEXTURE_MAX_ANISOTROPY_EXT = MAX_TEXTURE_MAX_ANISOTROPY_EXT.asInstanceOf[js.Any], TEXTURE_MAX_ANISOTROPY_EXT = TEXTURE_MAX_ANISOTROPY_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTTextureFilterAnisotropic]
  }
}

