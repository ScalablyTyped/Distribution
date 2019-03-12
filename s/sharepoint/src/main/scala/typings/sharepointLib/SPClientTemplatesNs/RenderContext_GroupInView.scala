package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderContext_GroupInView extends RenderContext_InView {
  var CurrentGroup: Group
  var CurrentGroupIdx: scala.Double
  var CurrentItems: js.Array[Item]
}

object RenderContext_GroupInView {
  @scala.inline
  def apply(
    AllowCreateFolder: scala.Boolean,
    AllowGridMode: scala.Boolean,
    BasePermissions: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    CanShareLinkForNewDocument: scala.Boolean,
    CascadeDeleteWarningMessage: java.lang.String,
    ContentTypesEnabled: scala.Boolean,
    CurrentGroup: Group,
    CurrentGroupIdx: scala.Double,
    CurrentItems: js.Array[Item],
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
    RenderBody: RenderContext_GroupInView => java.lang.String = null,
    RenderFieldByName: (RenderContext_GroupInView, /* fieldName */ java.lang.String) => java.lang.String = null,
    RenderFields: RenderContext_GroupInView => java.lang.String = null,
    RenderFooter: RenderContext_GroupInView => java.lang.String = null,
    RenderGroups: RenderContext_GroupInView => java.lang.String = null,
    RenderHeader: RenderContext_GroupInView => java.lang.String = null,
    RenderItems: RenderContext_GroupInView => java.lang.String = null,
    RenderView: RenderContext_GroupInView => java.lang.String = null,
    SiteClientTag: java.lang.String = null,
    Templates: Templates = null,
    onRefreshFailed: js.Any = null
  ): RenderContext_GroupInView = {
    val __obj = js.Dynamic.literal(AllowCreateFolder = AllowCreateFolder, AllowGridMode = AllowGridMode, BasePermissions = BasePermissions, CanShareLinkForNewDocument = CanShareLinkForNewDocument, CascadeDeleteWarningMessage = CascadeDeleteWarningMessage, ContentTypesEnabled = ContentTypesEnabled, CurrentGroup = CurrentGroup, CurrentGroupIdx = CurrentGroupIdx, CurrentItems = CurrentItems, CurrentUserId = CurrentUserId, CurrentUserIsSiteAdmin = CurrentUserIsSiteAdmin, EnableMinorVersions = EnableMinorVersions, ExternalDataList = ExternalDataList, HasRelatedCascadeLists = HasRelatedCascadeLists, HttpPath = HttpPath, HttpRoot = HttpRoot, IsAppWeb = IsAppWeb, IsClientRendering = IsClientRendering, LastRowIndexSelected = LastRowIndexSelected, LastSelectableRowIdx = LastSelectableRowIdx, LastSelectedItemIID = LastSelectedItemIID, LastSelectedItemId = LastSelectedItemId, ListData = ListData, ListDataJSONItemsKey = ListDataJSONItemsKey, ListSchema = ListSchema, ListTitle = ListTitle, ModerationStatus = ModerationStatus, NavigateForFormsPages = NavigateForFormsPages, NewWOPIDocumentEnabled = NewWOPIDocumentEnabled, NewWOPIDocumentUrl = NewWOPIDocumentUrl, OfficialFileName = OfficialFileName, OfficialFileNames = OfficialFileNames, PortalUrl = PortalUrl, RecycleBinEnabled = RecycleBinEnabled, RegionalSettingsTimeZoneBias = RegionalSettingsTimeZoneBias, RowFocusTimerID = RowFocusTimerID, SelectAllCbx = SelectAllCbx, SendToLocationName = SendToLocationName, SendToLocationUrl = SendToLocationUrl, SiteTitle = SiteTitle, StateInitDone = StateInitDone, TableCbxFocusHandler = TableCbxFocusHandler, TableMouseOverHandler = TableMouseOverHandler, TotalListItems = TotalListItems, WorkflowAssociated = WorkflowAssociated, WriteSecurity = WriteSecurity, bInitialRender = bInitialRender, clvp = clvp, ctxId = ctxId, ctxType = ctxType, dictSel = dictSel, displayFormUrl = displayFormUrl, editFormUrl = editFormUrl, enteringGridMode = enteringGridMode, existingServerFilterHash = existingServerFilterHash, heroId = heroId, imagesPath = imagesPath, inGridFullRender = inGridFullRender, inGridMode = inGridMode, isForceCheckout = isForceCheckout, isModerated = isModerated, isPortalTemplate = isPortalTemplate, isVersions = isVersions, isWebEditorPreview = isWebEditorPreview, isXslView = isXslView, leavingGridMode = leavingGridMode, listBaseType = listBaseType, listName = listName, listTemplate = listTemplate, listUrlDir = listUrlDir, loadingAsyncData = loadingAsyncData, newFormUrl = newFormUrl, noGroupCollapse = noGroupCollapse, overrideDeleteConfirmation = overrideDeleteConfirmation, overrideFilterQstring = overrideFilterQstring, queryString = queryString, recursiveView = recursiveView, rootFolder = rootFolder, rootFolderForDisplay = rootFolderForDisplay, serverUrl = serverUrl, verEnabled = verEnabled, view = view, viewTitle = viewTitle, wpq = wpq)
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
    __obj.asInstanceOf[RenderContext_GroupInView]
  }
}

