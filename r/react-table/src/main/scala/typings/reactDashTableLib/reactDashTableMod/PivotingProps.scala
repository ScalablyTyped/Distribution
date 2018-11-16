package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotingProps extends js.Object {
  /** Default: _aggregated */
  var aggregatedKey: java.lang.String = js.native
  /**
       * Default: {} - Pivoting State Overrides (see Fully Controlled Component section)
       * @example { 4: true }
       * @example { 5: { 9: true }, 10: true }
       */
  var expandedRows: ExpandedRows = js.native
  /** Default: _groupedByPivot */
  var groupedByPivotKey: java.lang.String = js.native
  /** Default: _index */
  var indexKey: java.lang.String = js.native
  /** Default: _nestingLevel */
  var nestingLevelKey: java.lang.String = js.native
  /** Default: ??? - Pivoting State Callbacks */
  @JSName("onExpandRow")
  var onExpandRow_Original: ReactTableFunction = js.native
  /** Default: _original */
  var originalKey: java.lang.String = js.native
  /** Default: undefined */
  var pivotBy: js.Array[java.lang.String] = js.native
  /** Default: 200 */
  var pivotColumnWidth: scala.Double = js.native
  /** Default: _pivotID */
  var pivotIDKey: java.lang.String = js.native
  /** Default: _pivotVal */
  var pivotValKey: java.lang.String = js.native
  /** Default: _subRows */
  var subRowsKey: java.lang.String = js.native
  /** Default: ??? - Pivoting State Callbacks */
  def onExpandRow(): scala.Unit = js.native
  /** Default: ??? - Pivoting State Callbacks */
  def onExpandRow(value: js.Any): scala.Unit = js.native
}

