package typings.storybookComponents.tabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapperProps extends js.Object {
  var absolute: js.UndefOr[Boolean] = js.native
  var bordered: js.UndefOr[Boolean] = js.native
}

object WrapperProps {
  @scala.inline
  def apply(absolute: js.UndefOr[Boolean] = js.undefined, bordered: js.UndefOr[Boolean] = js.undefined): WrapperProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapperProps]
  }
}

