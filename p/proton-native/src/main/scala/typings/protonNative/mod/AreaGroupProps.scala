package typings.protonNative.mod

import typings.protonNative.anon.H
import typings.protonNative.anon.X
import typings.protonNative.protonNativeStrings.bevel
import typings.protonNative.protonNativeStrings.flat
import typings.protonNative.protonNativeStrings.miter
import typings.protonNative.protonNativeStrings.round
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaGroupProps extends AreaBaseProps {
  /**
    * Specify `width` and `height` to be able to use percentage values in transforms.
    */
  var height: js.UndefOr[Double | String] = js.undefined
  /**
    * Specify `width` and `height` to be able to use percentage values in transforms.
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object AreaGroupProps {
  @scala.inline
  def apply(
    align: H = null,
    column: js.UndefOr[Double] = js.undefined,
    expand: H = null,
    fill: String = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    height: Double | String = null,
    label: String = null,
    row: js.UndefOr[Double] = js.undefined,
    span: X = null,
    stretchy: js.UndefOr[Boolean] = js.undefined,
    stroke: String = null,
    strokeLinecap: flat | round | bevel = null,
    strokeLinejoin: miter | round | bevel = null,
    strokeMiterlimit: js.UndefOr[Double] = js.undefined,
    strokeOpacity: js.UndefOr[Double] = js.undefined,
    strokeWidth: js.UndefOr[Double] = js.undefined,
    transform: String = null,
    width: Double | String = null
  ): AreaGroupProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.get.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeMiterlimit)) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeOpacity)) __obj.updateDynamic("strokeOpacity")(strokeOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaGroupProps]
  }
}

