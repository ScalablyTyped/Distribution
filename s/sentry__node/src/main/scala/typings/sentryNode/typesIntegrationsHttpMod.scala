package typings.sentryNode

import typings.sentryNode.anon.Breadcrumbs
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesHubMod.Hub
import typings.sentryTypes.typesIntegrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIntegrationsHttpMod {
  
  @JSImport("@sentry/node/types/integrations/http", "Http")
  @js.native
  /**
    * @inheritDoc
    */
  open class Http ()
    extends StObject
       with Integration {
    def this(options: Breadcrumbs) = this()
    
    /**
      * @inheritDoc
      */
    /* private */ val _breadcrumbs: Any = js.native
    
    /**
      * @inheritDoc
      */
    /* private */ val _tracing: Any = js.native
    
    /**
      * Returns {@link IntegrationClass.id}
      */
    /* CompleteClass */
    var name: String = js.native
    
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
  object Http {
    
    @JSImport("@sentry/node/types/integrations/http", "Http")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/node/types/integrations/http", "Http.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
}
