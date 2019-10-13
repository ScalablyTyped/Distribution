package typings.socketDotIoDashEmitter.socketDotIoDashEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketIORedisOptions extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var socket: js.UndefOr[String] = js.undefined
}

object SocketIORedisOptions {
  @scala.inline
  def apply(host: String = null, port: Int | Double = null, socket: String = null): SocketIORedisOptions = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket)
    __obj.asInstanceOf[SocketIORedisOptions]
  }
}

