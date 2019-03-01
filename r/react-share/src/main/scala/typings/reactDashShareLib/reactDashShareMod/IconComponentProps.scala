package typings
package reactDashShareLib.reactDashShareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconComponentProps extends js.Object {
  /** Customize background style, e.g. fill */
  var iconBgStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * Customize logo's fill color
    * @default 'white'
    */
  var logoFillColor: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to show round or rect icons */
  var round: js.UndefOr[scala.Boolean] = js.undefined
  /** Icon size in pixels */
  var size: js.UndefOr[scala.Double] = js.undefined
}

object IconComponentProps {
  @scala.inline
  def apply(
    iconBgStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    logoFillColor: java.lang.String = null,
    round: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null
  ): IconComponentProps = {
    val __obj = js.Dynamic.literal()
    if (iconBgStyle != null) __obj.updateDynamic("iconBgStyle")(iconBgStyle)
    if (logoFillColor != null) __obj.updateDynamic("logoFillColor")(logoFillColor)
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconComponentProps]
  }
}

