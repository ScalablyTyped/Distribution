package typings
package reactDashTruncateLib.reactDashTruncateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TruncateProps
  extends reactLib.reactMod.ReactNs.HTMLProps[Truncate] {
  var ellipsis: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var lines: js.UndefOr[scala.Double | reactDashTruncateLib.reactDashTruncateLibNumbers.`false`] = js.undefined
  var onTruncate: js.UndefOr[js.Function1[/* isTruncated */ scala.Boolean, scala.Unit]] = js.undefined
  var trimWhitespace: js.UndefOr[scala.Boolean] = js.undefined
}

object TruncateProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[Truncate] = null,
    ellipsis: reactLib.reactMod.ReactNs.ReactNode = null,
    lines: scala.Double | reactDashTruncateLib.reactDashTruncateLibNumbers.`false` = null,
    onTruncate: /* isTruncated */ scala.Boolean => scala.Unit = null,
    trimWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  ): TruncateProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (onTruncate != null) __obj.updateDynamic("onTruncate")(js.Any.fromFunction1(onTruncate))
    if (!js.isUndefined(trimWhitespace)) __obj.updateDynamic("trimWhitespace")(trimWhitespace)
    __obj.asInstanceOf[TruncateProps]
  }
}

