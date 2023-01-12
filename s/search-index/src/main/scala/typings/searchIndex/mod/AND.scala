package typings.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AND
  extends StObject
     with QueryVerb {
  
  var AND: js.Array[Token]
}
object AND {
  
  inline def apply(AND: js.Array[Token]): AND = {
    val __obj = js.Dynamic.literal(AND = AND.asInstanceOf[js.Any])
    __obj.asInstanceOf[AND]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AND] (val x: Self) extends AnyVal {
    
    inline def setAND(value: js.Array[Token]): Self = StObject.set(x, "AND", value.asInstanceOf[js.Any])
    
    inline def setANDVarargs(value: Token*): Self = StObject.set(x, "AND", js.Array(value*))
  }
}
