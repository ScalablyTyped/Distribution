package typings.reactDashIntl.ReactIntlNs.FormattedRelativeNs

import typings.react.reactMod.ReactNode
import typings.reactDashIntl.ReactIntlNs.DateSource
import typings.reactDashIntl.reactDashIntlStrings.`best fit`
import typings.reactDashIntl.reactDashIntlStrings.day
import typings.reactDashIntl.reactDashIntlStrings.hour
import typings.reactDashIntl.reactDashIntlStrings.minute
import typings.reactDashIntl.reactDashIntlStrings.month
import typings.reactDashIntl.reactDashIntlStrings.numeric
import typings.reactDashIntl.reactDashIntlStrings.second
import typings.reactDashIntl.reactDashIntlStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends PropsBase {
  var children: js.UndefOr[js.Function1[/* formattedRelative */ String, ReactNode]] = js.undefined
  var value: DateSource
}

object Props {
  @scala.inline
  def apply(
    value: DateSource,
    children: /* formattedRelative */ String => ReactNode = null,
    format: String = null,
    initialNow: js.Any = null,
    style: (`best fit`) | numeric = null,
    units: second | minute | hour | day | month | year = null,
    updateInterval: Int | Double = null
  ): Props = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (format != null) __obj.updateDynamic("format")(format)
    if (initialNow != null) __obj.updateDynamic("initialNow")(initialNow)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (updateInterval != null) __obj.updateDynamic("updateInterval")(updateInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

