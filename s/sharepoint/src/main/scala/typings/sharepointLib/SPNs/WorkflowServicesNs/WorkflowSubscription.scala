package typings
package sharepointLib.SPNs.WorkflowServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Base class representing subscriptions for the external workflow host. */
@JSGlobal("SP.WorkflowServices.WorkflowSubscription")
@js.native
class WorkflowSubscription ()
  extends sharepointLib.SPNs.ClientObject {
  /** Gets the unique ID of the workflow definition to activate. */
  def get_definitionId(): sharepointLib.SPNs.Guid = js.native
  /** Gets a boolean value that specifies if the workflow subscription is enabled.
              When disabled, new instances of the subscription cannot be started, but existing instances will continue to run.  */
  def get_enabled(): scala.Boolean = js.native
  /** Gets the logical source instance name of the event. (GUID) */
  def get_eventSourceId(): java.lang.String = js.native
  /** Gets or sets the list of event types for which the subscription is listening.
              For SharePoint events, these will map to a value in the SPEventReceiverType enumeration. */
  def get_eventTypes(): js.Array[java.lang.String] = js.native
  /** Unique identifier (GUID) of the workflow subscription */
  def get_id(): java.lang.String = js.native
  /** Boolean value that specifies whether multiple workflow instances can be started manually on the same list item at the same time. This property can be used for list workflows only.  */
  def get_manualStartBypassesActivationLimit(): scala.Boolean = js.native
  /** Gets the name of the workflow subscription for the specified event source.  */
  def get_name(): java.lang.String = js.native
  /** Gets the properties and values to pass to the workflow definition when the subscription is matched. */
  def get_propertyDefinitions(): js.Any = js.native
  /** Gets the name of the workflow status field on the specified list.  */
  def get_statusFieldName(): java.lang.String = js.native
  /** Sets the name-value pairs for workflow definition initiation parameters that are stored in the PropertyDefinitions property  */
  def setProperty(propertyName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /** Sets the unique ID of the workflow definition to activate. */
  def set_definitionId(value: sharepointLib.SPNs.Guid): sharepointLib.SPNs.Guid = js.native
  /** Sets a boolean value that enables or disables the workflow subscription.
              When disabled, new instances of the subscription cannot be started, but existing instances will continue to run.  */
  def set_enabled(value: scala.Boolean): scala.Boolean = js.native
  /** Sets the logical source instance name of the event. (GUID) */
  def set_eventSourceId(value: java.lang.String): java.lang.String = js.native
  /** Gets or sets the list of event types for which the subscription is listening.
              For SharePoint events, these will map to a value in the SPEventReceiverType enumeration. */
  def set_eventTypes(value: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  /** Unique identifier (GUID) of the workflow subscription */
  def set_id(value: java.lang.String): java.lang.String = js.native
  /** Boolean value that specifies whether multiple workflow instances can be started manually on the same list item at the same time. This property can be used for list workflows only.  */
  def set_manualStartBypassesActivationLimit(value: scala.Boolean): scala.Boolean = js.native
  /** Sets the name of the workflow subscription for the specified event source.  */
  def set_name(value: java.lang.String): java.lang.String = js.native
  /** Gets or sets the name of the workflow status field on the specified list.  */
  def set_statusFieldName(value: java.lang.String): java.lang.String = js.native
}

