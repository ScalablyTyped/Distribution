package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Part of the WebGL API and represents the information returned by calling the WebGLRenderingContext.getShaderPrecisionFormat() method. */
trait WebGLShaderPrecisionFormat extends js.Object {
  val precision: GLint
  val rangeMax: GLint
  val rangeMin: GLint
}

@JSGlobal("WebGLShaderPrecisionFormat")
@js.native
class WebGLShaderPrecisionFormatCls () extends WebGLShaderPrecisionFormat {
  /* CompleteClass */
  override val precision: GLint = js.native
  /* CompleteClass */
  override val rangeMax: GLint = js.native
  /* CompleteClass */
  override val rangeMin: GLint = js.native
}

@JSGlobal("WebGLShaderPrecisionFormat")
@js.native
object WebGLShaderPrecisionFormat extends Instantiable0[WebGLShaderPrecisionFormat]

