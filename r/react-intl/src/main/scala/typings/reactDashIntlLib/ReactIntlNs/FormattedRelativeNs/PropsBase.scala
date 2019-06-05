package typings
package reactDashIntlLib.ReactIntlNs.FormattedRelativeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsBase extends js.Object {
  var format: js.UndefOr[java.lang.String] = js.undefined
  var initialNow: js.UndefOr[js.Any] = js.undefined
  /*
    * one of "best fit" (default) | "numeric"
    */
  var style: js.UndefOr[
    (reactDashIntlLib.reactDashIntlLibStrings.`best fit`) | reactDashIntlLib.reactDashIntlLibStrings.numeric
  ] = js.undefined
  /*
    * one of "second", "minute", "hour", "day", "month" or "year"
    */
  var units: js.UndefOr[
    reactDashIntlLib.reactDashIntlLibStrings.second | reactDashIntlLib.reactDashIntlLibStrings.minute | reactDashIntlLib.reactDashIntlLibStrings.hour | reactDashIntlLib.reactDashIntlLibStrings.day | reactDashIntlLib.reactDashIntlLibStrings.month | reactDashIntlLib.reactDashIntlLibStrings.year
  ] = js.undefined
  var updateInterval: js.UndefOr[scala.Double] = js.undefined
}

object PropsBase {
  @scala.inline
  def apply(
    format: java.lang.String = null,
    initialNow: js.Any = null,
    style: (reactDashIntlLib.reactDashIntlLibStrings.`best fit`) | reactDashIntlLib.reactDashIntlLibStrings.numeric = null,
    units: reactDashIntlLib.reactDashIntlLibStrings.second | reactDashIntlLib.reactDashIntlLibStrings.minute | reactDashIntlLib.reactDashIntlLibStrings.hour | reactDashIntlLib.reactDashIntlLibStrings.day | reactDashIntlLib.reactDashIntlLibStrings.month | reactDashIntlLib.reactDashIntlLibStrings.year = null,
    updateInterval: scala.Int | scala.Double = null
  ): PropsBase = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (initialNow != null) __obj.updateDynamic("initialNow")(initialNow)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (updateInterval != null) __obj.updateDynamic("updateInterval")(updateInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsBase]
  }
}

