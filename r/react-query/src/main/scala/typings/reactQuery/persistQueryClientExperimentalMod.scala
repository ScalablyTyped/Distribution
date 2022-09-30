package typings.reactQuery

import typings.reactQuery.coreMod.QueryClient
import typings.reactQuery.hydrationMod.DehydrateOptions
import typings.reactQuery.hydrationMod.DehydratedState
import typings.reactQuery.hydrationMod.HydrateOptions
import typings.typeFest.promisableMod.Promisable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object persistQueryClientExperimentalMod {
  
  @JSImport("react-query/types/persistQueryClient-experimental", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def persistQueryClient(hasQueryClientPersistorMaxAgeBusterHydrateOptionsDehydrateOptions: PersistQueryClientOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("persistQueryClient")(hasQueryClientPersistorMaxAgeBusterHydrateOptionsDehydrateOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait PersistQueryClientOptions extends StObject {
    
    /** A unique string that can be used to forcefully
      * invalidate existing caches if they do not share the same buster string */
    var buster: js.UndefOr[String] = js.undefined
    
    /** The options passed to the dehydrate function */
    var dehydrateOptions: js.UndefOr[DehydrateOptions] = js.undefined
    
    /** The options passed to the hydrate function */
    var hydrateOptions: js.UndefOr[HydrateOptions] = js.undefined
    
    /** The max-allowed age of the cache.
      * If a persisted cache is found that is older than this
      * time, it will be discarded */
    var maxAge: js.UndefOr[Double] = js.undefined
    
    /** The Persistor interface for storing and restoring the cache
      * to/from a persisted location */
    var persistor: Persistor
    
    /** The QueryClient to persist */
    var queryClient: QueryClient
  }
  object PersistQueryClientOptions {
    
    inline def apply(persistor: Persistor, queryClient: QueryClient): PersistQueryClientOptions = {
      val __obj = js.Dynamic.literal(persistor = persistor.asInstanceOf[js.Any], queryClient = queryClient.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistQueryClientOptions]
    }
    
    extension [Self <: PersistQueryClientOptions](x: Self) {
      
      inline def setBuster(value: String): Self = StObject.set(x, "buster", value.asInstanceOf[js.Any])
      
      inline def setBusterUndefined: Self = StObject.set(x, "buster", js.undefined)
      
      inline def setDehydrateOptions(value: DehydrateOptions): Self = StObject.set(x, "dehydrateOptions", value.asInstanceOf[js.Any])
      
      inline def setDehydrateOptionsUndefined: Self = StObject.set(x, "dehydrateOptions", js.undefined)
      
      inline def setHydrateOptions(value: HydrateOptions): Self = StObject.set(x, "hydrateOptions", value.asInstanceOf[js.Any])
      
      inline def setHydrateOptionsUndefined: Self = StObject.set(x, "hydrateOptions", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setPersistor(value: Persistor): Self = StObject.set(x, "persistor", value.asInstanceOf[js.Any])
      
      inline def setQueryClient(value: QueryClient): Self = StObject.set(x, "queryClient", value.asInstanceOf[js.Any])
    }
  }
  
  trait PersistedClient extends StObject {
    
    var buster: String
    
    var clientState: DehydratedState
    
    var timestamp: Double
  }
  object PersistedClient {
    
    inline def apply(buster: String, clientState: DehydratedState, timestamp: Double): PersistedClient = {
      val __obj = js.Dynamic.literal(buster = buster.asInstanceOf[js.Any], clientState = clientState.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistedClient]
    }
    
    extension [Self <: PersistedClient](x: Self) {
      
      inline def setBuster(value: String): Self = StObject.set(x, "buster", value.asInstanceOf[js.Any])
      
      inline def setClientState(value: DehydratedState): Self = StObject.set(x, "clientState", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait Persistor extends StObject {
    
    def persistClient(persistClient: PersistedClient): Promisable[Unit]
    
    def removeClient(): Promisable[Unit]
    
    def restoreClient(): Promisable[js.UndefOr[PersistedClient]]
  }
  object Persistor {
    
    inline def apply(
      persistClient: PersistedClient => Promisable[Unit],
      removeClient: () => Promisable[Unit],
      restoreClient: () => Promisable[js.UndefOr[PersistedClient]]
    ): Persistor = {
      val __obj = js.Dynamic.literal(persistClient = js.Any.fromFunction1(persistClient), removeClient = js.Any.fromFunction0(removeClient), restoreClient = js.Any.fromFunction0(restoreClient))
      __obj.asInstanceOf[Persistor]
    }
    
    extension [Self <: Persistor](x: Self) {
      
      inline def setPersistClient(value: PersistedClient => Promisable[Unit]): Self = StObject.set(x, "persistClient", js.Any.fromFunction1(value))
      
      inline def setRemoveClient(value: () => Promisable[Unit]): Self = StObject.set(x, "removeClient", js.Any.fromFunction0(value))
      
      inline def setRestoreClient(value: () => Promisable[js.UndefOr[PersistedClient]]): Self = StObject.set(x, "restoreClient", js.Any.fromFunction0(value))
    }
  }
}
