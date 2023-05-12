package typings.sentryUtils

import typings.sentryUtils.anon.Method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInstrumentMod {
  
  @JSImport("@sentry/utils/types/instrument", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/utils/types/instrument", "SENTRY_XHR_DATA_KEY")
  @js.native
  val SENTRY_XHR_DATA_KEY: /* "__sentry_xhr_v2__" */ String = js.native
  
  inline def addInstrumentationHandler(`type`: InstrumentHandlerType, callback: InstrumentHandlerCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addInstrumentationHandler")(`type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseFetchArgs(fetchArgs: js.Array[Any]): Method = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFetchArgs")(fetchArgs.asInstanceOf[js.Any]).asInstanceOf[Method]
  
  type InstrumentHandlerCallback = js.Function1[/* data */ Any, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryUtils.sentryUtilsStrings.console
    - typings.sentryUtils.sentryUtilsStrings.dom
    - typings.sentryUtils.sentryUtilsStrings.fetch
    - typings.sentryUtils.sentryUtilsStrings.history
    - typings.sentryUtils.sentryUtilsStrings.sentry
    - typings.sentryUtils.sentryUtilsStrings.xhr
    - typings.sentryUtils.sentryUtilsStrings.error
    - typings.sentryUtils.sentryUtilsStrings.unhandledrejection
  */
  trait InstrumentHandlerType extends StObject
  object InstrumentHandlerType {
    
    inline def console: typings.sentryUtils.sentryUtilsStrings.console = "console".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.console]
    
    inline def dom: typings.sentryUtils.sentryUtilsStrings.dom = "dom".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.dom]
    
    inline def error: typings.sentryUtils.sentryUtilsStrings.error = "error".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.error]
    
    inline def fetch: typings.sentryUtils.sentryUtilsStrings.fetch = "fetch".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.fetch]
    
    inline def history: typings.sentryUtils.sentryUtilsStrings.history = "history".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.history]
    
    inline def sentry: typings.sentryUtils.sentryUtilsStrings.sentry = "sentry".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.sentry]
    
    inline def unhandledrejection: typings.sentryUtils.sentryUtilsStrings.unhandledrejection = "unhandledrejection".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.unhandledrejection]
    
    inline def xhr: typings.sentryUtils.sentryUtilsStrings.xhr = "xhr".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.xhr]
  }
}
