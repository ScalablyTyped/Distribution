package typings.prosemirrorTables.anon

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorView.mod.NodeView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellMinWidth[S /* <: Schema[_, _] */] extends js.Object {
  var View: js.UndefOr[NodeView[S]] = js.native
  var cellMinWidth: js.UndefOr[Double] = js.native
  var handleWidth: js.UndefOr[Double] = js.native
}

object CellMinWidth {
  @scala.inline
  def apply[/* <: typings.prosemirrorModel.mod.Schema[_, _] */ S](): CellMinWidth[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellMinWidth[S]]
  }
  @scala.inline
  implicit class CellMinWidthOps[Self <: CellMinWidth[_], /* <: typings.prosemirrorModel.mod.Schema[_, _] */ S] (val x: Self with CellMinWidth[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setView(value: NodeView[S]): Self = this.set("View", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("View", js.undefined)
    @scala.inline
    def setCellMinWidth(value: Double): Self = this.set("cellMinWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellMinWidth: Self = this.set("cellMinWidth", js.undefined)
    @scala.inline
    def setHandleWidth(value: Double): Self = this.set("handleWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleWidth: Self = this.set("handleWidth", js.undefined)
  }
  
}

