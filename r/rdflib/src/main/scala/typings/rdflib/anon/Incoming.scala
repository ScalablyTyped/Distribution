package typings.rdflib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Incoming extends StObject {
  
  var roots: js.Array[Any]
}
object Incoming {
  
  inline def apply(roots: js.Array[Any]): Incoming = {
    val __obj = js.Dynamic.literal(roots = roots.asInstanceOf[js.Any])
    __obj.asInstanceOf[Incoming]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Incoming] (val x: Self) extends AnyVal {
    
    inline def setRoots(value: js.Array[Any]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
    
    inline def setRootsVarargs(value: Any*): Self = StObject.set(x, "roots", js.Array(value*))
  }
}
