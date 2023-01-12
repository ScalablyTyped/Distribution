package typings.sharepoint

import typings.sharepoint.SPClientTemplates.ListSchema
import typings.sharepoint.SPClientTemplates.RenderContext
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextInfo
  extends StObject
     with RenderContext {
  
  var AllowCreateFolder: Boolean
  
  var AllowGridMode: Boolean
  
  var BasePermissions: Any
  
  var CanShareLinkForNewDocument: Boolean
  
  var CascadeDeleteWarningMessage: String
  
  var ContentTypesEnabled: Boolean
  
  @JSName("CurrentSelectedItems")
  var CurrentSelectedItems_ContextInfo: Boolean
  
  var CurrentUserId: Double
  
  var CurrentUserIsSiteAdmin: Boolean
  
  var EnableMinorVersions: Boolean
  
  var ExcludeFromOfflineClient: Boolean
  
  var ExternalDataList: Boolean
  
  var HasRelatedCascadeLists: Boolean
  
  var HttpPath: String
  
  var HttpRoot: String
  
  var IsAppWeb: Boolean
  
  var IsClientRendering: Boolean
  
  var LastRowIndexSelected: Double
  
  var LastSelectableRowIdx: Double
  
  var LastSelectedItemIID: Double
  
  var ListData: Any
  
  // SPClientTemplates.ListData_InView | SPClientTemplates.ListData_InForm
  var ListSchema: typings.sharepoint.SPClientTemplates.ListSchema
  
  var ListTitle: String
  
  var ModerationStatus: Double
  
  var NewWOPIDocumentEnabled: Boolean
  
  var NewWOPIDocumentUrl: String
  
  var PortalUrl: String
  
  var RecycleBinEnabled: Double
  
  var RowFocusTimerID: Double
  
  var SelectAllCbx: HTMLElement
  
  var SendToLocationName: String
  
  var SendToLocationUrl: String
  
  var SiteTemplateId: Double
  
  var SiteTitle: String
  
  var StateInitDone: Boolean
  
  def TableCbxFocusHandler(instance: Any, eventArgs: Any): Unit
  
  def TableMouseoverHandler(instance: Any, eventArgs: Any): Unit
  
  var TotalListItems: Double
  
  var WorkflowsAssociated: Boolean
  
  var clvp: Any
  
  var ctxId: Double
  
  var ctxType: Any
  
  var dictSel: Any
  
  var displayFormUrl: String
  
  var editFormUrl: String
  
  var imagesPath: String
  
  var inGridFullRender: Boolean
  
  var inGridMode: Boolean
  
  var isForceCheckout: Boolean
  
  var isModerated: Boolean
  
  var isPortalTemplate: Boolean
  
  var isVersions: Boolean
  
  var isWebEditorPreview: Boolean
  
  var leavingGridMode: Boolean
  
  var listBaseType: Double
  
  var listName: String
  
  var listTemplate: String
  
  var listUrlDir: String
  
  var loadingAsyncData: Boolean
  
  var newFormUrl: String
  
  var noGroupCollapse: Boolean
  
  @JSName("onRefreshFailed")
  def onRefreshFailed_MContextInfo(context: Any, requrest: Any, response: Any): Unit
  
  var overrideDeleteConfirmation: String
  
  var overrideFilterQstring: String
  
  var queryString: String
  
  var recursiveView: Boolean
  
  var rootFolder: String
  
  var rootFolderForDisplay: String
  
  var serverUrl: String
  
  var verEnabled: Boolean
  
  var view: String
  
  var wpq: String
}
object ContextInfo {
  
