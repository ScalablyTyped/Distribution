package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdRefHttpApiEventAuthorizer extends js.Object {
  var id: String
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}

object IdRefHttpApiEventAuthorizer {
  @scala.inline
  def apply(id: String, scopes: js.Array[String] = null): IdRefHttpApiEventAuthorizer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdRefHttpApiEventAuthorizer]
  }
}

