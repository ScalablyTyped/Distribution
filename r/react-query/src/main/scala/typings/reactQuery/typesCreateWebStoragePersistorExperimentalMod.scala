package typings.reactQuery

import typings.reactQuery.typesPersistQueryClientExperimentalMod.PersistedClient
import typings.reactQuery.typesPersistQueryClientExperimentalMod.Persistor
import typings.std.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateWebStoragePersistorExperimentalMod {
  
  @JSImport("react-query/types/createWebStoragePersistor-experimental", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWebStoragePersistor(param0: CreateWebStoragePersistorOptions): Persistor = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebStoragePersistor")(param0.asInstanceOf[js.Any]).asInstanceOf[Persistor]
  
  trait CreateWebStoragePersistorOptions extends StObject {
    
    /**
      * How to deserialize the data from storage.
      * @default `JSON.parse`
      */
    var deserialize: js.UndefOr[js.Function1[/* cachedString */ String, PersistedClient]] = js.undefined
    
    /** The key to use when storing the cache */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * How to serialize the data to storage.
      * @default `JSON.stringify`
      */
    var serialize: js.UndefOr[js.Function1[/* client */ PersistedClient, String]] = js.undefined
    
    /** The storage client used for setting an retrieving items from cache */
    var storage: Storage
    
    /** To avoid spamming,
      * pass a time in ms to throttle saving the cache to disk */
    var throttleTime: js.UndefOr[Double] = js.undefined
  }
  object CreateWebStoragePersistorOptions {
    
    inline def apply(storage: Storage): CreateWebStoragePersistorOptions = {
      val __obj = js.Dynamic.literal(storage = storage.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateWebStoragePersistorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateWebStoragePersistorOptions] (val x: Self) extends AnyVal {
      
      inline def setDeserialize(value: /* cachedString */ String => PersistedClient): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      inline def setDeserializeUndefined: Self = StObject.set(x, "deserialize", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setSerialize(value: /* client */ PersistedClient => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      inline def setStorage(value: Storage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setThrottleTime(value: Double): Self = StObject.set(x, "throttleTime", value.asInstanceOf[js.Any])
      
      inline def setThrottleTimeUndefined: Self = StObject.set(x, "throttleTime", js.undefined)
    }
  }
}
