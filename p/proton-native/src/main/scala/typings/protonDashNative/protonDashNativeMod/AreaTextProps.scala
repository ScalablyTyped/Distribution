package typings.protonDashNative.protonDashNativeMod

import typings.protonDashNative.Anon_Auxiliary
import typings.protonDashNative.Anon_H
import typings.protonDashNative.Anon_X
import typings.protonDashNative.protonDashNativeStrings.bevel
import typings.protonDashNative.protonDashNativeStrings.flat
import typings.protonDashNative.protonDashNativeStrings.miter
import typings.protonDashNative.protonDashNativeStrings.round
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaTextProps
  extends AreaBaseProps
     with StyledTextProps

object AreaTextProps {
  @scala.inline
  def apply(
    align: Anon_H = null,
    column: Int | Double = null,
    expand: Anon_H = null,
    fill: String = null,
    fillOpacity: Int | Double = null,
    label: String = null,
    row: Int | Double = null,
    span: Anon_X = null,
    stretchy: js.UndefOr[Boolean] = js.undefined,
    stroke: String = null,
    strokeLinecap: flat | round | bevel = null,
    strokeLinejoin: miter | round | bevel = null,
    strokeMiterlimit: Int | Double = null,
    strokeOpacity: Int | Double = null,
    strokeWidth: Int | Double = null,
    style: Anon_Auxiliary = null,
    transform: String = null,
    x: Double | String = null,
    y: Double | String = null
  ): AreaTextProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span)
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaTextProps]
  }
}

