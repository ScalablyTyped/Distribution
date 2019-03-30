package typings
package reactDashPopperDashTooltipLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloseOnOutOfBoundaries extends js.Object {
  var closeOnOutOfBoundaries: scala.Boolean
  var defaultTooltipShown: scala.Boolean
  var delayHide: scala.Double
  var delayShow: scala.Double
  var followCursor: scala.Boolean
  var placement: java.lang.String
  var portalContainer: stdLib.HTMLElement | scala.Null
  var trigger: java.lang.String
  var usePortal: scala.Boolean
  def onVisibilityChange(): scala.Unit
}

object Anon_CloseOnOutOfBoundaries {
  @scala.inline
  def apply(
    closeOnOutOfBoundaries: scala.Boolean,
    defaultTooltipShown: scala.Boolean,
    delayHide: scala.Double,
    delayShow: scala.Double,
    followCursor: scala.Boolean,
    onVisibilityChange: () => scala.Unit,
    placement: java.lang.String,
    trigger: java.lang.String,
    usePortal: scala.Boolean,
    portalContainer: stdLib.HTMLElement = null
  ): Anon_CloseOnOutOfBoundaries = {
    val __obj = js.Dynamic.literal(closeOnOutOfBoundaries = closeOnOutOfBoundaries, defaultTooltipShown = defaultTooltipShown, delayHide = delayHide, delayShow = delayShow, followCursor = followCursor, onVisibilityChange = js.Any.fromFunction0(onVisibilityChange), placement = placement, trigger = trigger, usePortal = usePortal)
    if (portalContainer != null) __obj.updateDynamic("portalContainer")(portalContainer)
    __obj.asInstanceOf[Anon_CloseOnOutOfBoundaries]
  }
}

