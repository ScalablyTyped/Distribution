package typings.reactShare.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconComponentProps extends js.Object {
  /** Allow rounded corners if using rect icons */
  var borderRadius: js.UndefOr[Double] = js.undefined
  /** Customize background style, e.g. fill */
  var iconBgStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Customize logo's fill color
    * @default 'white'
    */
  var logoFillColor: js.UndefOr[String] = js.undefined
  /** Whether to show round or rect icons */
  var round: js.UndefOr[Boolean] = js.undefined
  /** Icon size in pixels */
  var size: js.UndefOr[Double] = js.undefined
}

object IconComponentProps {
  @scala.inline
  def apply(
    borderRadius: js.UndefOr[Double] = js.undefined,
    iconBgStyle: CSSProperties = null,
    logoFillColor: String = null,
    round: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Double] = js.undefined
  ): IconComponentProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    if (iconBgStyle != null) __obj.updateDynamic("iconBgStyle")(iconBgStyle.asInstanceOf[js.Any])
    if (logoFillColor != null) __obj.updateDynamic("logoFillColor")(logoFillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconComponentProps]
  }
}

