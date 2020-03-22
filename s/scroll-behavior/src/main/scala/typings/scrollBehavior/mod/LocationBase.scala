package typings.scrollBehavior.mod

import typings.scrollBehavior.scrollBehaviorStrings.PUSH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationBase extends js.Object {
  var action: PUSH | String
  var hash: js.UndefOr[String] = js.undefined
}

object LocationBase {
  @scala.inline
  def apply(action: PUSH | String, hash: String = null): LocationBase = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationBase]
  }
}

