package typings.prosemirrorDashTables

import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashView.prosemirrorDashViewMod.NodeView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellMinWidth[S /* <: Schema[_, _] */] extends js.Object {
  var View: js.UndefOr[NodeView[S]] = js.undefined
  var cellMinWidth: js.UndefOr[Double] = js.undefined
  var handleWidth: js.UndefOr[Double] = js.undefined
}

object Anon_CellMinWidth {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](View: NodeView[S] = null, cellMinWidth: Int | Double = null, handleWidth: Int | Double = null): Anon_CellMinWidth[S] = {
    val __obj = js.Dynamic.literal()
    if (View != null) __obj.updateDynamic("View")(View)
    if (cellMinWidth != null) __obj.updateDynamic("cellMinWidth")(cellMinWidth.asInstanceOf[js.Any])
    if (handleWidth != null) __obj.updateDynamic("handleWidth")(handleWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CellMinWidth[S]]
  }
}

