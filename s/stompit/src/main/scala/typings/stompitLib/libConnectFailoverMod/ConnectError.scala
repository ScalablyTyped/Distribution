package typings
package stompitLib.libConnectFailoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectError
  extends stdLib.Error {
  var connectArgs: stompitLib.libConnectMod.ConnectOptions
}

object ConnectError {
  @scala.inline
  def apply(
    connectArgs: stompitLib.libConnectMod.ConnectOptions,
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): ConnectError = {
    val __obj = js.Dynamic.literal(connectArgs = connectArgs, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ConnectError]
  }
}

