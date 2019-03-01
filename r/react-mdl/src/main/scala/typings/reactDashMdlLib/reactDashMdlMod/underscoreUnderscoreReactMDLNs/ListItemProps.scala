package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps
  extends reactLib.reactMod.ReactNs.HTMLProps[js.Any] {
  var threeLine: js.UndefOr[scala.Boolean] = js.undefined
  var twoLine: js.UndefOr[scala.Boolean] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[js.Any] = null,
    threeLine: js.UndefOr[scala.Boolean] = js.undefined,
    twoLine: js.UndefOr[scala.Boolean] = js.undefined
  ): ListItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(threeLine)) __obj.updateDynamic("threeLine")(threeLine)
    if (!js.isUndefined(twoLine)) __obj.updateDynamic("twoLine")(twoLine)
    __obj.asInstanceOf[ListItemProps]
  }
}

