package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WEBGL_debug_renderer_info extends js.Object {
  val UNMASKED_RENDERER_WEBGL: GLenum
  val UNMASKED_VENDOR_WEBGL: GLenum
}

object WEBGL_debug_renderer_info {
  @scala.inline
  def apply(UNMASKED_RENDERER_WEBGL: GLenum, UNMASKED_VENDOR_WEBGL: GLenum): WEBGL_debug_renderer_info = {
    val __obj = js.Dynamic.literal(UNMASKED_RENDERER_WEBGL = UNMASKED_RENDERER_WEBGL, UNMASKED_VENDOR_WEBGL = UNMASKED_VENDOR_WEBGL)
  
    __obj.asInstanceOf[WEBGL_debug_renderer_info]
  }
}

