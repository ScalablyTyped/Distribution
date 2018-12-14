package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListSchema_InView extends ListSchema {
  /** Key-value object that represents all aggregations defined for the view.
              Key specifies the field internal name, and value specifies the type of the aggregation. */
  var Aggregate: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /** Either "TRUE" or false (for grouping) */
  var Collapse: java.lang.String
  /** Specifies whether to open items in a client application ("1") or in browser ("0"). */
  var DefaultItemOpen: java.lang.String
  var Direction: java.lang.String
  /** Either "0" or "1" */
  var EffectivePresenceEnabled: java.lang.String
  /** If in grid mode (context.inGridMode == true), cast to FieldSchema_InForm[], otherwise cast to FieldSchema_InView[] */
  var FieldSortParam: java.lang.String
  var Filter: js.Any
  /** Either "0" or "1" */
  var ForceCheckout: java.lang.String
  /** "1" if the view contains "Title" field, otherwise not defined. */
  var HasTitle: java.lang.String
  var HttpVDir: java.lang.String
  /** Either "0" or "1" */
  var InplaceSearchEnabled: java.lang.String
  /** Either "0" or "1" */
  var IsDocLib: java.lang.String
  /** e.g. "1033" */
  var LCID: java.lang.String
  /** Either "0" or "1" */
  var ListRight_AddListItems: java.lang.String
  var NoListItem: java.lang.String
  var NoListItemHowTo: java.lang.String
  /** Server-relative path to the current page */
  var PagePath: java.lang.String
  /** Internal name of the field inside which the hierarchy buttons are displayed */
  var ParentHierarchyDisplayField: java.lang.String
  var PresenceAlt: java.lang.String
  /** Represents SPList.RootFolder.Properties. Exists only if SPList.FetchPropertyBagForListView property is set to true. */
  var PropertyBag: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /** Either "True" or "False" */
  var RenderSaveAsNewViewButton: java.lang.String
  /** Either "True" or "False" */
  var RenderViewSelectorPivotMenu: java.lang.String
  /** Either "True" or "False" */
  var RenderViewSelectorPivotMenuAsync: java.lang.String
  /** Query string parameters that specify GUID of the current view and the current root folder */
  var RootFolderParam: java.lang.String
  var SelectedID: java.lang.String
   // number
  var ShowWebPart: java.lang.String
  /** Either "1" or undefined. */
  var StrikeThroughOnCompletedEnabled: java.lang.String
  /** Either "0" or "1" */
  var TabularView: java.lang.String
  var Toolbar: java.lang.String
  var UIVersion: java.lang.String
  /** Either "1" or "" */
  var UseParentHierarchy: java.lang.String
  /** Server relative path to "/_layouts/userdisp.aspx" in the current web */
  var UserDispUrl: java.lang.String
   // number
  var UserVanilla: js.Any
   // number
  var Userid: java.lang.String
  /** Guid of the view */
  var View: java.lang.String
  /** JSON string */
  var ViewSelectorPivotMenuOptions: java.lang.String
  /** Query string parameters that specify current root folder (RootFolder) and folder content type id (FolderCTID) */
  var ViewSelector_ViewParameters: java.lang.String
  /** Internal name for the first group by field, if any */
  var group1: java.lang.String
  /** Internal name for the second group by field, if any */
  var group2: java.lang.String
}

