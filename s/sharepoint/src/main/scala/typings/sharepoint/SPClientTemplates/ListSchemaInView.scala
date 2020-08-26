package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSchemaInView extends ListSchema {
  /** Key-value object that represents all aggregations defined for the view.
    Key specifies the field internal name, and value specifies the type of the aggregation. */
  var Aggregate: StringDictionary[String] = js.native
  /** Either "TRUE" or false (for grouping) */
  var Collapse: String = js.native
  /** Specifies whether to open items in a client application ("1") or in browser ("0"). */
  var DefaultItemOpen: String = js.native
  var Direction: String = js.native
  /** Either "0" or "1" */
  var EffectivePresenceEnabled: String = js.native
  /** If in grid mode (context.inGridMode == true), cast to FieldSchema_InForm[], otherwise cast to FieldSchema_InView[] */
  var FieldSortParam: String = js.native
  var Filter: js.Any = js.native
  /** Either "0" or "1" */
  var ForceCheckout: String = js.native
  /** "1" if the view contains "Title" field, otherwise not defined. */
  var HasTitle: String = js.native
  var HttpVDir: String = js.native
  /** Either "0" or "1" */
  var InplaceSearchEnabled: String = js.native
  /** Either "0" or "1" */
  var IsDocLib: String = js.native
  /** e.g. "1033" */
  var LCID: String = js.native
  /** Either "0" or "1" */
  var ListRight_AddListItems: String = js.native
  var NoListItem: String = js.native
  var NoListItemHowTo: String = js.native
  /** Server-relative path to the current page */
  var PagePath: String = js.native
  /** Internal name of the field inside which the hierarchy buttons are displayed */
  var ParentHierarchyDisplayField: String = js.native
  var PresenceAlt: String = js.native
  /** Represents SPList.RootFolder.Properties. Exists only if SPList.FetchPropertyBagForListView property is set to true. */
  var PropertyBag: StringDictionary[String] = js.native
  /** Either "True" or "False" */
  var RenderSaveAsNewViewButton: String = js.native
  /** Either "True" or "False" */
  var RenderViewSelectorPivotMenu: String = js.native
  /** Either "True" or "False" */
  var RenderViewSelectorPivotMenuAsync: String = js.native
  /** Query string parameters that specify GUID of the current view and the current root folder */
  var RootFolderParam: String = js.native
  var SelectedID: String = js.native
   // number
  var ShowWebPart: String = js.native
  /** Either "1" or undefined. */
  var StrikeThroughOnCompletedEnabled: String = js.native
  /** Either "0" or "1" */
  var TabularView: String = js.native
  var Toolbar: String = js.native
  var UIVersion: String = js.native
  /** Either "1" or "" */
  var UseParentHierarchy: String = js.native
  /** Server relative path to "/_layouts/userdisp.aspx" in the current web */
  var UserDispUrl: String = js.native
   // number
  var UserVanilla: js.Any = js.native
   // number
  var Userid: String = js.native
  /** Guid of the view */
  var View: String = js.native
  /** JSON string */
  var ViewSelectorPivotMenuOptions: String = js.native
  /** Query string parameters that specify current root folder (RootFolder) and folder content type id (FolderCTID) */
  var ViewSelector_ViewParameters: String = js.native
  /** Internal name for the first group by field, if any */
  var group1: String = js.native
  /** Internal name for the second group by field, if any */
  var group2: String = js.native
}

