package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteApiKeyResponse extends js.Object {
  // the API key that was deleted
  var data: js.UndefOr[ApiKey] = js.undefined
}

object DeleteApiKeyResponse {
  @scala.inline
  def apply(data: ApiKey = null): DeleteApiKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[DeleteApiKeyResponse]
  }
}

