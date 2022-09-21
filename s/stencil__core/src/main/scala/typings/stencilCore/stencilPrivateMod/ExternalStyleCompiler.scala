package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalStyleCompiler extends StObject {
  
  var absolutePath: String
  
  var originalComponentPath: String
  
  var relativePath: String
}
object ExternalStyleCompiler {
  
  inline def apply(absolutePath: String, originalComponentPath: String, relativePath: String): ExternalStyleCompiler = {
    val __obj = js.Dynamic.literal(absolutePath = absolutePath.asInstanceOf[js.Any], originalComponentPath = originalComponentPath.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalStyleCompiler]
  }
  
  extension [Self <: ExternalStyleCompiler](x: Self) {
    
    inline def setAbsolutePath(value: String): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
    
    inline def setOriginalComponentPath(value: String): Self = StObject.set(x, "originalComponentPath", value.asInstanceOf[js.Any])
    
    inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
  }
}
