package typings.reactWindow.mod

import typings.react.mod.Component
import typings.reactWindow.anon.RowIndex
import typings.reactWindow.anon.ScrollLeft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-window", "VariableSizeGrid")
@js.native
class VariableSizeGrid protected ()
  extends Component[VariableSizeGridProps, js.Object, js.Any] {
  def this(props: VariableSizeGridProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: VariableSizeGridProps, context: js.Any) = this()
  
  /**
    * VariableSizeGrid caches offsets and measurements for each column index for performance purposes.
    * This method clears that cached data for all columns after (and including) the specified index.
    * It should be called whenever a column's width changes. (Note that this is not a typical occurrence.)
    *
    * By default the grid will automatically re-render after the index is reset.
    * If you would like to delay this re-render until e.g. a state update has completed in the parent component,
    * specify a value of false for the second, optional parameter.
    */
  def resetAfterColumnIndex(index: Double): Unit = js.native
  def resetAfterColumnIndex(index: Double, shouldForceUpdate: Boolean): Unit = js.native
  
  /**
    * VariableSizeGrid caches offsets and measurements for each item for performance purposes.
    * This method clears that cached data for all items after (and including) the specified indices.
    * It should be called whenever an items size changes. (Note that this is not a typical occurrence.)
    *
    * By default the grid will automatically re-render after the index is reset.
    * If you would like to delay this re-render until e.g. a state update has completed in the parent component,
    * specify a value of false for the optional shouldForceUpdate parameter.
    */
  def resetAfterIndices(params: RowIndex): Unit = js.native
  
  /**
    * VariableSizeGrid caches offsets and measurements for each row index for performance purposes.
    * This method clears that cached data for all rows after (and including) the specified index.
    * It should be called whenever a row's height changes. (Note that this is not a typical occurrence.)
    *
    * By default the grid will automatically re-render after the index is reset.
    * If you would like to delay this re-render until e.g. a state update has completed in the parent component,
    * specify a value of false for the second, optional parameter.
    */
  def resetAfterRowIndex(index: Double): Unit = js.native
  def resetAfterRowIndex(index: Double, shouldForceUpdate: Boolean): Unit = js.native
  
  /**
    * Scroll to the specified offsets.
    */
  def scrollTo(params: ScrollLeft): Unit = js.native
  
  /**
    * Scroll to the specified item.
    *
    * By default, the Grid will scroll as little as possible to ensure the item is visible.
    * You can control the alignment of the item though by specifying an `align` property. Acceptable values are:
    *
    * - auto (default) - Scroll as little as possible to ensure the item is visible. (If the item is already visible, it won't scroll at all.)
    * - smart
    *   - If the item is already visible, don't scroll at all.
    *   - If it is less than one viewport away, scroll as little as possible so that it becomes visible.
    *   - If it is more than one viewport away, scroll so that it is centered within the grid.
    * - center - Center align the item within the grid.
    * - end - Align the item to the bottom, right hand side of the grid.
    * - start - Align the item to the top, left hand of the grid.
    *
    * If either `columnIndex` or `rowIndex` are omitted, `scrollLeft` or `scrollTop` will be unchanged (respectively).
    */
  def scrollToItem(params: typings.reactWindow.anon.Align): Unit = js.native
}
