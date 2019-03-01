package typings
package reactDashNativeDashSvgLib.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGradientProps extends js.Object {
  var cx: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var cy: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var fx: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var fy: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var gradientUnits: js.UndefOr[Units] = js.undefined
  var id: java.lang.String
  var r: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var rx: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var ry: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
}

object RadialGradientProps {
  @scala.inline
  def apply(
    id: java.lang.String,
    cx: reactDashNativeDashSvgLib.NumberProp = null,
    cy: reactDashNativeDashSvgLib.NumberProp = null,
    fx: reactDashNativeDashSvgLib.NumberProp = null,
    fy: reactDashNativeDashSvgLib.NumberProp = null,
    gradientUnits: Units = null,
    r: reactDashNativeDashSvgLib.NumberProp = null,
    rx: reactDashNativeDashSvgLib.NumberProp = null,
    ry: reactDashNativeDashSvgLib.NumberProp = null
  ): RadialGradientProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (fx != null) __obj.updateDynamic("fx")(fx.asInstanceOf[js.Any])
    if (fy != null) __obj.updateDynamic("fy")(fy.asInstanceOf[js.Any])
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits)
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGradientProps]
  }
}