  inline def apply(
    AllowCreateFolder: Boolean,
    AllowGridMode: Boolean,
    BasePermissions: Any,
    CanShareLinkForNewDocument: Boolean,
    CascadeDeleteWarningMessage: String,
    ContentTypesEnabled: Boolean,
    CurrentSelectedItems: Boolean,
    CurrentUserId: Double,
    CurrentUserIsSiteAdmin: Boolean,
    EnableMinorVersions: Boolean,
    ExcludeFromOfflineClient: Boolean,
    ExternalDataList: Boolean,
    HasRelatedCascadeLists: Boolean,
    HttpPath: String,
    HttpRoot: String,
    IsAppWeb: Boolean,
    IsClientRendering: Boolean,
    LastRowIndexSelected: Double,
    LastSelectableRowIdx: Double,
    LastSelectedItemIID: Double,
    ListData: Any,
    ListSchema: ListSchema,
    ListTitle: String,
    ModerationStatus: Double,
    NewWOPIDocumentEnabled: Boolean,
    NewWOPIDocumentUrl: String,
    PortalUrl: String,
    RecycleBinEnabled: Double,
    RowFocusTimerID: Double,
    SelectAllCbx: HTMLElement,
    SendToLocationName: String,
    SendToLocationUrl: String,
    SiteTemplateId: Double,
    SiteTitle: String,
    StateInitDone: Boolean,
    TableCbxFocusHandler: (Any, Any) => Unit,
    TableMouseoverHandler: (Any, Any) => Unit,
    TotalListItems: Double,
    WorkflowsAssociated: Boolean,
    clvp: Any,
    ctxId: Double,
    ctxType: Any,
    dictSel: Any,
    displayFormUrl: String,
    editFormUrl: String,
    imagesPath: String,
    inGridFullRender: Boolean,
    inGridMode: Boolean,
    isForceCheckout: Boolean,
    isModerated: Boolean,
    isPortalTemplate: Boolean,
    isVersions: Boolean,
    isWebEditorPreview: Boolean,
    leavingGridMode: Boolean,
    listBaseType: Double,
    listName: String,
    listTemplate: String,
    listUrlDir: String,
    loadingAsyncData: Boolean,
    newFormUrl: String,
    noGroupCollapse: Boolean,
    onRefreshFailed: (Any, Any, Any) => Unit,
    overrideDeleteConfirmation: String,
    overrideFilterQstring: String,
    queryString: String,
    recursiveView: Boolean,
    rootFolder: String,
    rootFolderForDisplay: String,
    serverUrl: String,
    verEnabled: Boolean,
    view: String,
    wpq: String
  ): ContextInfo = {
    val __obj = js.Dynamic.literal(AllowCreateFolder = AllowCreateFolder.asInstanceOf[js.Any], AllowGridMode = AllowGridMode.asInstanceOf[js.Any], BasePermissions = BasePermissions.asInstanceOf[js.Any], CanShareLinkForNewDocument = CanShareLinkForNewDocument.asInstanceOf[js.Any], CascadeDeleteWarningMessage = CascadeDeleteWarningMessage.asInstanceOf[js.Any], ContentTypesEnabled = ContentTypesEnabled.asInstanceOf[js.Any], CurrentSelectedItems = CurrentSelectedItems.asInstanceOf[js.Any], CurrentUserId = CurrentUserId.asInstanceOf[js.Any], CurrentUserIsSiteAdmin = CurrentUserIsSiteAdmin.asInstanceOf[js.Any], EnableMinorVersions = EnableMinorVersions.asInstanceOf[js.Any], ExcludeFromOfflineClient = ExcludeFromOfflineClient.asInstanceOf[js.Any], ExternalDataList = ExternalDataList.asInstanceOf[js.Any], HasRelatedCascadeLists = HasRelatedCascadeLists.asInstanceOf[js.Any], HttpPath = HttpPath.asInstanceOf[js.Any], HttpRoot = HttpRoot.asInstanceOf[js.Any], IsAppWeb = IsAppWeb.asInstanceOf[js.Any], IsClientRendering = IsClientRendering.asInstanceOf[js.Any], LastRowIndexSelected = LastRowIndexSelected.asInstanceOf[js.Any], LastSelectableRowIdx = LastSelectableRowIdx.asInstanceOf[js.Any], LastSelectedItemIID = LastSelectedItemIID.asInstanceOf[js.Any], ListData = ListData.asInstanceOf[js.Any], ListSchema = ListSchema.asInstanceOf[js.Any], ListTitle = ListTitle.asInstanceOf[js.Any], ModerationStatus = ModerationStatus.asInstanceOf[js.Any], NewWOPIDocumentEnabled = NewWOPIDocumentEnabled.asInstanceOf[js.Any], NewWOPIDocumentUrl = NewWOPIDocumentUrl.asInstanceOf[js.Any], PortalUrl = PortalUrl.asInstanceOf[js.Any], RecycleBinEnabled = RecycleBinEnabled.asInstanceOf[js.Any], RowFocusTimerID = RowFocusTimerID.asInstanceOf[js.Any], SelectAllCbx = SelectAllCbx.asInstanceOf[js.Any], SendToLocationName = SendToLocationName.asInstanceOf[js.Any], SendToLocationUrl = SendToLocationUrl.asInstanceOf[js.Any], SiteTemplateId = SiteTemplateId.asInstanceOf[js.Any], SiteTitle = SiteTitle.asInstanceOf[js.Any], StateInitDone = StateInitDone.asInstanceOf[js.Any], TableCbxFocusHandler = js.Any.fromFunction2(TableCbxFocusHandler), TableMouseoverHandler = js.Any.fromFunction2(TableMouseoverHandler), TotalListItems = TotalListItems.asInstanceOf[js.Any], WorkflowsAssociated = WorkflowsAssociated.asInstanceOf[js.Any], clvp = clvp.asInstanceOf[js.Any], ctxId = ctxId.asInstanceOf[js.Any], ctxType = ctxType.asInstanceOf[js.Any], dictSel = dictSel.asInstanceOf[js.Any], displayFormUrl = displayFormUrl.asInstanceOf[js.Any], editFormUrl = editFormUrl.asInstanceOf[js.Any], imagesPath = imagesPath.asInstanceOf[js.Any], inGridFullRender = inGridFullRender.asInstanceOf[js.Any], inGridMode = inGridMode.asInstanceOf[js.Any], isForceCheckout = isForceCheckout.asInstanceOf[js.Any], isModerated = isModerated.asInstanceOf[js.Any], isPortalTemplate = isPortalTemplate.asInstanceOf[js.Any], isVersions = isVersions.asInstanceOf[js.Any], isWebEditorPreview = isWebEditorPreview.asInstanceOf[js.Any], leavingGridMode = leavingGridMode.asInstanceOf[js.Any], listBaseType = listBaseType.asInstanceOf[js.Any], listName = listName.asInstanceOf[js.Any], listTemplate = listTemplate.asInstanceOf[js.Any], listUrlDir = listUrlDir.asInstanceOf[js.Any], loadingAsyncData = loadingAsyncData.asInstanceOf[js.Any], newFormUrl = newFormUrl.asInstanceOf[js.Any], noGroupCollapse = noGroupCollapse.asInstanceOf[js.Any], onRefreshFailed = js.Any.fromFunction3(onRefreshFailed), overrideDeleteConfirmation = overrideDeleteConfirmation.asInstanceOf[js.Any], overrideFilterQstring = overrideFilterQstring.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], recursiveView = recursiveView.asInstanceOf[js.Any], rootFolder = rootFolder.asInstanceOf[js.Any], rootFolderForDisplay = rootFolderForDisplay.asInstanceOf[js.Any], serverUrl = serverUrl.asInstanceOf[js.Any], verEnabled = verEnabled.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], wpq = wpq.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextInfo] (val x: Self) extends AnyVal {
    
    inline def setAllowCreateFolder(value: Boolean): Self = StObject.set(x, "AllowCreateFolder", value.asInstanceOf[js.Any])
    
    inline def setAllowGridMode(value: Boolean): Self = StObject.set(x, "AllowGridMode", value.asInstanceOf[js.Any])
    
    inline def setBasePermissions(value: Any): Self = StObject.set(x, "BasePermissions", value.asInstanceOf[js.Any])
    
    inline def setCanShareLinkForNewDocument(value: Boolean): Self = StObject.set(x, "CanShareLinkForNewDocument", value.asInstanceOf[js.Any])
    
    inline def setCascadeDeleteWarningMessage(value: String): Self = StObject.set(x, "CascadeDeleteWarningMessage", value.asInstanceOf[js.Any])
    
    inline def setClvp(value: Any): Self = StObject.set(x, "clvp", value.asInstanceOf[js.Any])
    
    inline def setContentTypesEnabled(value: Boolean): Self = StObject.set(x, "ContentTypesEnabled", value.asInstanceOf[js.Any])
    
    inline def setCtxId(value: Double): Self = StObject.set(x, "ctxId", value.asInstanceOf[js.Any])
    
    inline def setCtxType(value: Any): Self = StObject.set(x, "ctxType", value.asInstanceOf[js.Any])
    
    inline def setCurrentSelectedItems(value: Boolean): Self = StObject.set(x, "CurrentSelectedItems", value.asInstanceOf[js.Any])
    
    inline def setCurrentUserId(value: Double): Self = StObject.set(x, "CurrentUserId", value.asInstanceOf[js.Any])
    
    inline def setCurrentUserIsSiteAdmin(value: Boolean): Self = StObject.set(x, "CurrentUserIsSiteAdmin", value.asInstanceOf[js.Any])
    
    inline def setDictSel(value: Any): Self = StObject.set(x, "dictSel", value.asInstanceOf[js.Any])
    
    inline def setDisplayFormUrl(value: String): Self = StObject.set(x, "displayFormUrl", value.asInstanceOf[js.Any])
    
    inline def setEditFormUrl(value: String): Self = StObject.set(x, "editFormUrl", value.asInstanceOf[js.Any])
    
    inline def setEnableMinorVersions(value: Boolean): Self = StObject.set(x, "EnableMinorVersions", value.asInstanceOf[js.Any])
    
    inline def setExcludeFromOfflineClient(value: Boolean): Self = StObject.set(x, "ExcludeFromOfflineClient", value.asInstanceOf[js.Any])
    
    inline def setExternalDataList(value: Boolean): Self = StObject.set(x, "ExternalDataList", value.asInstanceOf[js.Any])
    
    inline def setHasRelatedCascadeLists(value: Boolean): Self = StObject.set(x, "HasRelatedCascadeLists", value.asInstanceOf[js.Any])
    
    inline def setHttpPath(value: String): Self = StObject.set(x, "HttpPath", value.asInstanceOf[js.Any])
    
    inline def setHttpRoot(value: String): Self = StObject.set(x, "HttpRoot", value.asInstanceOf[js.Any])
    
    inline def setImagesPath(value: String): Self = StObject.set(x, "imagesPath", value.asInstanceOf[js.Any])
    
    inline def setInGridFullRender(value: Boolean): Self = StObject.set(x, "inGridFullRender", value.asInstanceOf[js.Any])
    
    inline def setInGridMode(value: Boolean): Self = StObject.set(x, "inGridMode", value.asInstanceOf[js.Any])
    
    inline def setIsAppWeb(value: Boolean): Self = StObject.set(x, "IsAppWeb", value.asInstanceOf[js.Any])
    
    inline def setIsClientRendering(value: Boolean): Self = StObject.set(x, "IsClientRendering", value.asInstanceOf[js.Any])
    
    inline def setIsForceCheckout(value: Boolean): Self = StObject.set(x, "isForceCheckout", value.asInstanceOf[js.Any])
    
    inline def setIsModerated(value: Boolean): Self = StObject.set(x, "isModerated", value.asInstanceOf[js.Any])
    
    inline def setIsPortalTemplate(value: Boolean): Self = StObject.set(x, "isPortalTemplate", value.asInstanceOf[js.Any])
    
    inline def setIsVersions(value: Boolean): Self = StObject.set(x, "isVersions", value.asInstanceOf[js.Any])
    
    inline def setIsWebEditorPreview(value: Boolean): Self = StObject.set(x, "isWebEditorPreview", value.asInstanceOf[js.Any])
    
    inline def setLastRowIndexSelected(value: Double): Self = StObject.set(x, "LastRowIndexSelected", value.asInstanceOf[js.Any])
    
    inline def setLastSelectableRowIdx(value: Double): Self = StObject.set(x, "LastSelectableRowIdx", value.asInstanceOf[js.Any])
    
    inline def setLastSelectedItemIID(value: Double): Self = StObject.set(x, "LastSelectedItemIID", value.asInstanceOf[js.Any])
    
    inline def setLeavingGridMode(value: Boolean): Self = StObject.set(x, "leavingGridMode", value.asInstanceOf[js.Any])
    
    inline def setListBaseType(value: Double): Self = StObject.set(x, "listBaseType", value.asInstanceOf[js.Any])
    
    inline def setListData(value: Any): Self = StObject.set(x, "ListData", value.asInstanceOf[js.Any])
    
    inline def setListName(value: String): Self = StObject.set(x, "listName", value.asInstanceOf[js.Any])
    
    inline def setListSchema(value: ListSchema): Self = StObject.set(x, "ListSchema", value.asInstanceOf[js.Any])
    
    inline def setListTemplate(value: String): Self = StObject.set(x, "listTemplate", value.asInstanceOf[js.Any])
    
    inline def setListTitle(value: String): Self = StObject.set(x, "ListTitle", value.asInstanceOf[js.Any])
    
    inline def setListUrlDir(value: String): Self = StObject.set(x, "listUrlDir", value.asInstanceOf[js.Any])
    
    inline def setLoadingAsyncData(value: Boolean): Self = StObject.set(x, "loadingAsyncData", value.asInstanceOf[js.Any])
    
    inline def setModerationStatus(value: Double): Self = StObject.set(x, "ModerationStatus", value.asInstanceOf[js.Any])
    
    inline def setNewFormUrl(value: String): Self = StObject.set(x, "newFormUrl", value.asInstanceOf[js.Any])
    
    inline def setNewWOPIDocumentEnabled(value: Boolean): Self = StObject.set(x, "NewWOPIDocumentEnabled", value.asInstanceOf[js.Any])
    
    inline def setNewWOPIDocumentUrl(value: String): Self = StObject.set(x, "NewWOPIDocumentUrl", value.asInstanceOf[js.Any])
    
    inline def setNoGroupCollapse(value: Boolean): Self = StObject.set(x, "noGroupCollapse", value.asInstanceOf[js.Any])
    
    inline def setOnRefreshFailed(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "onRefreshFailed", js.Any.fromFunction3(value))
    
    inline def setOverrideDeleteConfirmation(value: String): Self = StObject.set(x, "overrideDeleteConfirmation", value.asInstanceOf[js.Any])
    
    inline def setOverrideFilterQstring(value: String): Self = StObject.set(x, "overrideFilterQstring", value.asInstanceOf[js.Any])
    
    inline def setPortalUrl(value: String): Self = StObject.set(x, "PortalUrl", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setRecursiveView(value: Boolean): Self = StObject.set(x, "recursiveView", value.asInstanceOf[js.Any])
    
    inline def setRecycleBinEnabled(value: Double): Self = StObject.set(x, "RecycleBinEnabled", value.asInstanceOf[js.Any])
    
    inline def setRootFolder(value: String): Self = StObject.set(x, "rootFolder", value.asInstanceOf[js.Any])
    
    inline def setRootFolderForDisplay(value: String): Self = StObject.set(x, "rootFolderForDisplay", value.asInstanceOf[js.Any])
    
    inline def setRowFocusTimerID(value: Double): Self = StObject.set(x, "RowFocusTimerID", value.asInstanceOf[js.Any])
    
    inline def setSelectAllCbx(value: HTMLElement): Self = StObject.set(x, "SelectAllCbx", value.asInstanceOf[js.Any])
    
    inline def setSendToLocationName(value: String): Self = StObject.set(x, "SendToLocationName", value.asInstanceOf[js.Any])
    
    inline def setSendToLocationUrl(value: String): Self = StObject.set(x, "SendToLocationUrl", value.asInstanceOf[js.Any])
    
    inline def setServerUrl(value: String): Self = StObject.set(x, "serverUrl", value.asInstanceOf[js.Any])
    
    inline def setSiteTemplateId(value: Double): Self = StObject.set(x, "SiteTemplateId", value.asInstanceOf[js.Any])
    
    inline def setSiteTitle(value: String): Self = StObject.set(x, "SiteTitle", value.asInstanceOf[js.Any])
    
    inline def setStateInitDone(value: Boolean): Self = StObject.set(x, "StateInitDone", value.asInstanceOf[js.Any])
    
    inline def setTableCbxFocusHandler(value: (Any, Any) => Unit): Self = StObject.set(x, "TableCbxFocusHandler", js.Any.fromFunction2(value))
    
    inline def setTableMouseoverHandler(value: (Any, Any) => Unit): Self = StObject.set(x, "TableMouseoverHandler", js.Any.fromFunction2(value))
    
    inline def setTotalListItems(value: Double): Self = StObject.set(x, "TotalListItems", value.asInstanceOf[js.Any])
    
    inline def setVerEnabled(value: Boolean): Self = StObject.set(x, "verEnabled", value.asInstanceOf[js.Any])
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setWorkflowsAssociated(value: Boolean): Self = StObject.set(x, "WorkflowsAssociated", value.asInstanceOf[js.Any])
    
    inline def setWpq(value: String): Self = StObject.set(x, "wpq", value.asInstanceOf[js.Any])
  }
}
