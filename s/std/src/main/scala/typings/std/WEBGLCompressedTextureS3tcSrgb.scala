package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WEBGLCompressedTextureS3tcSrgb extends js.Object {
  val COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT: GLenum = js.native
  val COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT: GLenum = js.native
  val COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT: GLenum = js.native
  val COMPRESSED_SRGB_S3TC_DXT1_EXT: GLenum = js.native
}

object WEBGLCompressedTextureS3tcSrgb {
  @scala.inline
  def apply(
    COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT: GLenum,
    COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT: GLenum,
    COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT: GLenum,
    COMPRESSED_SRGB_S3TC_DXT1_EXT: GLenum
  ): WEBGLCompressedTextureS3tcSrgb = {
    val __obj = js.Dynamic.literal(COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT = COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT.asInstanceOf[js.Any], COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT = COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT.asInstanceOf[js.Any], COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT = COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT.asInstanceOf[js.Any], COMPRESSED_SRGB_S3TC_DXT1_EXT = COMPRESSED_SRGB_S3TC_DXT1_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLCompressedTextureS3tcSrgb]
  }
  @scala.inline
  implicit class WEBGLCompressedTextureS3tcSrgbOps[Self <: WEBGLCompressedTextureS3tcSrgb] (val x: Self) extends AnyVal {
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
    def setCOMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT(value: GLenum): Self = this.set("COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setCOMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT(value: GLenum): Self = this.set("COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setCOMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT(value: GLenum): Self = this.set("COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setCOMPRESSED_SRGB_S3TC_DXT1_EXT(value: GLenum): Self = this.set("COMPRESSED_SRGB_S3TC_DXT1_EXT", value.asInstanceOf[js.Any])
  }
  
}

