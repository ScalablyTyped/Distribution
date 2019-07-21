package typings
package prettyDashMsLib.prettyDashMsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Only show the first unit: `1h 10m` → `~1h`.
  		Also ensures that `millisecondsDecimalDigits` and `secondsDecimalDigits` are both set to `0`.
  		@default false
  		*/
  val compact: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Show microseconds and nanoseconds.
  		@default false
  		*/
  val formatSubMilliseconds: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Keep milliseconds on whole seconds: `13s` → `13.0s`.
  		Useful when you are showing a number of seconds spent on an operation and don't want the width of the output to change when hitting a whole number.
  		@default false
  		*/
  val keepDecimalsOnWholeSeconds: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Number of digits to appear after the milliseconds decimal point.
  		Useful in combination with [`process.hrtime()`](https://nodejs.org/api/process.html#process_process_hrtime).
  		@default 0
  		*/
  val millisecondsDecimalDigits: js.UndefOr[scala.Double] = js.undefined
  /**
  		Number of digits to appear after the seconds decimal point.
  		@default 1
  		*/
  val secondsDecimalDigits: js.UndefOr[scala.Double] = js.undefined
  /**
  		Show milliseconds separately. This means they won't be included in the decimal part of the seconds.
  		@default false
  		*/
  val separateMilliseconds: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Number of units to show. Setting `compact` to `true` overrides this option.
  		@default Infinity
  		*/
  val unitCount: js.UndefOr[scala.Double] = js.undefined
  /**
  		Use full-length units: `5h 1m 45s` → `5 hours 1 minute 45 seconds`.
  		@default false
  		*/
  val verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    formatSubMilliseconds: js.UndefOr[scala.Boolean] = js.undefined,
    keepDecimalsOnWholeSeconds: js.UndefOr[scala.Boolean] = js.undefined,
    millisecondsDecimalDigits: scala.Int | scala.Double = null,
    secondsDecimalDigits: scala.Int | scala.Double = null,
    separateMilliseconds: js.UndefOr[scala.Boolean] = js.undefined,
    unitCount: scala.Int | scala.Double = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (!js.isUndefined(formatSubMilliseconds)) __obj.updateDynamic("formatSubMilliseconds")(formatSubMilliseconds)
    if (!js.isUndefined(keepDecimalsOnWholeSeconds)) __obj.updateDynamic("keepDecimalsOnWholeSeconds")(keepDecimalsOnWholeSeconds)
    if (millisecondsDecimalDigits != null) __obj.updateDynamic("millisecondsDecimalDigits")(millisecondsDecimalDigits.asInstanceOf[js.Any])
    if (secondsDecimalDigits != null) __obj.updateDynamic("secondsDecimalDigits")(secondsDecimalDigits.asInstanceOf[js.Any])
    if (!js.isUndefined(separateMilliseconds)) __obj.updateDynamic("separateMilliseconds")(separateMilliseconds)
    if (unitCount != null) __obj.updateDynamic("unitCount")(unitCount.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Options]
  }
}

