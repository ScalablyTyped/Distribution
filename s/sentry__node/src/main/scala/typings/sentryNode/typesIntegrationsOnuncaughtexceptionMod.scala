package typings.sentryNode

import typings.sentryNode.anon.OnFatalError
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesHubMod.Hub
import typings.sentryTypes.typesIntegrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIntegrationsOnuncaughtexceptionMod {
  
  @JSImport("@sentry/node/types/integrations/onuncaughtexception", "OnUncaughtException")
  @js.native
  /**
    * @inheritDoc
    */
  open class OnUncaughtException ()
    extends StObject
       with Integration {
    def this(_options: OnFatalError) = this()
    
    /**
      * @hidden
      */
    /* private */ var _makeErrorHandler: Any = js.native
    
    /* private */ val _options: Any = js.native
    
    /**
      * @inheritDoc
      */
    def handler(error: js.Error): Unit = js.native
    
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
  object OnUncaughtException {
    
    @JSImport("@sentry/node/types/integrations/onuncaughtexception", "OnUncaughtException")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/node/types/integrations/onuncaughtexception", "OnUncaughtException.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
}
