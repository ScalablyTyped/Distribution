package typings.atStorybookComponents.distBlocksToolbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarProps extends js.Object {
  var border: js.UndefOr[Boolean] = js.undefined
}

object BarProps {
  @scala.inline
  def apply(border: js.UndefOr[Boolean] = js.undefined): BarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarProps]
  }
}

