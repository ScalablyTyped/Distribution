package typings.restify.mod.plugins

import typings.restify.mod.Request
import typings.restify.mod.Response
import typings.restify.mod.Server
import typings.restify.restifyStrings.after
import typings.restify.restifyStrings.routed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditLoggerOptions extends StObject {
  
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
  var event: typings.restify.restifyStrings.pre | routed | after
  
  /**
    * Bunyan logger
    */
  var log: typings.bunyan.mod.^
  
  /**
    * Ringbuffer which is written to if passed in
    */
  var logBuffer: js.UndefOr[Any] = js.undefined
  
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
  
  inline def apply(event: typings.restify.restifyStrings.pre | routed | after, log: typings.bunyan.mod.^): AuditLoggerOptions = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditLoggerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditLoggerOptions] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Boolean): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setContext(value: (/* req */ Request, /* res */ Response, /* route */ Any, /* error */ Any) => Any): Self = StObject.set(x, "context", js.Any.fromFunction4(value))
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setEvent(value: typings.restify.restifyStrings.pre | routed | after): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setLog(value: typings.bunyan.mod.^): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogBuffer(value: Any): Self = StObject.set(x, "logBuffer", value.asInstanceOf[js.Any])
    
    inline def setLogBufferUndefined: Self = StObject.set(x, "logBuffer", js.undefined)
    
    inline def setPrintLog(value: Boolean): Self = StObject.set(x, "printLog", value.asInstanceOf[js.Any])
    
    inline def setPrintLogUndefined: Self = StObject.set(x, "printLog", js.undefined)
    
    inline def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
