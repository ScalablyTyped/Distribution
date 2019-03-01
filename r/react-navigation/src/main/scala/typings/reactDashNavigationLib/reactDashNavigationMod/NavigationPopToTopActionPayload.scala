package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationPopToTopActionPayload extends js.Object {
  var immediate: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
}

object NavigationPopToTopActionPayload {
  @scala.inline
  def apply(immediate: js.UndefOr[scala.Boolean] = js.undefined, key: java.lang.String = null): NavigationPopToTopActionPayload = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[NavigationPopToTopActionPayload]
  }
}

