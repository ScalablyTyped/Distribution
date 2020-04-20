package typings.reduxPromiseMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var promiseTypeDelimiter: js.UndefOr[String] = js.undefined
  var promiseTypeSuffixes: js.UndefOr[js.Tuple3[PendingActionType, FulfilledActionType, RejectedActionType]] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    promiseTypeDelimiter: String = null,
    promiseTypeSuffixes: js.Tuple3[PendingActionType, FulfilledActionType, RejectedActionType] = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (promiseTypeDelimiter != null) __obj.updateDynamic("promiseTypeDelimiter")(promiseTypeDelimiter.asInstanceOf[js.Any])
    if (promiseTypeSuffixes != null) __obj.updateDynamic("promiseTypeSuffixes")(promiseTypeSuffixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

