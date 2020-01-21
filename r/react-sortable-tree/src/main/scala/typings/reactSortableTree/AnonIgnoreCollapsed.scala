package typings.reactSortableTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIgnoreCollapsed extends js.Object {
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
}

object AnonIgnoreCollapsed {
  @scala.inline
  def apply(ignoreCollapsed: js.UndefOr[Boolean] = js.undefined): AnonIgnoreCollapsed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCollapsed)) __obj.updateDynamic("ignoreCollapsed")(ignoreCollapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIgnoreCollapsed]
  }
}

