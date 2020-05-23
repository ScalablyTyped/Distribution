package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationPopToTopActionPayload extends js.Object {
  var immediate: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
}

object NavigationPopToTopActionPayload {
  @scala.inline
  def apply(immediate: js.UndefOr[Boolean] = js.undefined, key: String = null): NavigationPopToTopActionPayload = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationPopToTopActionPayload]
  }
}

