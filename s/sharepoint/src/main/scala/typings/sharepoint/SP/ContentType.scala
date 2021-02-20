package typings.sharepoint.SP

import typings.sharepoint.SP.Workflow.WorkflowAssociationCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentType extends ClientObject {
  
  def deleteObject(): Unit = js.native
  
  def get_description(): String = js.native
  
  def get_displayFormTemplateName(): String = js.native
  
  def get_displayFormUrl(): String = js.native
  
  def get_documentTemplate(): String = js.native
  
  def get_documentTemplateUrl(): String = js.native
  
  def get_editFormTemplateName(): String = js.native
  
  def get_editFormUrl(): String = js.native
  
  def get_fieldLinks(): FieldLinkCollection = js.native
  
  def get_fields(): FieldCollection = js.native
  
  def get_group(): String = js.native
  
  def get_hidden(): Boolean = js.native
  
  def get_id(): ContentTypeId = js.native
  
  def get_jsLink(): String = js.native
  
  def get_name(): String = js.native
  
  def get_newFormTemplateName(): String = js.native
  
  def get_newFormUrl(): String = js.native
  
  def get_parent(): ContentType = js.native
  
  def get_readOnly(): Boolean = js.native
  
  def get_schemaXml(): String = js.native
  
  def get_schemaXmlWithResourceTokens(): String = js.native
  
  def get_scope(): String = js.native
  
  def get_sealed(): Boolean = js.native
  
  def get_stringId(): String = js.native
  
  def get_workflowAssociations(): WorkflowAssociationCollection = js.native
  
  def set_description(value: String): Unit = js.native
  
  def set_displayFormTemplateName(value: String): Unit = js.native
  
  def set_displayFormUrl(value: String): Unit = js.native
  
  def set_documentTemplate(value: String): Unit = js.native
  
  def set_editFormTemplateName(value: String): Unit = js.native
  
  def set_editFormUrl(value: String): Unit = js.native
  
  def set_group(value: String): Unit = js.native
  
  def set_hidden(value: Boolean): Unit = js.native
  
  def set_jsLink(value: String): Unit = js.native
  
  def set_name(value: String): Unit = js.native
  
  def set_newFormTemplateName(value: String): Unit = js.native
  
  def set_newFormUrl(value: String): Unit = js.native
  
  def set_readOnly(value: Boolean): Unit = js.native
  
  def set_schemaXmlWithResourceTokens(value: String): Unit = js.native
  
  def set_sealed(value: Boolean): Unit = js.native
  
  def update(updateChildren: Boolean): Unit = js.native
}
