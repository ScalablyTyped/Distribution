package typings
package sharepointLib.SPNs.WorkflowServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: comments, types
@JSGlobal("SP.WorkflowServices.InteropService")
@js.native
class InteropService protected ()
  extends sharepointLib.SPNs.ClientObject {
  def this(context: sharepointLib.SPNs.ClientRuntimeContext, objectPath: sharepointLib.SPNs.ObjectPathStaticProperty) = this()
  def cancelWorkflow(instanceId: sharepointLib.SPNs.Guid): scala.Unit = js.native
  def disableEvents(listId: sharepointLib.SPNs.Guid, itemGuid: sharepointLib.SPNs.Guid): scala.Unit = js.native
  def enableEvents(listId: sharepointLib.SPNs.Guid, itemGuid: sharepointLib.SPNs.Guid): scala.Unit = js.native
  def startWorkflow(
    associationName: java.lang.String,
    correlationId: sharepointLib.SPNs.Guid,
    listId: sharepointLib.SPNs.Guid,
    itemGuid: sharepointLib.SPNs.Guid,
    workflowParameters: js.Any
  ): sharepointLib.SPNs.GuidResult = js.native
}

/* static members */
@JSGlobal("SP.WorkflowServices.InteropService")
@js.native
object InteropService extends js.Object {
  def getCurrent(context: sharepointLib.SPNs.ClientRuntimeContext): sharepointLib.SPNs.WorkflowServicesNs.InteropService = js.native
}

