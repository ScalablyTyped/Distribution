package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingBarProps extends js.Object {
  val color: js.UndefOr[java.lang.String] = js.undefined
  val delay: js.UndefOr[scala.Double] = js.undefined
  val duration: js.UndefOr[scala.Double] = js.undefined
  val style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  val thickness: js.UndefOr[scala.Double] = js.undefined
}

object LoadingBarProps {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    thickness: scala.Int | scala.Double = null
  ): LoadingBarProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingBarProps]
  }
}

