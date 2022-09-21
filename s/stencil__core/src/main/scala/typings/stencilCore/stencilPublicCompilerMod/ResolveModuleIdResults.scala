package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.anon.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveModuleIdResults extends StObject {
  
  var moduleId: String
  
  var pkgData: Version
  
  var pkgDirPath: String
  
  var resolveId: String
}
object ResolveModuleIdResults {
  
  inline def apply(moduleId: String, pkgData: Version, pkgDirPath: String, resolveId: String): ResolveModuleIdResults = {
    val __obj = js.Dynamic.literal(moduleId = moduleId.asInstanceOf[js.Any], pkgData = pkgData.asInstanceOf[js.Any], pkgDirPath = pkgDirPath.asInstanceOf[js.Any], resolveId = resolveId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveModuleIdResults]
  }
  
  extension [Self <: ResolveModuleIdResults](x: Self) {
    
    inline def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setPkgData(value: Version): Self = StObject.set(x, "pkgData", value.asInstanceOf[js.Any])
    
    inline def setPkgDirPath(value: String): Self = StObject.set(x, "pkgDirPath", value.asInstanceOf[js.Any])
    
    inline def setResolveId(value: String): Self = StObject.set(x, "resolveId", value.asInstanceOf[js.Any])
  }
}
