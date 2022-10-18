package typings.sentryBrowser

import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesHubMod.Hub
import typings.sentryTypes.typesIntegrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIntegrationsGlobalhandlersMod {
  
  @JSImport("@sentry/browser/types/integrations/globalhandlers", "GlobalHandlers")
  @js.native
  /** JSDoc */
  open class GlobalHandlers ()
    extends StObject
       with Integration {
    def this(options: GlobalHandlersIntegrations) = this()
    
    /**
      * Stores references functions to installing handlers. Will set to undefined
      * after they have been run so that they are not used twice.
      */
    /* private */ var _installFunc: Any = js.native
    
    /** JSDoc */
    /* private */ val _options: Any = js.native
    
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
    
    @JSImport("@sentry/browser/types/integrations/globalhandlers", "GlobalHandlers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/types/integrations/globalhandlers", "GlobalHandlers.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  /** JSDoc */
  /* Inlined std.Record<@sentry/browser.@sentry/browser/types/integrations/globalhandlers.GlobalHandlersIntegrationsOptionKeys, boolean> */
  trait GlobalHandlersIntegrations extends StObject {
    
    var onerror: Boolean
    
    var onunhandledrejection: Boolean
  }
  object GlobalHandlersIntegrations {
    
    inline def apply(onerror: Boolean, onunhandledrejection: Boolean): GlobalHandlersIntegrations = {
      val __obj = js.Dynamic.literal(onerror = onerror.asInstanceOf[js.Any], onunhandledrejection = onunhandledrejection.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalHandlersIntegrations]
    }
    
    extension [Self <: GlobalHandlersIntegrations](x: Self) {
      
      inline def setOnerror(value: Boolean): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
      
      inline def setOnunhandledrejection(value: Boolean): Self = StObject.set(x, "onunhandledrejection", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryBrowser.sentryBrowserStrings.onerror
    - typings.sentryBrowser.sentryBrowserStrings.onunhandledrejection
  */
  trait GlobalHandlersIntegrationsOptionKeys extends StObject
  object GlobalHandlersIntegrationsOptionKeys {
    
    inline def onerror: typings.sentryBrowser.sentryBrowserStrings.onerror = "onerror".asInstanceOf[typings.sentryBrowser.sentryBrowserStrings.onerror]
    
    inline def onunhandledrejection: typings.sentryBrowser.sentryBrowserStrings.onunhandledrejection = "onunhandledrejection".asInstanceOf[typings.sentryBrowser.sentryBrowserStrings.onunhandledrejection]
  }
}
