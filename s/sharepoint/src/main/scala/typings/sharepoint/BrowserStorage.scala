package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object BrowserStorage {
  
  /** Available only in SharePoint Online*/
  trait CachedStorage extends StObject {
    
    def clead(): Unit
    
    def getItem(key: String): String
    
    var length: Double
    
    def removeItem(key: String): Unit
    
    def setItem(key: String, value: String): Unit
  }
  object CachedStorage {
    
    inline def apply(
      clead: () => Unit,
      getItem: String => String,
      length: Double,
      removeItem: String => Unit,
      setItem: (String, String) => Unit
    ): CachedStorage = {
      val __obj = js.Dynamic.literal(clead = js.Any.fromFunction0(clead), getItem = js.Any.fromFunction1(getItem), length = length.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[CachedStorage]
    }
    
    extension [Self <: CachedStorage](x: Self) {
      
      inline def setClead(value: () => Unit): Self = StObject.set(x, "clead", js.Any.fromFunction0(value))
      
      inline def setGetItem(value: String => String): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setRemoveItem(value: String => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      inline def setSetItem(value: (String, String) => Unit): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
}
