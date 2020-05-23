package typings.sharepoint.SP.WorkflowServices

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.GuidResult
import typings.sharepoint.SP.IntResult
import typings.sharepoint.SP.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reads the SharePoint workflow instances from the external workflow host and manages the instance execution. */
@js.native
trait WorkflowInstanceService extends ClientObject {
  /** Sends a cancel message to the specified workflow instance and permits the instance to execute a cancellation scope. */
  def cancelWorkflow(instance: WorkflowInstance): Unit = js.native
  /** Retrieves a count of all the instances of the specified WorkflowSubscription. */
  def countInstances(parentSubscription: WorkflowSubscription): IntResult = js.native
  /** Retrieves a count of the instances of the specified WorkflowSubscription that have a specified status. */
  def countInstancesWithStatus(parentSubscription: WorkflowSubscription, status: WorkflowStatus): IntResult = js.native
  /** Gets a workflow instance collection comprising the 100 most recent workflow instances started by a specified subscription.  */
  def enumerate(parentSubscription: WorkflowSubscription): WorkflowInstanceCollection = js.native
  /** Gets the list of instances for the specified list item. */
  def enumerateInstancesForListItem(listId: String, itemId: Double): WorkflowInstanceCollection = js.native
  /** Gets the list of instances for the specified list item. */
  def enumerateInstancesForListItemWithOffset(listId: String, itemId: Double, offset: Double): WorkflowInstanceCollection = js.native
  /** Gets the list of instances for the current site. */
  def enumerateInstancesForSite(): WorkflowInstanceCollection = js.native
  /** Gets the list of instances for the current site. */
  def enumerateInstancesForSiteWithOffset(offset: Double): WorkflowInstanceCollection = js.native
  /** Gets a workflow instance collection comprising 100 workflow instances starting at the specified offset.  */
  def enumerateWithOffset(parentSubscription: WorkflowSubscription, offset: Double): WorkflowInstanceCollection = js.native
  def getDebugInfo(instance: WorkflowInstance): StringResult = js.native
  /** Gets workflow instance specified by the provided instance GUID */
  def getInstance(instanceId: String): WorkflowInstance = js.native
  /** Sends a custom event to a running workflow with the event payload. */
  def publishCustomEvent(instance: WorkflowInstance, eventName: String, payload: String): Unit = js.native
  def resumeWorkflow(instance: WorkflowInstance): Unit = js.native
  /** Starts a Workflow Manager Client 1.0 instance specified by the subscription and passes the supplied parameters.
    Returns GUID of the instance object.
    @param payload Object that contains name-value pairs of parameter names and values to pass into the workflow instance. */
  def startWorkflow(subscription: WorkflowSubscription, payload: StringDictionary[js.Any]): GuidResult = js.native
  /** Starts a Workflow Manager Client 1.0 instance specified by the subscription and passes the supplied parameters.
    Returns GUID of the instance object.
    @param subscription The subscription associated with the workflow instance.
    @param itemId The integer id of the list item on which to start the workflow instance.
    @param payload Object that contains name-value pairs of parameter names and values to pass into the workflow instance. */
  def startWorkflowOnListItem(subscription: WorkflowSubscription, itemId: Double, payload: StringDictionary[js.Any]): GuidResult = js.native
  def suspendWorkflow(instance: WorkflowInstance): Unit = js.native
  /** Terminate a workflow instance forcefully by deleting it from memory. The instance is not allowed to execute a cancellation scope */
  def terminateWorkflow(instance: WorkflowInstance): Unit = js.native
}

