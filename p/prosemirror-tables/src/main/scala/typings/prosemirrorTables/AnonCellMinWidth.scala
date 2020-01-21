package typings.prosemirrorTables

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorView.mod.NodeView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCellMinWidth[S /* <: Schema[_, _] */] extends js.Object {
  var View: js.UndefOr[NodeView[S]] = js.undefined
  var cellMinWidth: js.UndefOr[Double] = js.undefined
  var handleWidth: js.UndefOr[Double] = js.undefined
}

object AnonCellMinWidth {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](View: NodeView[S] = null, cellMinWidth: Int | Double = null, handleWidth: Int | Double = null): AnonCellMinWidth[S] = {
    val __obj = js.Dynamic.literal()
    if (View != null) __obj.updateDynamic("View")(View.asInstanceOf[js.Any])
    if (cellMinWidth != null) __obj.updateDynamic("cellMinWidth")(cellMinWidth.asInstanceOf[js.Any])
    if (handleWidth != null) __obj.updateDynamic("handleWidth")(handleWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCellMinWidth[S]]
  }
}

