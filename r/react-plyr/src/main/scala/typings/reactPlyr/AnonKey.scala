package typings.reactPlyr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
}

object AnonKey {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, key: String = null): AnonKey = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

