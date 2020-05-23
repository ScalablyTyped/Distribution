package typings.reduxPromiseMiddleware.anon

import typings.reduxPromiseMiddleware.mod.AsyncFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var promise: js.Promise[_] | AsyncFunction
}

object Data {
  @scala.inline
  def apply(promise: js.Promise[_] | AsyncFunction, data: js.Any = null): Data = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

