package typings.sentryUtils

import typings.sentryUtils.instrumentMod.InstrumentHandlerType
import typings.sentryUtils.loggerMod.ConsoleLevel
import typings.sentryUtils.requestdataMod.TransactionNamingScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sentryUtilsStrings {
  
  @js.native
  sealed trait assert
    extends StObject
       with ConsoleLevel
  inline def assert: assert = "assert".asInstanceOf[assert]
  
  @js.native
  sealed trait console
    extends StObject
       with InstrumentHandlerType
  inline def console: console = "console".asInstanceOf[console]
  
  @js.native
  sealed trait debug
    extends StObject
       with ConsoleLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait dom
    extends StObject
       with InstrumentHandlerType
  inline def dom: dom = "dom".asInstanceOf[dom]
  
  @js.native
  sealed trait error
    extends StObject
       with ConsoleLevel
       with InstrumentHandlerType
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fetch
    extends StObject
       with InstrumentHandlerType
  inline def fetch: fetch = "fetch".asInstanceOf[fetch]
  
  @js.native
  sealed trait handler
    extends StObject
       with TransactionNamingScheme
  inline def handler: handler = "handler".asInstanceOf[handler]
  
  @js.native
  sealed trait history
    extends StObject
       with InstrumentHandlerType
  inline def history: history = "history".asInstanceOf[history]
  
  @js.native
  sealed trait info
    extends StObject
       with ConsoleLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait log
    extends StObject
       with ConsoleLevel
  inline def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait methodPath
    extends StObject
       with TransactionNamingScheme
  inline def methodPath: methodPath = "methodPath".asInstanceOf[methodPath]
  
  @js.native
  sealed trait path
    extends StObject
       with TransactionNamingScheme
  inline def path: path = "path".asInstanceOf[path]
  
  @js.native
  sealed trait sentry
    extends StObject
       with InstrumentHandlerType
  inline def sentry: sentry = "sentry".asInstanceOf[sentry]
  
  @js.native
  sealed trait trace
    extends StObject
       with ConsoleLevel
  inline def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait unhandledrejection
    extends StObject
       with InstrumentHandlerType
  inline def unhandledrejection: unhandledrejection = "unhandledrejection".asInstanceOf[unhandledrejection]
  
  @js.native
  sealed trait warn
    extends StObject
       with ConsoleLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait xhr
    extends StObject
       with InstrumentHandlerType
  inline def xhr: xhr = "xhr".asInstanceOf[xhr]
}
