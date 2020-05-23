package typings.reactElemental.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingBarProps extends js.Object {
  val color: js.UndefOr[String] = js.undefined
  val delay: js.UndefOr[Double] = js.undefined
  val duration: js.UndefOr[Double] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
  val thickness: js.UndefOr[Double] = js.undefined
}

object LoadingBarProps {
  @scala.inline
  def apply(
    color: String = null,
    delay: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    thickness: js.UndefOr[Double] = js.undefined
  ): LoadingBarProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(thickness)) __obj.updateDynamic("thickness")(thickness.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingBarProps]
  }
}

