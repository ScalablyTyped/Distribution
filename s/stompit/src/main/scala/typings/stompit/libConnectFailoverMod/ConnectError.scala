package typings.stompit.libConnectFailoverMod

import typings.std.Error
import typings.stompit.libConnectMod.ConnectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectError extends Error {
  var connectArgs: ConnectOptions
}

object ConnectError {
  @scala.inline
  def apply(connectArgs: ConnectOptions, message: String, name: String, stack: String = null): ConnectError = {
    val __obj = js.Dynamic.literal(connectArgs = connectArgs, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ConnectError]
  }
}

