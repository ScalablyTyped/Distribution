package typings.sharepoint.SP

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Workflow")
@js.native
object Workflow extends js.Object {
  @js.native
  class WorkflowAssociation () extends ClientObject {
    def deleteObject(): Unit = js.native
    def get_allowManual(): Boolean = js.native
    def get_associationData(): String = js.native
    def get_autoStartChange(): Boolean = js.native
    def get_autoStartCreate(): Boolean = js.native
    def get_baseId(): Guid = js.native
    def get_created(): Date = js.native
    def get_description(): String = js.native
    def get_enabled(): Boolean = js.native
    def get_historyListTitle(): String = js.native
    def get_id(): Guid = js.native
    def get_instantiationUrl(): String = js.native
    def get_internalName(): String = js.native
    def get_isDeclarative(): Boolean = js.native
    def get_listId(): Guid = js.native
    def get_modified(): Date = js.native
    def get_name(): String = js.native
    def get_taskListTitle(): String = js.native
    def get_webId(): Guid = js.native
    def set_allowManual(value: Boolean): Unit = js.native
    def set_associationData(value: String): Unit = js.native
    def set_autoStartChange(value: Boolean): Unit = js.native
    def set_autoStartCreate(value: Boolean): Unit = js.native
    def set_description(value: String): Unit = js.native
    def set_enabled(value: Boolean): Unit = js.native
    def set_historyListTitle(value: String): Unit = js.native
    def set_name(value: String): Unit = js.native
    def set_taskListTitle(value: String): Unit = js.native
    def update(): Unit = js.native
  }
  
  @js.native
  trait WorkflowAssociationCollection extends ClientObjectCollection[WorkflowAssociation] {
    def add(parameters: WorkflowAssociationCreationInformation): WorkflowAssociation = js.native
    def getById(associationId: Guid): WorkflowAssociation = js.native
    def getByName(name: String): WorkflowAssociation = js.native
    def get_item(index: Double): WorkflowAssociation = js.native
    def itemAt(index: Double): WorkflowAssociation = js.native
  }
  
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
  
  @js.native
  class WorkflowTemplate () extends ClientObject {
    def get_allowManual(): Boolean = js.native
    def get_associationUrl(): String = js.native
    def get_autoStartChange(): Boolean = js.native
    def get_autoStartCreate(): Boolean = js.native
    def get_description(): String = js.native
    def get_id(): Guid = js.native
    def get_isDeclarative(): Boolean = js.native
    def get_name(): String = js.native
    def get_permissionsManual(): BasePermissions = js.native
  }
  
  @js.native
  trait WorkflowTemplateCollection extends ClientObjectCollection[WorkflowTemplate] {
    def getById(templateId: Guid): WorkflowTemplate = js.native
    def getByName(name: String): WorkflowTemplate = js.native
    def get_item(index: Double): WorkflowTemplate = js.native
    def itemAt(index: Double): WorkflowTemplate = js.native
  }
  
}

