package typings
package reactDashMdLib.libTooltipsTooltippedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltippedProps
  extends reactDashMdLib.libMod.Props {
  var children: reactLib.reactMod.ReactNs.ReactElement
  var container: js.UndefOr[js.Function1[/* HTMLElement */ reactLib.HTMLElement, reactLib.HTMLElement]] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var enterTimeout: js.UndefOr[scala.Double] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var leaveTimeout: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[reactDashMdLib.libTooltipsInjectTooltipMod.Positions] = js.undefined
  var setPosition: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement | (js.Function1[/* HTMLElement */ reactLib.HTMLElement, reactLib.reactMod.ReactNs.ReactElement])
  ] = js.undefined
  var tooltipClassName: js.UndefOr[java.lang.String] = js.undefined
  var tooltipStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

