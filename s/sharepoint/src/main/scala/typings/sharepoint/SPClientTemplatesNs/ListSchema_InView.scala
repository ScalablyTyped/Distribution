package typings.sharepoint.SPClientTemplatesNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSchema_InView extends ListSchema {
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

object ListSchema_InView {
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
  ): ListSchema_InView = {
    val __obj = js.Dynamic.literal(Aggregate = Aggregate, Collapse = Collapse, DefaultItemOpen = DefaultItemOpen, Direction = Direction, EffectivePresenceEnabled = EffectivePresenceEnabled, Field = Field, FieldSortParam = FieldSortParam, Filter = Filter, ForceCheckout = ForceCheckout, HasTitle = HasTitle, HttpVDir = HttpVDir, InplaceSearchEnabled = InplaceSearchEnabled, IsDocLib = IsDocLib, LCID = LCID, ListRight_AddListItems = ListRight_AddListItems, NoListItem = NoListItem, NoListItemHowTo = NoListItemHowTo, PagePath = PagePath, ParentHierarchyDisplayField = ParentHierarchyDisplayField, PresenceAlt = PresenceAlt, PropertyBag = PropertyBag, RenderSaveAsNewViewButton = RenderSaveAsNewViewButton, RenderViewSelectorPivotMenu = RenderViewSelectorPivotMenu, RenderViewSelectorPivotMenuAsync = RenderViewSelectorPivotMenuAsync, RootFolderParam = RootFolderParam, SelectedID = SelectedID, ShowWebPart = ShowWebPart, StrikeThroughOnCompletedEnabled = StrikeThroughOnCompletedEnabled, TabularView = TabularView, Toolbar = Toolbar, UIVersion = UIVersion, UseParentHierarchy = UseParentHierarchy, UserDispUrl = UserDispUrl, UserVanilla = UserVanilla, Userid = Userid, View = View, ViewSelectorPivotMenuOptions = ViewSelectorPivotMenuOptions, ViewSelector_ViewParameters = ViewSelector_ViewParameters, group1 = group1, group2 = group2)
  
    __obj.asInstanceOf[ListSchema_InView]
  }
}

