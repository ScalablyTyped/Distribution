package typings.restify

import typings.restify.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonServer extends js.Object {
  var server: Server
}

object AnonServer {
  @scala.inline
  def apply(server: Server): AnonServer = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonServer]
  }
}

