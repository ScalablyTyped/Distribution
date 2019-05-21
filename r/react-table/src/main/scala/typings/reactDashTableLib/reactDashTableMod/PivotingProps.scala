package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotingProps extends js.Object {
  /** Default: _aggregated */
  var aggregatedKey: java.lang.String
  /**
    * Default: {} - Pivoting State Overrides (see Fully Controlled Component section)
    * @example { 4: true }
    * @example { 5: { 9: true }, 10: true }
    */
  var expandedRows: ExpandedRows
  /** Default: _groupedByPivot */
  var groupedByPivotKey: java.lang.String
  /** Default: _index */
  var indexKey: java.lang.String
  /** Default: _nestingLevel */
  var nestingLevelKey: java.lang.String
  /** Default: ??? - Pivoting State Callbacks */
  var onExpandRow: ReactTableFunction
  /** Default: _original */
  var originalKey: java.lang.String
  /** Default: undefined */
  var pivotBy: js.Array[java.lang.String]
  /** Default: 200 */
  var pivotColumnWidth: scala.Double
  /** Default: _pivotID */
  var pivotIDKey: java.lang.String
  /** Default: _pivotVal */
  var pivotValKey: java.lang.String
  /** Default: _subRows */
  var subRowsKey: java.lang.String
}

object PivotingProps {
  @scala.inline
  def apply(
    aggregatedKey: java.lang.String,
    expandedRows: ExpandedRows,
    groupedByPivotKey: java.lang.String,
    indexKey: java.lang.String,
    nestingLevelKey: java.lang.String,
    onExpandRow: ReactTableFunction,
    originalKey: java.lang.String,
    pivotBy: js.Array[java.lang.String],
    pivotColumnWidth: scala.Double,
    pivotIDKey: java.lang.String,
    pivotValKey: java.lang.String,
    subRowsKey: java.lang.String
  ): PivotingProps = {
    val __obj = js.Dynamic.literal(aggregatedKey = aggregatedKey, expandedRows = expandedRows, groupedByPivotKey = groupedByPivotKey, indexKey = indexKey, nestingLevelKey = nestingLevelKey, onExpandRow = onExpandRow, originalKey = originalKey, pivotBy = pivotBy, pivotColumnWidth = pivotColumnWidth, pivotIDKey = pivotIDKey, pivotValKey = pivotValKey, subRowsKey = subRowsKey)
  
    __obj.asInstanceOf[PivotingProps]
  }
}

