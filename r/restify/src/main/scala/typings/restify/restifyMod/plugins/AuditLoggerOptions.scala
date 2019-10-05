package typings.restify.restifyMod.plugins

import typings.bunyan.bunyanMod.^
import typings.restify.restifyMod.Request
import typings.restify.restifyMod.Response
import typings.restify.restifyMod.Server
import typings.restify.restifyStrings.after
import typings.restify.restifyStrings.pre
import typings.restify.restifyStrings.routed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditLoggerOptions extends js.Object {
  var body: js.UndefOr[Boolean] = js.undefined
  /**
    * The optional context function of signature
    * f(req, res, route, err).  Invoked each time an audit log is generated. This
    * function can return an object that customizes the format of anything off the
    * req, res, route, and err objects. The output of this function will be
    * available on the `context` key in the audit object.
    */
  var context: js.UndefOr[AuditLoggerContext] = js.undefined
  /**
    * The event from the server which initiates the
    * log, one of 'pre', 'routed', or 'after'
    */
  var event: pre | routed | after
  /**
    * Bunyan logger
    */
  var log: ^
  /**
    * Ringbuffer which is written to if passed in
    */
  var logBuffer: js.UndefOr[js.Any] = js.undefined
  /**
    * When true, prints audit logs. default true.
    */
  var printLog: js.UndefOr[Boolean] = js.undefined
  /**
    * Restify server. If passed in, causes server to emit 'auditlog' event after audit logs are flushed
    */
  var server: js.UndefOr[Server] = js.undefined
}

object AuditLoggerOptions {
  @scala.inline
  def apply(
    event: pre | routed | after,
    log: ^,
    body: js.UndefOr[Boolean] = js.undefined,
    context: (/* req */ Request, /* res */ Response, /* route */ js.Any, /* error */ js.Any) => js.Any = null,
    logBuffer: js.Any = null,
    printLog: js.UndefOr[Boolean] = js.undefined,
    server: Server = null
  ): AuditLoggerOptions = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], log = log)
    if (!js.isUndefined(body)) __obj.updateDynamic("body")(body)
    if (context != null) __obj.updateDynamic("context")(js.Any.fromFunction4(context))
    if (logBuffer != null) __obj.updateDynamic("logBuffer")(logBuffer)
    if (!js.isUndefined(printLog)) __obj.updateDynamic("printLog")(printLog)
    if (server != null) __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[AuditLoggerOptions]
  }
}

