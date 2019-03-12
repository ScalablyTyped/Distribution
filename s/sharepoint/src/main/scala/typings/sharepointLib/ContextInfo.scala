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

object ContextInfo {
  @scala.inline
  def apply(
    AllowCreateFolder: scala.Boolean,
    AllowGridMode: scala.Boolean,
    BasePermissions: js.Any,
    BaseViewID: js.Any,
    CanShareLinkForNewDocument: scala.Boolean,
    CascadeDeleteWarningMessage: java.lang.String,
    ContentTypesEnabled: scala.Boolean,
    CurrentSelectedItems: scala.Boolean,
    CurrentUserId: scala.Double,
    CurrentUserIsSiteAdmin: scala.Boolean,
    EnableMinorVersions: scala.Boolean,
    ExcludeFromOfflineClient: scala.Boolean,
    ExternalDataList: scala.Boolean,
    HasRelatedCascadeLists: scala.Boolean,
    HttpPath: java.lang.String,
    HttpRoot: java.lang.String,
    IsAppWeb: scala.Boolean,
    IsClientRendering: scala.Boolean,
    LastRowIndexSelected: scala.Double,
    LastSelectableRowIdx: scala.Double,
    LastSelectedItemIID: scala.Double,
    ListData: js.Any,
    ListSchema: sharepointLib.SPClientTemplatesNs.ListSchema,
    ListTitle: java.lang.String,
    ModerationStatus: scala.Double,
    NewWOPIDocumentEnabled: scala.Boolean,
    NewWOPIDocumentUrl: java.lang.String,
    PortalUrl: java.lang.String,
    RecycleBinEnabled: scala.Double,
    RowFocusTimerID: scala.Double,
    SelectAllCbx: stdLib.HTMLElement,
    SendToLocationName: java.lang.String,
    SendToLocationUrl: java.lang.String,
    SiteTemplateId: scala.Double,
    SiteTitle: java.lang.String,
    StateInitDone: scala.Boolean,
    TableCbxFocusHandler: (js.Any, js.Any) => scala.Unit,
    TableMouseoverHandler: (js.Any, js.Any) => scala.Unit,
    TotalListItems: scala.Double,
    WorkflowsAssociated: scala.Boolean,
    clvp: js.Any,
    ctxId: scala.Double,
    ctxType: js.Any,
    dictSel: js.Any,
    displayFormUrl: java.lang.String,
    editFormUrl: java.lang.String,
    imagesPath: java.lang.String,
    inGridFullRender: scala.Boolean,
    inGridMode: scala.Boolean,
    isForceCheckout: scala.Boolean,
    isModerated: scala.Boolean,
    isPortalTemplate: scala.Boolean,
    isVersions: scala.Boolean,
    isWebEditorPreview: scala.Boolean,
    leavingGridMode: scala.Boolean,
    listBaseType: scala.Double,
    listName: java.lang.String,
    listTemplate: java.lang.String,
    listUrlDir: java.lang.String,
    loadingAsyncData: scala.Boolean,
    newFormUrl: java.lang.String,
    noGroupCollapse: scala.Boolean,
    onRefreshFailed: (js.Any, js.Any, js.Any) => scala.Unit,
    overrideDeleteConfirmation: java.lang.String,
    overrideFilterQstring: java.lang.String,
    queryString: java.lang.String,
    recursiveView: scala.Boolean,
    rootFolder: java.lang.String,
    rootFolderForDisplay: java.lang.String,
    serverUrl: java.lang.String,
    verEnabled: scala.Boolean,
    view: java.lang.String,
    wpq: java.lang.String,
    ControlMode: sharepointLib.SPClientTemplatesNs.ClientControlMode = null,
    CurrentCultureName: java.lang.String = null,
    CurrentLanguage: scala.Int | scala.Double = null,
    CurrentUICultureName: java.lang.String = null,
    ListTemplateType: scala.Int | scala.Double = null,
    OnPostRender: sharepointLib.SPClientTemplatesNs.RenderCallback | js.Array[sharepointLib.SPClientTemplatesNs.RenderCallback] = null,
    OnPreRender: sharepointLib.SPClientTemplatesNs.RenderCallback | js.Array[sharepointLib.SPClientTemplatesNs.RenderCallback] = null,
    RenderBody: ContextInfo => java.lang.String = null,
    RenderFieldByName: (ContextInfo, /* fieldName */ java.lang.String) => java.lang.String = null,
    RenderFields: ContextInfo => java.lang.String = null,
    RenderFooter: ContextInfo => java.lang.String = null,
    RenderGroups: ContextInfo => java.lang.String = null,
    RenderHeader: ContextInfo => java.lang.String = null,
    RenderItems: ContextInfo => java.lang.String = null,
    RenderView: ContextInfo => java.lang.String = null,
    SiteClientTag: java.lang.String = null,
    Templates: sharepointLib.SPClientTemplatesNs.Templates = null
  ): ContextInfo = {
    val __obj = js.Dynamic.literal(AllowCreateFolder = AllowCreateFolder, AllowGridMode = AllowGridMode, BasePermissions = BasePermissions, BaseViewID = BaseViewID, CanShareLinkForNewDocument = CanShareLinkForNewDocument, CascadeDeleteWarningMessage = CascadeDeleteWarningMessage, ContentTypesEnabled = ContentTypesEnabled, CurrentSelectedItems = CurrentSelectedItems, CurrentUserId = CurrentUserId, CurrentUserIsSiteAdmin = CurrentUserIsSiteAdmin, EnableMinorVersions = EnableMinorVersions, ExcludeFromOfflineClient = ExcludeFromOfflineClient, ExternalDataList = ExternalDataList, HasRelatedCascadeLists = HasRelatedCascadeLists, HttpPath = HttpPath, HttpRoot = HttpRoot, IsAppWeb = IsAppWeb, IsClientRendering = IsClientRendering, LastRowIndexSelected = LastRowIndexSelected, LastSelectableRowIdx = LastSelectableRowIdx, LastSelectedItemIID = LastSelectedItemIID, ListData = ListData, ListSchema = ListSchema, ListTitle = ListTitle, ModerationStatus = ModerationStatus, NewWOPIDocumentEnabled = NewWOPIDocumentEnabled, NewWOPIDocumentUrl = NewWOPIDocumentUrl, PortalUrl = PortalUrl, RecycleBinEnabled = RecycleBinEnabled, RowFocusTimerID = RowFocusTimerID, SelectAllCbx = SelectAllCbx, SendToLocationName = SendToLocationName, SendToLocationUrl = SendToLocationUrl, SiteTemplateId = SiteTemplateId, SiteTitle = SiteTitle, StateInitDone = StateInitDone, TableCbxFocusHandler = js.Any.fromFunction2(TableCbxFocusHandler), TableMouseoverHandler = js.Any.fromFunction2(TableMouseoverHandler), TotalListItems = TotalListItems, WorkflowsAssociated = WorkflowsAssociated, clvp = clvp, ctxId = ctxId, ctxType = ctxType, dictSel = dictSel, displayFormUrl = displayFormUrl, editFormUrl = editFormUrl, imagesPath = imagesPath, inGridFullRender = inGridFullRender, inGridMode = inGridMode, isForceCheckout = isForceCheckout, isModerated = isModerated, isPortalTemplate = isPortalTemplate, isVersions = isVersions, isWebEditorPreview = isWebEditorPreview, leavingGridMode = leavingGridMode, listBaseType = listBaseType, listName = listName, listTemplate = listTemplate, listUrlDir = listUrlDir, loadingAsyncData = loadingAsyncData, newFormUrl = newFormUrl, noGroupCollapse = noGroupCollapse, onRefreshFailed = js.Any.fromFunction3(onRefreshFailed), overrideDeleteConfirmation = overrideDeleteConfirmation, overrideFilterQstring = overrideFilterQstring, queryString = queryString, recursiveView = recursiveView, rootFolder = rootFolder, rootFolderForDisplay = rootFolderForDisplay, serverUrl = serverUrl, verEnabled = verEnabled, view = view, wpq = wpq)
    if (ControlMode != null) __obj.updateDynamic("ControlMode")(ControlMode)
    if (CurrentCultureName != null) __obj.updateDynamic("CurrentCultureName")(CurrentCultureName)
    if (CurrentLanguage != null) __obj.updateDynamic("CurrentLanguage")(CurrentLanguage.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[ContextInfo]
  }
}

