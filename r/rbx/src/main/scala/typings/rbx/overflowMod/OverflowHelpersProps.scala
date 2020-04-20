package typings.rbx.overflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverflowHelpersProps extends js.Object {
  var clipped: js.UndefOr[Boolean] = js.undefined
}

object OverflowHelpersProps {
  @scala.inline
  def apply(clipped: js.UndefOr[Boolean] = js.undefined): OverflowHelpersProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clipped)) __obj.updateDynamic("clipped")(clipped.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverflowHelpersProps]
  }
}

