package typings.sharepoint.SP.Workflow

import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.Guid
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowAssociation extends ClientObject {
  
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
