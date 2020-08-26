package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The OES_standard_derivatives extension is part of the WebGL API and adds the GLSL derivative functions dFdx, dFdy, and fwidth. */
@js.native
trait OESStandardDerivatives extends js.Object {
  val FRAGMENT_SHADER_DERIVATIVE_HINT_OES: GLenum = js.native
}

object OESStandardDerivatives {
  @scala.inline
  def apply(FRAGMENT_SHADER_DERIVATIVE_HINT_OES: GLenum): OESStandardDerivatives = {
    val __obj = js.Dynamic.literal(FRAGMENT_SHADER_DERIVATIVE_HINT_OES = FRAGMENT_SHADER_DERIVATIVE_HINT_OES.asInstanceOf[js.Any])
    __obj.asInstanceOf[OESStandardDerivatives]
  }
  @scala.inline
  implicit class OESStandardDerivativesOps[Self <: OESStandardDerivatives] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFRAGMENT_SHADER_DERIVATIVE_HINT_OES(value: GLenum): Self = this.set("FRAGMENT_SHADER_DERIVATIVE_HINT_OES", value.asInstanceOf[js.Any])
  }
  
}

