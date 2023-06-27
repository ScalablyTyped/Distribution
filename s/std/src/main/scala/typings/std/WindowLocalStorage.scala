package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowLocalStorage extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/localStorage) */
  /* standard dom */
  val localStorage: Storage
}
object WindowLocalStorage {
  
  inline def apply(localStorage: Storage): WindowLocalStorage = {
    val __obj = js.Dynamic.literal(localStorage = localStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowLocalStorage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowLocalStorage] (val x: Self) extends AnyVal {
    
    inline def setLocalStorage(value: Storage): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
  }
}
