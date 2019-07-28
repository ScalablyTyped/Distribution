package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The WEBGL_depth_texture extension is part of the WebGL API and defines 2D depth and depth-stencil textures. */
trait WEBGL_depth_texture extends js.Object {
  val UNSIGNED_INT_24_8_WEBGL: GLenum
}

object WEBGL_depth_texture {
  @scala.inline
  def apply(UNSIGNED_INT_24_8_WEBGL: GLenum): WEBGL_depth_texture = {
    val __obj = js.Dynamic.literal(UNSIGNED_INT_24_8_WEBGL = UNSIGNED_INT_24_8_WEBGL)
  
    __obj.asInstanceOf[WEBGL_depth_texture]
  }
}

