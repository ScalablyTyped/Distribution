package typings.sharepoint.SPNs.WorkflowServicesNs

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an instance of a workflow association that performs on a list item the process that is defined in a workflow template */
@JSGlobal("SP.WorkflowServices.WorkflowInstance")
@js.native
class WorkflowInstance () extends ClientObject {
  /** Contains the error string or exception information if the workflow faults. */
  def get_faultInfo(): String = js.native
  /** Unique identifier (GUID) for the workflow instance */
  def get_id(): String = js.native
  /** Gets the Coordinated Universal Time (UTC) when this workflow instance was created. */
  def get_instanceCreated(): String = js.native
  /** Gets the Coordinated Universal Time (UTC) when the workflow instance state was last persisted */
  def get_lastUpdated(): String = js.native
  /** Specifies properties of this workflow instance */
  def get_properties(): StringDictionary[String] = js.native
  /** Returns runtime status of the workflow instance */
  def get_status(): WorkflowStatus = js.native
  /** Specifies the custom status set by workflow authors. */
  def get_userStatus(): String = js.native
  /** Gets the unique identifier (GUID) of the subscription that instantiates the WorkflowInstance */
  def get_workflowSubscriptionId(): Guid = js.native
  /** Specifies the custom status set by workflow authors. */
  def set_userStatus(value: String): String = js.native
}

