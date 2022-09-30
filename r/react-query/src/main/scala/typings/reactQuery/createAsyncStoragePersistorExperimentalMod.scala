package typings.reactQuery

import typings.reactQuery.persistQueryClientExperimentalMod.PersistedClient
import typings.reactQuery.persistQueryClientExperimentalMod.Persistor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createAsyncStoragePersistorExperimentalMod {
  
  @JSImport("react-query/types/createAsyncStoragePersistor-experimental", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAsyncStoragePersistor(hasStorageKeyThrottleTimeSerializeDeserialize: CreateAsyncStoragePersistorOptions): Persistor = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsyncStoragePersistor")(hasStorageKeyThrottleTimeSerializeDeserialize.asInstanceOf[js.Any]).asInstanceOf[Persistor]
  
  trait AsyncStorage extends StObject {
    
    def getItem(key: String): js.Promise[String | Null]
    
    def removeItem(key: String): js.Promise[Unit]
    
    def setItem(key: String, value: String): js.Promise[Unit]
  }
  object AsyncStorage {
    
    inline def apply(
      getItem: String => js.Promise[String | Null],
      removeItem: String => js.Promise[Unit],
      setItem: (String, String) => js.Promise[Unit]
    ): AsyncStorage = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[AsyncStorage]
    }
    
    extension [Self <: AsyncStorage](x: Self) {
      
      inline def setGetItem(value: String => js.Promise[String | Null]): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setRemoveItem(value: String => js.Promise[Unit]): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      inline def setSetItem(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
  
  trait CreateAsyncStoragePersistorOptions extends StObject {
    
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
    var storage: AsyncStorage
    
    /** To avoid spamming,
      * pass a time in ms to throttle saving the cache to disk */
    var throttleTime: js.UndefOr[Double] = js.undefined
  }
  object CreateAsyncStoragePersistorOptions {
    
    inline def apply(storage: AsyncStorage): CreateAsyncStoragePersistorOptions = {
      val __obj = js.Dynamic.literal(storage = storage.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateAsyncStoragePersistorOptions]
    }
    
    extension [Self <: CreateAsyncStoragePersistorOptions](x: Self) {
      
      inline def setDeserialize(value: /* cachedString */ String => PersistedClient): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      inline def setDeserializeUndefined: Self = StObject.set(x, "deserialize", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setSerialize(value: /* client */ PersistedClient => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      inline def setStorage(value: AsyncStorage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setThrottleTime(value: Double): Self = StObject.set(x, "throttleTime", value.asInstanceOf[js.Any])
      
      inline def setThrottleTimeUndefined: Self = StObject.set(x, "throttleTime", js.undefined)
    }
  }
}
