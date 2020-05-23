package typings.reapop.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterTimeout extends js.Object {
  var enterTimeout: js.UndefOr[Double] = js.undefined
  var leaveTimeout: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[js.Any] = js.undefined
}

object EnterTimeout {
  @scala.inline
  def apply(
    enterTimeout: js.UndefOr[Double] = js.undefined,
    leaveTimeout: js.UndefOr[Double] = js.undefined,
    name: js.Any = null
  ): EnterTimeout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enterTimeout)) __obj.updateDynamic("enterTimeout")(enterTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(leaveTimeout)) __obj.updateDynamic("leaveTimeout")(leaveTimeout.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterTimeout]
  }
}

