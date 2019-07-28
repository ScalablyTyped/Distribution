package typings.ssh2DashStreams.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait openssh_StreamLocalForwardGlobalRequest extends _GlobalRequest {
  var socketPath: String
}

object openssh_StreamLocalForwardGlobalRequest {
  @scala.inline
  def apply(socketPath: String): openssh_StreamLocalForwardGlobalRequest = {
    val __obj = js.Dynamic.literal(socketPath = socketPath)
  
    __obj.asInstanceOf[openssh_StreamLocalForwardGlobalRequest]
  }
}

