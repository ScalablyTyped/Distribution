package typings.sharepoint.SPClientTemplatesNs

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
    val __obj = js.Dynamic.literal(FilterFields = FilterFields, FilterLink = FilterLink, FirstRow = FirstRow, ForceNoHierarchy = ForceNoHierarchy, HierarchyHasIndention = HierarchyHasIndention, LastRow = LastRow, NextHref = NextHref, PrevHref = PrevHref, Row = Row, SortDir = SortDir, SortField = SortField)
  
    __obj.asInstanceOf[ListData_InView]
  }
}

