package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApiKeyResponse extends js.Object {
  // the API key that was created
  var data: js.UndefOr[ApiKey] = js.undefined
}

object CreateApiKeyResponse {
  @scala.inline
  def apply(data: ApiKey = null): CreateApiKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[CreateApiKeyResponse]
  }
}

