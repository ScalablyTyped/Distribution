package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps extends js.Object {
  val accentColor: js.UndefOr[java.lang.String] = js.undefined
  val duration: js.UndefOr[scala.Double] = js.undefined
  val ringColor: js.UndefOr[java.lang.String] = js.undefined
  val size: js.UndefOr[SpinnerSize] = js.undefined
  val style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  val thickness: js.UndefOr[scala.Double] = js.undefined
}

object SpinnerProps {
  @scala.inline
  def apply(
    accentColor: java.lang.String = null,
    duration: scala.Int | scala.Double = null,
    ringColor: java.lang.String = null,
    size: SpinnerSize = null,
    style: reactLib.reactMod.CSSProperties = null,
    thickness: scala.Int | scala.Double = null
  ): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ringColor != null) __obj.updateDynamic("ringColor")(ringColor)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerProps]
  }
}

