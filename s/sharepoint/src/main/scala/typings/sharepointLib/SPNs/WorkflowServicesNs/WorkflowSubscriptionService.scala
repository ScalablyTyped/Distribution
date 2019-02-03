package typings
package sharepointLib.SPNs.WorkflowServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.WorkflowServices.WorkflowSubscriptionService")
@js.native
class WorkflowSubscriptionService protected ()
  extends sharepointLib.SPNs.ClientObject {
  def this(context: sharepointLib.SPNs.ClientRuntimeContext, objectPath: sharepointLib.SPNs.ObjectPathStaticProperty) = this()
  def deleteSubscription(subscriptionId: sharepointLib.SPNs.Guid): WorkflowSubscription = js.native
  /** Retrieves workflow subscriptions that contains all of the workflow subscriptions on the Web  */
  def enumerateSubscriptions(): WorkflowSubscriptionCollection = js.native
  /** Retrieves workflow subscriptions based on workflow definition */
  def enumerateSubscriptionsByDefinition(definitionId: java.lang.String): WorkflowSubscriptionCollection = js.native
  /** Retrieves workflow subscriptions based on the specified EventSourceId */
  def enumerateSubscriptionsByEventSource(eventSourceId: java.lang.String): WorkflowSubscriptionCollection = js.native
  /** Retrieves workflow subscriptions based on the specified list.
    @param listId The unique identifier (GUID) of the list on which to filter the subscriptions. */
  def enumerateSubscriptionsByList(listId: java.lang.String): WorkflowSubscriptionCollection = js.native
  def getSubscription(subscriptionId: sharepointLib.SPNs.Guid): WorkflowSubscription = js.native
  /** Creates a workflow subscription for a workflow, and returns the unique identifier of the new subscription. */
  def publishSubscription(subscription: WorkflowSubscription): sharepointLib.SPNs.GuidResult = js.native
  /** Creates a workflow subscription for a workflow and if necessary an event receiver on the specified list.
    Also writes an EventSourceId that matches the list as the event source.
    Returns the unique identifier of the new subscription.
    @param listId Unique identifier (GUID) for the specified list. */
  def publishSubscriptionForList(subscription: WorkflowSubscription, listId: java.lang.String): sharepointLib.SPNs.GuidResult = js.native
  /** Ensures that an event receiver will monitor a list for the specified event.
    @param listId Unique identifier (GUID) for the specified list.
    @eventName eventName The name of the event to be monitored. */
  def registerInterestInList(listId: java.lang.String, eventName: java.lang.String): scala.Unit = js.native
  /** Removes monitoring for an event receiver on the specified list with the specified event.
    @param listId GUID of the list containing the event receiver to be unregistered.
    @eventName eventName The name of the event to be removed. */
  def unregisterInterestInList(listId: java.lang.String, eventName: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSGlobal("SP.WorkflowServices.WorkflowSubscriptionService")
@js.native
object WorkflowSubscriptionService extends js.Object {
  def getCurrent(context: sharepointLib.SPNs.ClientRuntimeContext): sharepointLib.SPNs.WorkflowServicesNs.WorkflowSubscriptionService = js.native
}

