package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogProps
  extends reactLib.reactMod.ReactNs.HTMLProps[js.Any] {
  var onCancel: js.UndefOr[js.Function1[/* e */ js.Any, scala.Unit]] = js.undefined
}

object DialogProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[js.Any] = null,
    onCancel: js.Function1[/* e */ js.Any, scala.Unit] = null,
    open: js.UndefOr[scala.Boolean] = js.undefined
  ): DialogProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (onCancel != null) __obj.updateDynamic("onCancel")(onCancel)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[DialogProps]
  }
}

