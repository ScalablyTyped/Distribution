package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WEBGLDebugShaders extends js.Object {
  def getTranslatedShaderSource(shader: WebGLShader): java.lang.String
}

object WEBGLDebugShaders {
  @scala.inline
  def apply(getTranslatedShaderSource: WebGLShader => java.lang.String): WEBGLDebugShaders = {
    val __obj = js.Dynamic.literal(getTranslatedShaderSource = js.Any.fromFunction1(getTranslatedShaderSource))
    __obj.asInstanceOf[WEBGLDebugShaders]
  }
}

