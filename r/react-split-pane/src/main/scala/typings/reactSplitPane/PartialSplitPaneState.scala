package typings.reactSplitPane

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-split-pane.react-split-pane.SplitPaneState> */
trait PartialSplitPaneState extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var resized: js.UndefOr[Boolean] = js.undefined
}

object PartialSplitPaneState {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined, resized: js.UndefOr[Boolean] = js.undefined): PartialSplitPaneState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(resized)) __obj.updateDynamic("resized")(resized.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSplitPaneState]
  }
}

