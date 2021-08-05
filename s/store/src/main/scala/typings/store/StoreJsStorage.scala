package typings.store

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreJsStorage extends StObject {
  
  def clearAll(): Unit
  
  def each(callback: js.Function2[/* val */ String, /* key */ String, js.Any]): Unit
  
  var name: String
  
  def read(key: String): String | Null
  
  def remove(key: String): Unit
  
  def write(key: String, data: String): Unit
}
object StoreJsStorage {
  
  inline def apply(
    clearAll: () => Unit,
    each: js.Function2[/* val */ String, /* key */ String, js.Any] => Unit,
    name: String,
    read: String => String | Null,
    remove: String => Unit,
    write: (String, String) => Unit
  ): StoreJsStorage = {
    val __obj = js.Dynamic.literal(clearAll = js.Any.fromFunction0(clearAll), each = js.Any.fromFunction1(each), name = name.asInstanceOf[js.Any], read = js.Any.fromFunction1(read), remove = js.Any.fromFunction1(remove), write = js.Any.fromFunction2(write))
    __obj.asInstanceOf[StoreJsStorage]
  }
  
  extension [Self <: StoreJsStorage](x: Self) {
    
    inline def setClearAll(value: () => Unit): Self = StObject.set(x, "clearAll", js.Any.fromFunction0(value))
    
    inline def setEach(value: js.Function2[/* val */ String, /* key */ String, js.Any] => Unit): Self = StObject.set(x, "each", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRead(value: String => String | Null): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setWrite(value: (String, String) => Unit): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
  }
}
