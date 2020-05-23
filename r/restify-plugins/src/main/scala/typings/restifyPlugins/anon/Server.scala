package typings.restifyPlugins.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  var server: typings.restify.mod.Server
}

object Server {
  @scala.inline
  def apply(server: typings.restify.mod.Server): Server = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
}

