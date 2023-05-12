package typings.sentryInternalTracing

import typings.sentryInternalTracing.typesNodeIntegrationsLazyMod.LazyLoadedIntegration
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesHubMod.Hub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNodeIntegrationsMysqlMod {
  
  @JSImport("@sentry-internal/tracing/types/node/integrations/mysql", "Mysql")
  @js.native
  open class Mysql ()
    extends StObject
       with LazyLoadedIntegration[MysqlConnection] {
    
    /* private */ var _module: Any = js.native
    
    /**
      * Loads the integration's dependency and caches it so it doesn't have to be loaded again.
      *
      * If this returns undefined, the dependency could not be loaded.
      */
    /* CompleteClass */
    override def loadDependency(): js.UndefOr[MysqlConnection] = js.native
    
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
  object Mysql {
    
    @JSImport("@sentry-internal/tracing/types/node/integrations/mysql", "Mysql")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry-internal/tracing/types/node/integrations/mysql", "Mysql.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  trait MysqlConnection extends StObject {
    
    def createQuery(): Unit
  }
  object MysqlConnection {
    
    inline def apply(createQuery: () => Unit): MysqlConnection = {
      val __obj = js.Dynamic.literal(createQuery = js.Any.fromFunction0(createQuery))
      __obj.asInstanceOf[MysqlConnection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MysqlConnection] (val x: Self) extends AnyVal {
      
      inline def setCreateQuery(value: () => Unit): Self = StObject.set(x, "createQuery", js.Any.fromFunction0(value))
    }
  }
}
