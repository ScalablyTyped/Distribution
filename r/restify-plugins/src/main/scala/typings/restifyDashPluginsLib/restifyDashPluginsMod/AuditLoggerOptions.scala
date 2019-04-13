package typings
package restifyDashPluginsLib.restifyDashPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditLoggerOptions extends js.Object {
  var body: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Bunyan logger
    */
  var log: bunyanLib.bunyanMod.^
  /**
    * Ringbuffer which is written to if passed in
    */
  var logBuffer: js.UndefOr[js.Any] = js.undefined
  /**
    * When true, prints audit logs. default true.
    */
  var printLog: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Restify server. If passed in, causes server to emit 'auditlog' event after audit logs are flushed
    */
  var server: js.UndefOr[restifyLib.restifyMod.Server] = js.undefined
}

object AuditLoggerOptions {
  @scala.inline
  def apply(
    log: bunyanLib.bunyanMod.^,
    body: js.UndefOr[scala.Boolean] = js.undefined,
    logBuffer: js.Any = null,
    printLog: js.UndefOr[scala.Boolean] = js.undefined,
    server: restifyLib.restifyMod.Server = null
  ): AuditLoggerOptions = {
    val __obj = js.Dynamic.literal(log = log)
    if (!js.isUndefined(body)) __obj.updateDynamic("body")(body)
    if (logBuffer != null) __obj.updateDynamic("logBuffer")(logBuffer)
    if (!js.isUndefined(printLog)) __obj.updateDynamic("printLog")(printLog)
    if (server != null) __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[AuditLoggerOptions]
  }
}

