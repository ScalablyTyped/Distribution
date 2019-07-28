package typings.reactDashSortableDashPane.reactDashSortableDashPaneMod

import typings.reactDashSortableDashPane.reactDashSortableDashPaneStrings.x
import typings.reactDashSortableDashPane.reactDashSortableDashPaneStrings.xy
import typings.reactDashSortableDashPane.reactDashSortableDashPaneStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneResizeData extends js.Object {
  var delta: PaneSize
  var direction: x | y | xy
  var pane: PaneProperty
}

object PaneResizeData {
  @scala.inline
  def apply(delta: PaneSize, direction: x | y | xy, pane: PaneProperty): PaneResizeData = {
    val __obj = js.Dynamic.literal(delta = delta, direction = direction.asInstanceOf[js.Any], pane = pane)
  
    __obj.asInstanceOf[PaneResizeData]
  }
}

