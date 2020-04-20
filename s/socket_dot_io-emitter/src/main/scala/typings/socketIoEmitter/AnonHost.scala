package typings.socketIoEmitter

import typings.socketIoEmitter.mod.SocketIORedisOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHost extends SocketIORedisOptions {
  var host: String
  var port: Double
}

object AnonHost {
  @scala.inline
  def apply(host: String, port: Double): AnonHost = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHost]
  }
}

