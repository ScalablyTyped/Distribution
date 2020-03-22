package typings.reactQuery.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationResult[TResults] extends js.Object {
  var data: TResults | Null
  var error: Null | Error
  var isLoading: Boolean
  var promise: js.Promise[TResults]
  def reset(): Unit
}

object MutationResult {
  @scala.inline
  def apply[TResults](
    isLoading: Boolean,
    promise: js.Promise[TResults],
    reset: () => Unit,
    data: TResults = null,
    error: Error = null
  ): MutationResult[TResults] = {
    val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult[TResults]]
  }
}

