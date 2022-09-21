package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerRequestResponse extends StObject {
  
  var cacheHit: Boolean
  
  var cachePath: String
  
  var content: String
  
  var nodeModuleId: String
  
  var nodeModuleVersion: String
  
  var nodeResolvedPath: String
  
  var path: String
  
  var status: Double
}
object CompilerRequestResponse {
  
  inline def apply(
    cacheHit: Boolean,
    cachePath: String,
    content: String,
    nodeModuleId: String,
    nodeModuleVersion: String,
    nodeResolvedPath: String,
    path: String,
    status: Double
  ): CompilerRequestResponse = {
    val __obj = js.Dynamic.literal(cacheHit = cacheHit.asInstanceOf[js.Any], cachePath = cachePath.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], nodeModuleId = nodeModuleId.asInstanceOf[js.Any], nodeModuleVersion = nodeModuleVersion.asInstanceOf[js.Any], nodeResolvedPath = nodeResolvedPath.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerRequestResponse]
  }
  
  extension [Self <: CompilerRequestResponse](x: Self) {
    
    inline def setCacheHit(value: Boolean): Self = StObject.set(x, "cacheHit", value.asInstanceOf[js.Any])
    
    inline def setCachePath(value: String): Self = StObject.set(x, "cachePath", value.asInstanceOf[js.Any])
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setNodeModuleId(value: String): Self = StObject.set(x, "nodeModuleId", value.asInstanceOf[js.Any])
    
    inline def setNodeModuleVersion(value: String): Self = StObject.set(x, "nodeModuleVersion", value.asInstanceOf[js.Any])
    
    inline def setNodeResolvedPath(value: String): Self = StObject.set(x, "nodeResolvedPath", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
