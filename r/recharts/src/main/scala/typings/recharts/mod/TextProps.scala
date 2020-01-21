package typings.recharts.mod

import typings.recharts.rechartsStrings.end
import typings.recharts.rechartsStrings.inherit
import typings.recharts.rechartsStrings.middle
import typings.recharts.rechartsStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait TextProps extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var capHeight: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var lineHeight: js.UndefOr[String] = js.undefined
  var scaleToFit: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var textAnchor: js.UndefOr[start | middle | end | inherit] = js.undefined
  var verticalAnchor: js.UndefOr[start | middle | end] = js.undefined
}

object TextProps {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    capHeight: String = null,
    className: String = null,
    lineHeight: String = null,
    scaleToFit: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    textAnchor: start | middle | end | inherit = null,
    verticalAnchor: start | middle | end = null
  ): TextProps = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (capHeight != null) __obj.updateDynamic("capHeight")(capHeight.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleToFit)) __obj.updateDynamic("scaleToFit")(scaleToFit.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (verticalAnchor != null) __obj.updateDynamic("verticalAnchor")(verticalAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextProps]
  }
}

