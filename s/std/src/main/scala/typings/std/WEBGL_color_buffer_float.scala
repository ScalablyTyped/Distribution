package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WEBGL_color_buffer_float extends js.Object {
  val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: GLenum
  val RGBA32F_EXT: GLenum
  val UNSIGNED_NORMALIZED_EXT: GLenum
}

object WEBGL_color_buffer_float {
  @scala.inline
  def apply(
    FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: GLenum,
    RGBA32F_EXT: GLenum,
    UNSIGNED_NORMALIZED_EXT: GLenum
  ): WEBGL_color_buffer_float = {
    val __obj = js.Dynamic.literal(FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT = FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT, RGBA32F_EXT = RGBA32F_EXT, UNSIGNED_NORMALIZED_EXT = UNSIGNED_NORMALIZED_EXT)
  
    __obj.asInstanceOf[WEBGL_color_buffer_float]
  }
}

