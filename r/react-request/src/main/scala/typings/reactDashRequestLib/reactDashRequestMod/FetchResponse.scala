package typings
package reactDashRequestLib.reactDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchResponse[T] extends js.Object {
  var data: T | scala.Null
  var didUnmount: scala.Boolean
  var error: stdLib.Error | scala.Null
  var failed: scala.Boolean
  var init: js.Any
  var requestKey: java.lang.String
  var response: stdLib.Response | scala.Null
  var url: java.lang.String
}

object FetchResponse {
  @scala.inline
  def apply[T](
    didUnmount: scala.Boolean,
    failed: scala.Boolean,
    init: js.Any,
    requestKey: java.lang.String,
    url: java.lang.String,
    data: T = null,
    error: stdLib.Error = null,
    response: stdLib.Response = null
  ): FetchResponse[T] = {
    val __obj = js.Dynamic.literal(didUnmount = didUnmount, failed = failed, init = init, requestKey = requestKey, url = url)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (response != null) __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[FetchResponse[T]]
  }
}

