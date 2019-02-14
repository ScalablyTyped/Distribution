package typings
package reactDashWindowLib.reactDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-window", "VariableSizeList")
@js.native
class VariableSizeList ()
  extends reactLib.reactMod.Component[VariableSizeListProps, js.Object, js.Any] {
  /**
    * VariableSizeList caches offsets and measurements for each index for performance purposes.
    * This method clears that cached data for all items after (and including) the specified index.
    * It should be called whenever a item's size changes. (Note that this is not a typical occurrence.)
    *
    * By default the list will automatically re-render after the index is reset.
    * If you would like to delay this re-render until e.g. a state update has completed in the parent component,
    * specify a value of false for the second, optional parameter.
    */
  def resetAfterIndex(index: scala.Double, shouldForceUpdate: scala.Boolean): scala.Unit = js.native
  /**
    * Scroll to the specified offset (scrollTop or scrollLeft, depending on the direction prop).
    */
  def scrollTo(scrollOffset: scala.Double): scala.Unit = js.native
  /**
    * Scroll to the specified item.
    *
    * By default, the List will scroll as little as possible to ensure the item is visible.
    * You can control the alignment of the item though by specifying a second alignment parameter. Acceptable values are:
    *
    * - auto (default) - Scroll as little as possible to ensure the item is visible. (If the item is already visible, it won't scroll at all.)
    * - center - Center align the item within the list.
    * - end - Align the item to the end of the list (the bottom for vertical lists or the right for horizontal lists).
    * - start - Align the item to the beginning of the list (the top for vertical lists or the left for horizontal lists).
    */
  def scrollToItem(index: scala.Double): scala.Unit = js.native
  def scrollToItem(index: scala.Double, align: Align): scala.Unit = js.native
}

