package typings
package sharepointLib.SPNs.WorkflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Workflow.WorkflowAssociationCreationInformation")
@js.native
class WorkflowAssociationCreationInformation ()
  extends sharepointLib.SPNs.ClientValueObject {
  def get_contentTypeAssociationHistoryListName(): java.lang.String = js.native
  def get_contentTypeAssociationTaskListName(): java.lang.String = js.native
  def get_historyList(): sharepointLib.SPNs.List[_] = js.native
  def get_name(): java.lang.String = js.native
  def get_taskList(): sharepointLib.SPNs.List[_] = js.native
  def get_template(): WorkflowTemplate = js.native
  def set_contentTypeAssociationHistoryListName(value: java.lang.String): scala.Unit = js.native
  def set_contentTypeAssociationTaskListName(value: java.lang.String): scala.Unit = js.native
  def set_historyList(value: sharepointLib.SPNs.List[_]): scala.Unit = js.native
  def set_name(value: java.lang.String): scala.Unit = js.native
  def set_taskList(value: sharepointLib.SPNs.List[_]): scala.Unit = js.native
  def set_template(value: WorkflowTemplate): scala.Unit = js.native
}

