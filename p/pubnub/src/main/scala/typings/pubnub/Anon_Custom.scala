package typings.pubnub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Custom extends js.Object {
  var custom: js.UndefOr[js.Object | Null] = js.undefined
  var id: String
}

object Anon_Custom {
  @scala.inline
  def apply(id: String, custom: js.Object = null): Anon_Custom = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Custom]
  }
}

