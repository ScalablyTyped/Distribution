package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.div] {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var onRemove: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object TokenProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.div] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    onRemove: js.Function0[scala.Unit] = null
  ): TokenProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (onRemove != null) __obj.updateDynamic("onRemove")(onRemove)
    __obj.asInstanceOf[TokenProps]
  }
}

