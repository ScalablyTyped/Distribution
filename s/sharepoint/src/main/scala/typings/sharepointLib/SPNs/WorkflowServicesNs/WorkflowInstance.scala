package typings
package sharepointLib.SPNs.WorkflowServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an instance of a workflow association that performs on a list item the process that is defined in a workflow template */
@JSGlobal("SP.WorkflowServices.WorkflowInstance")
@js.native
class WorkflowInstance ()
  extends sharepointLib.SPNs.ClientObject {
  /** Contains the error string or exception information if the workflow faults. */
  def get_faultInfo(): java.lang.String = js.native
  /** Unique identifier (GUID) for the workflow instance */
  def get_id(): java.lang.String = js.native
  /** Gets the Coordinated Universal Time (UTC) when this workflow instance was created. */
  def get_instanceCreated(): java.lang.String = js.native
  /** Gets the Coordinated Universal Time (UTC) when the workflow instance state was last persisted */
  def get_lastUpdated(): java.lang.String = js.native
  /** Specifies properties of this workflow instance */
  def get_properties(): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  /** Returns runtime status of the workflow instance */
  def get_status(): WorkflowStatus = js.native
  /** Specifies the custom status set by workflow authors. */
  def get_userStatus(): java.lang.String = js.native
  /** Gets the unique identifier (GUID) of the subscription that instantiates the WorkflowInstance */
  def get_workflowSubscriptionId(): sharepointLib.SPNs.Guid = js.native
  /** Specifies the custom status set by workflow authors. */
  def set_userStatus(value: java.lang.String): java.lang.String = js.native
}

