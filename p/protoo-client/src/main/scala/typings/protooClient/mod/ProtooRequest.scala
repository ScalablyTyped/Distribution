package typings.protooClient.mod

import typings.protooClient.protooClientBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtooRequest extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var id: Double
  var method: String
  var request: `true`
}

object ProtooRequest {
  @scala.inline
  def apply(id: Double, method: String, request: `true`, data: js.Any = null): ProtooRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtooRequest]
  }
}

