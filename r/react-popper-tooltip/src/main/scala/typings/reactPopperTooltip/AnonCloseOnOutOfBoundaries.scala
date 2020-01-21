package typings.reactPopperTooltip

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloseOnOutOfBoundaries extends js.Object {
  var closeOnOutOfBoundaries: Boolean
  var defaultTooltipShown: Boolean
  var delayHide: Double
  var delayShow: Double
  var followCursor: Boolean
  var placement: String
  var portalContainer: HTMLElement | Null
  var trigger: String
  var usePortal: Boolean
  def onVisibilityChange(): Unit
}

object AnonCloseOnOutOfBoundaries {
  @scala.inline
  def apply(
    closeOnOutOfBoundaries: Boolean,
    defaultTooltipShown: Boolean,
    delayHide: Double,
    delayShow: Double,
    followCursor: Boolean,
    onVisibilityChange: () => Unit,
    placement: String,
    trigger: String,
    usePortal: Boolean,
    portalContainer: HTMLElement = null
  ): AnonCloseOnOutOfBoundaries = {
    val __obj = js.Dynamic.literal(closeOnOutOfBoundaries = closeOnOutOfBoundaries.asInstanceOf[js.Any], defaultTooltipShown = defaultTooltipShown.asInstanceOf[js.Any], delayHide = delayHide.asInstanceOf[js.Any], delayShow = delayShow.asInstanceOf[js.Any], followCursor = followCursor.asInstanceOf[js.Any], onVisibilityChange = js.Any.fromFunction0(onVisibilityChange), placement = placement.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], usePortal = usePortal.asInstanceOf[js.Any])
    if (portalContainer != null) __obj.updateDynamic("portalContainer")(portalContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCloseOnOutOfBoundaries]
  }
}

