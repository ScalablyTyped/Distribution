package typings
package prosemirrorDashTablesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellMinWidth[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  var View: js.UndefOr[prosemirrorDashViewLib.prosemirrorDashViewMod.NodeView[S]] = js.undefined
  var cellMinWidth: js.UndefOr[scala.Double] = js.undefined
  var handleWidth: js.UndefOr[scala.Double] = js.undefined
}

object Anon_CellMinWidth {
  @scala.inline
  def apply[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    View: prosemirrorDashViewLib.prosemirrorDashViewMod.NodeView[S] = null,
    cellMinWidth: scala.Int | scala.Double = null,
    handleWidth: scala.Int | scala.Double = null
  ): Anon_CellMinWidth[S] = {
    val __obj = js.Dynamic.literal()
    if (View != null) __obj.updateDynamic("View")(View)
    if (cellMinWidth != null) __obj.updateDynamic("cellMinWidth")(cellMinWidth.asInstanceOf[js.Any])
    if (handleWidth != null) __obj.updateDynamic("handleWidth")(handleWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CellMinWidth[S]]
  }
}

