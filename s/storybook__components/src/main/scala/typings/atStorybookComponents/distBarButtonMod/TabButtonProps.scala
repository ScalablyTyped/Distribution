package typings.atStorybookComponents.distBarButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabButtonProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
}

object TabButtonProps {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined): TabButtonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    __obj.asInstanceOf[TabButtonProps]
  }
}

