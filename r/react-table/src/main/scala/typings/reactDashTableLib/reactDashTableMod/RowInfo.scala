package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowInfo[D] extends js.Object {
  /** A boolean stating if the row is an aggregation row */
  var aggregated: scala.Boolean
  /** A boolean stating if the row is grouped by Pivot */
  var groupedByPivot: scala.Boolean
  /** The index of the row */
  var index: scala.Double
  /** The nesting depth (zero-indexed) */
  var level: scala.Double
  /** The nesting path of the row */
  var nestingPath: js.Array[scala.Double]
  /** Original object passed to row */
  var original: D
  /** The index of page */
  var page: scala.Double
  /** The size of the page */
  var pageSize: scala.Double
  /** Materialized row of data */
  var row: js.Any
  /** The post-accessed values from the original row */
  var rowValues: js.Any
  /** An array of any expandable sub-rows contained in this row */
  var subRows: js.Array[_]
  /** The index of the row relative to the current page */
  var viewIndex: scala.Double
}

object RowInfo {
  @scala.inline
  def apply[D](
    aggregated: scala.Boolean,
    groupedByPivot: scala.Boolean,
    index: scala.Double,
    level: scala.Double,
    nestingPath: js.Array[scala.Double],
    original: D,
    page: scala.Double,
    pageSize: scala.Double,
    row: js.Any,
    rowValues: js.Any,
    subRows: js.Array[_],
    viewIndex: scala.Double
  ): RowInfo[D] = {
    val __obj = js.Dynamic.literal(aggregated = aggregated, groupedByPivot = groupedByPivot, index = index, level = level, nestingPath = nestingPath, original = original.asInstanceOf[js.Any], page = page, pageSize = pageSize, row = row, rowValues = rowValues, subRows = subRows, viewIndex = viewIndex)
  
    __obj.asInstanceOf[RowInfo[D]]
  }
}

