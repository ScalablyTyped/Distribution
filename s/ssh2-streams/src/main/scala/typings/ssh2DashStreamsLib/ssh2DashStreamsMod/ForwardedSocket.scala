package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardedSocket extends js.Object {
  var socketPath: java.lang.String
}

object ForwardedSocket {
  @scala.inline
  def apply(socketPath: java.lang.String): ForwardedSocket = {
    val __obj = js.Dynamic.literal(socketPath = socketPath)
  
    __obj.asInstanceOf[ForwardedSocket]
  }
}

