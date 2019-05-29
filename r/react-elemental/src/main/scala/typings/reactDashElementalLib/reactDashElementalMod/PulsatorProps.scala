package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PulsatorProps extends js.Object {
  val color: js.UndefOr[java.lang.String] = js.undefined
  val inactive: js.UndefOr[scala.Boolean] = js.undefined
  val size: js.UndefOr[PulsatorSize] = js.undefined
  val style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  val transparent: js.UndefOr[scala.Boolean] = js.undefined
}

object PulsatorProps {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    inactive: js.UndefOr[scala.Boolean] = js.undefined,
    size: PulsatorSize = null,
    style: reactLib.reactMod.CSSProperties = null,
    transparent: js.UndefOr[scala.Boolean] = js.undefined
  ): PulsatorProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(inactive)) __obj.updateDynamic("inactive")(inactive)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    __obj.asInstanceOf[PulsatorProps]
  }
}

