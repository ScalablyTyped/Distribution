package typings.protooDashServer.protooDashServerMod

import typings.protooDashServer.protooDashServerNumbers.`true`
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
    val __obj = js.Dynamic.literal(data = data, id = id, method = method, request = request)
  
    __obj.asInstanceOf[ProtooRequest]
  }
}

