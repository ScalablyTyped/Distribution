package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ContentType")
@js.native
class ContentType () extends ClientObject {
  def deleteObject(): scala.Unit = js.native
  def get_description(): java.lang.String = js.native
  def get_displayFormTemplateName(): java.lang.String = js.native
  def get_displayFormUrl(): java.lang.String = js.native
  def get_documentTemplate(): java.lang.String = js.native
  def get_documentTemplateUrl(): java.lang.String = js.native
  def get_editFormTemplateName(): java.lang.String = js.native
  def get_editFormUrl(): java.lang.String = js.native
  def get_fieldLinks(): FieldLinkCollection = js.native
  def get_fields(): FieldCollection = js.native
  def get_group(): java.lang.String = js.native
  def get_hidden(): scala.Boolean = js.native
  def get_id(): ContentTypeId = js.native
  def get_jsLink(): java.lang.String = js.native
  def get_name(): java.lang.String = js.native
  def get_newFormTemplateName(): java.lang.String = js.native
  def get_newFormUrl(): java.lang.String = js.native
  def get_parent(): ContentType = js.native
  def get_readOnly(): scala.Boolean = js.native
  def get_schemaXml(): java.lang.String = js.native
  def get_schemaXmlWithResourceTokens(): java.lang.String = js.native
  def get_scope(): java.lang.String = js.native
  def get_sealed(): scala.Boolean = js.native
  def get_stringId(): java.lang.String = js.native
  def get_workflowAssociations(): sharepointLib.SPNs.WorkflowNs.WorkflowAssociationCollection = js.native
  def set_description(value: java.lang.String): scala.Unit = js.native
  def set_displayFormTemplateName(value: java.lang.String): scala.Unit = js.native
  def set_displayFormUrl(value: java.lang.String): scala.Unit = js.native
  def set_documentTemplate(value: java.lang.String): scala.Unit = js.native
  def set_editFormTemplateName(value: java.lang.String): scala.Unit = js.native
  def set_editFormUrl(value: java.lang.String): scala.Unit = js.native
  def set_group(value: java.lang.String): scala.Unit = js.native
  def set_hidden(value: scala.Boolean): scala.Unit = js.native
  def set_jsLink(value: java.lang.String): scala.Unit = js.native
  def set_name(value: java.lang.String): scala.Unit = js.native
  def set_newFormTemplateName(value: java.lang.String): scala.Unit = js.native
  def set_newFormUrl(value: java.lang.String): scala.Unit = js.native
  def set_readOnly(value: scala.Boolean): scala.Unit = js.native
  def set_schemaXmlWithResourceTokens(value: java.lang.String): scala.Unit = js.native
  def set_sealed(value: scala.Boolean): scala.Unit = js.native
  def update(updateChildren: scala.Boolean): scala.Unit = js.native
}

