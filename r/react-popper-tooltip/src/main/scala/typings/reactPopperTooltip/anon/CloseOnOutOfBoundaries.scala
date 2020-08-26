package typings.reactPopperTooltip.anon

import typings.std.HTMLElement
import typings.std.MutationObserverInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseOnOutOfBoundaries extends js.Object {
  var closeOnOutOfBoundaries: Boolean = js.native
  var defaultTooltipShown: Boolean = js.native
  var delayHide: Double = js.native
  var delayShow: Double = js.native
  var followCursor: Boolean = js.native
  var mutationObserverOptions: MutationObserverInit = js.native
  var placement: String = js.native
  var portalContainer: HTMLElement | Null = js.native
  var trigger: String = js.native
  var usePortal: Boolean = js.native
  def onVisibilityChange(): Unit = js.native
}

object CloseOnOutOfBoundaries {
  @scala.inline
  def apply(
    closeOnOutOfBoundaries: Boolean,
    defaultTooltipShown: Boolean,
    delayHide: Double,
    delayShow: Double,
    followCursor: Boolean,
    mutationObserverOptions: MutationObserverInit,
    onVisibilityChange: () => Unit,
    placement: String,
    trigger: String,
    usePortal: Boolean
  ): CloseOnOutOfBoundaries = {
    val __obj = js.Dynamic.literal(closeOnOutOfBoundaries = closeOnOutOfBoundaries.asInstanceOf[js.Any], defaultTooltipShown = defaultTooltipShown.asInstanceOf[js.Any], delayHide = delayHide.asInstanceOf[js.Any], delayShow = delayShow.asInstanceOf[js.Any], followCursor = followCursor.asInstanceOf[js.Any], mutationObserverOptions = mutationObserverOptions.asInstanceOf[js.Any], onVisibilityChange = js.Any.fromFunction0(onVisibilityChange), placement = placement.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], usePortal = usePortal.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseOnOutOfBoundaries]
  }
  @scala.inline
  implicit class CloseOnOutOfBoundariesOps[Self <: CloseOnOutOfBoundaries] (val x: Self) extends AnyVal {
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
    def setCloseOnOutOfBoundaries(value: Boolean): Self = this.set("closeOnOutOfBoundaries", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultTooltipShown(value: Boolean): Self = this.set("defaultTooltipShown", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelayHide(value: Double): Self = this.set("delayHide", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelayShow(value: Double): Self = this.set("delayShow", value.asInstanceOf[js.Any])
    @scala.inline
    def setFollowCursor(value: Boolean): Self = this.set("followCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMutationObserverOptions(value: MutationObserverInit): Self = this.set("mutationObserverOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnVisibilityChange(value: () => Unit): Self = this.set("onVisibilityChange", js.Any.fromFunction0(value))
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsePortal(value: Boolean): Self = this.set("usePortal", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortalContainer(value: HTMLElement): Self = this.set("portalContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortalContainerNull: Self = this.set("portalContainer", null)
  }
  
}

