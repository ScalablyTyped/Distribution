package typings.sentryBrowser.globalhandlersMod

import typings.sentryTypes.integrationMod.Integration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/browser/dist/integrations/globalhandlers", "GlobalHandlers")
@js.native
/** JSDoc */
class GlobalHandlers () extends Integration {
  def this(options: GlobalHandlersIntegrations) = this()
  
  /** JSDoc */
  var _enhanceEventWithInitialFrame: js.Any = js.native
  
  /**
    * This function creates a stack from an old, error-less onerror handler.
    */
  var _eventFromIncompleteOnError: js.Any = js.native
  
  /**
    * This function creates an Event from an TraceKitStackTrace that has part of it missing.
    */
  var _eventFromIncompleteRejection: js.Any = js.native
  
  /** JSDoc */
  var _installGlobalOnErrorHandler: js.Any = js.native
  
  /** JSDoc */
  var _installGlobalOnUnhandledRejectionHandler: js.Any = js.native
  
  /** JSDoc */
  var _onErrorHandlerInstalled: js.Any = js.native
  
  /** JSDoc */
  var _onUnhandledRejectionHandlerInstalled: js.Any = js.native
  
  /** JSDoc */
  val _options: js.Any = js.native
  
  /**
    * @inheritDoc
    */
  def setupOnce(): Unit = js.native
}
/* static members */
@JSImport("@sentry/browser/dist/integrations/globalhandlers", "GlobalHandlers")
@js.native
object GlobalHandlers extends js.Object {
  
  /**
    * @inheritDoc
    */
  var id: String = js.native
}
