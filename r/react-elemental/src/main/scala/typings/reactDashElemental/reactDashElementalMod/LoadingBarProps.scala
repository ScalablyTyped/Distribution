package typings.reactDashElemental.reactDashElementalMod

import typings.react.reactMod.CSSProperties
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
    delay: Int | Double = null,
    duration: Int | Double = null,
    style: CSSProperties = null,
    thickness: Int | Double = null
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

