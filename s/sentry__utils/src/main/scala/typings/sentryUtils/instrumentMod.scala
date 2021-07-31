package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instrumentMod {
  
  @JSImport("@sentry/utils/dist/instrument", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addInstrumentationHandler(handler: InstrumentHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addInstrumentationHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait InstrumentHandler extends StObject {
    
    def callback(data: js.Any): Unit
    @JSName("callback")
    var callback_Original: InstrumentHandlerCallback
    
    var `type`: InstrumentHandlerType
  }
  object InstrumentHandler {
    
    @scala.inline
    def apply(callback: /* data */ js.Any => Unit, `type`: InstrumentHandlerType): InstrumentHandler = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstrumentHandler]
    }
    
    @scala.inline
    implicit class InstrumentHandlerMutableBuilder[Self <: InstrumentHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: /* data */ js.Any => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setType(value: InstrumentHandlerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type InstrumentHandlerCallback = js.Function1[/* data */ js.Any, Unit]
  
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
    
    @scala.inline
    def console: typings.sentryUtils.sentryUtilsStrings.console = "console".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.console]
    
    @scala.inline
    def dom: typings.sentryUtils.sentryUtilsStrings.dom = "dom".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.dom]
    
    @scala.inline
    def error: typings.sentryUtils.sentryUtilsStrings.error = "error".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.error]
    
    @scala.inline
    def fetch: typings.sentryUtils.sentryUtilsStrings.fetch = "fetch".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.fetch]
    
    @scala.inline
    def history: typings.sentryUtils.sentryUtilsStrings.history = "history".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.history]
    
    @scala.inline
    def sentry: typings.sentryUtils.sentryUtilsStrings.sentry = "sentry".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.sentry]
    
    @scala.inline
    def unhandledrejection: typings.sentryUtils.sentryUtilsStrings.unhandledrejection = "unhandledrejection".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.unhandledrejection]
    
    @scala.inline
    def xhr: typings.sentryUtils.sentryUtilsStrings.xhr = "xhr".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.xhr]
  }
}
