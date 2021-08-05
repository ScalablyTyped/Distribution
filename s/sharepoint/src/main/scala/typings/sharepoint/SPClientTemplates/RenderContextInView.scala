package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderContextInView
  extends StObject
     with RenderContext {
  
  var AllowCreateFolder: Boolean
  
  var AllowGridMode: Boolean
  
  var BasePermissions: StringDictionary[Boolean]
  
  var CanShareLinkForNewDocument: Boolean
  
  var CascadeDeleteWarningMessage: String
  
  // not in View
  var ContentTypesEnabled: Boolean
  
  // not in View
  var CurrentUserId: Double
  
  var CurrentUserIsSiteAdmin: Boolean
  
  var EnableMinorVersions: Boolean
  
  var ExternalDataList: Boolean
  
  var HasRelatedCascadeLists: Double
  
  // e.g. "idHomePageNewItem"
  var HttpPath: String
  
  var HttpRoot: String
  
  var IsAppWeb: Boolean
  
  var IsClientRendering: Boolean
  
  var LastRowIndexSelected: js.Any
  
  // not in View
  var LastSelectableRowIdx: js.Any
  
  var LastSelectedItemIID: js.Any
  
  var LastSelectedItemId: js.Any
  
  var ListData: ListDataInView
  
  var ListDataJSONItemsKey: String
  
  var ListSchema: ListSchemaInView
  
  var ListTitle: String
  
  var ModerationStatus: Double
  
  var NavigateForFormsPages: Boolean
  
  var NewWOPIDocumentEnabled: js.Any
  
  var NewWOPIDocumentUrl: js.Any
  
  var OfficialFileName: String
  
  var OfficialFileNames: String
  
  // not in View
  var PortalUrl: String
  
  /** either 1 or 0 */
  var RecycleBinEnabled: Double
  
  var RegionalSettingsTimeZoneBias: String
  
  var RowFocusTimerID: js.Any
  
  var SelectAllCbx: js.Any
  
  var SendToLocationName: String
  
  var SendToLocationUrl: String
  
  var SiteTitle: String
  
  var StateInitDone: Boolean
  
  var TableCbxFocusHandler: js.Any
  
  var TableMouseOverHandler: js.Any
  
  var TotalListItems: Double
  
  var WorkflowAssociated: Boolean
  
  var WriteSecurity: String
  
  // SP.BasePermissions?
  var bInitialRender: Boolean
  
  var clvp: HTMLElement
  
  var ctxId: Double
  
  var ctxType: js.Any
  
  var dictSel: js.Any
  
  /** Absolute path for the list display form */
  var displayFormUrl: String
  
  /** Absolute path for the list edit form */
  var editFormUrl: String
  
  var enteringGridMode: Boolean
  
  var existingServerFilterHash: js.Any
  
  var heroId: String
  
  var imagesPath: String
  
  var inGridFullRender: js.Any
  
  // not in View
  var inGridMode: Boolean
  
  var isForceCheckout: Boolean
  
  var isModerated: Boolean
  
  var isPortalTemplate: js.Any
  
  var isVersions: Double
  
  var isWebEditorPreview: Double
  
  var isXslView: Boolean
  
  // not in View
  var leavingGridMode: Boolean
  
  var listBaseType: Double
  
  // ="Row"
  /** Guid of the list */
  var listName: String
  
  var listTemplate: String
  
  var listUrlDir: String
  
  var loadingAsyncData: Boolean
  
  /** Absolute path for the list new form */
  var newFormUrl: String
  
  var noGroupCollapse: Boolean
  
  var overrideDeleteConfirmation: String
  
  // not in View
  var overrideFilterQstring: String
  
  var queryString: js.Any
  
  var recursiveView: Boolean
  
  var rootFolder: String
  
  var rootFolderForDisplay: js.Any
  
  var serverUrl: js.Any
  
  var verEnabled: Double
  
  /** Guid of the view. */
  var view: String
  
  var viewTitle: String
  
  var wpq: String
}
object RenderContextInView {
  
