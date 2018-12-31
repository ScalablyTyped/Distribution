package typings
package reactDashWindowLib.reactDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-window", "FixedSizeGrid")
@js.native
class FixedSizeGrid ()
  extends reactLib.reactMod.Component[FixedSizeGridProps, js.Object, js.Any] {
  /**
    * Scroll to the specified offsets.
    */
  def scrollTo(params: reactDashWindowLib.Anon_ScrollTop): scala.Unit = js.native
  /**
    * Scroll to the specified item.
    *
    * By default, the Grid will scroll as little as possible to ensure the item is visible.
    * You can control the alignment of the item though by specifying a second alignment parameter. Acceptable values are:
    *
    * - auto (default) - Scroll as little as possible to ensure the item is visible. (If the item is already visible, it won't scroll at all.)
    * - center - Center align the item within the grid.
    * - end - Align the item to the bottom, right hand side of the grid.
    * - start - Align the item to the top, left hand of the grid.
    */
  def scrollToItem(params: reactDashWindowLib.Anon_ColumnIndex): scala.Unit = js.native
}

