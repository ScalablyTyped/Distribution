package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListData_InView extends js.Object {
  var FilterFields: java.lang.String
  var FilterLink: java.lang.String
  var FirstRow: scala.Double
  /** Either "0" or "1" */
  var ForceNoHierarchy: java.lang.String
  var HierarchyHasIndention: java.lang.String
  var LastRow: scala.Double
  /** Link to the next page  (not defined if not available) */
  var NextHref: java.lang.String
  /** Link to the previous page (not defined if not available) */
  var PrevHref: java.lang.String
  var Row: js.Array[Item]
  var SortDir: java.lang.String
  var SortField: java.lang.String
}

object ListData_InView {
  @scala.inline
  def apply(
    FilterFields: java.lang.String,
    FilterLink: java.lang.String,
    FirstRow: scala.Double,
    ForceNoHierarchy: java.lang.String,
    HierarchyHasIndention: java.lang.String,
    LastRow: scala.Double,
    NextHref: java.lang.String,
    PrevHref: java.lang.String,
    Row: js.Array[Item],
    SortDir: java.lang.String,
    SortField: java.lang.String
  ): ListData_InView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FilterFields")(FilterFields)
    __obj.updateDynamic("FilterLink")(FilterLink)
    __obj.updateDynamic("FirstRow")(FirstRow)
    __obj.updateDynamic("ForceNoHierarchy")(ForceNoHierarchy)
    __obj.updateDynamic("HierarchyHasIndention")(HierarchyHasIndention)
    __obj.updateDynamic("LastRow")(LastRow)
    __obj.updateDynamic("NextHref")(NextHref)
    __obj.updateDynamic("PrevHref")(PrevHref)
    __obj.updateDynamic("Row")(Row)
    __obj.updateDynamic("SortDir")(SortDir)
    __obj.updateDynamic("SortField")(SortField)
    __obj.asInstanceOf[ListData_InView]
  }
}

