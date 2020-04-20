package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSchemaInView extends ListSchema {
  /** Key-value object that represents all aggregations defined for the view.
    Key specifies the field internal name, and value specifies the type of the aggregation. */
  var Aggregate: StringDictionary[String]
  /** Either "TRUE" or false (for grouping) */
  var Collapse: String
  /** Specifies whether to open items in a client application ("1") or in browser ("0"). */
  var DefaultItemOpen: String
  var Direction: String
  /** Either "0" or "1" */
  var EffectivePresenceEnabled: String
  /** If in grid mode (context.inGridMode == true), cast to FieldSchema_InForm[], otherwise cast to FieldSchema_InView[] */
  var FieldSortParam: String
  var Filter: js.Any
  /** Either "0" or "1" */
  var ForceCheckout: String
  /** "1" if the view contains "Title" field, otherwise not defined. */
  var HasTitle: String
  var HttpVDir: String
  /** Either "0" or "1" */
  var InplaceSearchEnabled: String
  /** Either "0" or "1" */
  var IsDocLib: String
  /** e.g. "1033" */
  var LCID: String
  /** Either "0" or "1" */
  var ListRight_AddListItems: String
  var NoListItem: String
  var NoListItemHowTo: String
  /** Server-relative path to the current page */
  var PagePath: String
  /** Internal name of the field inside which the hierarchy buttons are displayed */
  var ParentHierarchyDisplayField: String
  var PresenceAlt: String
  /** Represents SPList.RootFolder.Properties. Exists only if SPList.FetchPropertyBagForListView property is set to true. */
  var PropertyBag: StringDictionary[String]
  /** Either "True" or "False" */
  var RenderSaveAsNewViewButton: String
  /** Either "True" or "False" */
  var RenderViewSelectorPivotMenu: String
  /** Either "True" or "False" */
  var RenderViewSelectorPivotMenuAsync: String
  /** Query string parameters that specify GUID of the current view and the current root folder */
  var RootFolderParam: String
  var SelectedID: String
   // number
  var ShowWebPart: String
  /** Either "1" or undefined. */
  var StrikeThroughOnCompletedEnabled: String
  /** Either "0" or "1" */
  var TabularView: String
  var Toolbar: String
  var UIVersion: String
  /** Either "1" or "" */
  var UseParentHierarchy: String
  /** Server relative path to "/_layouts/userdisp.aspx" in the current web */
  var UserDispUrl: String
   // number
  var UserVanilla: js.Any
   // number
  var Userid: String
  /** Guid of the view */
  var View: String
  /** JSON string */
  var ViewSelectorPivotMenuOptions: String
  /** Query string parameters that specify current root folder (RootFolder) and folder content type id (FolderCTID) */
  var ViewSelector_ViewParameters: String
  /** Internal name for the first group by field, if any */
  var group1: String
  /** Internal name for the second group by field, if any */
  var group2: String
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
}

