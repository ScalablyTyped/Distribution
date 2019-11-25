package typings.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationResetActionPayload extends js.Object {
  var actions: js.Array[NavigationNavigateAction]
  var index: Double
  var key: js.UndefOr[String | Null] = js.undefined
}

object NavigationResetActionPayload {
  @scala.inline
  def apply(actions: js.Array[NavigationNavigateAction], index: Double, key: String = null): NavigationResetActionPayload = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationResetActionPayload]
  }
}

