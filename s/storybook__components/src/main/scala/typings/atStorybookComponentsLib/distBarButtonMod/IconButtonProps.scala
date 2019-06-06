package typings
package atStorybookComponentsLib.distBarButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconButtonProps extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
}

object IconButtonProps {
  @scala.inline
  def apply(active: js.UndefOr[scala.Boolean] = js.undefined): IconButtonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    __obj.asInstanceOf[IconButtonProps]
  }
}

