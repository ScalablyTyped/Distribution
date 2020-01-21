package typings.stompit.connectFailoverMod

import typings.std.Error
import typings.stompit.connectMod.ConnectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectError extends Error {
  var connectArgs: ConnectOptions
}

object ConnectError {
  @scala.inline
  def apply(connectArgs: ConnectOptions, message: String, name: String, stack: String = null): ConnectError = {
    val __obj = js.Dynamic.literal(connectArgs = connectArgs.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectError]
  }
}

