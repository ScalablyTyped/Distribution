package typings.rcFieldForm

import typings.rcFieldForm.interfaceMod.InternalNamePath
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nameMapMod {
  
  /**
    * NameMap like a `Map` but accepts `string[]` as key.
    */
  @JSImport("rc-field-form/es/utils/NameMap", JSImport.Default)
  @js.native
  open class default[T] ()
    extends StObject
       with NameMap[T] {
    
    /* CompleteClass */
    override def delete(key: InternalNamePath): Unit = js.native
    
    /* CompleteClass */
    override def get(key: InternalNamePath): T = js.native
    
    /* private */ /* CompleteClass */
    var kvs: Any = js.native
    
    /* CompleteClass */
    override def map[U](callback: js.Function1[/* kv */ KV[T], U]): js.Array[U] = js.native
    
    /* CompleteClass */
    override def set(key: InternalNamePath, value: T): Unit = js.native
    
    /* CompleteClass */
    override def toJSON(): Record[String, T] = js.native
    
    /* CompleteClass */
    override def update(key: InternalNamePath, updater: js.Function1[T, T | Null]): Unit = js.native
  }
  
  trait KV[T] extends StObject {
    
    var key: InternalNamePath
    
    var value: T
  }
  object KV {
    
    inline def apply[T](key: InternalNamePath, value: T): KV[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[KV[T]]
    }
    
    extension [Self <: KV[?], T](x: Self & KV[T]) {
      
      inline def setKey(value: InternalNamePath): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyVarargs(value: (String | Double)*): Self = StObject.set(x, "key", js.Array(value*))
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * NameMap like a `Map` but accepts `string[]` as key.
    */
  trait NameMap[T] extends StObject {
    
    def delete(key: InternalNamePath): Unit
    
    def get(key: InternalNamePath): T
    
    /* private */ var kvs: Any
    
    def map[U](callback: js.Function1[/* kv */ KV[T], U]): js.Array[U]
    
    def set(key: InternalNamePath, value: T): Unit
    
    def toJSON(): Record[String, T]
    
    def update(key: InternalNamePath, updater: js.Function1[/* origin */ T, T | Null]): Unit
  }
  object NameMap {
    
    inline def apply[T](
      delete: InternalNamePath => Unit,
      get: InternalNamePath => T,
      kvs: Any,
      map: js.Function1[/* kv */ KV[T], Any] => js.Array[Any],
      set: (InternalNamePath, T) => Unit,
      toJSON: () => Record[String, T],
      update: (InternalNamePath, js.Function1[/* origin */ T, T | Null]) => Unit
    ): NameMap[T] = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), kvs = kvs.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), set = js.Any.fromFunction2(set), toJSON = js.Any.fromFunction0(toJSON), update = js.Any.fromFunction2(update))
      __obj.asInstanceOf[NameMap[T]]
    }
    
    extension [Self <: NameMap[?], T](x: Self & NameMap[T]) {
      
      inline def setDelete(value: InternalNamePath => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setGet(value: InternalNamePath => T): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setKvs(value: Any): Self = StObject.set(x, "kvs", value.asInstanceOf[js.Any])
      
      inline def setMap(value: js.Function1[/* kv */ KV[T], Any] => js.Array[Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setSet(value: (InternalNamePath, T) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setToJSON(value: () => Record[String, T]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: (InternalNamePath, js.Function1[/* origin */ T, T | Null]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
}
