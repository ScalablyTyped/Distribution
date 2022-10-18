package typings.schematicsAngular.utilityWorkspaceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceProject[TProjectType /* <: ProjectType */] extends StObject {
  
  /**
    * Tool options.
    */
  var architect: js.UndefOr[WorkspaceTargets[TProjectType]] = js.undefined
  
  var cli: js.UndefOr[WorkspaceCLISchema] = js.undefined
  
  var prefix: String
  
  /**
    * Project type.
    */
  var projectType: ProjectType
  
  var root: String
  
  var sourceRoot: String
  
  /**
    * Tool options.
    */
  var targets: js.UndefOr[WorkspaceTargets[TProjectType]] = js.undefined
}
object WorkspaceProject {
  
  inline def apply[TProjectType /* <: ProjectType */](prefix: String, projectType: ProjectType, root: String, sourceRoot: String): WorkspaceProject[TProjectType] = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceProject[TProjectType]]
  }
  
  extension [Self <: WorkspaceProject[?], TProjectType /* <: ProjectType */](x: Self & WorkspaceProject[TProjectType]) {
    
    inline def setArchitect(value: WorkspaceTargets[TProjectType]): Self = StObject.set(x, "architect", value.asInstanceOf[js.Any])
    
    inline def setArchitectUndefined: Self = StObject.set(x, "architect", js.undefined)
    
    inline def setCli(value: WorkspaceCLISchema): Self = StObject.set(x, "cli", value.asInstanceOf[js.Any])
    
    inline def setCliUndefined: Self = StObject.set(x, "cli", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setProjectType(value: ProjectType): Self = StObject.set(x, "projectType", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
    
    inline def setTargets(value: WorkspaceTargets[TProjectType]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
  }
}
