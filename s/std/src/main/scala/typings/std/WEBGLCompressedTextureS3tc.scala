package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The WEBGL_compressed_texture_s3tc extension is part of the WebGL API and exposes four S3TC compressed texture formats. */
trait WEBGLCompressedTextureS3tc extends js.Object {
  val COMPRESSED_RGBA_S3TC_DXT1_EXT: GLenum
  val COMPRESSED_RGBA_S3TC_DXT3_EXT: GLenum
  val COMPRESSED_RGBA_S3TC_DXT5_EXT: GLenum
  val COMPRESSED_RGB_S3TC_DXT1_EXT: GLenum
}

object WEBGLCompressedTextureS3tc {
  @scala.inline
  def apply(
    COMPRESSED_RGBA_S3TC_DXT1_EXT: GLenum,
    COMPRESSED_RGBA_S3TC_DXT3_EXT: GLenum,
    COMPRESSED_RGBA_S3TC_DXT5_EXT: GLenum,
    COMPRESSED_RGB_S3TC_DXT1_EXT: GLenum
  ): WEBGLCompressedTextureS3tc = {
    val __obj = js.Dynamic.literal(COMPRESSED_RGBA_S3TC_DXT1_EXT = COMPRESSED_RGBA_S3TC_DXT1_EXT.asInstanceOf[js.Any], COMPRESSED_RGBA_S3TC_DXT3_EXT = COMPRESSED_RGBA_S3TC_DXT3_EXT.asInstanceOf[js.Any], COMPRESSED_RGBA_S3TC_DXT5_EXT = COMPRESSED_RGBA_S3TC_DXT5_EXT.asInstanceOf[js.Any], COMPRESSED_RGB_S3TC_DXT1_EXT = COMPRESSED_RGB_S3TC_DXT1_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLCompressedTextureS3tc]
  }
}

