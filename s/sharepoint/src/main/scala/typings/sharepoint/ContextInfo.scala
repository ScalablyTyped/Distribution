package typings.sharepoint

import typings.sharepoint.SPClientTemplates.ListSchema
import typings.sharepoint.SPClientTemplates.RenderContext
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextInfo extends RenderContext {
  
  var AllowCreateFolder: Boolean = js.native
  
  var AllowGridMode: Boolean = js.native
  
  var BasePermissions: js.Any = js.native
  
  var CanShareLinkForNewDocument: Boolean = js.native
  
  var CascadeDeleteWarningMessage: String = js.native
  
  var ContentTypesEnabled: Boolean = js.native
  
  @JSName("CurrentSelectedItems")
  var CurrentSelectedItems_ContextInfo: Boolean = js.native
  
  var CurrentUserId: Double = js.native
  
  var CurrentUserIsSiteAdmin: Boolean = js.native
  
  var EnableMinorVersions: Boolean = js.native
  
  var ExcludeFromOfflineClient: Boolean = js.native
  
  var ExternalDataList: Boolean = js.native
  
  var HasRelatedCascadeLists: Boolean = js.native
  
  var HttpPath: String = js.native
  
  var HttpRoot: String = js.native
  
  var IsAppWeb: Boolean = js.native
  
  var IsClientRendering: Boolean = js.native
  
  var LastRowIndexSelected: Double = js.native
  
  var LastSelectableRowIdx: Double = js.native
  
  var LastSelectedItemIID: Double = js.native
  
  var ListData: js.Any = js.native
  
   // SPClientTemplates.ListData_InView | SPClientTemplates.ListData_InForm
  var ListSchema: typings.sharepoint.SPClientTemplates.ListSchema = js.native
  
  var ListTitle: String = js.native
  
  var ModerationStatus: Double = js.native
  
  var NewWOPIDocumentEnabled: Boolean = js.native
  
  var NewWOPIDocumentUrl: String = js.native
  
  var PortalUrl: String = js.native
  
  var RecycleBinEnabled: Double = js.native
  
  var RowFocusTimerID: Double = js.native
  
  var SelectAllCbx: HTMLElement = js.native
  
  var SendToLocationName: String = js.native
  
  var SendToLocationUrl: String = js.native
  
  var SiteTemplateId: Double = js.native
  
  var SiteTitle: String = js.native
  
  var StateInitDone: Boolean = js.native
  
  def TableCbxFocusHandler(instance: js.Any, eventArgs: js.Any): Unit = js.native
  
  def TableMouseoverHandler(instance: js.Any, eventArgs: js.Any): Unit = js.native
  
  var TotalListItems: Double = js.native
  
  var WorkflowsAssociated: Boolean = js.native
  
  var clvp: js.Any = js.native
  
  var ctxId: Double = js.native
  
  var ctxType: js.Any = js.native
  
  var dictSel: js.Any = js.native
  
  var displayFormUrl: String = js.native
  
  var editFormUrl: String = js.native
  
  var imagesPath: String = js.native
  
  var inGridFullRender: Boolean = js.native
  
  var inGridMode: Boolean = js.native
  
  var isForceCheckout: Boolean = js.native
  
  var isModerated: Boolean = js.native
  
  var isPortalTemplate: Boolean = js.native
  
  var isVersions: Boolean = js.native
  
  var isWebEditorPreview: Boolean = js.native
  
  var leavingGridMode: Boolean = js.native
  
  var listBaseType: Double = js.native
  
  var listName: String = js.native
  
  var listTemplate: String = js.native
  
  var listUrlDir: String = js.native
  
  var loadingAsyncData: Boolean = js.native
  
  var newFormUrl: String = js.native
  
  var noGroupCollapse: Boolean = js.native
  
  @JSName("onRefreshFailed")
  def onRefreshFailed_MContextInfo(context: js.Any, requrest: js.Any, response: js.Any): Unit = js.native
  
  var overrideDeleteConfirmation: String = js.native
  
  var overrideFilterQstring: String = js.native
  
  var queryString: String = js.native
  
  var recursiveView: Boolean = js.native
  
  var rootFolder: String = js.native
  
  var rootFolderForDisplay: String = js.native
  
  var serverUrl: String = js.native
  
  var verEnabled: Boolean = js.native
  
  var view: String = js.native
  
  var wpq: String = js.native
}
object ContextInfo {
  
