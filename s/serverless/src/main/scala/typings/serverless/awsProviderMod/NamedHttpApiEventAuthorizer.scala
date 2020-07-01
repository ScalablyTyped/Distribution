package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedHttpApiEventAuthorizer extends js.Object {
  var name: String
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}

object NamedHttpApiEventAuthorizer {
  @scala.inline
  def apply(name: String, scopes: js.Array[String] = null): NamedHttpApiEventAuthorizer = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedHttpApiEventAuthorizer]
  }
}

