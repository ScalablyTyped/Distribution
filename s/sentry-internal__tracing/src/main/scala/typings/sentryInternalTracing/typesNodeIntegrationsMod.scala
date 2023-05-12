package typings.sentryInternalTracing

import typings.sentryInternalTracing.anon.App
import typings.sentryInternalTracing.anon.Client
import typings.sentryInternalTracing.typesNodeIntegrationsApolloMod.ApolloOptions
import typings.sentryInternalTracing.typesNodeIntegrationsLazyMod.LazyLoadedIntegration
import typings.sentryInternalTracing.typesNodeIntegrationsMongoMod.MongoOptions
import typings.sentryInternalTracing.typesNodeIntegrationsPostgresMod.PgOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNodeIntegrationsMod {
  
  @JSImport("@sentry-internal/tracing/types/node/integrations", "Apollo")
  @js.native
  /**
    * @inheritDoc
    */
  open class Apollo ()
    extends typings.sentryInternalTracing.typesNodeIntegrationsApolloMod.Apollo {
    def this(options: ApolloOptions) = this()
  }
  /* static members */
  object Apollo {
    
    @JSImport("@sentry-internal/tracing/types/node/integrations", "Apollo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry-internal/tracing/types/node/integrations", "Apollo.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry-internal/tracing/types/node/integrations", "Express")
  @js.native
  /**
    * @inheritDoc
    */
  open class Express ()
    extends typings.sentryInternalTracing.typesNodeIntegrationsExpressMod.Express {
    def this(options: App) = this()
  }
  /* static members */
  object Express {
    
    @JSImport("@sentry-internal/tracing/types/node/integrations", "Express")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry-internal/tracing/types/node/integrations", "Express.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry-internal/tracing/types/node/integrations", "GraphQL")
  @js.native
  open class GraphQL ()
    extends typings.sentryInternalTracing.typesNodeIntegrationsGraphqlMod.GraphQL
  /* static members */
  object GraphQL {
    
    @JSImport("@sentry-internal/tracing/types/node/integrations", "GraphQL")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry-internal/tracing/types/node/integrations", "GraphQL.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry-internal/tracing/types/node/integrations", "Mongo")
  @js.native
  /**
    * @inheritDoc
    */
  open class Mongo ()
    extends typings.sentryInternalTracing.typesNodeIntegrationsMongoMod.Mongo {
    def this(options: MongoOptions) = this()
  }
  /* static members */
  object Mongo {
    
    @JSImport("@sentry-internal/tracing/types/node/integrations", "Mongo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry-internal/tracing/types/node/integrations", "Mongo.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry-internal/tracing/types/node/integrations", "Mysql")
  @js.native
  open class Mysql ()
    extends typings.sentryInternalTracing.typesNodeIntegrationsMysqlMod.Mysql
  /* static members */
  object Mysql {
    
    @JSImport("@sentry-internal/tracing/types/node/integrations", "Mysql")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry-internal/tracing/types/node/integrations", "Mysql.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry-internal/tracing/types/node/integrations", "Postgres")
  @js.native
  open class Postgres ()
    extends typings.sentryInternalTracing.typesNodeIntegrationsPostgresMod.Postgres {
    def this(options: PgOptions) = this()
  }
  /* static members */
  object Postgres {
    
    @JSImport("@sentry-internal/tracing/types/node/integrations", "Postgres")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry-internal/tracing/types/node/integrations", "Postgres.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry-internal/tracing/types/node/integrations", "Prisma")
  @js.native
  /**
    * @inheritDoc
    */
  open class Prisma ()
    extends typings.sentryInternalTracing.typesNodeIntegrationsPrismaMod.Prisma {
    def this(options: Client) = this()
  }
  /* static members */
  object Prisma {
    
    @JSImport("@sentry-internal/tracing/types/node/integrations", "Prisma")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry-internal/tracing/types/node/integrations", "Prisma.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry-internal/tracing/types/node/integrations", "lazyLoadedNodePerformanceMonitoringIntegrations")
  @js.native
  val lazyLoadedNodePerformanceMonitoringIntegrations: js.Array[js.Function0[LazyLoadedIntegration[js.Object]]] = js.native
}
