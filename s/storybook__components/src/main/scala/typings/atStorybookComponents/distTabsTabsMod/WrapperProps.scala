package typings.atStorybookComponents.distTabsTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapperProps extends js.Object {
  var absolute: js.UndefOr[Boolean] = js.undefined
  var bordered: js.UndefOr[Boolean] = js.undefined
}

object WrapperProps {
  @scala.inline
  def apply(absolute: js.UndefOr[Boolean] = js.undefined, bordered: js.UndefOr[Boolean] = js.undefined): WrapperProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute)
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered)
    __obj.asInstanceOf[WrapperProps]
  }
}

