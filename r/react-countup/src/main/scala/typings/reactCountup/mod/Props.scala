package typings.reactCountup.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.reactCountup.AnonPauseResume
import typings.reactCountup.AnonPauseResumeReset
import typings.reactCountup.AnonReset
import typings.reactCountup.AnonStart
import typings.reactCountup.AnonUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: js.UndefOr[js.Function1[/* data */ RenderProps, ReactElement]] = js.undefined
  /**
    * CSS class name of the span element.
    * Note: This won't be applied when using CountUp with render props.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Specifies decimal character.
    * Default: .
    */
  var decimal: js.UndefOr[String] = js.undefined
  /**
    * Amount of decimals to display.
    * Default: 0
    */
  var decimals: js.UndefOr[Double] = js.undefined
  /**
    * Delay in seconds before starting the transition.
    * Default: null
    * Note: delay={0} will automatically start the count up.
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Duration in seconds.
    * Default: 2
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Easing function. http://robertpenner.com/easing for more details.
    * Default: easeInExpo
    */
  var easingFn: js.UndefOr[
    js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Unit]
  ] = js.undefined
  /**
    * Target value.
    */
  var end: js.UndefOr[Double] = js.undefined
  /**
    * Function to customize the formatting of the number
    */
  var formattingFn: js.UndefOr[js.Function1[/* value */ Double, String]] = js.undefined
  /**
    * Callback function on transition end.
    */
  var onEnd: js.UndefOr[js.Function1[/* providedFn */ AnonPauseResume, Unit]] = js.undefined
  /**
    * Callback function on pause or resume.
    */
  var onPauseResume: js.UndefOr[js.Function0[js.Function1[/* providedFn */ AnonStart, Unit]]] = js.undefined
  /**
    * Callback function on reset.
    */
  var onReset: js.UndefOr[js.Function0[js.Function1[/* providedFn */ AnonUpdate, Unit]]] = js.undefined
  /**
    * Callback function on transition start.
    */
  var onStart: js.UndefOr[js.Function1[/* providedFn */ AnonReset, Unit]] = js.undefined
  /**
    * Callback function on update.
    */
  var onUpdate: js.UndefOr[js.Function1[/* providedFn */ AnonPauseResumeReset, Unit]] = js.undefined
  /**
    * Static text before the transitioning value.
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * Save previously ended number to start every new animation from it.
    * Default: false
    */
  var preserveValue: js.UndefOr[Boolean] = js.undefined
  /**
    * Forces count up transition on every component update.
    * Default: false
    */
  var redraw: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies character of thousands separator.
    */
  var separator: js.UndefOr[String] = js.undefined
  /**
    * Initial value.
    * Default: 0
    */
  var start: js.UndefOr[Double] = js.undefined
  /**
    * Use for start counter on mount for hook usage.
    * Default: true
    */
  var startOnMount: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Static text after the transitioning value.
    */
  var suffix: js.UndefOr[String] = js.undefined
  /**
    * Enables easing. Set to false for a linear transition.
    * Default: true
    */
  var useEasing: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: /* data */ RenderProps => ReactElement = null,
    className: String = null,
    decimal: String = null,
    decimals: Int | Double = null,
    delay: Int | Double = null,
    duration: Int | Double = null,
    easingFn: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Unit = null,
    end: Int | Double = null,
    formattingFn: /* value */ Double => String = null,
    onEnd: /* providedFn */ AnonPauseResume => Unit = null,
    onPauseResume: () => js.Function1[/* providedFn */ AnonStart, Unit] = null,
    onReset: () => js.Function1[/* providedFn */ AnonUpdate, Unit] = null,
    onStart: /* providedFn */ AnonReset => Unit = null,
    onUpdate: /* providedFn */ AnonPauseResumeReset => Unit = null,
    prefix: String = null,
    preserveValue: js.UndefOr[Boolean] = js.undefined,
    redraw: js.UndefOr[Boolean] = js.undefined,
    separator: String = null,
    start: Int | Double = null,
    startOnMount: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    suffix: String = null,
    useEasing: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easingFn != null) __obj.updateDynamic("easingFn")(js.Any.fromFunction4(easingFn))
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (formattingFn != null) __obj.updateDynamic("formattingFn")(js.Any.fromFunction1(formattingFn))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (onPauseResume != null) __obj.updateDynamic("onPauseResume")(js.Any.fromFunction0(onPauseResume))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction0(onReset))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1(onStart))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveValue)) __obj.updateDynamic("preserveValue")(preserveValue.asInstanceOf[js.Any])
    if (!js.isUndefined(redraw)) __obj.updateDynamic("redraw")(redraw.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(startOnMount)) __obj.updateDynamic("startOnMount")(startOnMount.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (!js.isUndefined(useEasing)) __obj.updateDynamic("useEasing")(useEasing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

