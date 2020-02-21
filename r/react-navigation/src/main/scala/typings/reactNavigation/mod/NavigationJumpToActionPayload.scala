package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationJumpToActionPayload extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var preserveFocus: js.UndefOr[Boolean] = js.undefined
  var routeName: String
}

object NavigationJumpToActionPayload {
  @scala.inline
  def apply(routeName: String, key: String = null, preserveFocus: js.UndefOr[Boolean] = js.undefined): NavigationJumpToActionPayload = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveFocus)) __obj.updateDynamic("preserveFocus")(preserveFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationJumpToActionPayload]
  }
}

