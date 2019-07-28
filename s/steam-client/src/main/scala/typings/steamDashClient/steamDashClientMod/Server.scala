package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  var host: String
  var port: String | Double
}

object Server {
  @scala.inline
  def apply(host: String, port: String | Double): Server = {
    val __obj = js.Dynamic.literal(host = host, port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Server]
  }
}

