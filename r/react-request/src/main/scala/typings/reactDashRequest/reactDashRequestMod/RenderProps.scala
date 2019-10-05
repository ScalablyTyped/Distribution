package typings.reactDashRequest.reactDashRequestMod

import typings.std.Error
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps[T] extends FetchResponse[T] {
  var doFetch: DoFetch[T]
  var fetching: Boolean
  var requestName: String
}

object RenderProps {
  @scala.inline
  def apply[T](
    didUnmount: Boolean,
    doFetch: /* options */ js.UndefOr[DoFetchOptions] => js.Promise[FetchResponse[T]],
    failed: Boolean,
    fetching: Boolean,
    init: js.Any,
    requestKey: String,
    requestName: String,
    url: String,
    data: T = null,
    error: Error = null,
    response: Response = null
  ): RenderProps[T] = {
    val __obj = js.Dynamic.literal(didUnmount = didUnmount, doFetch = js.Any.fromFunction1(doFetch), failed = failed, fetching = fetching, init = init, requestKey = requestKey, requestName = requestName, url = url)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (response != null) __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[RenderProps[T]]
  }
}

