package typings.reduxPersistWebextensionStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-persist-webextension-storage", "localStorage")
  @js.native
  val localStorage: StorageInterface = js.native
  
  @JSImport("redux-persist-webextension-storage", "syncStorage")
  @js.native
  val syncStorage: StorageInterface = js.native
  
  trait StorageInterface extends StObject {
    
    def getItem(key: String): js.Promise[Any]
    
    def removeItem(key: String): js.Promise[Unit]
    
    def setItem(key: String, value: Any): js.Promise[Unit]
  }
  object StorageInterface {
    
    inline def apply(
      getItem: String => js.Promise[Any],
      removeItem: String => js.Promise[Unit],
      setItem: (String, Any) => js.Promise[Unit]
    ): StorageInterface = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[StorageInterface]
    }
    
    extension [Self <: StorageInterface](x: Self) {
      
      inline def setGetItem(value: String => js.Promise[Any]): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setRemoveItem(value: String => js.Promise[Unit]): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      inline def setSetItem(value: (String, Any) => js.Promise[Unit]): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
}
