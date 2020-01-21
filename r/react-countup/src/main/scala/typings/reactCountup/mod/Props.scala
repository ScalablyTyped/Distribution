package typings.reactCountup.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.reactCountup.AnonPauseResume
import typings.reactCountup.AnonPauseResumeReset
import typings.reactCountup.AnonPauseResumeResetStart
import typings.reactCountup.AnonPauseResumeStart
import typings.reactCountup.AnonReset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: js.UndefOr[js.Function1[/* data */ RenderProps, ReactElement]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var decimal: js.UndefOr[String] = js.undefined
  var decimals: js.UndefOr[Double] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easingFn: js.UndefOr[
    js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Unit]
  ] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var formattingFn: js.UndefOr[js.Function1[/* value */ Double, String]] = js.undefined
  var onComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onEnd: js.UndefOr[js.Function1[/* providedFn */ AnonPauseResume, Unit]] = js.undefined
  var onPauseResume: js.UndefOr[js.Function0[js.Function1[/* providedFn */ AnonReset, Unit]]] = js.undefined
  var onReset: js.UndefOr[js.Function0[js.Function1[/* providedFn */ AnonPauseResumeStart, Unit]]] = js.undefined
  var onStart: js.UndefOr[js.Function1[/* providedFn */ AnonPauseResumeReset, Unit]] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* providedFn */ AnonPauseResumeResetStart, Unit]] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var redraw: js.UndefOr[Boolean] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
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
    onComplete: () => Unit = null,
    onEnd: /* providedFn */ AnonPauseResume => Unit = null,
    onPauseResume: () => js.Function1[/* providedFn */ AnonReset, Unit] = null,
    onReset: () => js.Function1[/* providedFn */ AnonPauseResumeStart, Unit] = null,
    onStart: /* providedFn */ AnonPauseResumeReset => Unit = null,
    onUpdate: /* providedFn */ AnonPauseResumeResetStart => Unit = null,
    prefix: String = null,
    redraw: js.UndefOr[Boolean] = js.undefined,
    separator: String = null,
    start: Int | Double = null,
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
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction0(onComplete))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (onPauseResume != null) __obj.updateDynamic("onPauseResume")(js.Any.fromFunction0(onPauseResume))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction0(onReset))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1(onStart))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(redraw)) __obj.updateDynamic("redraw")(redraw.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (!js.isUndefined(useEasing)) __obj.updateDynamic("useEasing")(useEasing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

