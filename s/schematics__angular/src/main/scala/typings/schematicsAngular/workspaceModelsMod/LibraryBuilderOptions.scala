package typings.schematicsAngular.workspaceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LibraryBuilderOptions extends StObject {
  
  var project: String
  
  var tsConfig: String
}
object LibraryBuilderOptions {
  
  inline def apply(project: String, tsConfig: String): LibraryBuilderOptions = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], tsConfig = tsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[LibraryBuilderOptions]
  }
  
  extension [Self <: LibraryBuilderOptions](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setTsConfig(value: String): Self = StObject.set(x, "tsConfig", value.asInstanceOf[js.Any])
  }
}
