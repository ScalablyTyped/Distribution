package typings.staleLruCache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stale-lru-cache", JSImport.Namespace)
  @js.native
  class ^[K, V] () extends Cache[K, V] {
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
  
  @js.native
  trait CacheOptions[K, V] extends StObject {
    
    var getSize: js.UndefOr[js.Function2[/* value */ V, /* key */ K, Double]] = js.native
    
    var maxAge: js.UndefOr[Double] = js.native
    
    var maxSize: js.UndefOr[Double] = js.native
    
    var revalidate: js.UndefOr[RevalidationCallback[K, V]] = js.native
    
    var staleWhileRevalidate: js.UndefOr[Double] = js.native
  }
  object CacheOptions {
    
    @scala.inline
    def apply[K, V](): CacheOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheOptions[K, V]]
    }
    
    @scala.inline
    implicit class CacheOptionsMutableBuilder[Self <: CacheOptions[_, _], K, V] (val x: Self with (CacheOptions[K, V])) extends AnyVal {
      
      @scala.inline
      def setGetSize(value: (/* value */ V, /* key */ K) => Double): Self = StObject.set(x, "getSize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetSizeUndefined: Self = StObject.set(x, "getSize", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setRevalidate(value: (K, /* callback */ OptionsCallback[K, V]) => Unit): Self = StObject.set(x, "revalidate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRevalidateUndefined: Self = StObject.set(x, "revalidate", js.undefined)
      
      @scala.inline
      def setStaleWhileRevalidate(value: Double): Self = StObject.set(x, "staleWhileRevalidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaleWhileRevalidateUndefined: Self = StObject.set(x, "staleWhileRevalidate", js.undefined)
    }
  }
  
  type OptionsCallback[K, V] = js.Function3[
    /* error */ js.Any, 
    /* value */ js.UndefOr[V], 
    /* options */ js.UndefOr[String | (SetOptions[K, V])], 
    Unit
  ]
  
  type RevalidationCallback[K, V] = js.Function2[/* key */ K, /* callback */ OptionsCallback[K, V], Unit]
  
  @js.native
  trait SetOptions[K, V] extends StObject {
    
    var maxAge: js.UndefOr[Double] = js.native
    
    var revalidate: js.UndefOr[RevalidationCallback[K, V]] = js.native
    
    var staleWhileRevalidate: js.UndefOr[Double] = js.native
  }
  object SetOptions {
    
    @scala.inline
    def apply[K, V](): SetOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetOptions[K, V]]
    }
    
    @scala.inline
    implicit class SetOptionsMutableBuilder[Self <: SetOptions[_, _], K, V] (val x: Self with (SetOptions[K, V])) extends AnyVal {
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setRevalidate(value: (K, /* callback */ OptionsCallback[K, V]) => Unit): Self = StObject.set(x, "revalidate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRevalidateUndefined: Self = StObject.set(x, "revalidate", js.undefined)
      
      @scala.inline
      def setStaleWhileRevalidate(value: Double): Self = StObject.set(x, "staleWhileRevalidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaleWhileRevalidateUndefined: Self = StObject.set(x, "staleWhileRevalidate", js.undefined)
    }
  }
}
