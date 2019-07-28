package typings.sharepoint.SPNs.WorkflowServicesNs

import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.ClientRuntimeContext
import typings.sharepoint.SPNs.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the workflow host configuration states and provides service objects that interact with the workflow */
@JSGlobal("SP.WorkflowServices.WorkflowServicesManager")
@js.native
class WorkflowServicesManager protected () extends ClientObject {
  def this(context: ClientRuntimeContext, web: Web) = this()
  def getWorkflowDeploymentService(): WorkflowDeploymentService = js.native
  def getWorkflowInstanceService(): WorkflowInstanceService = js.native
  def getWorkflowInteropService(): InteropService = js.native
  def getWorkflowSubscriptionService(): WorkflowSubscriptionService = js.native
  /** The current application identifier.*/
  def get_appId(): String = js.native
  /** Indicates whether this workflow service is actively connected to a workflow host. */
  def get_isConnected(): Boolean = js.native
  /** Returns the path of the current scope in the workflow host. */
  def get_scopePath(): String = js.native
}

/* static members */
@JSGlobal("SP.WorkflowServices.WorkflowServicesManager")
@js.native
object WorkflowServicesManager extends js.Object {
  def newObject(context: ClientRuntimeContext, web: Web): WorkflowServicesManager = js.native
}

