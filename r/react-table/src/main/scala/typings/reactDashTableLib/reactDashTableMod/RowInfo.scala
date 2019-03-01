package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowInfo extends js.Object {
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
  var original: js.Any
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
  def apply(
    aggregated: scala.Boolean,
    groupedByPivot: scala.Boolean,
    index: scala.Double,
    level: scala.Double,
    nestingPath: js.Array[scala.Double],
    original: js.Any,
    page: scala.Double,
    pageSize: scala.Double,
    row: js.Any,
    rowValues: js.Any,
    subRows: js.Array[_],
    viewIndex: scala.Double
  ): RowInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregated")(aggregated)
    __obj.updateDynamic("groupedByPivot")(groupedByPivot)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("nestingPath")(nestingPath)
    __obj.updateDynamic("original")(original)
    __obj.updateDynamic("page")(page)
    __obj.updateDynamic("pageSize")(pageSize)
    __obj.updateDynamic("row")(row)
    __obj.updateDynamic("rowValues")(rowValues)
    __obj.updateDynamic("subRows")(subRows)
    __obj.updateDynamic("viewIndex")(viewIndex)
    __obj.asInstanceOf[RowInfo]
  }
}

