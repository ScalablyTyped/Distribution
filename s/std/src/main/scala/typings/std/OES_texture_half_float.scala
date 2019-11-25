package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The OES_texture_half_float extension is part of the WebGL API and adds texture formats with 16- (aka half float) and 32-bit floating-point components. */
trait OES_texture_half_float extends js.Object {
  val HALF_FLOAT_OES: GLenum
}

object OES_texture_half_float {
  @scala.inline
  def apply(HALF_FLOAT_OES: GLenum): OES_texture_half_float = {
    val __obj = js.Dynamic.literal(HALF_FLOAT_OES = HALF_FLOAT_OES.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OES_texture_half_float]
  }
}

