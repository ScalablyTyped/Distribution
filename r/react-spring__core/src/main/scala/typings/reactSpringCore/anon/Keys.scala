package typings.reactSpringCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keys extends StObject {
  
  /** The keys affected by this update. When null, all keys are affected. */
  var keys: js.Array[String] | Null
}
object Keys {
  
  inline def apply(): Keys = {
    val __obj = js.Dynamic.literal(keys = null)
    __obj.asInstanceOf[Keys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Keys] (val x: Self) extends AnyVal {
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysNull: Self = StObject.set(x, "keys", null)
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
