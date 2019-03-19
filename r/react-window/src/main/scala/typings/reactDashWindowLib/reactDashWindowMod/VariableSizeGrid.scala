package typings
package reactDashWindowLib.reactDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-window", "VariableSizeGrid")
@js.native
class VariableSizeGrid ()
  extends reactLib.reactMod.Component[VariableSizeGridProps, js.Object, js.Any] {
  /**
    * VariableSizeGrid caches offsets and measurements for each column index for performance purposes.
    * This method clears that cached data for all columns after (and including) the specified index.
    * It should be called whenever a column's width changes. (Note that this is not a typical occurrence.)
    *
    * By default the grid will automatically re-render after the index is reset.
    * If you would like to delay this re-render until e.g. a state update has completed in the parent component,
    * specify a value of false for the second, optional parameter.
    */
  def resetAfterColumnIndex(index: scala.Double): scala.Unit = js.native
  def resetAfterColumnIndex(index: scala.Double, shouldForceUpdate: scala.Boolean): scala.Unit = js.native
  /**
    * VariableSizeGrid caches offsets and measurements for each item for performance purposes.
    * This method clears that cached data for all items after (and including) the specified indices.
    * It should be called whenever an items size changes. (Note that this is not a typical occurrence.)
    *
    * By default the grid will automatically re-render after the index is reset.
    * If you would like to delay this re-render until e.g. a state update has completed in the parent component,
    * specify a value of false for the optional shouldForceUpdate parameter.
    */
  def resetAfterIndices(params: reactDashWindowLib.Anon_ColumnIndexRowIndex): scala.Unit = js.native
  /**
    * VariableSizeGrid caches offsets and measurements for each row index for performance purposes.
    * This method clears that cached data for all rows after (and including) the specified index.
    * It should be called whenever a row's height changes. (Note that this is not a typical occurrence.)
    *
    * By default the grid will automatically re-render after the index is reset.
    * If you would like to delay this re-render until e.g. a state update has completed in the parent component,
    * specify a value of false for the second, optional parameter.
    */
  def resetAfterRowIndex(index: scala.Double): scala.Unit = js.native
  def resetAfterRowIndex(index: scala.Double, shouldForceUpdate: scala.Boolean): scala.Unit = js.native
  /**
    * Scroll to the specified offsets.
    */
  def scrollTo(params: reactDashWindowLib.Anon_ScrollLeft): scala.Unit = js.native
  /**
    * Scroll to the specified item.
    *
    * By default, the Grid will scroll as little as possible to ensure the item is visible.
    * You can control the alignment of the item though by specifying an `align` property. Acceptable values are:
    *
    * - auto (default) - Scroll as little as possible to ensure the item is visible. (If the item is already visible, it won't scroll at all.)
    * - center - Center align the item within the grid.
    * - end - Align the item to the bottom, right hand side of the grid.
    * - start - Align the item to the top, left hand of the grid.
    *
    * If either `columnIndex` or `rowIndex` are omitted, `scrollLeft` or `scrollTop` will be unchanged (respectively).
    */
  def scrollToItem(params: reactDashWindowLib.Anon_Align): scala.Unit = js.native
}