  @scala.inline
  def apply(
    AllowCreateFolder: Boolean,
    AllowGridMode: Boolean,
    BasePermissions: js.Any,
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
    ListData: js.Any,
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
    TableCbxFocusHandler: (js.Any, js.Any) => Unit,
    TableMouseoverHandler: (js.Any, js.Any) => Unit,
    TotalListItems: Double,
    WorkflowsAssociated: Boolean,
    clvp: js.Any,
    ctxId: Double,
    ctxType: js.Any,
    dictSel: js.Any,
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
    onRefreshFailed: (js.Any, js.Any, js.Any) => Unit,
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
  implicit class ContextInfoOps[Self <: ContextInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowCreateFolder(value: Boolean): Self = this.set("AllowCreateFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowGridMode(value: Boolean): Self = this.set("AllowGridMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePermissions(value: js.Any): Self = this.set("BasePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanShareLinkForNewDocument(value: Boolean): Self = this.set("CanShareLinkForNewDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCascadeDeleteWarningMessage(value: String): Self = this.set("CascadeDeleteWarningMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypesEnabled(value: Boolean): Self = this.set("ContentTypesEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSelectedItems(value: Boolean): Self = this.set("CurrentSelectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUserId(value: Double): Self = this.set("CurrentUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUserIsSiteAdmin(value: Boolean): Self = this.set("CurrentUserIsSiteAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMinorVersions(value: Boolean): Self = this.set("EnableMinorVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeFromOfflineClient(value: Boolean): Self = this.set("ExcludeFromOfflineClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDataList(value: Boolean): Self = this.set("ExternalDataList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasRelatedCascadeLists(value: Boolean): Self = this.set("HasRelatedCascadeLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpPath(value: String): Self = this.set("HttpPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpRoot(value: String): Self = this.set("HttpRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAppWeb(value: Boolean): Self = this.set("IsAppWeb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClientRendering(value: Boolean): Self = this.set("IsClientRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRowIndexSelected(value: Double): Self = this.set("LastRowIndexSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSelectableRowIdx(value: Double): Self = this.set("LastSelectableRowIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSelectedItemIID(value: Double): Self = this.set("LastSelectedItemIID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListData(value: js.Any): Self = this.set("ListData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSchema(value: ListSchema): Self = this.set("ListSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListTitle(value: String): Self = this.set("ListTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModerationStatus(value: Double): Self = this.set("ModerationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewWOPIDocumentEnabled(value: Boolean): Self = this.set("NewWOPIDocumentEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewWOPIDocumentUrl(value: String): Self = this.set("NewWOPIDocumentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalUrl(value: String): Self = this.set("PortalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecycleBinEnabled(value: Double): Self = this.set("RecycleBinEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowFocusTimerID(value: Double): Self = this.set("RowFocusTimerID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAllCbx(value: HTMLElement): Self = this.set("SelectAllCbx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendToLocationName(value: String): Self = this.set("SendToLocationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendToLocationUrl(value: String): Self = this.set("SendToLocationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteTemplateId(value: Double): Self = this.set("SiteTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteTitle(value: String): Self = this.set("SiteTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateInitDone(value: Boolean): Self = this.set("StateInitDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableCbxFocusHandler(value: (js.Any, js.Any) => Unit): Self = this.set("TableCbxFocusHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTableMouseoverHandler(value: (js.Any, js.Any) => Unit): Self = this.set("TableMouseoverHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTotalListItems(value: Double): Self = this.set("TotalListItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowsAssociated(value: Boolean): Self = this.set("WorkflowsAssociated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClvp(value: js.Any): Self = this.set("clvp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtxId(value: Double): Self = this.set("ctxId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtxType(value: js.Any): Self = this.set("ctxType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictSel(value: js.Any): Self = this.set("dictSel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFormUrl(value: String): Self = this.set("displayFormUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditFormUrl(value: String): Self = this.set("editFormUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesPath(value: String): Self = this.set("imagesPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInGridFullRender(value: Boolean): Self = this.set("inGridFullRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInGridMode(value: Boolean): Self = this.set("inGridMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsForceCheckout(value: Boolean): Self = this.set("isForceCheckout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsModerated(value: Boolean): Self = this.set("isModerated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPortalTemplate(value: Boolean): Self = this.set("isPortalTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVersions(value: Boolean): Self = this.set("isVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWebEditorPreview(value: Boolean): Self = this.set("isWebEditorPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeavingGridMode(value: Boolean): Self = this.set("leavingGridMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListBaseType(value: Double): Self = this.set("listBaseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListName(value: String): Self = this.set("listName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListTemplate(value: String): Self = this.set("listTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListUrlDir(value: String): Self = this.set("listUrlDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingAsyncData(value: Boolean): Self = this.set("loadingAsyncData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewFormUrl(value: String): Self = this.set("newFormUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoGroupCollapse(value: Boolean): Self = this.set("noGroupCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRefreshFailed(value: (js.Any, js.Any, js.Any) => Unit): Self = this.set("onRefreshFailed", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOverrideDeleteConfirmation(value: String): Self = this.set("overrideDeleteConfirmation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideFilterQstring(value: String): Self = this.set("overrideFilterQstring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryString(value: String): Self = this.set("queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveView(value: Boolean): Self = this.set("recursiveView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootFolder(value: String): Self = this.set("rootFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootFolderForDisplay(value: String): Self = this.set("rootFolderForDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUrl(value: String): Self = this.set("serverUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerEnabled(value: Boolean): Self = this.set("verEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWpq(value: String): Self = this.set("wpq", value.asInstanceOf[js.Any])
  }
}
