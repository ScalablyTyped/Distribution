package typings.sharepoint.SP.Workflow

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.List
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowAssociationCreationInformation extends ClientValueObject {
  
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
  
  @scala.inline
  implicit class WorkflowAssociationCreationInformationOps[Self <: WorkflowAssociationCreationInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet_contentTypeAssociationHistoryListName(value: () => String): Self = this.set("get_contentTypeAssociationHistoryListName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_contentTypeAssociationTaskListName(value: () => String): Self = this.set("get_contentTypeAssociationTaskListName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_historyList(value: () => List[_]): Self = this.set("get_historyList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_name(value: () => String): Self = this.set("get_name", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_taskList(value: () => List[_]): Self = this.set("get_taskList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_template(value: () => WorkflowTemplate): Self = this.set("get_template", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_contentTypeAssociationHistoryListName(value: String => Unit): Self = this.set("set_contentTypeAssociationHistoryListName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_contentTypeAssociationTaskListName(value: String => Unit): Self = this.set("set_contentTypeAssociationTaskListName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_historyList(value: List[_] => Unit): Self = this.set("set_historyList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_name(value: String => Unit): Self = this.set("set_name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_taskList(value: List[_] => Unit): Self = this.set("set_taskList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_template(value: WorkflowTemplate => Unit): Self = this.set("set_template", js.Any.fromFunction1(value))
  }
}
