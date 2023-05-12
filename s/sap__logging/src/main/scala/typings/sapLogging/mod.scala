package typings.sapLogging

import typings.expressServeStaticCore.mod.IRouterHandler
import typings.expressServeStaticCore.mod.IRouterMatcher
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.sapLogging.anon.FnCall
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sap/logging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAppContext(): AppContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createAppContext")().asInstanceOf[AppContext]
  inline def createAppContext(options: AppContextOptions): AppContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createAppContext")(options.asInstanceOf[js.Any]).asInstanceOf[AppContext]
  
  inline def middleware(options: typings.sapLogging.anon.AppContext): ReturnType[IRouterHandler[this.type] & IRouterMatcher[this.type] & FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(options.asInstanceOf[js.Any]).asInstanceOf[ReturnType[IRouterHandler[this.type] & IRouterMatcher[this.type] & FnCall]]
  
  @js.native
  trait AppContext extends StObject {
    
    /**
      * A separate log context should be created for each new event (HTTP request received, job execution started, message from
      * messaging service received). Because of the asynchronous nature of Node.js, entries produced during the processing of
      * different events can be mixed. All entries contain information specific to the log context they are associated with,
      * which helps to distinguish between entries produced during the processing of different events.
      *
      * @param options Options to create log context
      */
    def createLogContext(): LogContext = js.native
    def createLogContext(options: LogContextOptions): LogContext = js.native
    
    /**
      * Use custom fields
      * @param fields field names
      */
    def setCustomFields(fields: js.Array[String]): Unit = js.native
    
    /**
      * Change severity level
      * @param path file path
      * @param level severity level
      */
    def setLevel(path: String, level: LogLevels): Unit = js.native
    def setLevel(path: String, level: TraceLevels): Unit = js.native
    
    /**
      * Clears the security level to default
      * @param path file path
      */
    def unsetLevel(path: String): Unit = js.native
  }
  
  trait AppContextOptions extends StObject {
    
    /**
      * Only applicable to SAP applications
      */
    var csnComponent: js.UndefOr[String] = js.undefined
  }
  object AppContextOptions {
    
    inline def apply(): AppContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppContextOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppContextOptions] (val x: Self) extends AnyVal {
      
      inline def setCsnComponent(value: String): Self = StObject.set(x, "csnComponent", value.asInstanceOf[js.Any])
      
      inline def setCsnComponentUndefined: Self = StObject.set(x, "csnComponent", js.undefined)
    }
  }
  
  trait LogContext extends StObject {
    
    /**
      * The correlation id of the log context. This property is useful when the value needs to be sent to another application.
      */
    var correlationId: String
    
    /**
      * log request metrics for an HTTP response
      * @param res HTTP response
      */
    def enableNetworkLog(res: ServerResponse[IncomingMessage]): Unit
    
    /**
      * AppContext object associated with this log context
      */
    def getAppContext(): AppContext
    
    /**
      * Logger instance
      * @param path file name or path
      * @example Usage
      * ```js
      * logContext.getLogger('/Application/Network')
      * ```
      */
    def getLogger(path: String): Logger
    
    /**
      * Tracer instance
      * @param path file name or path
      * @example Usage
      * ```js
      * logContext.getTracer(__filename)
      * ```
      */
    def getTracer(path: String): Tracer
    
    /**
      * The id of the log context.
      */
    var id: String
  }
  object LogContext {
    
    inline def apply(
      correlationId: String,
      enableNetworkLog: ServerResponse[IncomingMessage] => Unit,
      getAppContext: () => AppContext,
      getLogger: String => Logger,
      getTracer: String => Tracer,
      id: String
    ): LogContext = {
      val __obj = js.Dynamic.literal(correlationId = correlationId.asInstanceOf[js.Any], enableNetworkLog = js.Any.fromFunction1(enableNetworkLog), getAppContext = js.Any.fromFunction0(getAppContext), getLogger = js.Any.fromFunction1(getLogger), getTracer = js.Any.fromFunction1(getTracer), id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogContext] (val x: Self) extends AnyVal {
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setEnableNetworkLog(value: ServerResponse[IncomingMessage] => Unit): Self = StObject.set(x, "enableNetworkLog", js.Any.fromFunction1(value))
      
      inline def setGetAppContext(value: () => AppContext): Self = StObject.set(x, "getAppContext", js.Any.fromFunction0(value))
      
      inline def setGetLogger(value: String => Logger): Self = StObject.set(x, "getLogger", js.Any.fromFunction1(value))
      
      inline def setGetTracer(value: String => Tracer): Self = StObject.set(x, "getTracer", js.Any.fromFunction1(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogContextOptions extends StObject {
    
    /**
      * Used to correlate entries for a logical transaction which involves processing within different applications. If the value
      * is not set explicitly, then it is taken from the `x-correlationid` header (if req is provided and the header is present) or
      * from the `id` of the log context.
      */
    var correlationId: js.UndefOr[String] = js.undefined
    
    /**
      * Included in all logs and traces, should be unique. Used to distinguish entries from different log contexts.
      * Defaults to an auto-generated value. If `req` is provided, the value is taken from the request headers `x-request-id`
      * and `x-vcap-request-id` if present. It is recommended to explicitly pass an empty string for log contexts used during
      * application startup. If `req` is present, then this `id` can be thought of as a request id, because all log/trace entries
      * for that request will have the same id.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Represents an HTTP request
      */
    var req: js.UndefOr[IncomingMessage] = js.undefined
  }
  object LogContextOptions {
    
    inline def apply(): LogContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogContextOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogContextOptions] (val x: Self) extends AnyVal {
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sapLogging.sapLoggingStrings.info
    - typings.sapLogging.sapLoggingStrings.warning
    - typings.sapLogging.sapLoggingStrings.error
    - typings.sapLogging.sapLoggingStrings.fatal
  */
  trait LogLevels extends StObject
  object LogLevels {
    
    inline def error: typings.sapLogging.sapLoggingStrings.error = "error".asInstanceOf[typings.sapLogging.sapLoggingStrings.error]
    
    inline def fatal: typings.sapLogging.sapLoggingStrings.fatal = "fatal".asInstanceOf[typings.sapLogging.sapLoggingStrings.fatal]
    
    inline def info: typings.sapLogging.sapLoggingStrings.info = "info".asInstanceOf[typings.sapLogging.sapLoggingStrings.info]
    
    inline def warning: typings.sapLogging.sapLoggingStrings.warning = "warning".asInstanceOf[typings.sapLogging.sapLoggingStrings.warning]
  }
  
  trait Logger extends StObject {
    
    /**
      * Uses the same string interpolation mechanism as with {@link https://nodejs.org/api/util.html#util_util_format_format_args util.format}.
      *
      * If the first argument is an error, its message is appended to the log message. Also, the error stack is written to the trace.
      *
      * If the last argument is an object with a custom field, the custom field will be included in the log output as a custom field
      * and not as part of the message.
      */
    def error(args: Any*): Unit
    
    /**
      * Uses the same string interpolation mechanism as with {@link https://nodejs.org/api/util.html#util_util_format_format_args util.format}.
      *
      * If the first argument is an error, its message is appended to the log message. Also, the error stack is written to the trace.
      *
      * If the last argument is an object with a custom field, the custom field will be included in the log output as a custom field
      * and not as part of the message.
      */
    def fatal(args: Any*): Unit
    
    /**
      * Gets the severity level
      */
    def getLevel(): LogLevels
    
    /**
      * Uses the same string interpolation mechanism as with {@link https://nodejs.org/api/util.html#util_util_format_format_args util.format}.
      *
      * If the first argument is an error, its message is appended to the log message. Also, the error stack is written to the trace.
      *
      * If the last argument is an object with a custom field, the custom field will be included in the log output as a custom field
      * and not as part of the message.
      */
    def info(args: Any*): Unit
    
    /**
      * Check whether an entry with a specific severity level will be logged with the current level configuration
      * @param level
      */
    def isEnabled(level: LogLevels): Boolean
    
    /**
      * Uses the same string interpolation mechanism as with {@link https://nodejs.org/api/util.html#util_util_format_format_args util.format}.
      *
      * If the first argument is an error, its message is appended to the log message. Also, the error stack is written to the trace.
      *
      * If the last argument is an object with a custom field, the custom field will be included in the log output as a custom field
      * and not as part of the message.
      */
    def warning(args: Any*): Unit
  }
  object Logger {
    
    inline def apply(
      error: /* repeated */ Any => Unit,
      fatal: /* repeated */ Any => Unit,
      getLevel: () => LogLevels,
      info: /* repeated */ Any => Unit,
      isEnabled: LogLevels => Boolean,
      warning: /* repeated */ Any => Unit
    ): Logger = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), fatal = js.Any.fromFunction1(fatal), getLevel = js.Any.fromFunction0(getLevel), info = js.Any.fromFunction1(info), isEnabled = js.Any.fromFunction1(isEnabled), warning = js.Any.fromFunction1(warning))
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setFatal(value: /* repeated */ Any => Unit): Self = StObject.set(x, "fatal", js.Any.fromFunction1(value))
      
      inline def setGetLevel(value: () => LogLevels): Self = StObject.set(x, "getLevel", js.Any.fromFunction0(value))
      
      inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setIsEnabled(value: LogLevels => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction1(value))
      
      inline def setWarning(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warning", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sapLogging.sapLoggingStrings.debug
    - typings.sapLogging.sapLoggingStrings.path
    - typings.sapLogging.sapLoggingStrings.info
    - typings.sapLogging.sapLoggingStrings.warning
    - typings.sapLogging.sapLoggingStrings.error
    - typings.sapLogging.sapLoggingStrings.fatal
  */
  trait TraceLevels extends StObject
  object TraceLevels {
    
    inline def debug: typings.sapLogging.sapLoggingStrings.debug = "debug".asInstanceOf[typings.sapLogging.sapLoggingStrings.debug]
    
    inline def error: typings.sapLogging.sapLoggingStrings.error = "error".asInstanceOf[typings.sapLogging.sapLoggingStrings.error]
    
    inline def fatal: typings.sapLogging.sapLoggingStrings.fatal = "fatal".asInstanceOf[typings.sapLogging.sapLoggingStrings.fatal]
    
    inline def info: typings.sapLogging.sapLoggingStrings.info = "info".asInstanceOf[typings.sapLogging.sapLoggingStrings.info]
    
    inline def path: typings.sapLogging.sapLoggingStrings.path = "path".asInstanceOf[typings.sapLogging.sapLoggingStrings.path]
    
    inline def warning: typings.sapLogging.sapLoggingStrings.warning = "warning".asInstanceOf[typings.sapLogging.sapLoggingStrings.warning]
  }
  
  @js.native
  trait Tracer extends StObject {
    
    /**
      * Used in catch blocks. You may pass the caught error as an argument.
      * @param fnName function name
      * @param error error thrown
      */
    def catching(fnName: String): Unit = js.native
    def catching(fnName: String, error: js.Error): Unit = js.native
    
    /**
      * Uses the same string interpolation mechanism as with {@link https://nodejs.org/api/util.html#util_util_format_format_args util.format}.
      *
      * If the first argument is an error, its message is appended to the log message. Also, the error stack is written to the trace.
      *
      */
    def debug(args: Any*): Unit = js.native
    
    /**
      * Used to record that a function has been entered in the program flow. You may pass all of the arguments of your function to the entering function and they will be traced.
      * @param fnName function name
      * @param args arguments of function
      */
    def entering(fnName: String, args: Any*): Unit = js.native
    
    /**
      * Uses the same string interpolation mechanism as with {@link https://nodejs.org/api/util.html#util_util_format_format_args util.format}.
      *
      * If the first argument is an error, its message is appended to the log message. Also, the error stack is written to the trace.
      *
      */
    def error(args: Any*): Unit = js.native
    
    /**
      * Typically used in pair with the entering method. You may pass the return value of your function to the exiting function.
      * @param fnName function name
      * @param args arguments of function
      */
    def exiting(fnName: String, args: Any*): Unit = js.native
    
    /**
      * Uses the same string interpolation mechanism as with {@link https://nodejs.org/api/util.html#util_util_format_format_args util.format}.
      *
      * If the first argument is an error, its message is appended to the log message. Also, the error stack is written to the trace.
      *
      */
    def fatal(args: Any*): Unit = js.native
    
    /**
      * Gets the severity level
      */
    def getLevel(): TraceLevels = js.native
    
    /**
      * Uses the same string interpolation mechanism as with {@link https://nodejs.org/api/util.html#util_util_format_format_args util.format}.
      *
      * If the first argument is an error, its message is appended to the log message. Also, the error stack is written to the trace.
      *
      */
    def info(args: Any*): Unit = js.native
    
    /**
      * Check whether an entry with a specific severity level will be logged with the current level configuration
      * @param level
      */
    def isEnabled(level: TraceLevels): Boolean = js.native
    
    /**
      * Uses the same string interpolation mechanism as with {@link https://nodejs.org/api/util.html#util_util_format_format_args util.format}.
      *
      * If the first argument is an error, its message is appended to the log message. Also, the error stack is written to the trace.
      *
      */
    def path(args: Any*): Unit = js.native
    
    /**
      * Used when you would like to trace when the code is about to throw an error. You may pass the error that is about to be thrown as an argument.
      * @param fnName function name
      * @param error error being thrown
      */
    def throwing(fnName: String): Unit = js.native
    def throwing(fnName: String, error: js.Error): Unit = js.native
    
    /**
      * Uses the same string interpolation mechanism as with {@link https://nodejs.org/api/util.html#util_util_format_format_args util.format}.
      *
      * If the first argument is an error, its message is appended to the log message. Also, the error stack is written to the trace.
      *
      */
    def warning(args: Any*): Unit = js.native
  }
}
