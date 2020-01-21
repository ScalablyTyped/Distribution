package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardedSocket extends js.Object {
  var socketPath: String
}

object ForwardedSocket {
  @scala.inline
  def apply(socketPath: String): ForwardedSocket = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ForwardedSocket]
  }
}

