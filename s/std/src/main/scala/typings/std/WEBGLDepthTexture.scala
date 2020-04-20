package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The WEBGL_depth_texture extension is part of the WebGL API and defines 2D depth and depth-stencil textures. */
trait WEBGLDepthTexture extends js.Object {
  val UNSIGNED_INT_24_8_WEBGL: GLenum
}

object WEBGLDepthTexture {
  @scala.inline
  def apply(UNSIGNED_INT_24_8_WEBGL: GLenum): WEBGLDepthTexture = {
    val __obj = js.Dynamic.literal(UNSIGNED_INT_24_8_WEBGL = UNSIGNED_INT_24_8_WEBGL.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLDepthTexture]
  }
}

