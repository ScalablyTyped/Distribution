package typings.stencilCore.anon

import typings.stencilCore.stencilPublicCompilerMod.CompilerDependency
import typings.stencilCore.stencilPublicCompilerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dependencies extends StObject {
  
  var dependencies: js.Array[CompilerDependency]
  
  var logger: Logger
  
  var rootDir: String
}
object Dependencies {
  
  inline def apply(dependencies: js.Array[CompilerDependency], logger: Logger, rootDir: String): Dependencies = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependencies]
  }
  
  extension [Self <: Dependencies](x: Self) {
    
    inline def setDependencies(value: js.Array[CompilerDependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesVarargs(value: CompilerDependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
  }
}
