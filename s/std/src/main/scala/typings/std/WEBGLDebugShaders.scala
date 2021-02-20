package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WEBGLDebugShaders extends StObject {
  
  def getTranslatedShaderSource(shader: WebGLShader): java.lang.String = js.native
}
object WEBGLDebugShaders {
  
  @scala.inline
  def apply(getTranslatedShaderSource: WebGLShader => java.lang.String): WEBGLDebugShaders = {
    val __obj = js.Dynamic.literal(getTranslatedShaderSource = js.Any.fromFunction1(getTranslatedShaderSource))
    __obj.asInstanceOf[WEBGLDebugShaders]
  }
  
  @scala.inline
  implicit class WEBGLDebugShadersMutableBuilder[Self <: WEBGLDebugShaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTranslatedShaderSource(value: WebGLShader => java.lang.String): Self = StObject.set(x, "getTranslatedShaderSource", js.Any.fromFunction1(value))
  }
}
