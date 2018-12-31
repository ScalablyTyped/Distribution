package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderContext_InView extends RenderContext {
  var AllowCreateFolder: scala.Boolean
  var AllowGridMode: scala.Boolean
  var BasePermissions: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  var CanShareLinkForNewDocument: scala.Boolean
  var CascadeDeleteWarningMessage: java.lang.String
   // not in View
  var ContentTypesEnabled: scala.Boolean
   // not in View
  var CurrentUserId: scala.Double
  var CurrentUserIsSiteAdmin: scala.Boolean
  var EnableMinorVersions: scala.Boolean
  var ExternalDataList: scala.Boolean
  var HasRelatedCascadeLists: scala.Double
   // e.g. "idHomePageNewItem"
  var HttpPath: java.lang.String
  var HttpRoot: java.lang.String
  var IsAppWeb: scala.Boolean
  var IsClientRendering: scala.Boolean
  var LastRowIndexSelected: js.Any
   // not in View
  var LastSelectableRowIdx: js.Any
  var LastSelectedItemIID: js.Any
  var LastSelectedItemId: js.Any
  var ListData: ListData_InView
  var ListDataJSONItemsKey: java.lang.String
  var ListSchema: ListSchema_InView
  var ListTitle: java.lang.String
  var ModerationStatus: scala.Double
  var NavigateForFormsPages: scala.Boolean
  var NewWOPIDocumentEnabled: js.Any
  var NewWOPIDocumentUrl: js.Any
  var OfficialFileName: java.lang.String
  var OfficialFileNames: java.lang.String
   // not in View
  var PortalUrl: java.lang.String
  /** either 1 or 0 */
  var RecycleBinEnabled: scala.Double
  var RegionalSettingsTimeZoneBias: java.lang.String
  var RowFocusTimerID: js.Any
  var SelectAllCbx: js.Any
  var SendToLocationName: java.lang.String
  var SendToLocationUrl: java.lang.String
  var SiteTitle: java.lang.String
  var StateInitDone: scala.Boolean
  var TableCbxFocusHandler: js.Any
  var TableMouseOverHandler: js.Any
  var TotalListItems: scala.Double
  var WorkflowAssociated: scala.Boolean
  var WriteSecurity: java.lang.String
   // SP.BasePermissions?
  var bInitialRender: scala.Boolean
  var clvp: stdLib.HTMLElement
  var ctxId: scala.Double
  var ctxType: js.Any
  var dictSel: js.Any
  /** Absolute path for the list display form */
  var displayFormUrl: java.lang.String
  /** Absolute path for the list edit form */
  var editFormUrl: java.lang.String
  var enteringGridMode: scala.Boolean
  var existingServerFilterHash: js.Any
  var heroId: java.lang.String
  var imagesPath: java.lang.String
  var inGridFullRender: js.Any
   // not in View
  var inGridMode: scala.Boolean
  var isForceCheckout: scala.Boolean
  var isModerated: scala.Boolean
  var isPortalTemplate: js.Any
  var isVersions: scala.Double
  var isWebEditorPreview: scala.Double
  var isXslView: scala.Boolean
   // not in View
  var leavingGridMode: scala.Boolean
  var listBaseType: scala.Double
   // ="Row"
  /** Guid of the list */
  var listName: java.lang.String
  var listTemplate: java.lang.String
  var listUrlDir: java.lang.String
  var loadingAsyncData: scala.Boolean
  /** Absolute path for the list new form */
  var newFormUrl: java.lang.String
  var noGroupCollapse: scala.Boolean
  var overrideDeleteConfirmation: java.lang.String
   // not in View
  var overrideFilterQstring: java.lang.String
  var queryString: js.Any
  var recursiveView: scala.Boolean
  var rootFolder: java.lang.String
  var rootFolderForDisplay: js.Any
  var serverUrl: js.Any
  var verEnabled: scala.Double
  /** Guid of the view. */
  var view: java.lang.String
  var viewTitle: java.lang.String
  var wpq: java.lang.String
}

