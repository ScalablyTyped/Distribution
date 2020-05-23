package typings.sharepoint.SP.Workflow

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.List
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowAssociationCreationInformation extends ClientValueObject {
  def get_contentTypeAssociationHistoryListName(): String
  def get_contentTypeAssociationTaskListName(): String
  def get_historyList(): List[_]
  def get_name(): String
  def get_taskList(): List[_]
  def get_template(): WorkflowTemplate
  def set_contentTypeAssociationHistoryListName(value: String): Unit
  def set_contentTypeAssociationTaskListName(value: String): Unit
  def set_historyList(value: List[_]): Unit
  def set_name(value: String): Unit
  def set_taskList(value: List[_]): Unit
  def set_template(value: WorkflowTemplate): Unit
}

object WorkflowAssociationCreationInformation {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_contentTypeAssociationHistoryListName: () => String,
    get_contentTypeAssociationTaskListName: () => String,
    get_historyList: () => List[_],
    get_name: () => String,
    get_taskList: () => List[_],
    get_template: () => WorkflowTemplate,
    get_typeId: () => String,
    set_contentTypeAssociationHistoryListName: String => Unit,
    set_contentTypeAssociationTaskListName: String => Unit,
    set_historyList: List[_] => Unit,
    set_name: String => Unit,
    set_taskList: List[_] => Unit,
    set_template: WorkflowTemplate => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): WorkflowAssociationCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_contentTypeAssociationHistoryListName = js.Any.fromFunction0(get_contentTypeAssociationHistoryListName), get_contentTypeAssociationTaskListName = js.Any.fromFunction0(get_contentTypeAssociationTaskListName), get_historyList = js.Any.fromFunction0(get_historyList), get_name = js.Any.fromFunction0(get_name), get_taskList = js.Any.fromFunction0(get_taskList), get_template = js.Any.fromFunction0(get_template), get_typeId = js.Any.fromFunction0(get_typeId), set_contentTypeAssociationHistoryListName = js.Any.fromFunction1(set_contentTypeAssociationHistoryListName), set_contentTypeAssociationTaskListName = js.Any.fromFunction1(set_contentTypeAssociationTaskListName), set_historyList = js.Any.fromFunction1(set_historyList), set_name = js.Any.fromFunction1(set_name), set_taskList = js.Any.fromFunction1(set_taskList), set_template = js.Any.fromFunction1(set_template), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[WorkflowAssociationCreationInformation]
  }
}

