package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinalState[D] extends TableProps[D] {
  var allDecoratedColumns: js.Array[Column[D]] = js.native
  var allVisibleColumns: js.Array[Column[D]] = js.native
  var canNext: scala.Boolean = js.native
  var canPrevious: scala.Boolean = js.native
  var endRow: scala.Double = js.native
  var frozen: scala.Boolean = js.native
  var hasColumnFooter: scala.Boolean = js.native
  var hasHeaderGroups: scala.Boolean = js.native
  var headerGroups: js.Array[_] = js.native
  var padRows: scala.Double = js.native
  var pageRows: scala.Double = js.native
  var resolvedData: js.Array[DerivedDataObject] = js.native
  var rowMinWidth: scala.Double = js.native
  var sortedData: js.Array[DerivedDataObject] = js.native
  var startRow: scala.Double = js.native
}

