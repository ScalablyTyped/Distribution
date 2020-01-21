package typings.reactWindow.mod

import typings.react.mod.Component
import typings.reactWindow.AnonAlign
import typings.reactWindow.AnonScrollLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-window", "FixedSizeGrid")
@js.native
class FixedSizeGrid ()
  extends Component[FixedSizeGridProps, js.Object, js.Any] {
  /**
    * Scroll to the specified offsets.
    */
  def scrollTo(params: AnonScrollLeft): Unit = js.native
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
  def scrollToItem(params: AnonAlign): Unit = js.native
}

