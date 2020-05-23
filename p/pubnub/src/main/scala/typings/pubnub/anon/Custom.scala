package typings.pubnub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Custom extends js.Object {
  var custom: js.UndefOr[js.Object | Null] = js.undefined
  var id: String
}

object Custom {
  @scala.inline
  def apply(id: String, custom: js.UndefOr[Null | js.Object] = js.undefined): Custom = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custom]
  }
}

