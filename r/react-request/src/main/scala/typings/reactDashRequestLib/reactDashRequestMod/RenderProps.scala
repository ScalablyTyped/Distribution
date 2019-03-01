package typings
package reactDashRequestLib.reactDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps[T] extends js.Object {
  var data: T | scala.Null
  var error: stdLib.Error | scala.Null
  var failed: scala.Boolean
  var fetching: scala.Boolean
  var requestKey: java.lang.String
  var requestName: java.lang.String
  var response: stdLib.Response | scala.Null
  var url: java.lang.String
}

object RenderProps {
  @scala.inline
  def apply[T](
    failed: scala.Boolean,
    fetching: scala.Boolean,
    requestKey: java.lang.String,
    requestName: java.lang.String,
    url: java.lang.String,
    data: T = null,
    error: stdLib.Error = null,
    response: stdLib.Response = null
  ): RenderProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failed")(failed)
    __obj.updateDynamic("fetching")(fetching)
    __obj.updateDynamic("requestKey")(requestKey)
    __obj.updateDynamic("requestName")(requestName)
    __obj.updateDynamic("url")(url)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (response != null) __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[RenderProps[T]]
  }
}

