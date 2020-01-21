package typings.reactIntl

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForwardedRefInstance extends js.Object {
  var forwardedRef: js.UndefOr[(js.Function1[/* instance */ js.Any, Unit]) | RefObject[_] | Null] = js.undefined
}

object AnonForwardedRefInstance {
  @scala.inline
  def apply(forwardedRef: (js.Function1[/* instance */ js.Any, Unit]) | RefObject[_] = null): AnonForwardedRefInstance = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForwardedRefInstance]
  }
}

