package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowSessionStorage extends StObject {
  
  val sessionStorage: Storage
}
object WindowSessionStorage {
  
  inline def apply(sessionStorage: Storage): WindowSessionStorage = {
    val __obj = js.Dynamic.literal(sessionStorage = sessionStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowSessionStorage]
  }
  
  extension [Self <: WindowSessionStorage](x: Self) {
    
    inline def setSessionStorage(value: Storage): Self = StObject.set(x, "sessionStorage", value.asInstanceOf[js.Any])
  }
}
