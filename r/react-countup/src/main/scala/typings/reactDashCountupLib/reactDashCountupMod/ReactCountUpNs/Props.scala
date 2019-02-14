package typings
package reactDashCountupLib.reactDashCountupMod.ReactCountUpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: js.UndefOr[js.Function1[/* data */ RenderProps, reactLib.reactMod.ReactNs.ReactElement]] = js.undefined
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

