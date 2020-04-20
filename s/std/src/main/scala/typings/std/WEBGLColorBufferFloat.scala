package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WEBGLColorBufferFloat extends js.Object {
  val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: GLenum
  val RGBA32F_EXT: GLenum
  val UNSIGNED_NORMALIZED_EXT: GLenum
}

object WEBGLColorBufferFloat {
  @scala.inline
  def apply(
    FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: GLenum,
    RGBA32F_EXT: GLenum,
    UNSIGNED_NORMALIZED_EXT: GLenum
  ): WEBGLColorBufferFloat = {
    val __obj = js.Dynamic.literal(FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT = FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT.asInstanceOf[js.Any], RGBA32F_EXT = RGBA32F_EXT.asInstanceOf[js.Any], UNSIGNED_NORMALIZED_EXT = UNSIGNED_NORMALIZED_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLColorBufferFloat]
  }
}

