package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies options for creating a new `Shader`.
  */
trait ShaderOptions extends StObject {
  
  /** SphereFS path to a GLSL fragment shader file. */
  var fragmentFile: String
  
  /** SphereFS path to a GLSL vertex shader file. */
  var vertexFile: String
}
object ShaderOptions {
  
  inline def apply(fragmentFile: String, vertexFile: String): ShaderOptions = {
    val __obj = js.Dynamic.literal(fragmentFile = fragmentFile.asInstanceOf[js.Any], vertexFile = vertexFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShaderOptions] (val x: Self) extends AnyVal {
    
    inline def setFragmentFile(value: String): Self = StObject.set(x, "fragmentFile", value.asInstanceOf[js.Any])
    
    inline def setVertexFile(value: String): Self = StObject.set(x, "vertexFile", value.asInstanceOf[js.Any])
  }
}
