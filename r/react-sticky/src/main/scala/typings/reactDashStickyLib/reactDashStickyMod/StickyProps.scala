package typings
package reactDashStickyLib.reactDashStickyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyProps extends js.Object {
  var bottomOffset: js.UndefOr[scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disableCompensation: js.UndefOr[scala.Boolean] = js.undefined
  var disableHardwareAcceleration: js.UndefOr[scala.Boolean] = js.undefined
  var isActive: js.UndefOr[scala.Boolean] = js.undefined
  var onStickyStateChange: js.UndefOr[js.Function1[/* isSticky */ scala.Boolean, scala.Unit]] = js.undefined
  var relative: js.UndefOr[scala.Boolean] = js.undefined
  var stickyClassName: js.UndefOr[java.lang.String] = js.undefined
  var stickyStyle: js.UndefOr[js.Any] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var topOffset: js.UndefOr[scala.Double] = js.undefined
  def children(args: StickyChildArgs): reactLib.reactMod.ReactNs.ReactElement[_]
}

