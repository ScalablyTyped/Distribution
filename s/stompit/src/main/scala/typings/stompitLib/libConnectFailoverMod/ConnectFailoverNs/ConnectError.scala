package typings
package stompitLib.libConnectFailoverMod.ConnectFailoverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectError
  extends stdLib.Error {
  var connectArgs: stompitLib.libConnectMod.connectNs.ConnectOptions
}

object ConnectError {
  @scala.inline
  def apply(
    connectArgs: stompitLib.libConnectMod.connectNs.ConnectOptions,
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): ConnectError = {
    val __obj = js.Dynamic.literal(connectArgs = connectArgs, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ConnectError]
  }
}

