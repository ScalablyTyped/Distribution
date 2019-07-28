package typings.ssh2DashStreams.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardedSocket extends js.Object {
  var socketPath: String
}

object ForwardedSocket {
  @scala.inline
  def apply(socketPath: String): ForwardedSocket = {
    val __obj = js.Dynamic.literal(socketPath = socketPath)
  
    __obj.asInstanceOf[ForwardedSocket]
  }
}

