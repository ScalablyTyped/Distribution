package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Part of the WebGL API and represents the information returned by calling the WebGLRenderingContext.getActiveAttrib() and WebGLRenderingContext.getActiveUniform() methods. */
trait WebGLActiveInfo extends js.Object {
  val name: java.lang.String
  val size: GLint
  val `type`: GLenum
}

@JSGlobal("WebGLActiveInfo")
@js.native
class WebGLActiveInfoCls () extends WebGLActiveInfo {
  /* CompleteClass */
  override val name: java.lang.String = js.native
  /* CompleteClass */
  override val size: GLint = js.native
  /* CompleteClass */
  override val `type`: GLenum = js.native
}

@JSGlobal("WebGLActiveInfo")
@js.native
object WebGLActiveInfo extends Instantiable0[WebGLActiveInfo]

