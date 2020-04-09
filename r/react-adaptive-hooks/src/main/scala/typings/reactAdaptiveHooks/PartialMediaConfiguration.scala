package typings.reactAdaptiveHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-adaptive-hooks.react-adaptive-hooks/media-capabilities.MediaConfigurationInfo> */
trait PartialMediaConfiguration extends js.Object {
  var powerEfficient: js.UndefOr[Boolean] = js.undefined
  var smooth: js.UndefOr[Boolean] = js.undefined
  var supported: js.UndefOr[Boolean] = js.undefined
}

object PartialMediaConfiguration {
  @scala.inline
  def apply(
    powerEfficient: js.UndefOr[Boolean] = js.undefined,
    smooth: js.UndefOr[Boolean] = js.undefined,
    supported: js.UndefOr[Boolean] = js.undefined
  ): PartialMediaConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(powerEfficient)) __obj.updateDynamic("powerEfficient")(powerEfficient.asInstanceOf[js.Any])
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    if (!js.isUndefined(supported)) __obj.updateDynamic("supported")(supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMediaConfiguration]
  }
}

