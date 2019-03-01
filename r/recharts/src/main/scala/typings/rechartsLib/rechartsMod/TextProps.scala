package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait TextProps extends js.Object {
  var angle: js.UndefOr[scala.Double] = js.undefined
  var capHeight: js.UndefOr[java.lang.String] = js.undefined
  var lineHeight: js.UndefOr[java.lang.String] = js.undefined
  var scaleToFit: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var textAnchor: js.UndefOr[
    rechartsLib.rechartsLibStrings.start | rechartsLib.rechartsLibStrings.middle | rechartsLib.rechartsLibStrings.end | rechartsLib.rechartsLibStrings.inherit
  ] = js.undefined
  var verticalAnchor: js.UndefOr[
    rechartsLib.rechartsLibStrings.start | rechartsLib.rechartsLibStrings.middle | rechartsLib.rechartsLibStrings.end
  ] = js.undefined
}

object TextProps {
  @scala.inline
  def apply(
    angle: scala.Int | scala.Double = null,
    capHeight: java.lang.String = null,
    lineHeight: java.lang.String = null,
    scaleToFit: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Object = null,
    textAnchor: rechartsLib.rechartsLibStrings.start | rechartsLib.rechartsLibStrings.middle | rechartsLib.rechartsLibStrings.end | rechartsLib.rechartsLibStrings.inherit = null,
    verticalAnchor: rechartsLib.rechartsLibStrings.start | rechartsLib.rechartsLibStrings.middle | rechartsLib.rechartsLibStrings.end = null
  ): TextProps = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (capHeight != null) __obj.updateDynamic("capHeight")(capHeight)
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight)
    if (!js.isUndefined(scaleToFit)) __obj.updateDynamic("scaleToFit")(scaleToFit)
    if (style != null) __obj.updateDynamic("style")(style)
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (verticalAnchor != null) __obj.updateDynamic("verticalAnchor")(verticalAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextProps]
  }
}

