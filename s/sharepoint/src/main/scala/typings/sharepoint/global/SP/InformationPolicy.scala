package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InformationPolicy {
  
  @JSGlobal("SP.InformationPolicy.ProjectPolicy")
  @js.native
  class ProjectPolicy protected ()
    extends typings.sharepoint.SP.InformationPolicy.ProjectPolicy {
    def this(context: typings.sharepoint.SP.ClientRuntimeContext, objectPath: typings.sharepoint.SP.ObjectPath) = this()
  }
  object ProjectPolicy {
    
    /* static member */
    @JSGlobal("SP.InformationPolicy.ProjectPolicy.applyProjectPolicy")
    @js.native
    def applyProjectPolicy(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      web: typings.sharepoint.SP.Web,
      projectPolicy: typings.sharepoint.SP.InformationPolicy.ProjectPolicy
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.InformationPolicy.ProjectPolicy.closeProject")
    @js.native
    def closeProject(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.InformationPolicy.ProjectPolicy.doesProjectHavePolicy")
    @js.native
    def doesProjectHavePolicy(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.BooleanResult = js.native
    
    /* static member */
    @JSGlobal("SP.InformationPolicy.ProjectPolicy.getCurrentlyAppliedProject")
    @js.native
    def getCurrentlyAppliedProject(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.InformationPolicy.ProjectPolicy = js.native
    
    /* static member */
    @JSGlobal("SP.InformationPolicy.ProjectPolicy.getProjectCloseDate")
    @js.native
    def getProjectCloseDate(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.DateTimeResult = js.native
    
    /* static member */
    @JSGlobal("SP.InformationPolicy.ProjectPolicy.getProjectExpirationDate")
    @js.native
    def getProjectExpirationDate(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.DateTimeResult = js.native
    
    /* static member */
    @JSGlobal("SP.InformationPolicy.ProjectPolicy.getProjectPolicies")
    @js.native
    def getProjectPolicies(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.ClientObjectList[typings.sharepoint.SP.InformationPolicy.ProjectPolicy] = js.native
    
    /* static member */
    @JSGlobal("SP.InformationPolicy.ProjectPolicy.isProjectClosed")
    @js.native
    def isProjectClosed(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.BooleanResult = js.native
    
    /* static member */
    @JSGlobal("SP.InformationPolicy.ProjectPolicy.openProject")
    @js.native
    def openProject(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.InformationPolicy.ProjectPolicy.postponeProject")
    @js.native
    def postponeProject(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): Unit = js.native
  }
}
