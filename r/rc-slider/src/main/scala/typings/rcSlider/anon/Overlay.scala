package typings.rcSlider.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Overlay extends js.Object {
  var overlay: js.UndefOr[String] = js.native
  var placement: js.UndefOr[String] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object Overlay {
  @scala.inline
  def apply(): Overlay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Overlay]
  }
  @scala.inline
  implicit class OverlayOps[Self <: Overlay] (val x: Self) extends AnyVal {
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
    def setOverlay(value: String): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

