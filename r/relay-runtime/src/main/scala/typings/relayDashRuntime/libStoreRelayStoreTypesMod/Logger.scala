package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def flushLogs(): Unit
  def log(message: String, values: js.Any*): Unit
}

object Logger {
  @scala.inline
  def apply(flushLogs: () => Unit, log: (String, /* repeated */ js.Any) => Unit): Logger = {
    val __obj = js.Dynamic.literal(flushLogs = js.Any.fromFunction0(flushLogs), log = js.Any.fromFunction2(log))
  
    __obj.asInstanceOf[Logger]
  }
}

