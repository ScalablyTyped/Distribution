package typings.receptacle

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("receptacle", JSImport.Namespace)
  @js.native
  class ^[T, X] ()
    extends StObject
       with Receptacle[T, X] {
    def this(options: Options[T]) = this()
  }
  
  trait Export[T, X] extends StObject {
    
    var id: Double | String
    
    var items: js.Array[Items[T] & InternalItemData[T]]
    
    var lastModified: Date
    
    var max: js.UndefOr[Double] = js.undefined
  }
  object Export {
    
    inline def apply[T, X](id: Double | String, items: js.Array[Items[T] & InternalItemData[T]], lastModified: Date): Export[T, X] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any])
      __obj.asInstanceOf[Export[T, X]]
    }
    
    extension [Self <: Export[?, ?], T, X](x: Self & (Export[T, X])) {
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[Items[T] & InternalItemData[T]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: (Items[T] & InternalItemData[T])*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setLastModified(value: Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    }
  }
  
  trait InternalItemData[X] extends StObject {
    
    var expires: js.UndefOr[Double] = js.undefined
    
    var meta: js.UndefOr[X] = js.undefined
    
    var refresh: js.UndefOr[Double] = js.undefined
  }
  object InternalItemData {
    
    inline def apply[X](): InternalItemData[X] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalItemData[X]]
    }
    
    extension [Self <: InternalItemData[?], X](x: Self & InternalItemData[X]) {
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setMeta(value: X): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setRefresh(value: Double): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
      
      inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    }
  }
  
  trait Items[T] extends StObject {
    
    var key: String
    
    var value: T
  }
  object Items {
    
    inline def apply[T](key: String, value: T): Items[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items[T]]
    }
    
    extension [Self <: Items[?], T](x: Self & Items[T]) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options[T] extends StObject {
    
    var id: js.UndefOr[Double | String] = js.undefined
    
    var items: js.UndefOr[js.Array[Items[T]]] = js.undefined
    
    var lastModified: js.UndefOr[Date] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    extension [Self <: Options[?], T](x: Self & Options[T]) {
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItems(value: js.Array[Items[T]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Items[T]*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setLastModified(value: Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    }
  }
  
  @js.native
  trait Receptacle[T, X] extends StObject {
    
    def clear(): Unit = js.native
    
    def delete(key: String): Unit = js.native
    
    def expire(key: String, ms: Double): Unit = js.native
    
    def get(key: String): T | Null = js.native
    
    def has(key: String): Boolean = js.native
    
    var id: Double | String = js.native
    
    var items: js.Array[Items[T]] = js.native
    
    var max: Double = js.native
    
    def meta(key: String): js.UndefOr[X] = js.native
    
    def set(key: String, value: T): Receptacle[
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ js.Any, 
        Unit
      ] = js.native
    def set(key: String, value: T, options: SetOptions[X]): Receptacle[
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ js.Any, 
        Unit
      ] = js.native
    
    var size: Double = js.native
    
    def toJSON(): Export[T, X] = js.native
  }
  
  trait SetOptions[X] extends StObject {
    
    var meta: js.UndefOr[X] = js.undefined
    
    var refresh: js.UndefOr[Boolean] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object SetOptions {
    
    inline def apply[X](): SetOptions[X] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetOptions[X]]
    }
    
    extension [Self <: SetOptions[?], X](x: Self & SetOptions[X]) {
      
      inline def setMeta(value: X): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
      
      inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
}
