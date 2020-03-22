package typings.reactNativeSvgCharts.mod

import typings.d3Scale.mod.ScaleBand_
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSvgCharts.AnonTop
import typings.reactNativeSvgCharts.PartialTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAxisProps[T] extends AxisProps[T] {
  var contentInset: js.UndefOr[AnonTop] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var yAccessor: js.UndefOr[AccessorFunction[T, _]] = js.undefined
}

object YAxisProps {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    contentInset: AnonTop = null,
    formatLabel: (/* value */ js.Any, /* index */ Double) => Double | String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    numberOfTicks: Int | Double = null,
    scale: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any] = null,
    spacingInner: Int | Double = null,
    spacingOuter: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    svg: PartialTextProps = null,
    yAccessor: /* props */ AccessorFunctionProps[T] => _ = null
  ): YAxisProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(js.Any.fromFunction2(formatLabel))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (numberOfTicks != null) __obj.updateDynamic("numberOfTicks")(numberOfTicks.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(js.Any.fromFunction0(scale))
    if (spacingInner != null) __obj.updateDynamic("spacingInner")(spacingInner.asInstanceOf[js.Any])
    if (spacingOuter != null) __obj.updateDynamic("spacingOuter")(spacingOuter.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (yAccessor != null) __obj.updateDynamic("yAccessor")(js.Any.fromFunction1(yAccessor))
    __obj.asInstanceOf[YAxisProps[T]]
  }
}

