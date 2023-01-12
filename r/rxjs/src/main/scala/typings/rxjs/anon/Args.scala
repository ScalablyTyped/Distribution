package typings.rxjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Args[T] extends StObject {
  
  var args: js.Array[T]
  
  var keys: js.Array[String] | Null
}
object Args {
  
  inline def apply[T](args: js.Array[T]): Args[T] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], keys = null)
    __obj.asInstanceOf[Args[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Args[?], T] (val x: Self & Args[T]) extends AnyVal {
    
    inline def setArgs(value: js.Array[T]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: T*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysNull: Self = StObject.set(x, "keys", null)
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
