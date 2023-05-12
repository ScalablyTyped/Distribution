package typings.sentryInternalTracing

import typings.sentryInternalTracing.anon.ClientPgClient
import typings.sentryInternalTracing.typesNodeIntegrationsLazyMod.LazyLoadedIntegration
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesHubMod.Hub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNodeIntegrationsPostgresMod {
  
  @JSImport("@sentry-internal/tracing/types/node/integrations/postgres", "Postgres")
  @js.native
  open class Postgres ()
    extends StObject
       with LazyLoadedIntegration[PGModule] {
    def this(options: PgOptions) = this()
    
    /* private */ var _module: Any = js.native
    
    /* private */ var _usePgNative: Any = js.native
    
    /**
      * Loads the integration's dependency and caches it so it doesn't have to be loaded again.
      *
      * If this returns undefined, the dependency could not be loaded.
      */
    /* CompleteClass */
    override def loadDependency(): js.UndefOr[PGModule] = js.native
    
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
  object Postgres {
    
    @JSImport("@sentry-internal/tracing/types/node/integrations/postgres", "Postgres")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry-internal/tracing/types/node/integrations/postgres", "Postgres.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  trait PGModule extends StObject {
    
    var Client: PgClient
    
    var native: ClientPgClient
  }
  object PGModule {
    
    inline def apply(Client: PgClient, native: ClientPgClient): PGModule = {
      val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
      __obj.asInstanceOf[PGModule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PGModule] (val x: Self) extends AnyVal {
      
      inline def setClient(value: PgClient): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
      
      inline def setNative(value: ClientPgClient): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    }
  }
  
  trait PgClient extends StObject
  
  trait PgOptions extends StObject {
    
    var usePgNative: js.UndefOr[Boolean] = js.undefined
  }
  object PgOptions {
    
    inline def apply(): PgOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PgOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PgOptions] (val x: Self) extends AnyVal {
      
      inline def setUsePgNative(value: Boolean): Self = StObject.set(x, "usePgNative", value.asInstanceOf[js.Any])
      
      inline def setUsePgNativeUndefined: Self = StObject.set(x, "usePgNative", js.undefined)
    }
  }
}
