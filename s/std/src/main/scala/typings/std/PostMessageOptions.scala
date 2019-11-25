package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostMessageOptions extends js.Object {
  var transfer: js.UndefOr[js.Array[_]] = js.undefined
}

object PostMessageOptions {
  @scala.inline
  def apply(transfer: js.Array[_] = null): PostMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (transfer != null) __obj.updateDynamic("transfer")(transfer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostMessageOptions]
  }
}

