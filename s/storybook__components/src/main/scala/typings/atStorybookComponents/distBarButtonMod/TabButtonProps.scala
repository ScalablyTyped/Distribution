package typings.atStorybookComponents.distBarButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabButtonProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object TabButtonProps {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined, textColor: String = null): TabButtonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[TabButtonProps]
  }
}

