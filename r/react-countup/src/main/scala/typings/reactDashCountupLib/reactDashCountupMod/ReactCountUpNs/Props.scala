package typings
package reactDashCountupLib.reactDashCountupMod.ReactCountUpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: js.UndefOr[js.Function1[/* data */ RenderProps, reactLib.reactMod.ReactNs.ReactElement[_]]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var decimal: js.UndefOr[java.lang.String] = js.undefined
  var decimals: js.UndefOr[scala.Double] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easingFn: js.UndefOr[
    js.Function4[
      /* t */ scala.Double, 
      /* b */ scala.Double, 
      /* c */ scala.Double, 
      /* d */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var end: js.UndefOr[scala.Double] = js.undefined
  var formattingFn: js.UndefOr[js.Function1[/* value */ scala.Double, java.lang.String]] = js.undefined
  var onComplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onEnd: js.UndefOr[js.Function1[/* providedFn */ reactDashCountupLib.Anon_PauseResume, scala.Unit]] = js.undefined
  var onPauseResume: js.UndefOr[
    js.Function0[js.Function1[/* providedFn */ reactDashCountupLib.Anon_Reset, scala.Unit]]
  ] = js.undefined
  var onReset: js.UndefOr[
    js.Function0[
      js.Function1[/* providedFn */ reactDashCountupLib.Anon_PauseResumeStart, scala.Unit]
    ]
  ] = js.undefined
  var onStart: js.UndefOr[
    js.Function1[/* providedFn */ reactDashCountupLib.Anon_PauseResumeReset, scala.Unit]
  ] = js.undefined
  var onUpdate: js.UndefOr[
    js.Function1[/* providedFn */ reactDashCountupLib.Anon_PauseResumeResetStart, scala.Unit]
  ] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var redraw: js.UndefOr[scala.Boolean] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  var useEasing: js.UndefOr[scala.Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: js.Function1[/* data */ RenderProps, reactLib.reactMod.ReactNs.ReactElement[_]] = null,
    className: java.lang.String = null,
    decimal: java.lang.String = null,
    decimals: scala.Int | scala.Double = null,
    delay: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    easingFn: js.Function4[
      /* t */ scala.Double, 
      /* b */ scala.Double, 
      /* c */ scala.Double, 
      /* d */ scala.Double, 
      scala.Unit
    ] = null,
    end: scala.Int | scala.Double = null,
    formattingFn: js.Function1[/* value */ scala.Double, java.lang.String] = null,
    onComplete: js.Function0[scala.Unit] = null,
    onEnd: js.Function1[/* providedFn */ reactDashCountupLib.Anon_PauseResume, scala.Unit] = null,
    onPauseResume: js.Function0[js.Function1[/* providedFn */ reactDashCountupLib.Anon_Reset, scala.Unit]] = null,
    onReset: js.Function0[
      js.Function1[/* providedFn */ reactDashCountupLib.Anon_PauseResumeStart, scala.Unit]
    ] = null,
    onStart: js.Function1[/* providedFn */ reactDashCountupLib.Anon_PauseResumeReset, scala.Unit] = null,
    onUpdate: js.Function1[/* providedFn */ reactDashCountupLib.Anon_PauseResumeResetStart, scala.Unit] = null,
    prefix: java.lang.String = null,
    redraw: js.UndefOr[scala.Boolean] = js.undefined,
    separator: java.lang.String = null,
    start: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    suffix: java.lang.String = null,
    useEasing: js.UndefOr[scala.Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (decimal != null) __obj.updateDynamic("decimal")(decimal)
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easingFn != null) __obj.updateDynamic("easingFn")(easingFn)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (formattingFn != null) __obj.updateDynamic("formattingFn")(formattingFn)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (onEnd != null) __obj.updateDynamic("onEnd")(onEnd)
    if (onPauseResume != null) __obj.updateDynamic("onPauseResume")(onPauseResume)
    if (onReset != null) __obj.updateDynamic("onReset")(onReset)
    if (onStart != null) __obj.updateDynamic("onStart")(onStart)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(redraw)) __obj.updateDynamic("redraw")(redraw)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (!js.isUndefined(useEasing)) __obj.updateDynamic("useEasing")(useEasing)
    __obj.asInstanceOf[Props]
  }
}

