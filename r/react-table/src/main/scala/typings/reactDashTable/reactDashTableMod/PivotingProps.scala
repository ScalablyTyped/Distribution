package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotingProps extends js.Object {
  /** Default: _aggregated */
  var aggregatedKey: String
  /**
    * Default: {} - Pivoting State Overrides (see Fully Controlled Component section)
    * @example { 4: true }
    * @example { 5: { 9: true }, 10: true }
    */
  var expandedRows: ExpandedRows
  /** Default: _groupedByPivot */
  var groupedByPivotKey: String
  /** Default: _index */
  var indexKey: String
  /** Default: _nestingLevel */
  var nestingLevelKey: String
  /** Default: ??? - Pivoting State Callbacks */
  var onExpandRow: ReactTableFunction
  /** Default: _original */
  var originalKey: String
  /** Default: undefined */
  var pivotBy: js.Array[String]
  /** Default: 200 */
  var pivotColumnWidth: Double
  /** Default: _pivotID */
  var pivotIDKey: String
  /** Default: _pivotVal */
  var pivotValKey: String
  /** Default: _subRows */
  var subRowsKey: String
}

object PivotingProps {
  @scala.inline
  def apply(
    aggregatedKey: String,
    expandedRows: ExpandedRows,
    groupedByPivotKey: String,
    indexKey: String,
    nestingLevelKey: String,
    onExpandRow: /* value */ js.UndefOr[js.Any] => Unit,
    originalKey: String,
    pivotBy: js.Array[String],
    pivotColumnWidth: Double,
    pivotIDKey: String,
    pivotValKey: String,
    subRowsKey: String
  ): PivotingProps = {
    val __obj = js.Dynamic.literal(aggregatedKey = aggregatedKey.asInstanceOf[js.Any], expandedRows = expandedRows.asInstanceOf[js.Any], groupedByPivotKey = groupedByPivotKey.asInstanceOf[js.Any], indexKey = indexKey.asInstanceOf[js.Any], nestingLevelKey = nestingLevelKey.asInstanceOf[js.Any], onExpandRow = js.Any.fromFunction1(onExpandRow), originalKey = originalKey.asInstanceOf[js.Any], pivotBy = pivotBy.asInstanceOf[js.Any], pivotColumnWidth = pivotColumnWidth.asInstanceOf[js.Any], pivotIDKey = pivotIDKey.asInstanceOf[js.Any], pivotValKey = pivotValKey.asInstanceOf[js.Any], subRowsKey = subRowsKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PivotingProps]
  }
}

