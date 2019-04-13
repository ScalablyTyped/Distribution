package typings
package prettyDashMsLib.prettyDashMsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrettyMsOptions extends js.Object {
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  var formatSubMs: js.UndefOr[scala.Boolean] = js.undefined
  var keepDecimalsOnWholeSeconds: js.UndefOr[scala.Boolean] = js.undefined
  var msDecimalDigits: js.UndefOr[scala.Double] = js.undefined
  var secDecimalDigits: js.UndefOr[scala.Double] = js.undefined
  var separateMs: js.UndefOr[scala.Boolean] = js.undefined
  var unitCount: js.UndefOr[scala.Double] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object PrettyMsOptions {
  @scala.inline
  def apply(
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    formatSubMs: js.UndefOr[scala.Boolean] = js.undefined,
    keepDecimalsOnWholeSeconds: js.UndefOr[scala.Boolean] = js.undefined,
    msDecimalDigits: scala.Int | scala.Double = null,
    secDecimalDigits: scala.Int | scala.Double = null,
    separateMs: js.UndefOr[scala.Boolean] = js.undefined,
    unitCount: scala.Int | scala.Double = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): PrettyMsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (!js.isUndefined(formatSubMs)) __obj.updateDynamic("formatSubMs")(formatSubMs)
    if (!js.isUndefined(keepDecimalsOnWholeSeconds)) __obj.updateDynamic("keepDecimalsOnWholeSeconds")(keepDecimalsOnWholeSeconds)
    if (msDecimalDigits != null) __obj.updateDynamic("msDecimalDigits")(msDecimalDigits.asInstanceOf[js.Any])
    if (secDecimalDigits != null) __obj.updateDynamic("secDecimalDigits")(secDecimalDigits.asInstanceOf[js.Any])
    if (!js.isUndefined(separateMs)) __obj.updateDynamic("separateMs")(separateMs)
    if (unitCount != null) __obj.updateDynamic("unitCount")(unitCount.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[PrettyMsOptions]
  }
}

