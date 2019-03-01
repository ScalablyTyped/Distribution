package typings
package reactDashSortableDashPaneLib.reactDashSortableDashPaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneResizeData extends js.Object {
  var delta: PaneSize
  var direction: reactDashSortableDashPaneLib.reactDashSortableDashPaneLibStrings.x | reactDashSortableDashPaneLib.reactDashSortableDashPaneLibStrings.y | reactDashSortableDashPaneLib.reactDashSortableDashPaneLibStrings.xy
  var pane: PaneProperty
}

object PaneResizeData {
  @scala.inline
  def apply(
    delta: PaneSize,
    direction: reactDashSortableDashPaneLib.reactDashSortableDashPaneLibStrings.x | reactDashSortableDashPaneLib.reactDashSortableDashPaneLibStrings.y | reactDashSortableDashPaneLib.reactDashSortableDashPaneLibStrings.xy,
    pane: PaneProperty
  ): PaneResizeData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delta")(delta)
    __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.updateDynamic("pane")(pane)
    __obj.asInstanceOf[PaneResizeData]
  }
}

