package typings
package protractorDashHttpDashMockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  var interceptedAnonymousRequest: js.UndefOr[scala.Boolean] = js.undefined
  var interceptedRequest: js.UndefOr[scala.Boolean] = js.undefined
  var method: protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.mockNs.requestsNs.Method
  var params: js.UndefOr[js.Object] = js.undefined
  var path: java.lang.String
  var queryString: js.UndefOr[js.Object] = js.undefined
  var regex: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Headers {
  @scala.inline
  def apply(
    method: protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.mockNs.requestsNs.Method,
    path: java.lang.String,
    headers: js.Object = null,
    interceptedAnonymousRequest: js.UndefOr[scala.Boolean] = js.undefined,
    interceptedRequest: js.UndefOr[scala.Boolean] = js.undefined,
    params: js.Object = null,
    queryString: js.Object = null,
    regex: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Headers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("path")(path)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(interceptedAnonymousRequest)) __obj.updateDynamic("interceptedAnonymousRequest")(interceptedAnonymousRequest)
    if (!js.isUndefined(interceptedRequest)) __obj.updateDynamic("interceptedRequest")(interceptedRequest)
    if (params != null) __obj.updateDynamic("params")(params)
    if (queryString != null) __obj.updateDynamic("queryString")(queryString)
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex)
    __obj.asInstanceOf[Anon_Headers]
  }
}

