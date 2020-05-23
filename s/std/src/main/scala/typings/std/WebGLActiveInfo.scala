package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Part of the WebGL API and represents the information returned by calling the WebGLRenderingContext.getActiveAttrib() and WebGLRenderingContext.getActiveUniform() methods. */
trait WebGLActiveInfo extends js.Object {
  val name: java.lang.String
  val size: GLint
  val `type`: GLenum
}

object WebGLActiveInfo {
  @scala.inline
  def apply(name: java.lang.String, size: GLint, `type`: GLenum): WebGLActiveInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLActiveInfo]
  }
}

