package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkflowServices {
  
  // TODO: comments, types
  @JSGlobal("SP.WorkflowServices.InteropService")
  @js.native
  class InteropService protected ()
    extends typings.sharepoint.SP.WorkflowServices.InteropService {
    def this(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      objectPath: typings.sharepoint.SP.ObjectPathStaticProperty
    ) = this()
  }
  object InteropService {
    
    /* static member */
    @JSGlobal("SP.WorkflowServices.InteropService.getCurrent")
    @js.native
    def getCurrent(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.WorkflowServices.InteropService = js.native
  }
  
  /** Represents a workflow definition and associated properties. */
  @JSGlobal("SP.WorkflowServices.WorkflowDefinition")
  @js.native
  class WorkflowDefinition protected ()
    extends typings.sharepoint.SP.WorkflowServices.WorkflowDefinition {
    def this(context: typings.sharepoint.SP.ClientRuntimeContext) = this()
  }
  
  /** Manages workflow definitions and workflow activity authoring. */
  @JSGlobal("SP.WorkflowServices.WorkflowDeploymentService")
  @js.native
  class WorkflowDeploymentService ()
    extends typings.sharepoint.SP.WorkflowServices.WorkflowDeploymentService
  
  /** Represents an instance of a workflow association that performs on a list item the process that is defined in a workflow template */
  @JSGlobal("SP.WorkflowServices.WorkflowInstance")
  @js.native
  class WorkflowInstance ()
    extends typings.sharepoint.SP.WorkflowServices.WorkflowInstance
  
  /** Reads the SharePoint workflow instances from the external workflow host and manages the instance execution. */
  @JSGlobal("SP.WorkflowServices.WorkflowInstanceService")
  @js.native
  class WorkflowInstanceService ()
    extends typings.sharepoint.SP.WorkflowServices.WorkflowInstanceService
  
  /** Describes the workflow host configuration states and provides service objects that interact with the workflow */
  @JSGlobal("SP.WorkflowServices.WorkflowServicesManager")
  @js.native
  class WorkflowServicesManager protected ()
    extends typings.sharepoint.SP.WorkflowServices.WorkflowServicesManager {
    def this(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web) = this()
  }
  object WorkflowServicesManager {
    
    /* static member */
    @JSGlobal("SP.WorkflowServices.WorkflowServicesManager.newObject")
    @js.native
    def newObject(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.WorkflowServices.WorkflowServicesManager = js.native
  }
  
  @JSGlobal("SP.WorkflowServices.WorkflowStatus")
  @js.native
  object WorkflowStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.WorkflowServices.WorkflowStatus with Double] = js.native
    
    /* 4 */ val canceled: typings.sharepoint.SP.WorkflowServices.WorkflowStatus.canceled with Double = js.native
    
    /* 3 */ val canceling: typings.sharepoint.SP.WorkflowServices.WorkflowStatus.canceling with Double = js.native
    
    /* 6 */ val completed: typings.sharepoint.SP.WorkflowServices.WorkflowStatus.completed with Double = js.native
    
    /* 8 */ val invalid: typings.sharepoint.SP.WorkflowServices.WorkflowStatus.invalid with Double = js.native
    
    /* 7 */ val notSpecified: typings.sharepoint.SP.WorkflowServices.WorkflowStatus.notSpecified with Double = js.native
    
    /* 0 */ val notStarted: typings.sharepoint.SP.WorkflowServices.WorkflowStatus.notStarted with Double = js.native
    
    /* 1 */ val started: typings.sharepoint.SP.WorkflowServices.WorkflowStatus.started with Double = js.native
    
    /* 2 */ val suspended: typings.sharepoint.SP.WorkflowServices.WorkflowStatus.suspended with Double = js.native
    
    /* 5 */ val terminated: typings.sharepoint.SP.WorkflowServices.WorkflowStatus.terminated with Double = js.native
  }
  
  /** Base class representing subscriptions for the external workflow host. */
  @JSGlobal("SP.WorkflowServices.WorkflowSubscription")
  @js.native
  class WorkflowSubscription ()
    extends typings.sharepoint.SP.WorkflowServices.WorkflowSubscription
  
  @JSGlobal("SP.WorkflowServices.WorkflowSubscriptionService")
  @js.native
  class WorkflowSubscriptionService protected ()
    extends typings.sharepoint.SP.WorkflowServices.WorkflowSubscriptionService {
    def this(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      objectPath: typings.sharepoint.SP.ObjectPathStaticProperty
    ) = this()
  }
  object WorkflowSubscriptionService {
    
    /* static member */
    @JSGlobal("SP.WorkflowServices.WorkflowSubscriptionService.getCurrent")
    @js.native
    def getCurrent(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.WorkflowServices.WorkflowSubscriptionService = js.native
  }
}
