package typings
package reactDashMdlLib.reactDashMdlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps
  extends reactLib.reactMod.HTMLProps[js.Any] {
  var singleColor: js.UndefOr[scala.Boolean] = js.undefined
}

object SpinnerProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[js.Any] = null,
    singleColor: js.UndefOr[scala.Boolean] = js.undefined
  ): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(singleColor)) __obj.updateDynamic("singleColor")(singleColor)
    __obj.asInstanceOf[SpinnerProps]
  }
}

