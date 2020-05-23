package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Workflow")
@js.native
object Workflow extends js.Object {
  @js.native
  class WorkflowAssociation ()
    extends typings.sharepoint.SP.Workflow.WorkflowAssociation
  
  @js.native
  class WorkflowAssociationCreationInformation ()
    extends typings.sharepoint.SP.Workflow.WorkflowAssociationCreationInformation {
    /* CompleteClass */
    override def customFromJson(obj: js.Any): Boolean = js.native
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    /* CompleteClass */
    override def fromJson(obj: js.Any): Unit = js.native
    /* CompleteClass */
    override def get_contentTypeAssociationHistoryListName(): String = js.native
    /* CompleteClass */
    override def get_contentTypeAssociationTaskListName(): String = js.native
    /* CompleteClass */
    override def get_historyList(): typings.sharepoint.SP.List[_] = js.native
    /* CompleteClass */
    override def get_name(): String = js.native
    /* CompleteClass */
    override def get_taskList(): typings.sharepoint.SP.List[_] = js.native
    /* CompleteClass */
    override def get_template(): typings.sharepoint.SP.Workflow.WorkflowTemplate = js.native
    /* CompleteClass */
    override def get_typeId(): String = js.native
    /* CompleteClass */
    override def set_contentTypeAssociationHistoryListName(value: String): Unit = js.native
    /* CompleteClass */
    override def set_contentTypeAssociationTaskListName(value: String): Unit = js.native
    /* CompleteClass */
    override def set_historyList(value: typings.sharepoint.SP.List[_]): Unit = js.native
    /* CompleteClass */
    override def set_name(value: String): Unit = js.native
    /* CompleteClass */
    override def set_taskList(value: typings.sharepoint.SP.List[_]): Unit = js.native
    /* CompleteClass */
    override def set_template(value: typings.sharepoint.SP.Workflow.WorkflowTemplate): Unit = js.native
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  @js.native
  class WorkflowTemplate ()
    extends typings.sharepoint.SP.Workflow.WorkflowTemplate
  
}

