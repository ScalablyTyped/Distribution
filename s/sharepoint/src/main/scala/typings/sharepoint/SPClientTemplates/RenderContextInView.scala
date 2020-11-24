package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderContextInView extends RenderContext {
  
  var AllowCreateFolder: Boolean = js.native
  
  var AllowGridMode: Boolean = js.native
  
  var BasePermissions: StringDictionary[Boolean] = js.native
  
  var CanShareLinkForNewDocument: Boolean = js.native
  
  var CascadeDeleteWarningMessage: String = js.native
  
   // not in View
  var ContentTypesEnabled: Boolean = js.native
  
   // not in View
  var CurrentUserId: Double = js.native
  
  var CurrentUserIsSiteAdmin: Boolean = js.native
  
  var EnableMinorVersions: Boolean = js.native
  
  var ExternalDataList: Boolean = js.native
  
  var HasRelatedCascadeLists: Double = js.native
  
   // e.g. "idHomePageNewItem"
  var HttpPath: String = js.native
  
  var HttpRoot: String = js.native
  
  var IsAppWeb: Boolean = js.native
  
  var IsClientRendering: Boolean = js.native
  
  var LastRowIndexSelected: js.Any = js.native
  
   // not in View
  var LastSelectableRowIdx: js.Any = js.native
  
  var LastSelectedItemIID: js.Any = js.native
  
  var LastSelectedItemId: js.Any = js.native
  
  var ListData: ListDataInView = js.native
  
  var ListDataJSONItemsKey: String = js.native
  
  var ListSchema: ListSchemaInView = js.native
  
  var ListTitle: String = js.native
  
  var ModerationStatus: Double = js.native
  
  var NavigateForFormsPages: Boolean = js.native
  
  var NewWOPIDocumentEnabled: js.Any = js.native
  
  var NewWOPIDocumentUrl: js.Any = js.native
  
  var OfficialFileName: String = js.native
  
  var OfficialFileNames: String = js.native
  
   // not in View
  var PortalUrl: String = js.native
  
  /** either 1 or 0 */
  var RecycleBinEnabled: Double = js.native
  
  var RegionalSettingsTimeZoneBias: String = js.native
  
  var RowFocusTimerID: js.Any = js.native
  
  var SelectAllCbx: js.Any = js.native
  
  var SendToLocationName: String = js.native
  
  var SendToLocationUrl: String = js.native
  
  var SiteTitle: String = js.native
  
  var StateInitDone: Boolean = js.native
  
  var TableCbxFocusHandler: js.Any = js.native
  
  var TableMouseOverHandler: js.Any = js.native
  
  var TotalListItems: Double = js.native
  
  var WorkflowAssociated: Boolean = js.native
  
  var WriteSecurity: String = js.native
  
   // SP.BasePermissions?
  var bInitialRender: Boolean = js.native
  
  var clvp: HTMLElement = js.native
  
  var ctxId: Double = js.native
  
  var ctxType: js.Any = js.native
  
  var dictSel: js.Any = js.native
  
  /** Absolute path for the list display form */
  var displayFormUrl: String = js.native
  
  /** Absolute path for the list edit form */
  var editFormUrl: String = js.native
  
  var enteringGridMode: Boolean = js.native
  
  var existingServerFilterHash: js.Any = js.native
  
  var heroId: String = js.native
  
  var imagesPath: String = js.native
  
  var inGridFullRender: js.Any = js.native
  
   // not in View
  var inGridMode: Boolean = js.native
  
  var isForceCheckout: Boolean = js.native
  
  var isModerated: Boolean = js.native
  
  var isPortalTemplate: js.Any = js.native
  
  var isVersions: Double = js.native
  
  var isWebEditorPreview: Double = js.native
  
  var isXslView: Boolean = js.native
  
   // not in View
  var leavingGridMode: Boolean = js.native
  
  var listBaseType: Double = js.native
  
   // ="Row"
  /** Guid of the list */
  var listName: String = js.native
  
  var listTemplate: String = js.native
  
  var listUrlDir: String = js.native
  
  var loadingAsyncData: Boolean = js.native
  
  /** Absolute path for the list new form */
  var newFormUrl: String = js.native
  
  var noGroupCollapse: Boolean = js.native
  
  var overrideDeleteConfirmation: String = js.native
  
   // not in View
  var overrideFilterQstring: String = js.native
  
  var queryString: js.Any = js.native
  
  var recursiveView: Boolean = js.native
  
  var rootFolder: String = js.native
  
  var rootFolderForDisplay: js.Any = js.native
  
  var serverUrl: js.Any = js.native
  
  var verEnabled: Double = js.native
  
  /** Guid of the view. */
  var view: String = js.native
  
  var viewTitle: String = js.native
  
  var wpq: String = js.native
}
object RenderContextInView {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class RenderContextInViewOps[Self <: RenderContextInView] (val x: Self) extends AnyVal {
    
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
    def setBasePermissions(value: StringDictionary[Boolean]): Self = this.set("BasePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanShareLinkForNewDocument(value: Boolean): Self = this.set("CanShareLinkForNewDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCascadeDeleteWarningMessage(value: String): Self = this.set("CascadeDeleteWarningMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypesEnabled(value: Boolean): Self = this.set("ContentTypesEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUserId(value: Double): Self = this.set("CurrentUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUserIsSiteAdmin(value: Boolean): Self = this.set("CurrentUserIsSiteAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMinorVersions(value: Boolean): Self = this.set("EnableMinorVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDataList(value: Boolean): Self = this.set("ExternalDataList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasRelatedCascadeLists(value: Double): Self = this.set("HasRelatedCascadeLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpPath(value: String): Self = this.set("HttpPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpRoot(value: String): Self = this.set("HttpRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAppWeb(value: Boolean): Self = this.set("IsAppWeb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClientRendering(value: Boolean): Self = this.set("IsClientRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRowIndexSelected(value: js.Any): Self = this.set("LastRowIndexSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSelectableRowIdx(value: js.Any): Self = this.set("LastSelectableRowIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSelectedItemIID(value: js.Any): Self = this.set("LastSelectedItemIID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSelectedItemId(value: js.Any): Self = this.set("LastSelectedItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListData(value: ListDataInView): Self = this.set("ListData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListDataJSONItemsKey(value: String): Self = this.set("ListDataJSONItemsKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSchema(value: ListSchemaInView): Self = this.set("ListSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListTitle(value: String): Self = this.set("ListTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModerationStatus(value: Double): Self = this.set("ModerationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigateForFormsPages(value: Boolean): Self = this.set("NavigateForFormsPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewWOPIDocumentEnabled(value: js.Any): Self = this.set("NewWOPIDocumentEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewWOPIDocumentUrl(value: js.Any): Self = this.set("NewWOPIDocumentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficialFileName(value: String): Self = this.set("OfficialFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficialFileNames(value: String): Self = this.set("OfficialFileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalUrl(value: String): Self = this.set("PortalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecycleBinEnabled(value: Double): Self = this.set("RecycleBinEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalSettingsTimeZoneBias(value: String): Self = this.set("RegionalSettingsTimeZoneBias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowFocusTimerID(value: js.Any): Self = this.set("RowFocusTimerID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAllCbx(value: js.Any): Self = this.set("SelectAllCbx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendToLocationName(value: String): Self = this.set("SendToLocationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendToLocationUrl(value: String): Self = this.set("SendToLocationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteTitle(value: String): Self = this.set("SiteTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateInitDone(value: Boolean): Self = this.set("StateInitDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableCbxFocusHandler(value: js.Any): Self = this.set("TableCbxFocusHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableMouseOverHandler(value: js.Any): Self = this.set("TableMouseOverHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalListItems(value: Double): Self = this.set("TotalListItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowAssociated(value: Boolean): Self = this.set("WorkflowAssociated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteSecurity(value: String): Self = this.set("WriteSecurity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBInitialRender(value: Boolean): Self = this.set("bInitialRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClvp(value: HTMLElement): Self = this.set("clvp", value.asInstanceOf[js.Any])
    
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
    def setEnteringGridMode(value: Boolean): Self = this.set("enteringGridMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistingServerFilterHash(value: js.Any): Self = this.set("existingServerFilterHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeroId(value: String): Self = this.set("heroId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesPath(value: String): Self = this.set("imagesPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInGridFullRender(value: js.Any): Self = this.set("inGridFullRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInGridMode(value: Boolean): Self = this.set("inGridMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsForceCheckout(value: Boolean): Self = this.set("isForceCheckout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsModerated(value: Boolean): Self = this.set("isModerated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPortalTemplate(value: js.Any): Self = this.set("isPortalTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVersions(value: Double): Self = this.set("isVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWebEditorPreview(value: Double): Self = this.set("isWebEditorPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsXslView(value: Boolean): Self = this.set("isXslView", value.asInstanceOf[js.Any])
    
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
    def setOverrideDeleteConfirmation(value: String): Self = this.set("overrideDeleteConfirmation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideFilterQstring(value: String): Self = this.set("overrideFilterQstring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryString(value: js.Any): Self = this.set("queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveView(value: Boolean): Self = this.set("recursiveView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootFolder(value: String): Self = this.set("rootFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootFolderForDisplay(value: js.Any): Self = this.set("rootFolderForDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUrl(value: js.Any): Self = this.set("serverUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerEnabled(value: Double): Self = this.set("verEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewTitle(value: String): Self = this.set("viewTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWpq(value: String): Self = this.set("wpq", value.asInstanceOf[js.Any])
  }
}
