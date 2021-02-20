package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderContextFieldInView extends RenderContextItemInView {
  
  /** If in grid mode (context.inGridMode == true), cast to FieldSchema_InForm, otherwise cast to FieldSchema_InView */
  var CurrentFieldSchema: FieldSchemaInForm | FieldSchemaInView = js.native
  
  var CurrentFieldValue: js.Any = js.native
  
  var FieldControlsModes: StringDictionary[ClientControlMode] = js.native
  
  var FormContext: ClientFormContext = js.native
  
  var FormUniqueId: String = js.native
}
object RenderContextFieldInView {
  
  @scala.inline
  def apply(
    AllowCreateFolder: Boolean,
    AllowGridMode: Boolean,
    BasePermissions: StringDictionary[Boolean],
    CanShareLinkForNewDocument: Boolean,
    CascadeDeleteWarningMessage: String,
    ContentTypesEnabled: Boolean,
    CurrentFieldSchema: FieldSchemaInForm | FieldSchemaInView,
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
  ): RenderContextFieldInView = {
    val __obj = js.Dynamic.literal(AllowCreateFolder = AllowCreateFolder.asInstanceOf[js.Any], AllowGridMode = AllowGridMode.asInstanceOf[js.Any], BasePermissions = BasePermissions.asInstanceOf[js.Any], CanShareLinkForNewDocument = CanShareLinkForNewDocument.asInstanceOf[js.Any], CascadeDeleteWarningMessage = CascadeDeleteWarningMessage.asInstanceOf[js.Any], ContentTypesEnabled = ContentTypesEnabled.asInstanceOf[js.Any], CurrentFieldSchema = CurrentFieldSchema.asInstanceOf[js.Any], CurrentFieldValue = CurrentFieldValue.asInstanceOf[js.Any], CurrentItem = CurrentItem.asInstanceOf[js.Any], CurrentItemIdx = CurrentItemIdx.asInstanceOf[js.Any], CurrentUserId = CurrentUserId.asInstanceOf[js.Any], CurrentUserIsSiteAdmin = CurrentUserIsSiteAdmin.asInstanceOf[js.Any], EnableMinorVersions = EnableMinorVersions.asInstanceOf[js.Any], ExternalDataList = ExternalDataList.asInstanceOf[js.Any], FieldControlsModes = FieldControlsModes.asInstanceOf[js.Any], FormContext = FormContext.asInstanceOf[js.Any], FormUniqueId = FormUniqueId.asInstanceOf[js.Any], HasRelatedCascadeLists = HasRelatedCascadeLists.asInstanceOf[js.Any], HttpPath = HttpPath.asInstanceOf[js.Any], HttpRoot = HttpRoot.asInstanceOf[js.Any], IsAppWeb = IsAppWeb.asInstanceOf[js.Any], IsClientRendering = IsClientRendering.asInstanceOf[js.Any], LastRowIndexSelected = LastRowIndexSelected.asInstanceOf[js.Any], LastSelectableRowIdx = LastSelectableRowIdx.asInstanceOf[js.Any], LastSelectedItemIID = LastSelectedItemIID.asInstanceOf[js.Any], LastSelectedItemId = LastSelectedItemId.asInstanceOf[js.Any], ListData = ListData.asInstanceOf[js.Any], ListDataJSONItemsKey = ListDataJSONItemsKey.asInstanceOf[js.Any], ListSchema = ListSchema.asInstanceOf[js.Any], ListTitle = ListTitle.asInstanceOf[js.Any], ModerationStatus = ModerationStatus.asInstanceOf[js.Any], NavigateForFormsPages = NavigateForFormsPages.asInstanceOf[js.Any], NewWOPIDocumentEnabled = NewWOPIDocumentEnabled.asInstanceOf[js.Any], NewWOPIDocumentUrl = NewWOPIDocumentUrl.asInstanceOf[js.Any], OfficialFileName = OfficialFileName.asInstanceOf[js.Any], OfficialFileNames = OfficialFileNames.asInstanceOf[js.Any], PortalUrl = PortalUrl.asInstanceOf[js.Any], RecycleBinEnabled = RecycleBinEnabled.asInstanceOf[js.Any], RegionalSettingsTimeZoneBias = RegionalSettingsTimeZoneBias.asInstanceOf[js.Any], RowFocusTimerID = RowFocusTimerID.asInstanceOf[js.Any], SelectAllCbx = SelectAllCbx.asInstanceOf[js.Any], SendToLocationName = SendToLocationName.asInstanceOf[js.Any], SendToLocationUrl = SendToLocationUrl.asInstanceOf[js.Any], SiteTitle = SiteTitle.asInstanceOf[js.Any], StateInitDone = StateInitDone.asInstanceOf[js.Any], TableCbxFocusHandler = TableCbxFocusHandler.asInstanceOf[js.Any], TableMouseOverHandler = TableMouseOverHandler.asInstanceOf[js.Any], TotalListItems = TotalListItems.asInstanceOf[js.Any], WorkflowAssociated = WorkflowAssociated.asInstanceOf[js.Any], WriteSecurity = WriteSecurity.asInstanceOf[js.Any], bInitialRender = bInitialRender.asInstanceOf[js.Any], clvp = clvp.asInstanceOf[js.Any], ctxId = ctxId.asInstanceOf[js.Any], ctxType = ctxType.asInstanceOf[js.Any], dictSel = dictSel.asInstanceOf[js.Any], displayFormUrl = displayFormUrl.asInstanceOf[js.Any], editFormUrl = editFormUrl.asInstanceOf[js.Any], enteringGridMode = enteringGridMode.asInstanceOf[js.Any], existingServerFilterHash = existingServerFilterHash.asInstanceOf[js.Any], heroId = heroId.asInstanceOf[js.Any], imagesPath = imagesPath.asInstanceOf[js.Any], inGridFullRender = inGridFullRender.asInstanceOf[js.Any], inGridMode = inGridMode.asInstanceOf[js.Any], isForceCheckout = isForceCheckout.asInstanceOf[js.Any], isModerated = isModerated.asInstanceOf[js.Any], isPortalTemplate = isPortalTemplate.asInstanceOf[js.Any], isVersions = isVersions.asInstanceOf[js.Any], isWebEditorPreview = isWebEditorPreview.asInstanceOf[js.Any], isXslView = isXslView.asInstanceOf[js.Any], leavingGridMode = leavingGridMode.asInstanceOf[js.Any], listBaseType = listBaseType.asInstanceOf[js.Any], listName = listName.asInstanceOf[js.Any], listTemplate = listTemplate.asInstanceOf[js.Any], listUrlDir = listUrlDir.asInstanceOf[js.Any], loadingAsyncData = loadingAsyncData.asInstanceOf[js.Any], newFormUrl = newFormUrl.asInstanceOf[js.Any], noGroupCollapse = noGroupCollapse.asInstanceOf[js.Any], overrideDeleteConfirmation = overrideDeleteConfirmation.asInstanceOf[js.Any], overrideFilterQstring = overrideFilterQstring.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], recursiveView = recursiveView.asInstanceOf[js.Any], rootFolder = rootFolder.asInstanceOf[js.Any], rootFolderForDisplay = rootFolderForDisplay.asInstanceOf[js.Any], serverUrl = serverUrl.asInstanceOf[js.Any], verEnabled = verEnabled.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], viewTitle = viewTitle.asInstanceOf[js.Any], wpq = wpq.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContextFieldInView]
  }
  
  @scala.inline
  implicit class RenderContextFieldInViewMutableBuilder[Self <: RenderContextFieldInView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentFieldSchema(value: FieldSchemaInForm | FieldSchemaInView): Self = StObject.set(x, "CurrentFieldSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentFieldValue(value: js.Any): Self = StObject.set(x, "CurrentFieldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldControlsModes(value: StringDictionary[ClientControlMode]): Self = StObject.set(x, "FieldControlsModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormContext(value: ClientFormContext): Self = StObject.set(x, "FormContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUniqueId(value: String): Self = StObject.set(x, "FormUniqueId", value.asInstanceOf[js.Any])
  }
}
