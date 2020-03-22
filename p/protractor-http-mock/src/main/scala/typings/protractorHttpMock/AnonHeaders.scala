package typings.protractorHttpMock

import typings.protractorHttpMock.protractorHttpMockStrings.GET
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeaders extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  var method: GET
  var params: js.UndefOr[js.Object] = js.undefined
  var path: String
  var queryString: js.UndefOr[js.Object] = js.undefined
  var regex: js.UndefOr[Boolean] = js.undefined
}

object AnonHeaders {
  @scala.inline
  def apply(
    method: GET,
    path: String,
    headers: js.Object = null,
    params: js.Object = null,
    queryString: js.Object = null,
    regex: js.UndefOr[Boolean] = js.undefined
  ): AnonHeaders = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (queryString != null) __obj.updateDynamic("queryString")(queryString.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeaders]
  }
}

