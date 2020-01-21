package typings.reactQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs[TVariables] extends js.Object {
  var disableThrow: js.UndefOr[Boolean] = js.undefined
  var merge: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var variables: js.UndefOr[TVariables] = js.undefined
}

object AnonArgs {
  @scala.inline
  def apply[TVariables](
    disableThrow: js.UndefOr[Boolean] = js.undefined,
    merge: /* repeated */ js.Any => _ = null,
    variables: TVariables = null
  ): AnonArgs[TVariables] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableThrow)) __obj.updateDynamic("disableThrow")(disableThrow.asInstanceOf[js.Any])
    if (merge != null) __obj.updateDynamic("merge")(js.Any.fromFunction1(merge))
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgs[TVariables]]
  }
}

