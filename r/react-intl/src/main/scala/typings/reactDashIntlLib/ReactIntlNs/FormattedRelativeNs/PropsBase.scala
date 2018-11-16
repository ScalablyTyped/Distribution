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
    reactDashIntlLib.reactDashIntlLibStrings.`best-fit` | reactDashIntlLib.reactDashIntlLibStrings.numeric
  ] = js.undefined
  /*
               * one of "second", "minute", "hour", "day", "month" or "year"
               */
  var units: js.UndefOr[
    reactDashIntlLib.reactDashIntlLibStrings.second | reactDashIntlLib.reactDashIntlLibStrings.minute | reactDashIntlLib.reactDashIntlLibStrings.hour | reactDashIntlLib.reactDashIntlLibStrings.day | reactDashIntlLib.reactDashIntlLibStrings.month | reactDashIntlLib.reactDashIntlLibStrings.year
  ] = js.undefined
  var updateInterval: js.UndefOr[scala.Double] = js.undefined
}

