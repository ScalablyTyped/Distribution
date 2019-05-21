package typings
package reactDashRequestLib.reactDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps[T] extends FetchResponse[T] {
  var doFetch: DoFetch[T]
  var fetching: scala.Boolean
  var requestName: java.lang.String
}

object RenderProps {
  @scala.inline
  def apply[T](
    didUnmount: scala.Boolean,
    doFetch: DoFetch[T],
    failed: scala.Boolean,
    fetching: scala.Boolean,
    init: js.Any,
    requestKey: java.lang.String,
    requestName: java.lang.String,
    url: java.lang.String,
    data: T = null,
    error: stdLib.Error = null,
    response: stdLib.Response = null
  ): RenderProps[T] = {
    val __obj = js.Dynamic.literal(didUnmount = didUnmount, doFetch = doFetch, failed = failed, fetching = fetching, init = init, requestKey = requestKey, requestName = requestName, url = url)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (response != null) __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[RenderProps[T]]
  }
}

