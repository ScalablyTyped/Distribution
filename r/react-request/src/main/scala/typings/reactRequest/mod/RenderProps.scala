package typings.reactRequest.mod

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
    val __obj = js.Dynamic.literal(didUnmount = didUnmount.asInstanceOf[js.Any], doFetch = js.Any.fromFunction1(doFetch), failed = failed.asInstanceOf[js.Any], fetching = fetching.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], requestKey = requestKey.asInstanceOf[js.Any], requestName = requestName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps[T]]
  }
}

