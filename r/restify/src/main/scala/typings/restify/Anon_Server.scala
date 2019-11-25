package typings.restify

import typings.restify.restifyMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Server extends js.Object {
  var server: Server
}

object Anon_Server {
  @scala.inline
  def apply(server: Server): Anon_Server = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Server]
  }
}

