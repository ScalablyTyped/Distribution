package typings
package reactDashNotifyDashToastLib.reactDashNotifyDashToastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  var colors: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var top: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var wrapperId: js.UndefOr[java.lang.String] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    animationDuration: scala.Int | scala.Double = null,
    colors: js.Any = null,
    timeout: scala.Int | scala.Double = null,
    top: scala.Double | java.lang.String = null,
    wrapperId: java.lang.String = null,
    zIndex: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (wrapperId != null) __obj.updateDynamic("wrapperId")(wrapperId)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

