package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WEBGL_debug_shaders extends js.Object {
  def getTranslatedShaderSource(shader: WebGLShader): java.lang.String
}

object WEBGL_debug_shaders {
  @scala.inline
  def apply(getTranslatedShaderSource: WebGLShader => java.lang.String): WEBGL_debug_shaders = {
    val __obj = js.Dynamic.literal(getTranslatedShaderSource = js.Any.fromFunction1(getTranslatedShaderSource))
  
    __obj.asInstanceOf[WEBGL_debug_shaders]
  }
}

