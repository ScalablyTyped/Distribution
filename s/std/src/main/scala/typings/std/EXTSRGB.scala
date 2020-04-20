package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EXTSRGB extends js.Object {
  val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT: GLenum
  val SRGB8_ALPHA8_EXT: GLenum
  val SRGB_ALPHA_EXT: GLenum
  val SRGB_EXT: GLenum
}

object EXTSRGB {
  @scala.inline
  def apply(
    FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT: GLenum,
    SRGB8_ALPHA8_EXT: GLenum,
    SRGB_ALPHA_EXT: GLenum,
    SRGB_EXT: GLenum
  ): EXTSRGB = {
    val __obj = js.Dynamic.literal(FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT = FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT.asInstanceOf[js.Any], SRGB8_ALPHA8_EXT = SRGB8_ALPHA8_EXT.asInstanceOf[js.Any], SRGB_ALPHA_EXT = SRGB_ALPHA_EXT.asInstanceOf[js.Any], SRGB_EXT = SRGB_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTSRGB]
  }
}

