package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayNetworkLoggerTransactionMod.LoggerTransactionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerProvider extends js.Object {
  def getLogger(config: LoggerTransactionConfig): Logger
}

object LoggerProvider {
  @scala.inline
  def apply(getLogger: LoggerTransactionConfig => Logger): LoggerProvider = {
    val __obj = js.Dynamic.literal(getLogger = js.Any.fromFunction1(getLogger))
  
    __obj.asInstanceOf[LoggerProvider]
  }
}

