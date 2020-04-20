package typings.protooServer.mod

import typings.protooServer.protooServerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtooRequest extends js.Object {
  var data: js.Any
  var id: Double
  var method: String
  var request: `true`
}

object ProtooRequest {
  @scala.inline
  def apply(data: js.Any, id: Double, method: String, request: `true`): ProtooRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtooRequest]
  }
}

