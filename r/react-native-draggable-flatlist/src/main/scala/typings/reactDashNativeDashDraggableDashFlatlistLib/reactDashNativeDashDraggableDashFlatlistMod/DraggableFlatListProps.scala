package typings
package reactDashNativeDashDraggableDashFlatlistLib.reactDashNativeDashDraggableDashFlatlistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DraggableFlatListProps[Item]
  extends reactDashNativeLib.reactDashNativeMod.VirtualizedListWithoutRenderItemProps[Item] {
  /**
     * Items to be rendered.
     */
  @JSName("data")
  var data_DraggableFlatListProps: js.Array[Item] | scala.Null
  /**
     * Function that is called when row becomes active.
     */
  var onMoveBegin: js.UndefOr[js.Function1[/* index */ scala.Double, scala.Unit]] = js.undefined
  /**
     *  Function that returns updated ordering of data
     */
  var onMoveEnd: js.UndefOr[js.Function1[/* info */ OnMoveEndInfo[Item], scala.Unit]] = js.undefined
  /**
     * Sets where scrolling begins.
     *
     * Default is 5
     */
  var scrollPercent: js.UndefOr[scala.Double] = js.undefined
  /**
     * Function that calls move when the row should become active (in an onPress, onLongPress, etc). Calls moveEnd when the gesture is complete (in onPressOut).
     */
  def renderItem(info: RenderItemInfo[Item]): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null
}

