package typings.serverless.anon

import typings.serverless.validateMod.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authorizer extends js.Object {
  var authorizer: js.UndefOr[js.Any] = js.undefined
  var cors: js.UndefOr[js.Any] = js.undefined
  var integration: js.UndefOr[String] = js.undefined
  var mehtod: HttpMethod
  var path: String
}

object Authorizer {
  @scala.inline
  def apply(
    mehtod: HttpMethod,
    path: String,
    authorizer: js.Any = null,
    cors: js.Any = null,
    integration: String = null
  ): Authorizer = {
    val __obj = js.Dynamic.literal(mehtod = mehtod.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (authorizer != null) __obj.updateDynamic("authorizer")(authorizer.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (integration != null) __obj.updateDynamic("integration")(integration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorizer]
  }
}

