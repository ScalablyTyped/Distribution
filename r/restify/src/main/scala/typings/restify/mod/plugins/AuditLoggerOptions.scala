package typings.restify.mod.plugins

import typings.bunyan.mod.^
import typings.restify.mod.Request
import typings.restify.mod.Response
import typings.restify.mod.Server
import typings.restify.restifyStrings.after
import typings.restify.restifyStrings.routed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuditLoggerOptions extends js.Object {
  
  var body: js.UndefOr[Boolean] = js.native
  
  /**
    * The optional context function of signature
    * f(req, res, route, err).  Invoked each time an audit log is generated. This
    * function can return an object that customizes the format of anything off the
    * req, res, route, and err objects. The output of this function will be
    * available on the `context` key in the audit object.
    */
  var context: js.UndefOr[AuditLoggerContext] = js.native
  
  /**
    * The event from the server which initiates the
    * log, one of 'pre', 'routed', or 'after'
    */
  var event: typings.restify.restifyStrings.pre | routed | after = js.native
  
  /**
    * Bunyan logger
    */
  var log: ^ = js.native
  
  /**
    * Ringbuffer which is written to if passed in
    */
  var logBuffer: js.UndefOr[js.Any] = js.native
  
  /**
    * When true, prints audit logs. default true.
    */
  var printLog: js.UndefOr[Boolean] = js.native
  
  /**
    * Restify server. If passed in, causes server to emit 'auditlog' event after audit logs are flushed
    */
  var server: js.UndefOr[Server] = js.native
}
object AuditLoggerOptions {
  
  @scala.inline
  def apply(event: typings.restify.restifyStrings.pre | routed | after, log: ^): AuditLoggerOptions = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditLoggerOptions]
  }
  
  @scala.inline
  implicit class AuditLoggerOptionsOps[Self <: AuditLoggerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvent(value: typings.restify.restifyStrings.pre | routed | after): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: ^): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: Boolean): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setContext(value: (/* req */ Request, /* res */ Response, /* route */ js.Any, /* error */ js.Any) => js.Any): Self = this.set("context", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setLogBuffer(value: js.Any): Self = this.set("logBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogBuffer: Self = this.set("logBuffer", js.undefined)
    
    @scala.inline
    def setPrintLog(value: Boolean): Self = this.set("printLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintLog: Self = this.set("printLog", js.undefined)
    
    @scala.inline
    def setServer(value: Server): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
  }
}
