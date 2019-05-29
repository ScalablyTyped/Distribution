package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProps extends js.Object {
  val bold: js.UndefOr[scala.Boolean] = js.undefined
  val center: js.UndefOr[scala.Boolean] = js.undefined
  val children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  val color: js.UndefOr[java.lang.String] = js.undefined
  val `inline`: js.UndefOr[scala.Boolean] = js.undefined
  val right: js.UndefOr[scala.Boolean] = js.undefined
  val secondary: js.UndefOr[scala.Boolean] = js.undefined
  val size: js.UndefOr[java.lang.String] = js.undefined
  val style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  val uppercase: js.UndefOr[scala.Boolean] = js.undefined
}

object TextProps {
  @scala.inline
  def apply(
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    center: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    color: java.lang.String = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    right: js.UndefOr[scala.Boolean] = js.undefined,
    secondary: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    uppercase: js.UndefOr[scala.Boolean] = js.undefined
  ): TextProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(uppercase)) __obj.updateDynamic("uppercase")(uppercase)
    __obj.asInstanceOf[TextProps]
  }
}

