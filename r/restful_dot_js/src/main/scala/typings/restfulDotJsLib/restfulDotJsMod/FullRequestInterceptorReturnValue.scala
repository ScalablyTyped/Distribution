package typings
package restfulDotJsLib.restfulDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullRequestInterceptorReturnValue extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[Headers] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object FullRequestInterceptorReturnValue {
  @scala.inline
  def apply(
    data: js.Any = null,
    headers: Headers = null,
    method: java.lang.String = null,
    params: js.Any = null,
    url: java.lang.String = null
  ): FullRequestInterceptorReturnValue = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (params != null) __obj.updateDynamic("params")(params)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[FullRequestInterceptorReturnValue]
  }
}

