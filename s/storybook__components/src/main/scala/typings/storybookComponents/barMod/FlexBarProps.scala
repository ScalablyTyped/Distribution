package typings.storybookComponents.barMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexBarProps extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var border: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[js.Any] = js.native
}

object FlexBarProps {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    border: js.UndefOr[Boolean] = js.undefined,
    children: js.Any = null
  ): FlexBarProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexBarProps]
  }
}