object ListSchemaInView {
  @scala.inline
  def apply(
    Aggregate: StringDictionary[String],
    Collapse: String,
    DefaultItemOpen: String,
    Direction: String,
    EffectivePresenceEnabled: String,
    Field: js.Array[FieldSchema],
    FieldSortParam: String,
    Filter: js.Any,
    ForceCheckout: String,
    HasTitle: String,
    HttpVDir: String,
    InplaceSearchEnabled: String,
    IsDocLib: String,
    LCID: String,
    ListRight_AddListItems: String,
    NoListItem: String,
    NoListItemHowTo: String,
    PagePath: String,
    ParentHierarchyDisplayField: String,
    PresenceAlt: String,
    PropertyBag: StringDictionary[String],
    RenderSaveAsNewViewButton: String,
    RenderViewSelectorPivotMenu: String,
    RenderViewSelectorPivotMenuAsync: String,
    RootFolderParam: String,
    SelectedID: String,
    ShowWebPart: String,
    StrikeThroughOnCompletedEnabled: String,
    TabularView: String,
    Toolbar: String,
    UIVersion: String,
    UseParentHierarchy: String,
    UserDispUrl: String,
    UserVanilla: js.Any,
    Userid: String,
    View: String,
    ViewSelectorPivotMenuOptions: String,
    ViewSelector_ViewParameters: String,
    group1: String,
    group2: String
  ): ListSchemaInView = {
    val __obj = js.Dynamic.literal(Aggregate = Aggregate.asInstanceOf[js.Any], Collapse = Collapse.asInstanceOf[js.Any], DefaultItemOpen = DefaultItemOpen.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], EffectivePresenceEnabled = EffectivePresenceEnabled.asInstanceOf[js.Any], Field = Field.asInstanceOf[js.Any], FieldSortParam = FieldSortParam.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], ForceCheckout = ForceCheckout.asInstanceOf[js.Any], HasTitle = HasTitle.asInstanceOf[js.Any], HttpVDir = HttpVDir.asInstanceOf[js.Any], InplaceSearchEnabled = InplaceSearchEnabled.asInstanceOf[js.Any], IsDocLib = IsDocLib.asInstanceOf[js.Any], LCID = LCID.asInstanceOf[js.Any], ListRight_AddListItems = ListRight_AddListItems.asInstanceOf[js.Any], NoListItem = NoListItem.asInstanceOf[js.Any], NoListItemHowTo = NoListItemHowTo.asInstanceOf[js.Any], PagePath = PagePath.asInstanceOf[js.Any], ParentHierarchyDisplayField = ParentHierarchyDisplayField.asInstanceOf[js.Any], PresenceAlt = PresenceAlt.asInstanceOf[js.Any], PropertyBag = PropertyBag.asInstanceOf[js.Any], RenderSaveAsNewViewButton = RenderSaveAsNewViewButton.asInstanceOf[js.Any], RenderViewSelectorPivotMenu = RenderViewSelectorPivotMenu.asInstanceOf[js.Any], RenderViewSelectorPivotMenuAsync = RenderViewSelectorPivotMenuAsync.asInstanceOf[js.Any], RootFolderParam = RootFolderParam.asInstanceOf[js.Any], SelectedID = SelectedID.asInstanceOf[js.Any], ShowWebPart = ShowWebPart.asInstanceOf[js.Any], StrikeThroughOnCompletedEnabled = StrikeThroughOnCompletedEnabled.asInstanceOf[js.Any], TabularView = TabularView.asInstanceOf[js.Any], Toolbar = Toolbar.asInstanceOf[js.Any], UIVersion = UIVersion.asInstanceOf[js.Any], UseParentHierarchy = UseParentHierarchy.asInstanceOf[js.Any], UserDispUrl = UserDispUrl.asInstanceOf[js.Any], UserVanilla = UserVanilla.asInstanceOf[js.Any], Userid = Userid.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], ViewSelectorPivotMenuOptions = ViewSelectorPivotMenuOptions.asInstanceOf[js.Any], ViewSelector_ViewParameters = ViewSelector_ViewParameters.asInstanceOf[js.Any], group1 = group1.asInstanceOf[js.Any], group2 = group2.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemaInView]
  }
  @scala.inline
  implicit class ListSchemaInViewOps[Self <: ListSchemaInView] (val x: Self) extends AnyVal {
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
    def setAggregate(value: StringDictionary[String]): Self = this.set("Aggregate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollapse(value: String): Self = this.set("Collapse", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultItemOpen(value: String): Self = this.set("DefaultItemOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: String): Self = this.set("Direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffectivePresenceEnabled(value: String): Self = this.set("EffectivePresenceEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldSortParam(value: String): Self = this.set("FieldSortParam", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: js.Any): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceCheckout(value: String): Self = this.set("ForceCheckout", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasTitle(value: String): Self = this.set("HasTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpVDir(value: String): Self = this.set("HttpVDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setInplaceSearchEnabled(value: String): Self = this.set("InplaceSearchEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDocLib(value: String): Self = this.set("IsDocLib", value.asInstanceOf[js.Any])
    @scala.inline
    def setLCID(value: String): Self = this.set("LCID", value.asInstanceOf[js.Any])
    @scala.inline
    def setListRight_AddListItems(value: String): Self = this.set("ListRight_AddListItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoListItem(value: String): Self = this.set("NoListItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoListItemHowTo(value: String): Self = this.set("NoListItemHowTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagePath(value: String): Self = this.set("PagePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentHierarchyDisplayField(value: String): Self = this.set("ParentHierarchyDisplayField", value.asInstanceOf[js.Any])
    @scala.inline
    def setPresenceAlt(value: String): Self = this.set("PresenceAlt", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyBag(value: StringDictionary[String]): Self = this.set("PropertyBag", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderSaveAsNewViewButton(value: String): Self = this.set("RenderSaveAsNewViewButton", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderViewSelectorPivotMenu(value: String): Self = this.set("RenderViewSelectorPivotMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderViewSelectorPivotMenuAsync(value: String): Self = this.set("RenderViewSelectorPivotMenuAsync", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootFolderParam(value: String): Self = this.set("RootFolderParam", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedID(value: String): Self = this.set("SelectedID", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowWebPart(value: String): Self = this.set("ShowWebPart", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrikeThroughOnCompletedEnabled(value: String): Self = this.set("StrikeThroughOnCompletedEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabularView(value: String): Self = this.set("TabularView", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolbar(value: String): Self = this.set("Toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setUIVersion(value: String): Self = this.set("UIVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseParentHierarchy(value: String): Self = this.set("UseParentHierarchy", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserDispUrl(value: String): Self = this.set("UserDispUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserVanilla(value: js.Any): Self = this.set("UserVanilla", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserid(value: String): Self = this.set("Userid", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: String): Self = this.set("View", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewSelectorPivotMenuOptions(value: String): Self = this.set("ViewSelectorPivotMenuOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewSelector_ViewParameters(value: String): Self = this.set("ViewSelector_ViewParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroup1(value: String): Self = this.set("group1", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroup2(value: String): Self = this.set("group2", value.asInstanceOf[js.Any])
  }
  
}

