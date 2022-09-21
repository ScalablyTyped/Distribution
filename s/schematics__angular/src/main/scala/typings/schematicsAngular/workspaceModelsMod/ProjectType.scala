package typings.schematicsAngular.workspaceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProjectType extends StObject
@JSImport("@schematics/angular/utility/workspace-models", "ProjectType")
@js.native
object ProjectType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ProjectType & String] = js.native
  
  @js.native
  sealed trait Application
    extends StObject
       with ProjectType
  /* "application" */ val Application: typings.schematicsAngular.workspaceModelsMod.ProjectType.Application & String = js.native
  
  @js.native
  sealed trait Library
    extends StObject
       with ProjectType
  /* "library" */ val Library: typings.schematicsAngular.workspaceModelsMod.ProjectType.Library & String = js.native
}
