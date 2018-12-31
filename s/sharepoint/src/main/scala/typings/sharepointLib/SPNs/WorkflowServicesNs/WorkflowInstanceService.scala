package typings
package sharepointLib.SPNs.WorkflowServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reads the SharePoint workflow instances from the external workflow host and manages the instance execution. */
@JSGlobal("SP.WorkflowServices.WorkflowInstanceService")
@js.native
class WorkflowInstanceService ()
  extends sharepointLib.SPNs.ClientObject {
  /** Sends a cancel message to the specified workflow instance and permits the instance to execute a cancellation scope. */
  def cancelWorkflow(instance: WorkflowInstance): scala.Unit = js.native
  /** Retrieves a count of all the instances of the specified WorkflowSubscription. */
  def countInstances(parentSubscription: WorkflowSubscription): sharepointLib.SPNs.IntResult = js.native
  /** Retrieves a count of the instances of the specified WorkflowSubscription that have a specified status. */
  def countInstancesWithStatus(parentSubscription: WorkflowSubscription, status: WorkflowStatus): sharepointLib.SPNs.IntResult = js.native
  /** Gets a workflow instance collection comprising the 100 most recent workflow instances started by a specified subscription.  */
  def enumerate(parentSubscription: WorkflowSubscription): WorkflowInstanceCollection = js.native
  /** Gets the list of instances for the specified list item. */
  def enumerateInstancesForListItem(listId: java.lang.String, itemId: scala.Double): WorkflowInstanceCollection = js.native
  /** Gets the list of instances for the specified list item. */
  def enumerateInstancesForListItemWithOffset(listId: java.lang.String, itemId: scala.Double, offset: scala.Double): WorkflowInstanceCollection = js.native
  /** Gets the list of instances for the current site. */
  def enumerateInstancesForSite(): WorkflowInstanceCollection = js.native
  /** Gets the list of instances for the current site. */
  def enumerateInstancesForSiteWithOffset(offset: scala.Double): WorkflowInstanceCollection = js.native
  /** Gets a workflow instance collection comprising 100 workflow instances starting at the specified offset.  */
  def enumerateWithOffset(parentSubscription: WorkflowSubscription, offset: scala.Double): WorkflowInstanceCollection = js.native
  def getDebugInfo(instance: WorkflowInstance): sharepointLib.SPNs.StringResult = js.native
  /** Gets workflow instance specified by the provided instance GUID */
  def getInstance(instanceId: java.lang.String): WorkflowInstance = js.native
  /** Sends a custom event to a running workflow with the event payload. */
  def publishCustomEvent(instance: WorkflowInstance, eventName: java.lang.String, payload: java.lang.String): scala.Unit = js.native
  def resumeWorkflow(instance: WorkflowInstance): scala.Unit = js.native
  /** Starts a Workflow Manager Client 1.0 instance specified by the subscription and passes the supplied parameters.
    Returns GUID of the instance object.
    @param payload Object that contains name-value pairs of parameter names and values to pass into the workflow instance. */
  def startWorkflow(subscription: WorkflowSubscription, payload: org.scalablytyped.runtime.StringDictionary[js.Any]): sharepointLib.SPNs.GuidResult = js.native
  /** Starts a Workflow Manager Client 1.0 instance specified by the subscription and passes the supplied parameters.
    Returns GUID of the instance object.
    @param subscription The subscription associated with the workflow instance.
    @param itemId The integer id of the list item on which to start the workflow instance.
    @param payload Object that contains name-value pairs of parameter names and values to pass into the workflow instance. */
  def startWorkflowOnListItem(
    subscription: WorkflowSubscription,
    itemId: scala.Double,
    payload: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): sharepointLib.SPNs.GuidResult = js.native
  def suspendWorkflow(instance: WorkflowInstance): scala.Unit = js.native
  /** Terminate a workflow instance forcefully by deleting it from memory. The instance is not allowed to execute a cancellation scope */
  def terminateWorkflow(instance: WorkflowInstance): scala.Unit = js.native
}

