package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Http extends js.Object {
  var authorizer: js.UndefOr[HttpAuthorizer] = js.undefined
  var cors: js.UndefOr[Boolean] = js.undefined
  var method: String
  var path: String
  var `private`: js.UndefOr[Boolean] = js.undefined
}

object Http {
  @scala.inline
  def apply(
    method: String,
    path: String,
    authorizer: HttpAuthorizer = null,
    cors: js.UndefOr[Boolean] = js.undefined,
    `private`: js.UndefOr[Boolean] = js.undefined
  ): Http = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (authorizer != null) __obj.updateDynamic("authorizer")(authorizer.asInstanceOf[js.Any])
    if (!js.isUndefined(cors)) __obj.updateDynamic("cors")(cors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Http]
  }
}

