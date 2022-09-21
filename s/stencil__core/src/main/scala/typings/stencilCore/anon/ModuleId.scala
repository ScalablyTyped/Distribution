package typings.stencilCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleId extends StObject {
  
  var moduleId: String
  
  var path: String
  
  var rootDir: String
}
object ModuleId {
  
  inline def apply(moduleId: String, path: String, rootDir: String): ModuleId = {
    val __obj = js.Dynamic.literal(moduleId = moduleId.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleId]
  }
  
  extension [Self <: ModuleId](x: Self) {
    
    inline def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
  }
}
