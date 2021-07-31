package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View
  extends StObject
     with ClientObject {
  
  def deleteObject(): Unit = js.native
  
  def get_aggregations(): String = js.native
  
  def get_aggregationsStatus(): String = js.native
  
  def get_baseViewId(): String = js.native
  
  def get_contentTypeId(): ContentTypeId = js.native
  
  def get_defaultView(): Boolean = js.native
  
  def get_defaultViewForContentType(): Boolean = js.native
  
  def get_editorModified(): Boolean = js.native
  
  def get_formats(): String = js.native
  
  def get_hidden(): Boolean = js.native
  
  def get_htmlSchemaXml(): String = js.native
  
  def get_id(): Guid = js.native
  
  def get_imageUrl(): String = js.native
  
  def get_includeRootFolder(): Boolean = js.native
  
  def get_jsLink(): String = js.native
  
  def get_listViewXml(): String = js.native
  
  def get_method(): String = js.native
  
  def get_mobileDefaultView(): Boolean = js.native
  
  def get_mobileView(): Boolean = js.native
  
  def get_moderationType(): String = js.native
  
  def get_orderedView(): Boolean = js.native
  
  def get_paged(): Boolean = js.native
  
  def get_personalView(): Boolean = js.native
  
  def get_readOnlyView(): Boolean = js.native
  
  def get_requiresClientIntegration(): Boolean = js.native
  
  def get_rowLimit(): Double = js.native
  
  def get_scope(): ViewScope = js.native
  
  def get_serverRelativeUrl(): String = js.native
  
  def get_styleId(): String = js.native
  
  def get_threaded(): Boolean = js.native
  
  def get_title(): String = js.native
  
  def get_toolbar(): String = js.native
  
  def get_toolbarTemplateName(): String = js.native
  
  def get_viewData(): String = js.native
  
  def get_viewFields(): ViewFieldCollection = js.native
  
  def get_viewJoins(): String = js.native
  
  def get_viewProjectedFields(): String = js.native
  
  def get_viewQuery(): String = js.native
  
  def get_viewType(): String = js.native
  
  def renderAsHtml(): StringResult = js.native
  
  def set_aggregations(value: String): Unit = js.native
  
  def set_aggregationsStatus(value: String): Unit = js.native
  
  def set_contentTypeId(value: ContentTypeId): Unit = js.native
  
  def set_defaultView(value: Boolean): Unit = js.native
  
  def set_defaultViewForContentType(value: Boolean): Unit = js.native
  
  def set_editorModified(value: Boolean): Unit = js.native
  
  def set_formats(value: String): Unit = js.native
  
  def set_hidden(value: Boolean): Unit = js.native
  
  def set_includeRootFolder(value: Boolean): Unit = js.native
  
  def set_jsLink(value: String): Unit = js.native
  
  def set_listViewXml(value: String): Unit = js.native
  
  def set_method(value: String): Unit = js.native
  
  def set_mobileDefaultView(value: Boolean): Unit = js.native
  
  def set_mobileView(value: Boolean): Unit = js.native
  
  def set_paged(value: Boolean): Unit = js.native
  
  def set_rowLimit(value: Double): Unit = js.native
  
  def set_scope(value: ViewScope): Unit = js.native
  
  def set_title(value: String): Unit = js.native
  
  def set_toolbar(value: String): Unit = js.native
  
  def set_viewData(value: String): Unit = js.native
  
  def set_viewJoins(value: String): Unit = js.native
  
  def set_viewProjectedFields(value: String): Unit = js.native
  
  def set_viewQuery(value: String): Unit = js.native
  
  def update(): Unit = js.native
}
