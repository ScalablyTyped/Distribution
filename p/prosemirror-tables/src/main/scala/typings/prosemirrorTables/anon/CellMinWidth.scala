package typings.prosemirrorTables.anon

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorView.mod.NodeView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellMinWidth[S /* <: Schema[_, _] */] extends js.Object {
  var View: js.UndefOr[NodeView[S]] = js.undefined
  var cellMinWidth: js.UndefOr[Double] = js.undefined
  var handleWidth: js.UndefOr[Double] = js.undefined
}

object CellMinWidth {
  @scala.inline
  def apply[S](
    View: NodeView[S] = null,
    cellMinWidth: js.UndefOr[Double] = js.undefined,
    handleWidth: js.UndefOr[Double] = js.undefined
  ): CellMinWidth[S] = {
    val __obj = js.Dynamic.literal()
    if (View != null) __obj.updateDynamic("View")(View.asInstanceOf[js.Any])
    if (!js.isUndefined(cellMinWidth)) __obj.updateDynamic("cellMinWidth")(cellMinWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(handleWidth)) __obj.updateDynamic("handleWidth")(handleWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellMinWidth[S]]
  }
}

