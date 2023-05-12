package typings.sentryInternalTracing

import org.scalablytyped.runtime.StringDictionary
import typings.sentryInternalTracing.typesNodeIntegrationsLazyMod.LazyLoadedIntegration
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesHubMod.Hub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNodeIntegrationsGraphqlMod {
  
  @JSImport("@sentry-internal/tracing/types/node/integrations/graphql", "GraphQL")
  @js.native
  open class GraphQL ()
    extends StObject
       with LazyLoadedIntegration[GraphQLModule] {
    
    /* private */ var _module: Any = js.native
    
    /**
      * Loads the integration's dependency and caches it so it doesn't have to be loaded again.
      *
      * If this returns undefined, the dependency could not be loaded.
      */
    /* CompleteClass */
    override def loadDependency(): js.UndefOr[GraphQLModule] = js.native
    
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
  object GraphQL {
    
    @JSImport("@sentry-internal/tracing/types/node/integrations/graphql", "GraphQL")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry-internal/tracing/types/node/integrations/graphql", "GraphQL.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  type GraphQLModule = StringDictionary[js.Function1[/* repeated */ Any, Any]]
}
