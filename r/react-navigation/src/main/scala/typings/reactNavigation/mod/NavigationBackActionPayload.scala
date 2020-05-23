package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBackActionPayload extends js.Object {
  var immediate: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String | Null] = js.undefined
}

object NavigationBackActionPayload {
  @scala.inline
  def apply(immediate: js.UndefOr[Boolean] = js.undefined, key: js.UndefOr[Null | String] = js.undefined): NavigationBackActionPayload = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBackActionPayload]
  }
}

