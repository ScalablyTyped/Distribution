package typings.reactSplitPane.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-split-pane.react-split-pane.SplitPaneState> */
@js.native
trait PartialSplitPaneState extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var resized: js.UndefOr[Boolean] = js.native
}

object PartialSplitPaneState {
  @scala.inline
  def apply(): PartialSplitPaneState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSplitPaneState]
  }
  @scala.inline
  implicit class PartialSplitPaneStateOps[Self <: PartialSplitPaneState] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setResized(value: Boolean): Self = this.set("resized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResized: Self = this.set("resized", js.undefined)
  }
  
}

