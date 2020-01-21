package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationCompleteTransitionActionPayload extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var toChildKey: js.UndefOr[String] = js.undefined
}

object NavigationCompleteTransitionActionPayload {
  @scala.inline
  def apply(key: String = null, toChildKey: String = null): NavigationCompleteTransitionActionPayload = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (toChildKey != null) __obj.updateDynamic("toChildKey")(toChildKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationCompleteTransitionActionPayload]
  }
}

