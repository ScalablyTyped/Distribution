package typings.schematicsAngular.workspaceModelsMod

import org.scalablytyped.runtime.StringDictionary
import typings.schematicsAngular.schematicsAngularNumbers.`1`
import typings.schematicsAngular.workspaceModelsMod.ProjectType.Application
import typings.schematicsAngular.workspaceModelsMod.ProjectType.Library
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceSchema extends StObject {
  
  var cli: js.UndefOr[WorkspaceCLISchema] = js.undefined
  
  var defaultProject: js.UndefOr[String] = js.undefined
  
  var projects: StringDictionary[WorkspaceProject[Application | Library]]
  
  var version: `1`
}
object WorkspaceSchema {
  
  inline def apply(projects: StringDictionary[WorkspaceProject[Application | Library]]): WorkspaceSchema = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any], version = 1)
    __obj.asInstanceOf[WorkspaceSchema]
  }
  
  extension [Self <: WorkspaceSchema](x: Self) {
    
    inline def setCli(value: WorkspaceCLISchema): Self = StObject.set(x, "cli", value.asInstanceOf[js.Any])
    
    inline def setCliUndefined: Self = StObject.set(x, "cli", js.undefined)
    
    inline def setDefaultProject(value: String): Self = StObject.set(x, "defaultProject", value.asInstanceOf[js.Any])
    
    inline def setDefaultProjectUndefined: Self = StObject.set(x, "defaultProject", js.undefined)
    
    inline def setProjects(value: StringDictionary[WorkspaceProject[Application | Library]]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: `1`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
