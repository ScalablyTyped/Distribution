package typings
package stompitLib.libConnectFailoverMod.ConnectFailoverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectError
  extends nodeLib.Error {
  var connectArgs: stompitLib.libConnectMod.connectNs.ConnectOptions
}

object ConnectError {
  @scala.inline
  def apply(connectArgs: stompitLib.libConnectMod.connectNs.ConnectOptions, stack: java.lang.String = null): ConnectError = {
    val __obj = js.Dynamic.literal(connectArgs = connectArgs)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ConnectError]
  }
}

