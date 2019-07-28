package typings.reactDashRequest.reactDashRequestMod

import typings.std.Error
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchResponse[T] extends js.Object {
  var data: T | Null
  var didUnmount: Boolean
  var error: Error | Null
  var failed: Boolean
  var init: js.Any
  var requestKey: String
  var response: Response | Null
  var url: String
}

object FetchResponse {
  @scala.inline
  def apply[T](
    didUnmount: Boolean,
    failed: Boolean,
    init: js.Any,
    requestKey: String,
    url: String,
    data: T = null,
    error: Error = null,
    response: Response = null
  ): FetchResponse[T] = {
    val __obj = js.Dynamic.literal(didUnmount = didUnmount, failed = failed, init = init, requestKey = requestKey, url = url)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (response != null) __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[FetchResponse[T]]
  }
}

