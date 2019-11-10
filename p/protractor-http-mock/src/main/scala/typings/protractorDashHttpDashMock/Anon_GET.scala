package typings.protractorDashHttpDashMock

import typings.protractorDashHttpDashMock.protractorDashHttpDashMockStrings.GET
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GET extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  var method: GET
  var params: js.UndefOr[js.Object] = js.undefined
  var path: String
  var queryString: js.UndefOr[js.Object] = js.undefined
  var regex: js.UndefOr[Boolean] = js.undefined
}

object Anon_GET {
  @scala.inline
  def apply(
    method: GET,
    path: String,
    headers: js.Object = null,
    params: js.Object = null,
    queryString: js.Object = null,
    regex: js.UndefOr[Boolean] = js.undefined
  ): Anon_GET = {
    val __obj = js.Dynamic.literal(method = method, path = path)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (params != null) __obj.updateDynamic("params")(params)
    if (queryString != null) __obj.updateDynamic("queryString")(queryString)
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex)
    __obj.asInstanceOf[Anon_GET]
  }
}

