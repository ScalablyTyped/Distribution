package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderContext_FieldInView extends RenderContext_ItemInView {
  /** If in grid mode (context.inGridMode == true), cast to FieldSchema_InForm, otherwise cast to FieldSchema_InView */
  var CurrentFieldSchema: FieldSchema_InForm | FieldSchema_InView
  var CurrentFieldValue: js.Any
  var FieldControlsModes: StringDictionary[ClientControlMode]
  var FormContext: ClientFormContext
  var FormUniqueId: String
}

object RenderContext_FieldInView {
  @scala.inline
  def apply(
    AllowCreateFolder: Boolean,
    AllowGridMode: Boolean,
    BasePermissions: StringDictionary[Boolean],
    CanShareLinkForNewDocument: Boolean,
    CascadeDeleteWarningMessage: String,
    ContentTypesEnabled: Boolean,
    CurrentFieldSchema: FieldSchema_InForm | FieldSchema_InView,
    CurrentFieldValue: js.Any,
    CurrentItem: Item,
    CurrentItemIdx: Double,
    CurrentUserId: Double,
    CurrentUserIsSiteAdmin: Boolean,
    EnableMinorVersions: Boolean,
    ExternalDataList: Boolean,
    FieldControlsModes: StringDictionary[ClientControlMode],
    FormContext: ClientFormContext,
    FormUniqueId: String,
    HasRelatedCascadeLists: Double,
    HttpPath: String,
    HttpRoot: String,
    IsAppWeb: Boolean,
    IsClientRendering: Boolean,
    LastRowIndexSelected: js.Any,
    LastSelectableRowIdx: js.Any,
    LastSelectedItemIID: js.Any,
    LastSelectedItemId: js.Any,
    ListData: ListData_InView,
    ListDataJSONItemsKey: String,
    ListSchema: ListSchema_InView,
    ListTitle: String,
    ModerationStatus: Double,
    NavigateForFormsPages: Boolean,
    NewWOPIDocumentEnabled: js.Any,
    NewWOPIDocumentUrl: js.Any,
    OfficialFileName: String,
    OfficialFileNames: String,
    PortalUrl: String,
    RecycleBinEnabled: Double,
    RegionalSettingsTimeZoneBias: String,
    RowFocusTimerID: js.Any,
    SelectAllCbx: js.Any,
    SendToLocationName: String,
    SendToLocationUrl: String,
    SiteTitle: String,
    StateInitDone: Boolean,
    TableCbxFocusHandler: js.Any,
    TableMouseOverHandler: js.Any,
    TotalListItems: Double,
    WorkflowAssociated: Boolean,
    WriteSecurity: String,
    bInitialRender: Boolean,
    clvp: HTMLElement,
    ctxId: Double,
    ctxType: js.Any,
    dictSel: js.Any,
    displayFormUrl: String,
    editFormUrl: String,
    enteringGridMode: Boolean,
    existingServerFilterHash: js.Any,
    heroId: String,
    imagesPath: String,
    inGridFullRender: js.Any,
    inGridMode: Boolean,
    isForceCheckout: Boolean,
    isModerated: Boolean,
    isPortalTemplate: js.Any,
    isVersions: Double,
    isWebEditorPreview: Double,
    isXslView: Boolean,
    leavingGridMode: Boolean,
    listBaseType: Double,
    listName: String,
    listTemplate: String,
    listUrlDir: String,
    loadingAsyncData: Boolean,
    newFormUrl: String,
    noGroupCollapse: Boolean,
    overrideDeleteConfirmation: String,
    overrideFilterQstring: String,
    queryString: js.Any,
    recursiveView: Boolean,
    rootFolder: String,
    rootFolderForDisplay: js.Any,
    serverUrl: js.Any,
    verEnabled: Double,
    view: String,
    viewTitle: String,
    wpq: String,
    BaseViewID: Int | Double = null,
    ControlMode: ClientControlMode = null,
    CurrentCultureName: String = null,
    CurrentLanguage: Int | Double = null,
    CurrentSelectedItems: js.Any = null,
    CurrentUICultureName: String = null,
    ListTemplateType: Int | Double = null,
    OnPostRender: RenderCallback | js.Array[RenderCallback] = null,
    OnPreRender: RenderCallback | js.Array[RenderCallback] = null,
    RenderBody: RenderContext_FieldInView => String = null,
    RenderFieldByName: (RenderContext_FieldInView, /* fieldName */ String) => String = null,
    RenderFields: RenderContext_FieldInView => String = null,
    RenderFooter: RenderContext_FieldInView => String = null,
    RenderGroups: RenderContext_FieldInView => String = null,
    RenderHeader: RenderContext_FieldInView => String = null,
    RenderItems: RenderContext_FieldInView => String = null,
    RenderView: RenderContext_FieldInView => String = null,
    SiteClientTag: String = null,
    Templates: Templates = null,
    onRefreshFailed: js.Any = null
  ): RenderContext_FieldInView = {
    val __obj = js.Dynamic.literal(AllowCreateFolder = AllowCreateFolder, AllowGridMode = AllowGridMode, BasePermissions = BasePermissions, CanShareLinkForNewDocument = CanShareLinkForNewDocument, CascadeDeleteWarningMessage = CascadeDeleteWarningMessage, ContentTypesEnabled = ContentTypesEnabled, CurrentFieldSchema = CurrentFieldSchema.asInstanceOf[js.Any], CurrentFieldValue = CurrentFieldValue, CurrentItem = CurrentItem, CurrentItemIdx = CurrentItemIdx, CurrentUserId = CurrentUserId, CurrentUserIsSiteAdmin = CurrentUserIsSiteAdmin, EnableMinorVersions = EnableMinorVersions, ExternalDataList = ExternalDataList, FieldControlsModes = FieldControlsModes, FormContext = FormContext, FormUniqueId = FormUniqueId, HasRelatedCascadeLists = HasRelatedCascadeLists, HttpPath = HttpPath, HttpRoot = HttpRoot, IsAppWeb = IsAppWeb, IsClientRendering = IsClientRendering, LastRowIndexSelected = LastRowIndexSelected, LastSelectableRowIdx = LastSelectableRowIdx, LastSelectedItemIID = LastSelectedItemIID, LastSelectedItemId = LastSelectedItemId, ListData = ListData, ListDataJSONItemsKey = ListDataJSONItemsKey, ListSchema = ListSchema, ListTitle = ListTitle, ModerationStatus = ModerationStatus, NavigateForFormsPages = NavigateForFormsPages, NewWOPIDocumentEnabled = NewWOPIDocumentEnabled, NewWOPIDocumentUrl = NewWOPIDocumentUrl, OfficialFileName = OfficialFileName, OfficialFileNames = OfficialFileNames, PortalUrl = PortalUrl, RecycleBinEnabled = RecycleBinEnabled, RegionalSettingsTimeZoneBias = RegionalSettingsTimeZoneBias, RowFocusTimerID = RowFocusTimerID, SelectAllCbx = SelectAllCbx, SendToLocationName = SendToLocationName, SendToLocationUrl = SendToLocationUrl, SiteTitle = SiteTitle, StateInitDone = StateInitDone, TableCbxFocusHandler = TableCbxFocusHandler, TableMouseOverHandler = TableMouseOverHandler, TotalListItems = TotalListItems, WorkflowAssociated = WorkflowAssociated, WriteSecurity = WriteSecurity, bInitialRender = bInitialRender, clvp = clvp, ctxId = ctxId, ctxType = ctxType, dictSel = dictSel, displayFormUrl = displayFormUrl, editFormUrl = editFormUrl, enteringGridMode = enteringGridMode, existingServerFilterHash = existingServerFilterHash, heroId = heroId, imagesPath = imagesPath, inGridFullRender = inGridFullRender, inGridMode = inGridMode, isForceCheckout = isForceCheckout, isModerated = isModerated, isPortalTemplate = isPortalTemplate, isVersions = isVersions, isWebEditorPreview = isWebEditorPreview, isXslView = isXslView, leavingGridMode = leavingGridMode, listBaseType = listBaseType, listName = listName, listTemplate = listTemplate, listUrlDir = listUrlDir, loadingAsyncData = loadingAsyncData, newFormUrl = newFormUrl, noGroupCollapse = noGroupCollapse, overrideDeleteConfirmation = overrideDeleteConfirmation, overrideFilterQstring = overrideFilterQstring, queryString = queryString, recursiveView = recursiveView, rootFolder = rootFolder, rootFolderForDisplay = rootFolderForDisplay, serverUrl = serverUrl, verEnabled = verEnabled, view = view, viewTitle = viewTitle, wpq = wpq)
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
    __obj.asInstanceOf[RenderContext_FieldInView]
  }
}

