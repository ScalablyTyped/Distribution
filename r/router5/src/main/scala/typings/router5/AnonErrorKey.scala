package typings.router5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorKey extends js.Object {
  var errorKey: js.UndefOr[js.Any] = js.undefined
  var fromState: js.Any
  var isCancelled: js.Any
  var toState: js.Any
}

object AnonErrorKey {
  @scala.inline
  def apply(fromState: js.Any, isCancelled: js.Any, toState: js.Any, errorKey: js.Any = null): AnonErrorKey = {
    val __obj = js.Dynamic.literal(fromState = fromState.asInstanceOf[js.Any], isCancelled = isCancelled.asInstanceOf[js.Any], toState = toState.asInstanceOf[js.Any])
    if (errorKey != null) __obj.updateDynamic("errorKey")(errorKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorKey]
  }
}

