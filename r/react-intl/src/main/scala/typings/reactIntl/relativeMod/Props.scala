package typings.reactIntl.relativeMod

import typings.formatjsIntlRelativetimeformat.mod.Unit
import typings.react.mod.ReactChild
import typings.reactIntl.typesMod.CustomFormatConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped @formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.IntlRelativeTimeFormatOptions extends 'localeMatcher' ? never : @formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.IntlRelativeTimeFormatOptions */ trait Props extends CustomFormatConfig {
  var children: js.UndefOr[js.Function1[/* value */ String, ReactChild]] = js.undefined
  var unit: js.UndefOr[Unit] = js.undefined
  var updateIntervalInSeconds: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: /* value */ String => ReactChild = null,
    format: String = null,
    unit: Unit = null,
    updateIntervalInSeconds: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (!js.isUndefined(updateIntervalInSeconds)) __obj.updateDynamic("updateIntervalInSeconds")(updateIntervalInSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

