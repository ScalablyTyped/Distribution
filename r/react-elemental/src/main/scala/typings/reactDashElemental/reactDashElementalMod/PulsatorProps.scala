package typings.reactDashElemental.reactDashElementalMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PulsatorProps extends js.Object {
  val color: js.UndefOr[String] = js.undefined
  val inactive: js.UndefOr[Boolean] = js.undefined
  val size: js.UndefOr[PulsatorSize] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
  val transparent: js.UndefOr[Boolean] = js.undefined
}

object PulsatorProps {
  @scala.inline
  def apply(
    color: String = null,
    inactive: js.UndefOr[Boolean] = js.undefined,
    size: PulsatorSize = null,
    style: CSSProperties = null,
    transparent: js.UndefOr[Boolean] = js.undefined
  ): PulsatorProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(inactive)) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PulsatorProps]
  }
}

