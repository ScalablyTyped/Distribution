package typings.reapop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnterTimeout extends js.Object {
  var enterTimeout: js.UndefOr[Double] = js.undefined
  var leaveTimeout: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[js.Any] = js.undefined
}

object AnonEnterTimeout {
  @scala.inline
  def apply(enterTimeout: Int | Double = null, leaveTimeout: Int | Double = null, name: js.Any = null): AnonEnterTimeout = {
    val __obj = js.Dynamic.literal()
    if (enterTimeout != null) __obj.updateDynamic("enterTimeout")(enterTimeout.asInstanceOf[js.Any])
    if (leaveTimeout != null) __obj.updateDynamic("leaveTimeout")(leaveTimeout.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnterTimeout]
  }
}

