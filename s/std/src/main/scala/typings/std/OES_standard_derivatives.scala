package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The OES_standard_derivatives extension is part of the WebGL API and adds the GLSL derivative functions dFdx, dFdy, and fwidth. */
trait OES_standard_derivatives extends js.Object {
  val FRAGMENT_SHADER_DERIVATIVE_HINT_OES: GLenum
}

object OES_standard_derivatives {
  @scala.inline
  def apply(FRAGMENT_SHADER_DERIVATIVE_HINT_OES: GLenum): OES_standard_derivatives = {
    val __obj = js.Dynamic.literal(FRAGMENT_SHADER_DERIVATIVE_HINT_OES = FRAGMENT_SHADER_DERIVATIVE_HINT_OES)
  
    __obj.asInstanceOf[OES_standard_derivatives]
  }
}

