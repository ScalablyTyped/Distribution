package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextInfo
  extends sharepointLib.SPClientTemplatesNs.RenderContext {
  var AllowCreateFolder: scala.Boolean
  var AllowGridMode: scala.Boolean
  var BasePermissions: js.Any
  var CanShareLinkForNewDocument: scala.Boolean
  var CascadeDeleteWarningMessage: java.lang.String
  var ContentTypesEnabled: scala.Boolean
  @JSName("CurrentSelectedItems")
  var CurrentSelectedItems_ContextInfo: scala.Boolean
  var CurrentUserId: scala.Double
  var CurrentUserIsSiteAdmin: scala.Boolean
  var EnableMinorVersions: scala.Boolean
  var ExcludeFromOfflineClient: scala.Boolean
  var ExternalDataList: scala.Boolean
  var HasRelatedCascadeLists: scala.Boolean
  var HttpPath: java.lang.String
  var HttpRoot: java.lang.String
  var IsAppWeb: scala.Boolean
  var IsClientRendering: scala.Boolean
  var LastRowIndexSelected: scala.Double
  var LastSelectableRowIdx: scala.Double
  var LastSelectedItemIID: scala.Double
  var ListData: js.Any
   // SPClientTemplates.ListData_InView | SPClientTemplates.ListData_InForm
  var ListSchema: sharepointLib.SPClientTemplatesNs.ListSchema
  var ListTitle: java.lang.String
  var ModerationStatus: scala.Double
  var NewWOPIDocumentEnabled: scala.Boolean
  var NewWOPIDocumentUrl: java.lang.String
  var PortalUrl: java.lang.String
  var RecycleBinEnabled: scala.Double
  var RowFocusTimerID: scala.Double
  var SelectAllCbx: stdLib.HTMLElement
  var SendToLocationName: java.lang.String
  var SendToLocationUrl: java.lang.String
  var SiteTemplateId: scala.Double
  var SiteTitle: java.lang.String
  var StateInitDone: scala.Boolean
  var TotalListItems: scala.Double
  var WorkflowsAssociated: scala.Boolean
  var clvp: js.Any
  var ctxId: scala.Double
  var ctxType: js.Any
  var dictSel: js.Any
  var displayFormUrl: java.lang.String
  var editFormUrl: java.lang.String
  var imagesPath: java.lang.String
  var inGridFullRender: scala.Boolean
  var inGridMode: scala.Boolean
  var isForceCheckout: scala.Boolean
  var isModerated: scala.Boolean
  var isPortalTemplate: scala.Boolean
  var isVersions: scala.Boolean
  var isWebEditorPreview: scala.Boolean
  var leavingGridMode: scala.Boolean
  var listBaseType: scala.Double
  var listName: java.lang.String
  var listTemplate: java.lang.String
  var listUrlDir: java.lang.String
  var loadingAsyncData: scala.Boolean
  var newFormUrl: java.lang.String
  var noGroupCollapse: scala.Boolean
  var overrideDeleteConfirmation: java.lang.String
  var overrideFilterQstring: java.lang.String
  var queryString: java.lang.String
  var recursiveView: scala.Boolean
  var rootFolder: java.lang.String
  var rootFolderForDisplay: java.lang.String
  var serverUrl: java.lang.String
  var verEnabled: scala.Boolean
  var view: java.lang.String
  var wpq: java.lang.String
  def TableCbxFocusHandler(instance: js.Any, eventArgs: js.Any): scala.Unit
  def TableMouseoverHandler(instance: js.Any, eventArgs: js.Any): scala.Unit
  @JSName("onRefreshFailed")
  def onRefreshFailed_MContextInfo(context: js.Any, requrest: js.Any, response: js.Any): scala.Unit
}

