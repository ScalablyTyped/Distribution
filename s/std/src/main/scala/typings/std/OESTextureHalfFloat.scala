package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The OES_texture_half_float extension is part of the WebGL API and adds texture formats with 16- (aka half float) and 32-bit floating-point components. */
trait OESTextureHalfFloat extends js.Object {
  val HALF_FLOAT_OES: GLenum
}

object OESTextureHalfFloat {
  @scala.inline
  def apply(HALF_FLOAT_OES: GLenum): OESTextureHalfFloat = {
    val __obj = js.Dynamic.literal(HALF_FLOAT_OES = HALF_FLOAT_OES.asInstanceOf[js.Any])
    __obj.asInstanceOf[OESTextureHalfFloat]
  }
}

