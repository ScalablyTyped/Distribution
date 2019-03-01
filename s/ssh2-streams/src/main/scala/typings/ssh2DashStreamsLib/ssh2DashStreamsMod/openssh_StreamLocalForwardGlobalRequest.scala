package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait openssh_StreamLocalForwardGlobalRequest extends _GlobalRequest {
  var socketPath: java.lang.String
}

object openssh_StreamLocalForwardGlobalRequest {
  @scala.inline
  def apply(socketPath: java.lang.String): openssh_StreamLocalForwardGlobalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("socketPath")(socketPath)
    __obj.asInstanceOf[openssh_StreamLocalForwardGlobalRequest]
  }
}

