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
    val __obj = js.Dynamic.literal(actions = actions, index = index)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[NavigationResetActionPayload]
  }
}

