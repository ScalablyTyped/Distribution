package typings.restfulDotJs.restfulDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseInterceptorReturnValue extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[Headers] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object ResponseInterceptorReturnValue {
  @scala.inline
  def apply(data: js.Any = null, headers: Headers = null, method: String = null, url: String = null): ResponseInterceptorReturnValue = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ResponseInterceptorReturnValue]
  }
}

