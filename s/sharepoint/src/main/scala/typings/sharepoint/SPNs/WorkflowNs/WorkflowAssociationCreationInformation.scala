package typings.sharepoint.SPNs.WorkflowNs

import typings.sharepoint.SPNs.ClientValueObject
import typings.sharepoint.SPNs.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Workflow.WorkflowAssociationCreationInformation")
@js.native
class WorkflowAssociationCreationInformation () extends ClientValueObject {
  def get_contentTypeAssociationHistoryListName(): String = js.native
  def get_contentTypeAssociationTaskListName(): String = js.native
  def get_historyList(): List[_] = js.native
  def get_name(): String = js.native
  def get_taskList(): List[_] = js.native
  def get_template(): WorkflowTemplate = js.native
  def set_contentTypeAssociationHistoryListName(value: String): Unit = js.native
  def set_contentTypeAssociationTaskListName(value: String): Unit = js.native
  def set_historyList(value: List[_]): Unit = js.native
  def set_name(value: String): Unit = js.native
  def set_taskList(value: List[_]): Unit = js.native
  def set_template(value: WorkflowTemplate): Unit = js.native
}

