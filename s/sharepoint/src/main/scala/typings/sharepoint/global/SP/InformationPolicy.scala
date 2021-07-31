package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InformationPolicy {
  
  @JSGlobal("SP.InformationPolicy.ProjectPolicy")
  @js.native
  class ProjectPolicy protected ()
    extends StObject
       with typings.sharepoint.SP.InformationPolicy.ProjectPolicy {
    def this(context: typings.sharepoint.SP.ClientRuntimeContext, objectPath: typings.sharepoint.SP.ObjectPath) = this()
  }
  object ProjectPolicy {
    
    @JSGlobal("SP.InformationPolicy.ProjectPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def applyProjectPolicy(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      web: typings.sharepoint.SP.Web,
      projectPolicy: typings.sharepoint.SP.InformationPolicy.ProjectPolicy
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyProjectPolicy")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any], projectPolicy.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    @scala.inline
    def closeProject(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("closeProject")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    @scala.inline
    def doesProjectHavePolicy(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.BooleanResult = (^.asInstanceOf[js.Dynamic].applyDynamic("doesProjectHavePolicy")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.BooleanResult]
    
    /* static member */
    @scala.inline
    def getCurrentlyAppliedProject(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.InformationPolicy.ProjectPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentlyAppliedProject")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.InformationPolicy.ProjectPolicy]
    
    /* static member */
    @scala.inline
    def getProjectCloseDate(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.DateTimeResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getProjectCloseDate")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.DateTimeResult]
    
    /* static member */
    @scala.inline
    def getProjectExpirationDate(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.DateTimeResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getProjectExpirationDate")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.DateTimeResult]
    
    /* static member */
    @scala.inline
    def getProjectPolicies(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.ClientObjectList[typings.sharepoint.SP.InformationPolicy.ProjectPolicy] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProjectPolicies")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.ClientObjectList[typings.sharepoint.SP.InformationPolicy.ProjectPolicy]]
    
    /* static member */
    @scala.inline
    def isProjectClosed(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.BooleanResult = (^.asInstanceOf[js.Dynamic].applyDynamic("isProjectClosed")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.BooleanResult]
    
    /* static member */
    @scala.inline
    def openProject(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openProject")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    @scala.inline
    def postponeProject(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postponeProject")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
