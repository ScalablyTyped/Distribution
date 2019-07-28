package typings.protractorDashHttpDashMock

import typings.protractorDashHttpDashMock.protractorDashHttpDashMockMod.requestsNs.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  var interceptedAnonymousRequest: js.UndefOr[Boolean] = js.undefined
  var interceptedRequest: js.UndefOr[Boolean] = js.undefined
  var method: Method
  var params: js.UndefOr[js.Object] = js.undefined
  var path: String
  var queryString: js.UndefOr[js.Object] = js.undefined
  var regex: js.UndefOr[Boolean] = js.undefined
}

object Anon_Headers {
  @scala.inline
  def apply(
    method: Method,
    path: String,
    headers: js.Object = null,
    interceptedAnonymousRequest: js.UndefOr[Boolean] = js.undefined,
    interceptedRequest: js.UndefOr[Boolean] = js.undefined,
    params: js.Object = null,
    queryString: js.Object = null,
    regex: js.UndefOr[Boolean] = js.undefined
  ): Anon_Headers = {
    val __obj = js.Dynamic.literal(method = method, path = path)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(interceptedAnonymousRequest)) __obj.updateDynamic("interceptedAnonymousRequest")(interceptedAnonymousRequest)
    if (!js.isUndefined(interceptedRequest)) __obj.updateDynamic("interceptedRequest")(interceptedRequest)
    if (params != null) __obj.updateDynamic("params")(params)
    if (queryString != null) __obj.updateDynamic("queryString")(queryString)
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex)
    __obj.asInstanceOf[Anon_Headers]
  }
}

