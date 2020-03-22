package typings.reactNativeSvgCharts.mod

import typings.d3Scale.mod.ScaleBand_
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSvgCharts.AnonLeft
import typings.reactNativeSvgCharts.PartialTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxisProps[T] extends AxisProps[T] {
  var contentInset: js.UndefOr[AnonLeft] = js.undefined
  var xAccessor: js.UndefOr[AccessorFunction[T, _]] = js.undefined
}

object XAxisProps {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    contentInset: AnonLeft = null,
    formatLabel: (/* value */ js.Any, /* index */ Double) => Double | String = null,
    numberOfTicks: Int | Double = null,
    scale: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any] = null,
    spacingInner: Int | Double = null,
    spacingOuter: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    svg: PartialTextProps = null,
    xAccessor: /* props */ AccessorFunctionProps[T] => _ = null
  ): XAxisProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(js.Any.fromFunction2(formatLabel))
    if (numberOfTicks != null) __obj.updateDynamic("numberOfTicks")(numberOfTicks.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(js.Any.fromFunction0(scale))
    if (spacingInner != null) __obj.updateDynamic("spacingInner")(spacingInner.asInstanceOf[js.Any])
    if (spacingOuter != null) __obj.updateDynamic("spacingOuter")(spacingOuter.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (xAccessor != null) __obj.updateDynamic("xAccessor")(js.Any.fromFunction1(xAccessor))
    __obj.asInstanceOf[XAxisProps[T]]
  }
}

