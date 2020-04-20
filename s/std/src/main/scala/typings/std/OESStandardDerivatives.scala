package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The OES_standard_derivatives extension is part of the WebGL API and adds the GLSL derivative functions dFdx, dFdy, and fwidth. */
trait OESStandardDerivatives extends js.Object {
  val FRAGMENT_SHADER_DERIVATIVE_HINT_OES: GLenum
}

object OESStandardDerivatives {
  @scala.inline
  def apply(FRAGMENT_SHADER_DERIVATIVE_HINT_OES: GLenum): OESStandardDerivatives = {
    val __obj = js.Dynamic.literal(FRAGMENT_SHADER_DERIVATIVE_HINT_OES = FRAGMENT_SHADER_DERIVATIVE_HINT_OES.asInstanceOf[js.Any])
    __obj.asInstanceOf[OESStandardDerivatives]
  }
}

