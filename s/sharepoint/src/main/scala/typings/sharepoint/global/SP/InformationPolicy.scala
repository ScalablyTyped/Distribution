package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.InformationPolicy")
@js.native
object InformationPolicy extends js.Object {
  
  @js.native
  class ProjectPolicy protected ()
    extends typings.sharepoint.SP.InformationPolicy.ProjectPolicy {
    def this(context: typings.sharepoint.SP.ClientRuntimeContext, objectPath: typings.sharepoint.SP.ObjectPath) = this()
  }
  /* static members */
  @js.native
  object ProjectPolicy extends js.Object {
    
    def applyProjectPolicy(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      web: typings.sharepoint.SP.Web,
      projectPolicy: typings.sharepoint.SP.InformationPolicy.ProjectPolicy
    ): Unit = js.native
    
    def closeProject(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): Unit = js.native
    
    def doesProjectHavePolicy(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.BooleanResult = js.native
    
    def getCurrentlyAppliedProject(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.InformationPolicy.ProjectPolicy = js.native
    
    def getProjectCloseDate(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.DateTimeResult = js.native
    
    def getProjectExpirationDate(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.DateTimeResult = js.native
    
    def getProjectPolicies(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.ClientObjectList[typings.sharepoint.SP.InformationPolicy.ProjectPolicy] = js.native
    
    def isProjectClosed(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.BooleanResult = js.native
    
    def openProject(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): Unit = js.native
    
    def postponeProject(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): Unit = js.native
  }
}