  inline def apply(
    AllowCreateFolder: Boolean,
    AllowGridMode: Boolean,
    BasePermissions: StringDictionary[Boolean],
    CanShareLinkForNewDocument: Boolean,
    CascadeDeleteWarningMessage: String,
    ContentTypesEnabled: Boolean,
    CurrentUserId: Double,
    CurrentUserIsSiteAdmin: Boolean,
    EnableMinorVersions: Boolean,
    ExternalDataList: Boolean,
    HasRelatedCascadeLists: Double,
    HttpPath: String,
    HttpRoot: String,
    IsAppWeb: Boolean,
    IsClientRendering: Boolean,
    LastRowIndexSelected: js.Any,
    LastSelectableRowIdx: js.Any,
    LastSelectedItemIID: js.Any,
    LastSelectedItemId: js.Any,
    ListData: ListDataInView,
    ListDataJSONItemsKey: String,
    ListSchema: ListSchemaInView,
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
    wpq: String
  ): RenderContextInView = {
    val __obj = js.Dynamic.literal(AllowCreateFolder = AllowCreateFolder.asInstanceOf[js.Any], AllowGridMode = AllowGridMode.asInstanceOf[js.Any], BasePermissions = BasePermissions.asInstanceOf[js.Any], CanShareLinkForNewDocument = CanShareLinkForNewDocument.asInstanceOf[js.Any], CascadeDeleteWarningMessage = CascadeDeleteWarningMessage.asInstanceOf[js.Any], ContentTypesEnabled = ContentTypesEnabled.asInstanceOf[js.Any], CurrentUserId = CurrentUserId.asInstanceOf[js.Any], CurrentUserIsSiteAdmin = CurrentUserIsSiteAdmin.asInstanceOf[js.Any], EnableMinorVersions = EnableMinorVersions.asInstanceOf[js.Any], ExternalDataList = ExternalDataList.asInstanceOf[js.Any], HasRelatedCascadeLists = HasRelatedCascadeLists.asInstanceOf[js.Any], HttpPath = HttpPath.asInstanceOf[js.Any], HttpRoot = HttpRoot.asInstanceOf[js.Any], IsAppWeb = IsAppWeb.asInstanceOf[js.Any], IsClientRendering = IsClientRendering.asInstanceOf[js.Any], LastRowIndexSelected = LastRowIndexSelected.asInstanceOf[js.Any], LastSelectableRowIdx = LastSelectableRowIdx.asInstanceOf[js.Any], LastSelectedItemIID = LastSelectedItemIID.asInstanceOf[js.Any], LastSelectedItemId = LastSelectedItemId.asInstanceOf[js.Any], ListData = ListData.asInstanceOf[js.Any], ListDataJSONItemsKey = ListDataJSONItemsKey.asInstanceOf[js.Any], ListSchema = ListSchema.asInstanceOf[js.Any], ListTitle = ListTitle.asInstanceOf[js.Any], ModerationStatus = ModerationStatus.asInstanceOf[js.Any], NavigateForFormsPages = NavigateForFormsPages.asInstanceOf[js.Any], NewWOPIDocumentEnabled = NewWOPIDocumentEnabled.asInstanceOf[js.Any], NewWOPIDocumentUrl = NewWOPIDocumentUrl.asInstanceOf[js.Any], OfficialFileName = OfficialFileName.asInstanceOf[js.Any], OfficialFileNames = OfficialFileNames.asInstanceOf[js.Any], PortalUrl = PortalUrl.asInstanceOf[js.Any], RecycleBinEnabled = RecycleBinEnabled.asInstanceOf[js.Any], RegionalSettingsTimeZoneBias = RegionalSettingsTimeZoneBias.asInstanceOf[js.Any], RowFocusTimerID = RowFocusTimerID.asInstanceOf[js.Any], SelectAllCbx = SelectAllCbx.asInstanceOf[js.Any], SendToLocationName = SendToLocationName.asInstanceOf[js.Any], SendToLocationUrl = SendToLocationUrl.asInstanceOf[js.Any], SiteTitle = SiteTitle.asInstanceOf[js.Any], StateInitDone = StateInitDone.asInstanceOf[js.Any], TableCbxFocusHandler = TableCbxFocusHandler.asInstanceOf[js.Any], TableMouseOverHandler = TableMouseOverHandler.asInstanceOf[js.Any], TotalListItems = TotalListItems.asInstanceOf[js.Any], WorkflowAssociated = WorkflowAssociated.asInstanceOf[js.Any], WriteSecurity = WriteSecurity.asInstanceOf[js.Any], bInitialRender = bInitialRender.asInstanceOf[js.Any], clvp = clvp.asInstanceOf[js.Any], ctxId = ctxId.asInstanceOf[js.Any], ctxType = ctxType.asInstanceOf[js.Any], dictSel = dictSel.asInstanceOf[js.Any], displayFormUrl = displayFormUrl.asInstanceOf[js.Any], editFormUrl = editFormUrl.asInstanceOf[js.Any], enteringGridMode = enteringGridMode.asInstanceOf[js.Any], existingServerFilterHash = existingServerFilterHash.asInstanceOf[js.Any], heroId = heroId.asInstanceOf[js.Any], imagesPath = imagesPath.asInstanceOf[js.Any], inGridFullRender = inGridFullRender.asInstanceOf[js.Any], inGridMode = inGridMode.asInstanceOf[js.Any], isForceCheckout = isForceCheckout.asInstanceOf[js.Any], isModerated = isModerated.asInstanceOf[js.Any], isPortalTemplate = isPortalTemplate.asInstanceOf[js.Any], isVersions = isVersions.asInstanceOf[js.Any], isWebEditorPreview = isWebEditorPreview.asInstanceOf[js.Any], isXslView = isXslView.asInstanceOf[js.Any], leavingGridMode = leavingGridMode.asInstanceOf[js.Any], listBaseType = listBaseType.asInstanceOf[js.Any], listName = listName.asInstanceOf[js.Any], listTemplate = listTemplate.asInstanceOf[js.Any], listUrlDir = listUrlDir.asInstanceOf[js.Any], loadingAsyncData = loadingAsyncData.asInstanceOf[js.Any], newFormUrl = newFormUrl.asInstanceOf[js.Any], noGroupCollapse = noGroupCollapse.asInstanceOf[js.Any], overrideDeleteConfirmation = overrideDeleteConfirmation.asInstanceOf[js.Any], overrideFilterQstring = overrideFilterQstring.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], recursiveView = recursiveView.asInstanceOf[js.Any], rootFolder = rootFolder.asInstanceOf[js.Any], rootFolderForDisplay = rootFolderForDisplay.asInstanceOf[js.Any], serverUrl = serverUrl.asInstanceOf[js.Any], verEnabled = verEnabled.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], viewTitle = viewTitle.asInstanceOf[js.Any], wpq = wpq.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContextInView]
  }
  
  extension [Self <: RenderContextInView](x: Self) {
    
    inline def setAllowCreateFolder(value: Boolean): Self = StObject.set(x, "AllowCreateFolder", value.asInstanceOf[js.Any])
    
    inline def setAllowGridMode(value: Boolean): Self = StObject.set(x, "AllowGridMode", value.asInstanceOf[js.Any])
    
    inline def setBInitialRender(value: Boolean): Self = StObject.set(x, "bInitialRender", value.asInstanceOf[js.Any])
    
    inline def setBasePermissions(value: StringDictionary[Boolean]): Self = StObject.set(x, "BasePermissions", value.asInstanceOf[js.Any])
    
    inline def setCanShareLinkForNewDocument(value: Boolean): Self = StObject.set(x, "CanShareLinkForNewDocument", value.asInstanceOf[js.Any])
    
    inline def setCascadeDeleteWarningMessage(value: String): Self = StObject.set(x, "CascadeDeleteWarningMessage", value.asInstanceOf[js.Any])
    
    inline def setClvp(value: HTMLElement): Self = StObject.set(x, "clvp", value.asInstanceOf[js.Any])
    
    inline def setContentTypesEnabled(value: Boolean): Self = StObject.set(x, "ContentTypesEnabled", value.asInstanceOf[js.Any])
    
    inline def setCtxId(value: Double): Self = StObject.set(x, "ctxId", value.asInstanceOf[js.Any])
    
    inline def setCtxType(value: js.Any): Self = StObject.set(x, "ctxType", value.asInstanceOf[js.Any])
    
    inline def setCurrentUserId(value: Double): Self = StObject.set(x, "CurrentUserId", value.asInstanceOf[js.Any])
    
    inline def setCurrentUserIsSiteAdmin(value: Boolean): Self = StObject.set(x, "CurrentUserIsSiteAdmin", value.asInstanceOf[js.Any])
    
    inline def setDictSel(value: js.Any): Self = StObject.set(x, "dictSel", value.asInstanceOf[js.Any])
    
    inline def setDisplayFormUrl(value: String): Self = StObject.set(x, "displayFormUrl", value.asInstanceOf[js.Any])
    
    inline def setEditFormUrl(value: String): Self = StObject.set(x, "editFormUrl", value.asInstanceOf[js.Any])
    
    inline def setEnableMinorVersions(value: Boolean): Self = StObject.set(x, "EnableMinorVersions", value.asInstanceOf[js.Any])
    
    inline def setEnteringGridMode(value: Boolean): Self = StObject.set(x, "enteringGridMode", value.asInstanceOf[js.Any])
    
    inline def setExistingServerFilterHash(value: js.Any): Self = StObject.set(x, "existingServerFilterHash", value.asInstanceOf[js.Any])
    
    inline def setExternalDataList(value: Boolean): Self = StObject.set(x, "ExternalDataList", value.asInstanceOf[js.Any])
    
    inline def setHasRelatedCascadeLists(value: Double): Self = StObject.set(x, "HasRelatedCascadeLists", value.asInstanceOf[js.Any])
    
    inline def setHeroId(value: String): Self = StObject.set(x, "heroId", value.asInstanceOf[js.Any])
    
    inline def setHttpPath(value: String): Self = StObject.set(x, "HttpPath", value.asInstanceOf[js.Any])
    
    inline def setHttpRoot(value: String): Self = StObject.set(x, "HttpRoot", value.asInstanceOf[js.Any])
    
    inline def setImagesPath(value: String): Self = StObject.set(x, "imagesPath", value.asInstanceOf[js.Any])
    
    inline def setInGridFullRender(value: js.Any): Self = StObject.set(x, "inGridFullRender", value.asInstanceOf[js.Any])
    
    inline def setInGridMode(value: Boolean): Self = StObject.set(x, "inGridMode", value.asInstanceOf[js.Any])
    
    inline def setIsAppWeb(value: Boolean): Self = StObject.set(x, "IsAppWeb", value.asInstanceOf[js.Any])
    
    inline def setIsClientRendering(value: Boolean): Self = StObject.set(x, "IsClientRendering", value.asInstanceOf[js.Any])
    
    inline def setIsForceCheckout(value: Boolean): Self = StObject.set(x, "isForceCheckout", value.asInstanceOf[js.Any])
    
    inline def setIsModerated(value: Boolean): Self = StObject.set(x, "isModerated", value.asInstanceOf[js.Any])
    
    inline def setIsPortalTemplate(value: js.Any): Self = StObject.set(x, "isPortalTemplate", value.asInstanceOf[js.Any])
    
    inline def setIsVersions(value: Double): Self = StObject.set(x, "isVersions", value.asInstanceOf[js.Any])
    
    inline def setIsWebEditorPreview(value: Double): Self = StObject.set(x, "isWebEditorPreview", value.asInstanceOf[js.Any])
    
    inline def setIsXslView(value: Boolean): Self = StObject.set(x, "isXslView", value.asInstanceOf[js.Any])
    
    inline def setLastRowIndexSelected(value: js.Any): Self = StObject.set(x, "LastRowIndexSelected", value.asInstanceOf[js.Any])
    
    inline def setLastSelectableRowIdx(value: js.Any): Self = StObject.set(x, "LastSelectableRowIdx", value.asInstanceOf[js.Any])
    
    inline def setLastSelectedItemIID(value: js.Any): Self = StObject.set(x, "LastSelectedItemIID", value.asInstanceOf[js.Any])
    
    inline def setLastSelectedItemId(value: js.Any): Self = StObject.set(x, "LastSelectedItemId", value.asInstanceOf[js.Any])
    
    inline def setLeavingGridMode(value: Boolean): Self = StObject.set(x, "leavingGridMode", value.asInstanceOf[js.Any])
    
    inline def setListBaseType(value: Double): Self = StObject.set(x, "listBaseType", value.asInstanceOf[js.Any])
    
    inline def setListData(value: ListDataInView): Self = StObject.set(x, "ListData", value.asInstanceOf[js.Any])
    
    inline def setListDataJSONItemsKey(value: String): Self = StObject.set(x, "ListDataJSONItemsKey", value.asInstanceOf[js.Any])
    
    inline def setListName(value: String): Self = StObject.set(x, "listName", value.asInstanceOf[js.Any])
    
    inline def setListSchema(value: ListSchemaInView): Self = StObject.set(x, "ListSchema", value.asInstanceOf[js.Any])
    
    inline def setListTemplate(value: String): Self = StObject.set(x, "listTemplate", value.asInstanceOf[js.Any])
    
    inline def setListTitle(value: String): Self = StObject.set(x, "ListTitle", value.asInstanceOf[js.Any])
    
    inline def setListUrlDir(value: String): Self = StObject.set(x, "listUrlDir", value.asInstanceOf[js.Any])
    
    inline def setLoadingAsyncData(value: Boolean): Self = StObject.set(x, "loadingAsyncData", value.asInstanceOf[js.Any])
    
    inline def setModerationStatus(value: Double): Self = StObject.set(x, "ModerationStatus", value.asInstanceOf[js.Any])
    
    inline def setNavigateForFormsPages(value: Boolean): Self = StObject.set(x, "NavigateForFormsPages", value.asInstanceOf[js.Any])
    
    inline def setNewFormUrl(value: String): Self = StObject.set(x, "newFormUrl", value.asInstanceOf[js.Any])
    
    inline def setNewWOPIDocumentEnabled(value: js.Any): Self = StObject.set(x, "NewWOPIDocumentEnabled", value.asInstanceOf[js.Any])
    
    inline def setNewWOPIDocumentUrl(value: js.Any): Self = StObject.set(x, "NewWOPIDocumentUrl", value.asInstanceOf[js.Any])
    
    inline def setNoGroupCollapse(value: Boolean): Self = StObject.set(x, "noGroupCollapse", value.asInstanceOf[js.Any])
    
    inline def setOfficialFileName(value: String): Self = StObject.set(x, "OfficialFileName", value.asInstanceOf[js.Any])
    
    inline def setOfficialFileNames(value: String): Self = StObject.set(x, "OfficialFileNames", value.asInstanceOf[js.Any])
    
    inline def setOverrideDeleteConfirmation(value: String): Self = StObject.set(x, "overrideDeleteConfirmation", value.asInstanceOf[js.Any])
    
    inline def setOverrideFilterQstring(value: String): Self = StObject.set(x, "overrideFilterQstring", value.asInstanceOf[js.Any])
    
    inline def setPortalUrl(value: String): Self = StObject.set(x, "PortalUrl", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: js.Any): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setRecursiveView(value: Boolean): Self = StObject.set(x, "recursiveView", value.asInstanceOf[js.Any])
    
    inline def setRecycleBinEnabled(value: Double): Self = StObject.set(x, "RecycleBinEnabled", value.asInstanceOf[js.Any])
    
    inline def setRegionalSettingsTimeZoneBias(value: String): Self = StObject.set(x, "RegionalSettingsTimeZoneBias", value.asInstanceOf[js.Any])
    
    inline def setRootFolder(value: String): Self = StObject.set(x, "rootFolder", value.asInstanceOf[js.Any])
    
    inline def setRootFolderForDisplay(value: js.Any): Self = StObject.set(x, "rootFolderForDisplay", value.asInstanceOf[js.Any])
    
    inline def setRowFocusTimerID(value: js.Any): Self = StObject.set(x, "RowFocusTimerID", value.asInstanceOf[js.Any])
    
    inline def setSelectAllCbx(value: js.Any): Self = StObject.set(x, "SelectAllCbx", value.asInstanceOf[js.Any])
    
    inline def setSendToLocationName(value: String): Self = StObject.set(x, "SendToLocationName", value.asInstanceOf[js.Any])
    
    inline def setSendToLocationUrl(value: String): Self = StObject.set(x, "SendToLocationUrl", value.asInstanceOf[js.Any])
    
    inline def setServerUrl(value: js.Any): Self = StObject.set(x, "serverUrl", value.asInstanceOf[js.Any])
    
    inline def setSiteTitle(value: String): Self = StObject.set(x, "SiteTitle", value.asInstanceOf[js.Any])
    
    inline def setStateInitDone(value: Boolean): Self = StObject.set(x, "StateInitDone", value.asInstanceOf[js.Any])
    
    inline def setTableCbxFocusHandler(value: js.Any): Self = StObject.set(x, "TableCbxFocusHandler", value.asInstanceOf[js.Any])
    
    inline def setTableMouseOverHandler(value: js.Any): Self = StObject.set(x, "TableMouseOverHandler", value.asInstanceOf[js.Any])
    
    inline def setTotalListItems(value: Double): Self = StObject.set(x, "TotalListItems", value.asInstanceOf[js.Any])
    
    inline def setVerEnabled(value: Double): Self = StObject.set(x, "verEnabled", value.asInstanceOf[js.Any])
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewTitle(value: String): Self = StObject.set(x, "viewTitle", value.asInstanceOf[js.Any])
    
    inline def setWorkflowAssociated(value: Boolean): Self = StObject.set(x, "WorkflowAssociated", value.asInstanceOf[js.Any])
    
    inline def setWpq(value: String): Self = StObject.set(x, "wpq", value.asInstanceOf[js.Any])
    
    inline def setWriteSecurity(value: String): Self = StObject.set(x, "WriteSecurity", value.asInstanceOf[js.Any])
  }
}
