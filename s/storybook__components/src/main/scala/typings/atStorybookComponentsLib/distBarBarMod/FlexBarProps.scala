package typings
package atStorybookComponentsLib.distBarBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexBarProps extends js.Object {
  var border: js.UndefOr[scala.Boolean] = js.undefined
}

object FlexBarProps {
  @scala.inline
  def apply(border: js.UndefOr[scala.Boolean] = js.undefined): FlexBarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border)
    __obj.asInstanceOf[FlexBarProps]
  }
}

