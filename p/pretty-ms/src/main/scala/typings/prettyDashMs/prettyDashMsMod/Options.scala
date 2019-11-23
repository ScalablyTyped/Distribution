package typings.prettyDashMs.prettyDashMsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Display time using colon notation: `5h 1m 45s` → `5:01:45`. Always shows time in at least minutes: `1s` → `0:01`
  		Useful when you want to display time without the time units, similar to a digital watch.
  		Setting `colonNotation` to `true` overrides the following options to `false`:
  		- `compact`
  		- `formatSubMilliseconds`
  		- `separateMilliseconds`
  		- `verbose`
  		@default false
  		*/
  val colonNotation: js.UndefOr[Boolean] = js.undefined
  /**
  		Only show the first unit: `1h 10m` → `~1h`.
  		Also ensures that `millisecondsDecimalDigits` and `secondsDecimalDigits` are both set to `0`.
  		@default false
  		*/
  val compact: js.UndefOr[Boolean] = js.undefined
  /**
  		Show microseconds and nanoseconds.
  		@default false
  		*/
  val formatSubMilliseconds: js.UndefOr[Boolean] = js.undefined
  /**
  		Keep milliseconds on whole seconds: `13s` → `13.0s`.
  		Useful when you are showing a number of seconds spent on an operation and don't want the width of the output to change when hitting a whole number.
  		@default false
  		*/
  val keepDecimalsOnWholeSeconds: js.UndefOr[Boolean] = js.undefined
  /**
  		Number of digits to appear after the milliseconds decimal point.
  		Useful in combination with [`process.hrtime()`](https://nodejs.org/api/process.html#process_process_hrtime).
  		@default 0
  		*/
  val millisecondsDecimalDigits: js.UndefOr[Double] = js.undefined
  /**
  		Number of digits to appear after the seconds decimal point.
  		@default 1
  		*/
  val secondsDecimalDigits: js.UndefOr[Double] = js.undefined
  /**
  		Show milliseconds separately. This means they won't be included in the decimal part of the seconds.
  		@default false
  		*/
  val separateMilliseconds: js.UndefOr[Boolean] = js.undefined
  /**
  		Number of units to show. Setting `compact` to `true` overrides this option.
  		@default Infinity
  		*/
  val unitCount: js.UndefOr[Double] = js.undefined
  /**
  		Use full-length units: `5h 1m 45s` → `5 hours 1 minute 45 seconds`.
  		@default false
  		*/
  val verbose: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    colonNotation: js.UndefOr[Boolean] = js.undefined,
    compact: js.UndefOr[Boolean] = js.undefined,
    formatSubMilliseconds: js.UndefOr[Boolean] = js.undefined,
    keepDecimalsOnWholeSeconds: js.UndefOr[Boolean] = js.undefined,
    millisecondsDecimalDigits: Int | Double = null,
    secondsDecimalDigits: Int | Double = null,
    separateMilliseconds: js.UndefOr[Boolean] = js.undefined,
    unitCount: Int | Double = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colonNotation)) __obj.updateDynamic("colonNotation")(colonNotation)
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

