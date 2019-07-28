package typings.sipDotJs

import typings.sipDotJs.libCoreMod.IncomingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Request extends js.Object {
  var request: IncomingRequestMessage
}

object Anon_Request {
  @scala.inline
  def apply(request: IncomingRequestMessage): Anon_Request = {
    val __obj = js.Dynamic.literal(request = request)
  
    __obj.asInstanceOf[Anon_Request]
  }
}

