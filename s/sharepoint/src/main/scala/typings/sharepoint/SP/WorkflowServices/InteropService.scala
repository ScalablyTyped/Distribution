package typings.sharepoint.SP.WorkflowServices

import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.GuidResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: comments, types
@js.native
trait InteropService extends ClientObject {
  
  def cancelWorkflow(instanceId: Guid): Unit = js.native
  
  def disableEvents(listId: Guid, itemGuid: Guid): Unit = js.native
  
  def enableEvents(listId: Guid, itemGuid: Guid): Unit = js.native
  
  def startWorkflow(
    associationName: String,
    correlationId: Guid,
    listId: Guid,
    itemGuid: Guid,
    workflowParameters: js.Any
  ): GuidResult = js.native
}
