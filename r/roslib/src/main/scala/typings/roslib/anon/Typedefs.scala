package typings.roslib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typedefs extends StObject {
  
  var typedefs: js.Array[java.lang.String]
}
object Typedefs {
  
  inline def apply(typedefs: js.Array[java.lang.String]): Typedefs = {
    val __obj = js.Dynamic.literal(typedefs = typedefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typedefs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typedefs] (val x: Self) extends AnyVal {
    
    inline def setTypedefs(value: js.Array[java.lang.String]): Self = StObject.set(x, "typedefs", value.asInstanceOf[js.Any])
    
    inline def setTypedefsVarargs(value: java.lang.String*): Self = StObject.set(x, "typedefs", js.Array(value*))
  }
}
