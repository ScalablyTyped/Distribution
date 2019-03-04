package typings
package reactDashIntlLib.ReactIntlNs.FormattedRelativeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends PropsBase {
  var children: js.UndefOr[
    js.Function1[/* formattedRelative */ java.lang.String, reactLib.reactMod.ReactNs.ReactNode]
  ] = js.undefined
  var value: reactDashIntlLib.ReactIntlNs.DateSource
}

object Props {
  @scala.inline
  def apply(
    value: reactDashIntlLib.ReactIntlNs.DateSource,
    children: js.Function1[/* formattedRelative */ java.lang.String, reactLib.reactMod.ReactNs.ReactNode] = null,
    format: java.lang.String = null,
    initialNow: js.Any = null,
    style: reactDashIntlLib.reactDashIntlLibStrings.`best-fit` | reactDashIntlLib.reactDashIntlLibStrings.numeric = null,
    units: reactDashIntlLib.reactDashIntlLibStrings.second | reactDashIntlLib.reactDashIntlLibStrings.minute | reactDashIntlLib.reactDashIntlLibStrings.hour | reactDashIntlLib.reactDashIntlLibStrings.day | reactDashIntlLib.reactDashIntlLibStrings.month | reactDashIntlLib.reactDashIntlLibStrings.year = null,
    updateInterval: scala.Int | scala.Double = null
  ): Props = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    if (format != null) __obj.updateDynamic("format")(format)
    if (initialNow != null) __obj.updateDynamic("initialNow")(initialNow)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (updateInterval != null) __obj.updateDynamic("updateInterval")(updateInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

