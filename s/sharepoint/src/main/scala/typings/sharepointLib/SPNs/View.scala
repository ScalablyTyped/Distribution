package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.View")
@js.native
class View () extends ClientObject {
  def deleteObject(): scala.Unit = js.native
  def get_aggregations(): java.lang.String = js.native
  def get_aggregationsStatus(): java.lang.String = js.native
  def get_baseViewId(): java.lang.String = js.native
  def get_contentTypeId(): ContentTypeId = js.native
  def get_defaultView(): scala.Boolean = js.native
  def get_defaultViewForContentType(): scala.Boolean = js.native
  def get_editorModified(): scala.Boolean = js.native
  def get_formats(): java.lang.String = js.native
  def get_hidden(): scala.Boolean = js.native
  def get_htmlSchemaXml(): java.lang.String = js.native
  def get_id(): Guid = js.native
  def get_imageUrl(): java.lang.String = js.native
  def get_includeRootFolder(): scala.Boolean = js.native
  def get_jsLink(): java.lang.String = js.native
  def get_listViewXml(): java.lang.String = js.native
  def get_method(): java.lang.String = js.native
  def get_mobileDefaultView(): scala.Boolean = js.native
  def get_mobileView(): scala.Boolean = js.native
  def get_moderationType(): java.lang.String = js.native
  def get_orderedView(): scala.Boolean = js.native
  def get_paged(): scala.Boolean = js.native
  def get_personalView(): scala.Boolean = js.native
  def get_readOnlyView(): scala.Boolean = js.native
  def get_requiresClientIntegration(): scala.Boolean = js.native
  def get_rowLimit(): scala.Double = js.native
  def get_scope(): ViewScope = js.native
  def get_serverRelativeUrl(): java.lang.String = js.native
  def get_styleId(): java.lang.String = js.native
  def get_threaded(): scala.Boolean = js.native
  def get_title(): java.lang.String = js.native
  def get_toolbar(): java.lang.String = js.native
  def get_toolbarTemplateName(): java.lang.String = js.native
  def get_viewData(): java.lang.String = js.native
  def get_viewFields(): ViewFieldCollection = js.native
  def get_viewJoins(): java.lang.String = js.native
  def get_viewProjectedFields(): java.lang.String = js.native
  def get_viewQuery(): java.lang.String = js.native
  def get_viewType(): java.lang.String = js.native
  def renderAsHtml(): StringResult = js.native
  def set_aggregations(value: java.lang.String): scala.Unit = js.native
  def set_aggregationsStatus(value: java.lang.String): scala.Unit = js.native
  def set_contentTypeId(value: ContentTypeId): scala.Unit = js.native
  def set_defaultView(value: scala.Boolean): scala.Unit = js.native
  def set_defaultViewForContentType(value: scala.Boolean): scala.Unit = js.native
  def set_editorModified(value: scala.Boolean): scala.Unit = js.native
  def set_formats(value: java.lang.String): scala.Unit = js.native
  def set_hidden(value: scala.Boolean): scala.Unit = js.native
  def set_includeRootFolder(value: scala.Boolean): scala.Unit = js.native
  def set_jsLink(value: java.lang.String): scala.Unit = js.native
  def set_listViewXml(value: java.lang.String): scala.Unit = js.native
  def set_method(value: java.lang.String): scala.Unit = js.native
  def set_mobileDefaultView(value: scala.Boolean): scala.Unit = js.native
  def set_mobileView(value: scala.Boolean): scala.Unit = js.native
  def set_paged(value: scala.Boolean): scala.Unit = js.native
  def set_rowLimit(value: scala.Double): scala.Unit = js.native
  def set_scope(value: ViewScope): scala.Unit = js.native
  def set_title(value: java.lang.String): scala.Unit = js.native
  def set_toolbar(value: java.lang.String): scala.Unit = js.native
  def set_viewData(value: java.lang.String): scala.Unit = js.native
  def set_viewJoins(value: java.lang.String): scala.Unit = js.native
  def set_viewProjectedFields(value: java.lang.String): scala.Unit = js.native
  def set_viewQuery(value: java.lang.String): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

