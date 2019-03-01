package typings
package reactDashAsyncLib.reactDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchInit extends js.Object {
  var headers: js.UndefOr[stdLib.Headers | js.Object] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
}

object FetchInit {
  @scala.inline
  def apply(headers: stdLib.Headers | js.Object = null, method: java.lang.String = null): FetchInit = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[FetchInit]
  }
}

