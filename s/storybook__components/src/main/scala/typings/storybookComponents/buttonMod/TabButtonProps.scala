package typings.storybookComponents.buttonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabButtonProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var textColor: js.UndefOr[String] = js.native
}

object TabButtonProps {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined, textColor: String = null): TabButtonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabButtonProps]
  }
}

