package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListApiKeysResponse extends js.Object {
  // list of API key objects
  var data: js.UndefOr[js.Array[ApiKey]] = js.undefined
}

object ListApiKeysResponse {
  @scala.inline
  def apply(data: js.Array[ApiKey] = null): ListApiKeysResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApiKeysResponse]
  }
}

