package typings.sentryBrowser

import typings.sentryTypes.eventprocessorMod.EventProcessor
import typings.sentryTypes.hubMod.Hub
import typings.sentryTypes.integrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalhandlersMod {
  
  @JSImport("@sentry/browser/dist/integrations/globalhandlers", "GlobalHandlers")
  @js.native
  /** JSDoc */
  class GlobalHandlers ()
    extends StObject
       with Integration {
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
      * Returns {@link IntegrationClass.id}
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * @inheritDoc
      */
    def setupOnce(): Unit = js.native
    /**
      * Sets the integration up only once.
      * This takes no options on purpose, options should be passed in the constructor
      */
    /* CompleteClass */
    override def setupOnce(
      addGlobalEventProcessor: js.Function1[/* callback */ EventProcessor, Unit],
      getCurrentHub: js.Function0[Hub]
    ): Unit = js.native
  }
  /* static members */
  object GlobalHandlers {
    
    @JSImport("@sentry/browser/dist/integrations/globalhandlers", "GlobalHandlers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/dist/integrations/globalhandlers", "GlobalHandlers.id")
    @js.native
    def id: String = js.native
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  /** JSDoc */
  trait GlobalHandlersIntegrations extends StObject {
    
    var onerror: Boolean
    
    var onunhandledrejection: Boolean
  }
  object GlobalHandlersIntegrations {
    
    @scala.inline
    def apply(onerror: Boolean, onunhandledrejection: Boolean): GlobalHandlersIntegrations = {
      val __obj = js.Dynamic.literal(onerror = onerror.asInstanceOf[js.Any], onunhandledrejection = onunhandledrejection.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalHandlersIntegrations]
    }
    
    @scala.inline
    implicit class GlobalHandlersIntegrationsMutableBuilder[Self <: GlobalHandlersIntegrations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnerror(value: Boolean): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnunhandledrejection(value: Boolean): Self = StObject.set(x, "onunhandledrejection", value.asInstanceOf[js.Any])
    }
  }
}
