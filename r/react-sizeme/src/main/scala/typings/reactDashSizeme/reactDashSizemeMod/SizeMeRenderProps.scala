package typings.reactDashSizeme.reactDashSizemeMod

import typings.react.reactMod.ReactElement
import typings.reactDashSizeme.reactDashSizemeStrings.debounce
import typings.reactDashSizeme.reactDashSizemeStrings.throttle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeMeRenderProps extends SizeMeOptions {
  def children(props: SizeMeProps): ReactElement
}

object SizeMeRenderProps {
  @scala.inline
  def apply(
    children: SizeMeProps => ReactElement,
    monitorHeight: js.UndefOr[Boolean] = js.undefined,
    monitorPosition: js.UndefOr[Boolean] = js.undefined,
    monitorWidth: js.UndefOr[Boolean] = js.undefined,
    noPlaceholder: js.UndefOr[Boolean] = js.undefined,
    refreshMode: throttle | debounce = null,
    refreshRate: Int | Double = null
  ): SizeMeRenderProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (!js.isUndefined(monitorHeight)) __obj.updateDynamic("monitorHeight")(monitorHeight)
    if (!js.isUndefined(monitorPosition)) __obj.updateDynamic("monitorPosition")(monitorPosition)
    if (!js.isUndefined(monitorWidth)) __obj.updateDynamic("monitorWidth")(monitorWidth)
    if (!js.isUndefined(noPlaceholder)) __obj.updateDynamic("noPlaceholder")(noPlaceholder)
    if (refreshMode != null) __obj.updateDynamic("refreshMode")(refreshMode.asInstanceOf[js.Any])
    if (refreshRate != null) __obj.updateDynamic("refreshRate")(refreshRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeMeRenderProps]
  }
}

