package typings.reactPanelgroup.mod

import typings.reactPanelgroup.reactPanelgroupStrings.dynamic
import typings.reactPanelgroup.reactPanelgroupStrings.fixed
import typings.reactPanelgroup.reactPanelgroupStrings.stretch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelWidth extends js.Object {
  var minSize: js.UndefOr[Double] = js.native
  var resize: js.UndefOr[fixed | dynamic | stretch] = js.native
  var size: js.UndefOr[Double] = js.native
  var snap: js.UndefOr[js.Array[Double]] = js.native
}

object PanelWidth {
  @scala.inline
  def apply(): PanelWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelWidth]
  }
  @scala.inline
  implicit class PanelWidthOps[Self <: PanelWidth] (val x: Self) extends AnyVal {
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
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    @scala.inline
    def setResize(value: fixed | dynamic | stretch): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSnapVarargs(value: Double*): Self = this.set("snap", js.Array(value :_*))
    @scala.inline
    def setSnap(value: js.Array[Double]): Self = this.set("snap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnap: Self = this.set("snap", js.undefined)
  }
  
}

