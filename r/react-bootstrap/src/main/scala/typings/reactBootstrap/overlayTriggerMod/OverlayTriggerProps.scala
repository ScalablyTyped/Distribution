package typings.reactBootstrap.overlayTriggerMod

import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayTriggerProps extends Props[OverlayTrigger] {
   // TODO: Add more specific type
  // Optional
  var animation: js.UndefOr[js.Any] = js.native
   // TODO: Add more specific type
  var container: js.UndefOr[js.Any] = js.native
   // TODO: Add more specific type
  var containerPadding: js.UndefOr[Double] = js.native
  var defaultOverlayShown: js.UndefOr[Boolean] = js.native
  var delay: js.UndefOr[Double] = js.native
  var delayHide: js.UndefOr[Double] = js.native
  var delayShow: js.UndefOr[Double] = js.native
  var onEnter: js.UndefOr[js.Function] = js.native
  var onEntered: js.UndefOr[js.Function] = js.native
  var onEntering: js.UndefOr[js.Function] = js.native
  var onExit: js.UndefOr[js.Function] = js.native
  var onExited: js.UndefOr[js.Function] = js.native
  var onExiting: js.UndefOr[js.Function] = js.native
  // Required
  var overlay: js.Any = js.native
  var placement: js.UndefOr[String] = js.native
  var rootClose: js.UndefOr[Boolean] = js.native
  var trigger: js.UndefOr[String | js.Array[String]] = js.native
}

object OverlayTriggerProps {
  @scala.inline
  def apply(overlay: js.Any): OverlayTriggerProps = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayTriggerProps]
  }
  @scala.inline
  implicit class OverlayTriggerPropsOps[Self <: OverlayTriggerProps] (val x: Self) extends AnyVal {
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
    def setOverlay(value: js.Any): Self = this.set("overlay", value.asInstanceOf[js.Any])
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
    def setDefaultOverlayShown(value: Boolean): Self = this.set("defaultOverlayShown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOverlayShown: Self = this.set("defaultOverlayShown", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDelayHide(value: Double): Self = this.set("delayHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayHide: Self = this.set("delayHide", js.undefined)
    @scala.inline
    def setDelayShow(value: Double): Self = this.set("delayShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayShow: Self = this.set("delayShow", js.undefined)
    @scala.inline
    def setOnEnter(value: js.Function): Self = this.set("onEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    @scala.inline
    def setOnEntered(value: js.Function): Self = this.set("onEntered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEntered: Self = this.set("onEntered", js.undefined)
    @scala.inline
    def setOnEntering(value: js.Function): Self = this.set("onEntering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEntering: Self = this.set("onEntering", js.undefined)
    @scala.inline
    def setOnExit(value: js.Function): Self = this.set("onExit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    @scala.inline
    def setOnExited(value: js.Function): Self = this.set("onExited", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnExited: Self = this.set("onExited", js.undefined)
    @scala.inline
    def setOnExiting(value: js.Function): Self = this.set("onExiting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnExiting: Self = this.set("onExiting", js.undefined)
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setRootClose(value: Boolean): Self = this.set("rootClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootClose: Self = this.set("rootClose", js.undefined)
    @scala.inline
    def setTriggerVarargs(value: String*): Self = this.set("trigger", js.Array(value :_*))
    @scala.inline
    def setTrigger(value: String | js.Array[String]): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
  }
  
}

