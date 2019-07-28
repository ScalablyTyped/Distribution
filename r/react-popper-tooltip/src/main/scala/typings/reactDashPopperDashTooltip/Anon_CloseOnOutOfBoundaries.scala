package typings.reactDashPopperDashTooltip

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloseOnOutOfBoundaries extends js.Object {
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

object Anon_CloseOnOutOfBoundaries {
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
  ): Anon_CloseOnOutOfBoundaries = {
    val __obj = js.Dynamic.literal(closeOnOutOfBoundaries = closeOnOutOfBoundaries, defaultTooltipShown = defaultTooltipShown, delayHide = delayHide, delayShow = delayShow, followCursor = followCursor, onVisibilityChange = js.Any.fromFunction0(onVisibilityChange), placement = placement, trigger = trigger, usePortal = usePortal)
    if (portalContainer != null) __obj.updateDynamic("portalContainer")(portalContainer)
    __obj.asInstanceOf[Anon_CloseOnOutOfBoundaries]
  }
}

