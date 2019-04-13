package typings
package sailsDotIoDotJsLib.sailsDotIoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[Headers] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var url: java.lang.String
}

object RequestOptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    data: js.Any = null,
    headers: Headers = null,
    method: java.lang.String = null,
    params: js.Any = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[RequestOptions]
  }
}

