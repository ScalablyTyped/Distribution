package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpApi extends js.Object {
  var authorizers: js.UndefOr[Authorizers] = js.undefined
  var cors: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var payload: js.UndefOr[String] = js.undefined
}

object HttpApi {
  @scala.inline
  def apply(
    authorizers: Authorizers = null,
    cors: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    name: String = null,
    payload: String = null
  ): HttpApi = {
    val __obj = js.Dynamic.literal()
    if (authorizers != null) __obj.updateDynamic("authorizers")(authorizers.asInstanceOf[js.Any])
    if (!js.isUndefined(cors)) __obj.updateDynamic("cors")(cors.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpApi]
  }
}

