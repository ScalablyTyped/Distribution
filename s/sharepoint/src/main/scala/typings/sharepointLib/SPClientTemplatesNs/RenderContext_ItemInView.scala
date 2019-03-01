package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderContext_ItemInView extends RenderContext_InView {
  var CurrentItem: Item
  var CurrentItemIdx: scala.Double
}

object RenderContext_ItemInView {
  @scala.inline
  def apply(
    AllowCreateFolder: scala.Boolean,
    AllowGridMode: scala.Boolean,
    BasePermissions: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    CanShareLinkForNewDocument: scala.Boolean,
    CascadeDeleteWarningMessage: java.lang.String,
    ContentTypesEnabled: scala.Boolean,
    CurrentItem: Item,
    CurrentItemIdx: scala.Double,
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
    RenderBody: js.Function1[RenderContext_ItemInView, java.lang.String] = null,
    RenderFieldByName: js.Function2[RenderContext_ItemInView, /* fieldName */ java.lang.String, java.lang.String] = null,
    RenderFields: js.Function1[RenderContext_ItemInView, java.lang.String] = null,
    RenderFooter: js.Function1[RenderContext_ItemInView, java.lang.String] = null,
    RenderGroups: js.Function1[RenderContext_ItemInView, java.lang.String] = null,
    RenderHeader: js.Function1[RenderContext_ItemInView, java.lang.String] = null,
    RenderItems: js.Function1[RenderContext_ItemInView, java.lang.String] = null,
    RenderView: js.Function1[RenderContext_ItemInView, java.lang.String] = null,
    SiteClientTag: java.lang.String = null,
    Templates: Templates = null,
    onRefreshFailed: js.Any = null
  ): RenderContext_ItemInView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AllowCreateFolder")(AllowCreateFolder)
    __obj.updateDynamic("AllowGridMode")(AllowGridMode)
    __obj.updateDynamic("BasePermissions")(BasePermissions)
    __obj.updateDynamic("CanShareLinkForNewDocument")(CanShareLinkForNewDocument)
    __obj.updateDynamic("CascadeDeleteWarningMessage")(CascadeDeleteWarningMessage)
    __obj.updateDynamic("ContentTypesEnabled")(ContentTypesEnabled)
    __obj.updateDynamic("CurrentItem")(CurrentItem)
    __obj.updateDynamic("CurrentItemIdx")(CurrentItemIdx)
    __obj.updateDynamic("CurrentUserId")(CurrentUserId)
    __obj.updateDynamic("CurrentUserIsSiteAdmin")(CurrentUserIsSiteAdmin)
    __obj.updateDynamic("EnableMinorVersions")(EnableMinorVersions)
    __obj.updateDynamic("ExternalDataList")(ExternalDataList)
    __obj.updateDynamic("HasRelatedCascadeLists")(HasRelatedCascadeLists)
    __obj.updateDynamic("HttpPath")(HttpPath)
    __obj.updateDynamic("HttpRoot")(HttpRoot)
    __obj.updateDynamic("IsAppWeb")(IsAppWeb)
    __obj.updateDynamic("IsClientRendering")(IsClientRendering)
    __obj.updateDynamic("LastRowIndexSelected")(LastRowIndexSelected)
    __obj.updateDynamic("LastSelectableRowIdx")(LastSelectableRowIdx)
    __obj.updateDynamic("LastSelectedItemIID")(LastSelectedItemIID)
    __obj.updateDynamic("LastSelectedItemId")(LastSelectedItemId)
    __obj.updateDynamic("ListData")(ListData)
    __obj.updateDynamic("ListDataJSONItemsKey")(ListDataJSONItemsKey)
    __obj.updateDynamic("ListSchema")(ListSchema)
    __obj.updateDynamic("ListTitle")(ListTitle)
    __obj.updateDynamic("ModerationStatus")(ModerationStatus)
    __obj.updateDynamic("NavigateForFormsPages")(NavigateForFormsPages)
    __obj.updateDynamic("NewWOPIDocumentEnabled")(NewWOPIDocumentEnabled)
    __obj.updateDynamic("NewWOPIDocumentUrl")(NewWOPIDocumentUrl)
    __obj.updateDynamic("OfficialFileName")(OfficialFileName)
    __obj.updateDynamic("OfficialFileNames")(OfficialFileNames)
    __obj.updateDynamic("PortalUrl")(PortalUrl)
    __obj.updateDynamic("RecycleBinEnabled")(RecycleBinEnabled)
    __obj.updateDynamic("RegionalSettingsTimeZoneBias")(RegionalSettingsTimeZoneBias)
    __obj.updateDynamic("RowFocusTimerID")(RowFocusTimerID)
    __obj.updateDynamic("SelectAllCbx")(SelectAllCbx)
    __obj.updateDynamic("SendToLocationName")(SendToLocationName)
    __obj.updateDynamic("SendToLocationUrl")(SendToLocationUrl)
    __obj.updateDynamic("SiteTitle")(SiteTitle)
    __obj.updateDynamic("StateInitDone")(StateInitDone)
    __obj.updateDynamic("TableCbxFocusHandler")(TableCbxFocusHandler)
    __obj.updateDynamic("TableMouseOverHandler")(TableMouseOverHandler)
    __obj.updateDynamic("TotalListItems")(TotalListItems)
    __obj.updateDynamic("WorkflowAssociated")(WorkflowAssociated)
    __obj.updateDynamic("WriteSecurity")(WriteSecurity)
    __obj.updateDynamic("bInitialRender")(bInitialRender)
    __obj.updateDynamic("clvp")(clvp)
    __obj.updateDynamic("ctxId")(ctxId)
    __obj.updateDynamic("ctxType")(ctxType)
    __obj.updateDynamic("dictSel")(dictSel)
    __obj.updateDynamic("displayFormUrl")(displayFormUrl)
    __obj.updateDynamic("editFormUrl")(editFormUrl)
    __obj.updateDynamic("enteringGridMode")(enteringGridMode)
    __obj.updateDynamic("existingServerFilterHash")(existingServerFilterHash)
    __obj.updateDynamic("heroId")(heroId)
    __obj.updateDynamic("imagesPath")(imagesPath)
    __obj.updateDynamic("inGridFullRender")(inGridFullRender)
    __obj.updateDynamic("inGridMode")(inGridMode)
    __obj.updateDynamic("isForceCheckout")(isForceCheckout)
    __obj.updateDynamic("isModerated")(isModerated)
    __obj.updateDynamic("isPortalTemplate")(isPortalTemplate)
    __obj.updateDynamic("isVersions")(isVersions)
    __obj.updateDynamic("isWebEditorPreview")(isWebEditorPreview)
    __obj.updateDynamic("isXslView")(isXslView)
    __obj.updateDynamic("leavingGridMode")(leavingGridMode)
    __obj.updateDynamic("listBaseType")(listBaseType)
    __obj.updateDynamic("listName")(listName)
    __obj.updateDynamic("listTemplate")(listTemplate)
    __obj.updateDynamic("listUrlDir")(listUrlDir)
    __obj.updateDynamic("loadingAsyncData")(loadingAsyncData)
    __obj.updateDynamic("newFormUrl")(newFormUrl)
    __obj.updateDynamic("noGroupCollapse")(noGroupCollapse)
    __obj.updateDynamic("overrideDeleteConfirmation")(overrideDeleteConfirmation)
    __obj.updateDynamic("overrideFilterQstring")(overrideFilterQstring)
    __obj.updateDynamic("queryString")(queryString)
    __obj.updateDynamic("recursiveView")(recursiveView)
    __obj.updateDynamic("rootFolder")(rootFolder)
    __obj.updateDynamic("rootFolderForDisplay")(rootFolderForDisplay)
    __obj.updateDynamic("serverUrl")(serverUrl)
    __obj.updateDynamic("verEnabled")(verEnabled)
    __obj.updateDynamic("view")(view)
    __obj.updateDynamic("viewTitle")(viewTitle)
    __obj.updateDynamic("wpq")(wpq)
    if (BaseViewID != null) __obj.updateDynamic("BaseViewID")(BaseViewID.asInstanceOf[js.Any])
    if (ControlMode != null) __obj.updateDynamic("ControlMode")(ControlMode)
    if (CurrentCultureName != null) __obj.updateDynamic("CurrentCultureName")(CurrentCultureName)
    if (CurrentLanguage != null) __obj.updateDynamic("CurrentLanguage")(CurrentLanguage.asInstanceOf[js.Any])
    if (CurrentSelectedItems != null) __obj.updateDynamic("CurrentSelectedItems")(CurrentSelectedItems)
    if (CurrentUICultureName != null) __obj.updateDynamic("CurrentUICultureName")(CurrentUICultureName)
    if (ListTemplateType != null) __obj.updateDynamic("ListTemplateType")(ListTemplateType.asInstanceOf[js.Any])
    if (OnPostRender != null) __obj.updateDynamic("OnPostRender")(OnPostRender.asInstanceOf[js.Any])
    if (OnPreRender != null) __obj.updateDynamic("OnPreRender")(OnPreRender.asInstanceOf[js.Any])
    if (RenderBody != null) __obj.updateDynamic("RenderBody")(RenderBody)
    if (RenderFieldByName != null) __obj.updateDynamic("RenderFieldByName")(RenderFieldByName)
    if (RenderFields != null) __obj.updateDynamic("RenderFields")(RenderFields)
    if (RenderFooter != null) __obj.updateDynamic("RenderFooter")(RenderFooter)
    if (RenderGroups != null) __obj.updateDynamic("RenderGroups")(RenderGroups)
    if (RenderHeader != null) __obj.updateDynamic("RenderHeader")(RenderHeader)
    if (RenderItems != null) __obj.updateDynamic("RenderItems")(RenderItems)
    if (RenderView != null) __obj.updateDynamic("RenderView")(RenderView)
    if (SiteClientTag != null) __obj.updateDynamic("SiteClientTag")(SiteClientTag)
    if (Templates != null) __obj.updateDynamic("Templates")(Templates)
    if (onRefreshFailed != null) __obj.updateDynamic("onRefreshFailed")(onRefreshFailed)
    __obj.asInstanceOf[RenderContext_ItemInView]
  }
}

