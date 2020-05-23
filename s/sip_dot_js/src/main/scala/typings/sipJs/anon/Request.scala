package typings.sipJs.anon

import typings.sipJs.coreMod.IncomingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var request: IncomingRequestMessage
}

object Request {
  @scala.inline
  def apply(request: IncomingRequestMessage): Request = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

