package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationCompleteTransitionActionPayload extends js.Object {
  var key: js.UndefOr[java.lang.String] = js.undefined
}

object NavigationCompleteTransitionActionPayload {
  @scala.inline
  def apply(key: java.lang.String = null): NavigationCompleteTransitionActionPayload = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[NavigationCompleteTransitionActionPayload]
  }
}

