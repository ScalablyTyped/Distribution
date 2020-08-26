package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Part of the WebGL API and represents the information returned by calling the WebGLRenderingContext.getActiveAttrib() and WebGLRenderingContext.getActiveUniform() methods. */
@js.native
trait WebGLActiveInfo extends js.Object {
  val name: java.lang.String = js.native
  val size: GLint = js.native
  val `type`: GLenum = js.native
}

object WebGLActiveInfo {
  @scala.inline
  def apply(name: java.lang.String, size: GLint, `type`: GLenum): WebGLActiveInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLActiveInfo]
  }
  @scala.inline
  implicit class WebGLActiveInfoOps[Self <: WebGLActiveInfo] (val x: Self) extends AnyVal {
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
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: GLint): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: GLenum): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

