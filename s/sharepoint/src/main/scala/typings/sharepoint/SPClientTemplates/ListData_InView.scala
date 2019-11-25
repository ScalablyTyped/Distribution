package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListData_InView extends js.Object {
  var FilterFields: String
  var FilterLink: String
  var FirstRow: Double
  /** Either "0" or "1" */
  var ForceNoHierarchy: String
  var HierarchyHasIndention: String
  var LastRow: Double
  /** Link to the next page  (not defined if not available) */
  var NextHref: String
  /** Link to the previous page (not defined if not available) */
  var PrevHref: String
  var Row: js.Array[Item]
  var SortDir: String
  var SortField: String
}

object ListData_InView {
  @scala.inline
  def apply(
    FilterFields: String,
    FilterLink: String,
    FirstRow: Double,
    ForceNoHierarchy: String,
    HierarchyHasIndention: String,
    LastRow: Double,
    NextHref: String,
    PrevHref: String,
    Row: js.Array[Item],
    SortDir: String,
    SortField: String
  ): ListData_InView = {
    val __obj = js.Dynamic.literal(FilterFields = FilterFields.asInstanceOf[js.Any], FilterLink = FilterLink.asInstanceOf[js.Any], FirstRow = FirstRow.asInstanceOf[js.Any], ForceNoHierarchy = ForceNoHierarchy.asInstanceOf[js.Any], HierarchyHasIndention = HierarchyHasIndention.asInstanceOf[js.Any], LastRow = LastRow.asInstanceOf[js.Any], NextHref = NextHref.asInstanceOf[js.Any], PrevHref = PrevHref.asInstanceOf[js.Any], Row = Row.asInstanceOf[js.Any], SortDir = SortDir.asInstanceOf[js.Any], SortField = SortField.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListData_InView]
  }
}

