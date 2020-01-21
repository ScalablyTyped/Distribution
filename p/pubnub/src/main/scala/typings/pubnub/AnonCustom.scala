package typings.pubnub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustom extends js.Object {
  var custom: js.UndefOr[js.Object | Null] = js.undefined
  var id: String
}

object AnonCustom {
  @scala.inline
  def apply(id: String, custom: js.Object = null): AnonCustom = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustom]
  }
}

