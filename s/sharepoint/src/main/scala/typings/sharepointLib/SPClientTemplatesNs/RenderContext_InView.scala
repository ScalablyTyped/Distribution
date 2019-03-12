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

object RenderContext_InView {
  @scala.inline
  def apply(
    AllowCreateFolder: scala.Boolean,
    AllowGridMode: scala.Boolean,
    BasePermissions: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    CanShareLinkForNewDocument: scala.Boolean,
    CascadeDeleteWarningMessage: java.lang.String,
    ContentTypesEnabled: scala.Boolean,
    CurrentUserId: scala.Double,
    CurrentUserIsSiteAdmin: scala.Boolean,
    EnableMinorVersions: scala.Boolean,
    ExternalDataList: scala.Boolean,
    HasRelatedCascadeLists: scala.Double,
    HttpPath: java.lang.String,
    HttpRoot: java.lang.String,
    IsAppWeb: scala.Boolean,
    IsClientRendering: scala.Boolean,
    LastRowIndexSelected: js.Any,
    LastSelectableRowIdx: js.Any,
    LastSelectedItemIID: js.Any,
    LastSelectedItemId: js.Any,
    ListData: ListData_InView,
    ListDataJSONItemsKey: java.lang.String,
    ListSchema: ListSchema_InView,
    ListTitle: java.lang.String,
    ModerationStatus: scala.Double,
    NavigateForFormsPages: scala.Boolean,
    NewWOPIDocumentEnabled: js.Any,
    NewWOPIDocumentUrl: js.Any,
    OfficialFileName: java.lang.String,
    OfficialFileNames: java.lang.String,
    PortalUrl: java.lang.String,
    RecycleBinEnabled: scala.Double,
    RegionalSettingsTimeZoneBias: java.lang.String,
    RowFocusTimerID: js.Any,
    SelectAllCbx: js.Any,
    SendToLocationName: java.lang.String,
    SendToLocationUrl: java.lang.String,
    SiteTitle: java.lang.String,
    StateInitDone: scala.Boolean,
    TableCbxFocusHandler: js.Any,
    TableMouseOverHandler: js.Any,
    TotalListItems: scala.Double,
    WorkflowAssociated: scala.Boolean,
    WriteSecurity: java.lang.String,
    bInitialRender: scala.Boolean,
    clvp: stdLib.HTMLElement,
    ctxId: scala.Double,
    ctxType: js.Any,
    dictSel: js.Any,
    displayFormUrl: java.lang.String,
    editFormUrl: java.lang.String,
    enteringGridMode: scala.Boolean,
    existingServerFilterHash: js.Any,
    heroId: java.lang.String,
    imagesPath: java.lang.String,
    inGridFullRender: js.Any,
    inGridMode: scala.Boolean,
    isForceCheckout: scala.Boolean,
    isModerated: scala.Boolean,
    isPortalTemplate: js.Any,
    isVersions: scala.Double,
    isWebEditorPreview: scala.Double,
    isXslView: scala.Boolean,
    leavingGridMode: scala.Boolean,
    listBaseType: scala.Double,
    listName: java.lang.String,
    listTemplate: java.lang.String,
    listUrlDir: java.lang.String,
    loadingAsyncData: scala.Boolean,
    newFormUrl: java.lang.String,
    noGroupCollapse: scala.Boolean,
    overrideDeleteConfirmation: java.lang.String,
    overrideFilterQstring: java.lang.String,
    queryString: js.Any,
    recursiveView: scala.Boolean,
    rootFolder: java.lang.String,
    rootFolderForDisplay: js.Any,
    serverUrl: js.Any,
    verEnabled: scala.Double,
    view: java.lang.String,
    viewTitle: java.lang.String,
    wpq: java.lang.String,
    BaseViewID: scala.Int | scala.Double = null,
    ControlMode: ClientControlMode = null,
    CurrentCultureName: java.lang.String = null,
    CurrentLanguage: scala.Int | scala.Double = null,
    CurrentSelectedItems: js.Any = null,
    CurrentUICultureName: java.lang.String = null,
    ListTemplateType: scala.Int | scala.Double = null,
    OnPostRender: RenderCallback | js.Array[RenderCallback] = null,
    OnPreRender: RenderCallback | js.Array[RenderCallback] = null,
    RenderBody: RenderContext_InView => java.lang.String = null,
    RenderFieldByName: (RenderContext_InView, /* fieldName */ java.lang.String) => java.lang.String = null,
    RenderFields: RenderContext_InView => java.lang.String = null,
    RenderFooter: RenderContext_InView => java.lang.String = null,
    RenderGroups: RenderContext_InView => java.lang.String = null,
    RenderHeader: RenderContext_InView => java.lang.String = null,
    RenderItems: RenderContext_InView => java.lang.String = null,
    RenderView: RenderContext_InView => java.lang.String = null,
    SiteClientTag: java.lang.String = null,
    Templates: Templates = null,
    onRefreshFailed: js.Any = null
  ): RenderContext_InView = {
    val __obj = js.Dynamic.literal(AllowCreateFolder = AllowCreateFolder, AllowGridMode = AllowGridMode, BasePermissions = BasePermissions, CanShareLinkForNewDocument = CanShareLinkForNewDocument, CascadeDeleteWarningMessage = CascadeDeleteWarningMessage, ContentTypesEnabled = ContentTypesEnabled, CurrentUserId = CurrentUserId, CurrentUserIsSiteAdmin = CurrentUserIsSiteAdmin, EnableMinorVersions = EnableMinorVersions, ExternalDataList = ExternalDataList, HasRelatedCascadeLists = HasRelatedCascadeLists, HttpPath = HttpPath, HttpRoot = HttpRoot, IsAppWeb = IsAppWeb, IsClientRendering = IsClientRendering, LastRowIndexSelected = LastRowIndexSelected, LastSelectableRowIdx = LastSelectableRowIdx, LastSelectedItemIID = LastSelectedItemIID, LastSelectedItemId = LastSelectedItemId, ListData = ListData, ListDataJSONItemsKey = ListDataJSONItemsKey, ListSchema = ListSchema, ListTitle = ListTitle, ModerationStatus = ModerationStatus, NavigateForFormsPages = NavigateForFormsPages, NewWOPIDocumentEnabled = NewWOPIDocumentEnabled, NewWOPIDocumentUrl = NewWOPIDocumentUrl, OfficialFileName = OfficialFileName, OfficialFileNames = OfficialFileNames, PortalUrl = PortalUrl, RecycleBinEnabled = RecycleBinEnabled, RegionalSettingsTimeZoneBias = RegionalSettingsTimeZoneBias, RowFocusTimerID = RowFocusTimerID, SelectAllCbx = SelectAllCbx, SendToLocationName = SendToLocationName, SendToLocationUrl = SendToLocationUrl, SiteTitle = SiteTitle, StateInitDone = StateInitDone, TableCbxFocusHandler = TableCbxFocusHandler, TableMouseOverHandler = TableMouseOverHandler, TotalListItems = TotalListItems, WorkflowAssociated = WorkflowAssociated, WriteSecurity = WriteSecurity, bInitialRender = bInitialRender, clvp = clvp, ctxId = ctxId, ctxType = ctxType, dictSel = dictSel, displayFormUrl = displayFormUrl, editFormUrl = editFormUrl, enteringGridMode = enteringGridMode, existingServerFilterHash = existingServerFilterHash, heroId = heroId, imagesPath = imagesPath, inGridFullRender = inGridFullRender, inGridMode = inGridMode, isForceCheckout = isForceCheckout, isModerated = isModerated, isPortalTemplate = isPortalTemplate, isVersions = isVersions, isWebEditorPreview = isWebEditorPreview, isXslView = isXslView, leavingGridMode = leavingGridMode, listBaseType = listBaseType, listName = listName, listTemplate = listTemplate, listUrlDir = listUrlDir, loadingAsyncData = loadingAsyncData, newFormUrl = newFormUrl, noGroupCollapse = noGroupCollapse, overrideDeleteConfirmation = overrideDeleteConfirmation, overrideFilterQstring = overrideFilterQstring, queryString = queryString, recursiveView = recursiveView, rootFolder = rootFolder, rootFolderForDisplay = rootFolderForDisplay, serverUrl = serverUrl, verEnabled = verEnabled, view = view, viewTitle = viewTitle, wpq = wpq)
    if (BaseViewID != null) __obj.updateDynamic("BaseViewID")(BaseViewID.asInstanceOf[js.Any])
    if (ControlMode != null) __obj.updateDynamic("ControlMode")(ControlMode)
    if (CurrentCultureName != null) __obj.updateDynamic("CurrentCultureName")(CurrentCultureName)
    if (CurrentLanguage != null) __obj.updateDynamic("CurrentLanguage")(CurrentLanguage.asInstanceOf[js.Any])
    if (CurrentSelectedItems != null) __obj.updateDynamic("CurrentSelectedItems")(CurrentSelectedItems)
    if (CurrentUICultureName != null) __obj.updateDynamic("CurrentUICultureName")(CurrentUICultureName)
    if (ListTemplateType != null) __obj.updateDynamic("ListTemplateType")(ListTemplateType.asInstanceOf[js.Any])
    if (OnPostRender != null) __obj.updateDynamic("OnPostRender")(OnPostRender.asInstanceOf[js.Any])
    if (OnPreRender != null) __obj.updateDynamic("OnPreRender")(OnPreRender.asInstanceOf[js.Any])
    if (RenderBody != null) __obj.updateDynamic("RenderBody")(js.Any.fromFunction1(RenderBody))
    if (RenderFieldByName != null) __obj.updateDynamic("RenderFieldByName")(js.Any.fromFunction2(RenderFieldByName))
    if (RenderFields != null) __obj.updateDynamic("RenderFields")(js.Any.fromFunction1(RenderFields))
    if (RenderFooter != null) __obj.updateDynamic("RenderFooter")(js.Any.fromFunction1(RenderFooter))
    if (RenderGroups != null) __obj.updateDynamic("RenderGroups")(js.Any.fromFunction1(RenderGroups))
    if (RenderHeader != null) __obj.updateDynamic("RenderHeader")(js.Any.fromFunction1(RenderHeader))
    if (RenderItems != null) __obj.updateDynamic("RenderItems")(js.Any.fromFunction1(RenderItems))
    if (RenderView != null) __obj.updateDynamic("RenderView")(js.Any.fromFunction1(RenderView))
    if (SiteClientTag != null) __obj.updateDynamic("SiteClientTag")(SiteClientTag)
    if (Templates != null) __obj.updateDynamic("Templates")(Templates)
    if (onRefreshFailed != null) __obj.updateDynamic("onRefreshFailed")(onRefreshFailed)
    __obj.asInstanceOf[RenderContext_InView]
  }
}

