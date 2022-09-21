package typings.staleLruCache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stale-lru-cache", JSImport.Namespace)
  @js.native
  open class ^[K, V] ()
    extends StObject
       with Cache[K, V] {
    def this(options: CacheOptions[K, V]) = this()
  }
  
  @js.native
  trait Cache[K, V] extends StObject {
    
    def delete(key: K): Boolean = js.native
    
    def get(key: K): js.UndefOr[V] = js.native
    
    def has(key: K): Boolean = js.native
    
    def isStale(key: K): Boolean = js.native
    
    def keys(): js.Array[K] = js.native
    
    def reset(): Unit = js.native
    
    def set(key: K, value: V): Boolean = js.native
    def set(key: K, value: V, options: String): Boolean = js.native
    def set(key: K, value: V, options: SetOptions[K, V]): Boolean = js.native
    
    def size(): Double = js.native
    
    def values(): js.Array[V] = js.native
    
    def wrap(key: K, revalidate: RevalidationCallback[K, V], callback: OptionsCallback[K, V]): Unit = js.native
  }
  
  trait CacheOptions[K, V] extends StObject {
    
    var getSize: js.UndefOr[js.Function2[/* value */ V, /* key */ K, Double]] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var maxSize: js.UndefOr[Double] = js.undefined
    
    var revalidate: js.UndefOr[RevalidationCallback[K, V]] = js.undefined
    
    var staleWhileRevalidate: js.UndefOr[Double] = js.undefined
  }
  object CacheOptions {
    
    inline def apply[K, V](): CacheOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheOptions[K, V]]
    }
    
    extension [Self <: CacheOptions[?, ?], K, V](x: Self & (CacheOptions[K, V])) {
      
      inline def setGetSize(value: (/* value */ V, /* key */ K) => Double): Self = StObject.set(x, "getSize", js.Any.fromFunction2(value))
      
      inline def setGetSizeUndefined: Self = StObject.set(x, "getSize", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setRevalidate(value: (K, /* callback */ OptionsCallback[K, V]) => Unit): Self = StObject.set(x, "revalidate", js.Any.fromFunction2(value))
      
      inline def setRevalidateUndefined: Self = StObject.set(x, "revalidate", js.undefined)
      
      inline def setStaleWhileRevalidate(value: Double): Self = StObject.set(x, "staleWhileRevalidate", value.asInstanceOf[js.Any])
      
      inline def setStaleWhileRevalidateUndefined: Self = StObject.set(x, "staleWhileRevalidate", js.undefined)
    }
  }
  
  type OptionsCallback[K, V] = js.Function3[
    /* error */ Any, 
    /* value */ js.UndefOr[V], 
    /* options */ js.UndefOr[String | (SetOptions[K, V])], 
    Unit
  ]
  
  type RevalidationCallback[K, V] = js.Function2[/* key */ K, /* callback */ OptionsCallback[K, V], Unit]
  
  trait SetOptions[K, V] extends StObject {
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var revalidate: js.UndefOr[RevalidationCallback[K, V]] = js.undefined
    
    var staleWhileRevalidate: js.UndefOr[Double] = js.undefined
  }
  object SetOptions {
    
    inline def apply[K, V](): SetOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetOptions[K, V]]
    }
    
    extension [Self <: SetOptions[?, ?], K, V](x: Self & (SetOptions[K, V])) {
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setRevalidate(value: (K, /* callback */ OptionsCallback[K, V]) => Unit): Self = StObject.set(x, "revalidate", js.Any.fromFunction2(value))
      
      inline def setRevalidateUndefined: Self = StObject.set(x, "revalidate", js.undefined)
      
      inline def setStaleWhileRevalidate(value: Double): Self = StObject.set(x, "staleWhileRevalidate", value.asInstanceOf[js.Any])
      
      inline def setStaleWhileRevalidateUndefined: Self = StObject.set(x, "staleWhileRevalidate", js.undefined)
    }
  }
}
