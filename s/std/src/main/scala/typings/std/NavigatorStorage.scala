package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait NavigatorStorage extends StObject {
  
  /* standard dom */
  val storage: StorageManager
}
object NavigatorStorage {
  
  inline def apply(storage: StorageManager): NavigatorStorage = {
    val __obj = js.Dynamic.literal(storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorStorage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigatorStorage] (val x: Self) extends AnyVal {
    
    inline def setStorage(value: StorageManager): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
  }
}
