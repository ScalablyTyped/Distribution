package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EXT_sRGB extends js.Object {
  val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT: GLenum
  val SRGB8_ALPHA8_EXT: GLenum
  val SRGB_ALPHA_EXT: GLenum
  val SRGB_EXT: GLenum
}

object EXT_sRGB {
  @scala.inline
  def apply(
    FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT: GLenum,
    SRGB8_ALPHA8_EXT: GLenum,
    SRGB_ALPHA_EXT: GLenum,
    SRGB_EXT: GLenum
  ): EXT_sRGB = {
    val __obj = js.Dynamic.literal(FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT = FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT, SRGB8_ALPHA8_EXT = SRGB8_ALPHA8_EXT, SRGB_ALPHA_EXT = SRGB_ALPHA_EXT, SRGB_EXT = SRGB_EXT)
  
    __obj.asInstanceOf[EXT_sRGB]
  }
}

