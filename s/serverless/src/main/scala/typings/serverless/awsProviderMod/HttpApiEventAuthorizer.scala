package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpApiEventAuthorizer extends js.Object {
  var name: String
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}

object HttpApiEventAuthorizer {
  @scala.inline
  def apply(name: String, scopes: js.Array[String] = null): HttpApiEventAuthorizer = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpApiEventAuthorizer]
  }
}

