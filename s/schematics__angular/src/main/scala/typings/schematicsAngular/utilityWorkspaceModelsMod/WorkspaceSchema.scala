package typings.schematicsAngular.utilityWorkspaceModelsMod

import org.scalablytyped.runtime.StringDictionary
import typings.schematicsAngular.schematicsAngularInts.`1`
import typings.schematicsAngular.utilityWorkspaceModelsMod.ProjectType.Application
import typings.schematicsAngular.utilityWorkspaceModelsMod.ProjectType.Library
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceSchema extends StObject {
  
  var cli: js.UndefOr[WorkspaceCLISchema] = js.undefined
  
  var projects: StringDictionary[WorkspaceProject[Application | Library]]
  
  var version: `1`
}
object WorkspaceSchema {
  
  inline def apply(projects: StringDictionary[WorkspaceProject[Application | Library]]): WorkspaceSchema = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any], version = 1)
    __obj.asInstanceOf[WorkspaceSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkspaceSchema] (val x: Self) extends AnyVal {
    
    inline def setCli(value: WorkspaceCLISchema): Self = StObject.set(x, "cli", value.asInstanceOf[js.Any])
    
    inline def setCliUndefined: Self = StObject.set(x, "cli", js.undefined)
    
    inline def setProjects(value: StringDictionary[WorkspaceProject[Application | Library]]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: `1`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
