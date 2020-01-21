package typings.sipJs

import typings.sipJs.coreMod.IncomingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequest extends js.Object {
  var request: IncomingRequestMessage
}

object AnonRequest {
  @scala.inline
  def apply(request: IncomingRequestMessage): AnonRequest = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRequest]
  }
}

