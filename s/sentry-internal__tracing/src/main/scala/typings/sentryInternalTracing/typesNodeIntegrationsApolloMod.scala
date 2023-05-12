package typings.sentryInternalTracing

import org.scalablytyped.runtime.StringDictionary
import typings.sentryInternalTracing.typesNodeIntegrationsLazyMod.LazyLoadedIntegration
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesHubMod.Hub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNodeIntegrationsApolloMod {
  
  @JSImport("@sentry-internal/tracing/types/node/integrations/apollo", "Apollo")
  @js.native
  /**
    * @inheritDoc
    */
  open class Apollo ()
    extends StObject
       with LazyLoadedIntegration[GraphQLModule & ApolloModule] {
    def this(options: ApolloOptions) = this()
    
    /* private */ var _module: Any = js.native
    
    /* private */ val _useNest: Any = js.native
    
    /**
      * Loads the integration's dependency and caches it so it doesn't have to be loaded again.
      *
      * If this returns undefined, the dependency could not be loaded.
      */
    /* CompleteClass */
    override def loadDependency(): js.UndefOr[GraphQLModule & ApolloModule] = js.native
    
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
  object Apollo {
    
    @JSImport("@sentry-internal/tracing/types/node/integrations/apollo", "Apollo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry-internal/tracing/types/node/integrations/apollo", "Apollo.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  type ApolloModelResolvers = StringDictionary[ApolloResolverGroup]
  
  trait ApolloModule extends StObject
  
  trait ApolloOptions extends StObject {
    
    var useNestjs: js.UndefOr[Boolean] = js.undefined
  }
  object ApolloOptions {
    
    inline def apply(): ApolloOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApolloOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApolloOptions] (val x: Self) extends AnyVal {
      
      inline def setUseNestjs(value: Boolean): Self = StObject.set(x, "useNestjs", value.asInstanceOf[js.Any])
      
      inline def setUseNestjsUndefined: Self = StObject.set(x, "useNestjs", js.undefined)
    }
  }
  
  type ApolloResolverGroup = StringDictionary[js.Function0[Any]]
  
  trait GraphQLModule extends StObject
}
