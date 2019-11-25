package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowInfo extends js.Object {
  /** A boolean stating if the row is an aggregation row */
  var aggregated: Boolean
  /** A boolean stating if the row is grouped by Pivot */
  var groupedByPivot: Boolean
  /** The index of the row */
  var index: Double
  /** The nesting depth (zero-indexed) */
  var level: Double
  /** The nesting path of the row */
  var nestingPath: js.Array[Double]
  /** Original object passed to row */
  var original: js.Any
  /** The index of page */
  var page: Double
  /** The size of the page */
  var pageSize: Double
  /** Materialized row of data */
  var row: js.Any
  /** The post-accessed values from the original row */
  var rowValues: js.Any
  /** An array of any expandable sub-rows contained in this row */
  var subRows: js.Array[_]
  /** The index of the row relative to the current page */
  var viewIndex: Double
}

object RowInfo {
  @scala.inline
  def apply(
    aggregated: Boolean,
    groupedByPivot: Boolean,
    index: Double,
    level: Double,
    nestingPath: js.Array[Double],
    original: js.Any,
    page: Double,
    pageSize: Double,
    row: js.Any,
    rowValues: js.Any,
    subRows: js.Array[_],
    viewIndex: Double
  ): RowInfo = {
    val __obj = js.Dynamic.literal(aggregated = aggregated.asInstanceOf[js.Any], groupedByPivot = groupedByPivot.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], nestingPath = nestingPath.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowValues = rowValues.asInstanceOf[js.Any], subRows = subRows.asInstanceOf[js.Any], viewIndex = viewIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RowInfo]
  }
}

