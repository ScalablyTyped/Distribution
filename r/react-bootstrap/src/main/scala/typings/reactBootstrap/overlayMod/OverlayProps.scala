package typings.reactBootstrap.overlayMod

import typings.react.mod.ReactInstance
import typings.reactBootstrap.mod.TransitionCallbacks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayProps extends TransitionCallbacks {
  // Optional
  var animation: js.UndefOr[js.Any] = js.native
   // TODO: Add more specific type
  var container: js.UndefOr[js.Any] = js.native
   // TODO: Add more specific type
  var containerPadding: js.UndefOr[Double] = js.native
   // TODO: Add more specific type
  var onHide: js.UndefOr[js.Function] = js.native
  var placement: js.UndefOr[String] = js.native
  var rootClose: js.UndefOr[Boolean] = js.native
  var shouldUpdatePosition: js.UndefOr[Boolean] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[js.Function | ReactInstance] = js.native
}

object OverlayProps {
  @scala.inline
  def apply(): OverlayProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayProps]
  }
  @scala.inline
  implicit class OverlayPropsOps[Self <: OverlayProps] (val x: Self) extends AnyVal {
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
    def setAnimation(value: js.Any): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setContainer(value: js.Any): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setContainerPadding(value: Double): Self = this.set("containerPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerPadding: Self = this.set("containerPadding", js.undefined)
    @scala.inline
    def setOnHide(value: js.Function): Self = this.set("onHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setRootClose(value: Boolean): Self = this.set("rootClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootClose: Self = this.set("rootClose", js.undefined)
    @scala.inline
    def setShouldUpdatePosition(value: Boolean): Self = this.set("shouldUpdatePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldUpdatePosition: Self = this.set("shouldUpdatePosition", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setTarget(value: js.Function | ReactInstance): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

