package typings.sentryInternalTracing

import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesHubMod.Hub
import typings.sentryTypes.typesIntegrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNodeIntegrationsLazyMod {
  
  @JSImport("@sentry-internal/tracing/types/node/integrations/lazy", "lazyLoadedNodePerformanceMonitoringIntegrations")
  @js.native
  val lazyLoadedNodePerformanceMonitoringIntegrations: js.Array[js.Function0[LazyLoadedIntegration[js.Object]]] = js.native
  
  trait LazyLoadedIntegration[T]
    extends StObject
       with Integration {
    
    /**
      * Loads the integration's dependency and caches it so it doesn't have to be loaded again.
      *
      * If this returns undefined, the dependency could not be loaded.
      */
    def loadDependency(): js.UndefOr[T]
  }
  object LazyLoadedIntegration {
    
    inline def apply[T](
      loadDependency: () => js.UndefOr[T],
      name: String,
      setupOnce: (js.Function1[/* callback */ EventProcessor, Unit], js.Function0[Hub]) => Unit
    ): LazyLoadedIntegration[T] = {
      val __obj = js.Dynamic.literal(loadDependency = js.Any.fromFunction0(loadDependency), name = name.asInstanceOf[js.Any], setupOnce = js.Any.fromFunction2(setupOnce))
      __obj.asInstanceOf[LazyLoadedIntegration[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LazyLoadedIntegration[?], T] (val x: Self & LazyLoadedIntegration[T]) extends AnyVal {
      
      inline def setLoadDependency(value: () => js.UndefOr[T]): Self = StObject.set(x, "loadDependency", js.Any.fromFunction0(value))
    }
  }
}
