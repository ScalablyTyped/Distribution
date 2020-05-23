package typings.reactNativeSvgCharts.mod

import typings.d3Scale.mod.ScaleBand_
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSvgCharts.anon.Left
import typings.reactNativeSvgCharts.anon.PartialTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxisProps[T] extends AxisProps[T] {
  var contentInset: js.UndefOr[Left] = js.undefined
  var xAccessor: js.UndefOr[AccessorFunction[T, _]] = js.undefined
}

object XAxisProps {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    contentInset: Left = null,
    formatLabel: (/* value */ js.Any, /* index */ Double) => Double | String = null,
    numberOfTicks: js.UndefOr[Double] = js.undefined,
    scale: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any] = null,
    spacingInner: js.UndefOr[Double] = js.undefined,
    spacingOuter: js.UndefOr[Double] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    svg: PartialTextProps = null,
    xAccessor: /* props */ AccessorFunctionProps[T] => _ = null
  ): XAxisProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(js.Any.fromFunction2(formatLabel))
    if (!js.isUndefined(numberOfTicks)) __obj.updateDynamic("numberOfTicks")(numberOfTicks.get.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(js.Any.fromFunction0(scale))
    if (!js.isUndefined(spacingInner)) __obj.updateDynamic("spacingInner")(spacingInner.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spacingOuter)) __obj.updateDynamic("spacingOuter")(spacingOuter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (xAccessor != null) __obj.updateDynamic("xAccessor")(js.Any.fromFunction1(xAccessor))
    __obj.asInstanceOf[XAxisProps[T]]
  }
}

