package typings.reactSizeme.mod

import typings.react.mod.ReactElement
import typings.reactSizeme.reactSizemeStrings.debounce
import typings.reactSizeme.reactSizemeStrings.throttle
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
    refreshRate: js.UndefOr[Double] = js.undefined
  ): SizeMeRenderProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (!js.isUndefined(monitorHeight)) __obj.updateDynamic("monitorHeight")(monitorHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorPosition)) __obj.updateDynamic("monitorPosition")(monitorPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorWidth)) __obj.updateDynamic("monitorWidth")(monitorWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noPlaceholder)) __obj.updateDynamic("noPlaceholder")(noPlaceholder.get.asInstanceOf[js.Any])
    if (refreshMode != null) __obj.updateDynamic("refreshMode")(refreshMode.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshRate)) __obj.updateDynamic("refreshRate")(refreshRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeMeRenderProps]
  }
}

