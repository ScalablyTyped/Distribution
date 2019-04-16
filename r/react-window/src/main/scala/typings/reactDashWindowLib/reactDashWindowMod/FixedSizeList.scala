package typings
package reactDashWindowLib.reactDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-window", "FixedSizeList")
@js.native
class FixedSizeList ()
  extends reactLib.reactMod.Component[FixedSizeListProps, js.Object, js.Any] {
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
    * - smart
    *   - If the item is already visible, don't scroll at all.
    *   - If it is less than one viewport away, scroll as little as possible so that it becomes visible.
    *   - If it is more than one viewport away, scroll so that it is centered within the list.
    * - center - Center align the item within the list.
    * - end - Align the item to the end of the list (the bottom for vertical lists or the right for horizontal lists).
    * - start - Align the item to the beginning of the list (the top for vertical lists or the left for horizontal lists).
    */
  def scrollToItem(index: scala.Double): scala.Unit = js.native
  def scrollToItem(index: scala.Double, align: Align): scala.Unit = js.native
}

