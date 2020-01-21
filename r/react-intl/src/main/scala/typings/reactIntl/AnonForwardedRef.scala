package typings.reactIntl

import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForwardedRef extends js.Object {
  var forwardedRef: js.UndefOr[Ref[_]] = js.undefined
}

object AnonForwardedRef {
  @scala.inline
  def apply(forwardedRef: Ref[_] = null): AnonForwardedRef = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForwardedRef]
  }
}

