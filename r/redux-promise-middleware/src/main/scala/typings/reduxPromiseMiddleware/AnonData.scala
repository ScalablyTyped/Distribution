package typings.reduxPromiseMiddleware

import typings.reduxPromiseMiddleware.mod.AsyncFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var promise: js.Promise[_] | AsyncFunction
}

object AnonData {
  @scala.inline
  def apply(promise: js.Promise[_] | AsyncFunction, data: js.Any = null): AnonData = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

