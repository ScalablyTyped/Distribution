package typings.atStorybookComponents.distBarBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexBarProps extends js.Object {
  var border: js.UndefOr[Boolean] = js.undefined
}

object FlexBarProps {
  @scala.inline
  def apply(border: js.UndefOr[Boolean] = js.undefined): FlexBarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border)
    __obj.asInstanceOf[FlexBarProps]
  }
}

