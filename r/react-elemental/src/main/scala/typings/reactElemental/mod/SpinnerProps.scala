package typings.reactElemental.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps extends js.Object {
  val accentColor: js.UndefOr[String] = js.undefined
  val duration: js.UndefOr[Double] = js.undefined
  val ringColor: js.UndefOr[String] = js.undefined
  val size: js.UndefOr[SpinnerSize] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
  val thickness: js.UndefOr[Double] = js.undefined
}

object SpinnerProps {
  @scala.inline
  def apply(
    accentColor: String = null,
    duration: js.UndefOr[Double] = js.undefined,
    ringColor: String = null,
    size: SpinnerSize = null,
    style: CSSProperties = null,
    thickness: js.UndefOr[Double] = js.undefined
  ): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (ringColor != null) __obj.updateDynamic("ringColor")(ringColor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(thickness)) __obj.updateDynamic("thickness")(thickness.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerProps]
  }
}

