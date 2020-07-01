package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpApiEvent extends js.Object {
  var authorizer: js.UndefOr[NamedHttpApiEventAuthorizer | IdRefHttpApiEventAuthorizer] = js.undefined
  var method: String
  var path: String
}

object HttpApiEvent {
  @scala.inline
  def apply(
    method: String,
    path: String,
    authorizer: NamedHttpApiEventAuthorizer | IdRefHttpApiEventAuthorizer = null
  ): HttpApiEvent = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (authorizer != null) __obj.updateDynamic("authorizer")(authorizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpApiEvent]
  }
}

