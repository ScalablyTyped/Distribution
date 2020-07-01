package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Http extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var authorizer: js.UndefOr[HttpAuthorizer] = js.undefined
  var cors: js.UndefOr[Boolean | HttpCors] = js.undefined
  var method: String
  var path: String
  var `private`: js.UndefOr[Boolean] = js.undefined
  var request: js.UndefOr[HttpRequestValidation] = js.undefined
}

object Http {
  @scala.inline
  def apply(
    method: String,
    path: String,
    async: js.UndefOr[Boolean] = js.undefined,
    authorizer: HttpAuthorizer = null,
    cors: Boolean | HttpCors = null,
    `private`: js.UndefOr[Boolean] = js.undefined,
    request: HttpRequestValidation = null
  ): Http = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (authorizer != null) __obj.updateDynamic("authorizer")(authorizer.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.get.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Http]
  }
}

