package typings.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBackActionPayload extends js.Object {
  var key: js.UndefOr[String | Null] = js.undefined
}

object NavigationBackActionPayload {
  @scala.inline
  def apply(key: String = null): NavigationBackActionPayload = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[NavigationBackActionPayload]
  }
}

