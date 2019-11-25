package typings.reapop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnterTimeout extends js.Object {
  var enterTimeout: js.UndefOr[Double] = js.undefined
  var leaveTimeout: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[js.Any] = js.undefined
}

object Anon_EnterTimeout {
  @scala.inline
  def apply(enterTimeout: Int | Double = null, leaveTimeout: Int | Double = null, name: js.Any = null): Anon_EnterTimeout = {
    val __obj = js.Dynamic.literal()
    if (enterTimeout != null) __obj.updateDynamic("enterTimeout")(enterTimeout.asInstanceOf[js.Any])
    if (leaveTimeout != null) __obj.updateDynamic("leaveTimeout")(leaveTimeout.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnterTimeout]
  }
}

