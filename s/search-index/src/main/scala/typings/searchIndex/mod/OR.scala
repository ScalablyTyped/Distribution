package typings.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OR
  extends StObject
     with QueryVerb {
  
  var OR: js.Array[Token]
}
object OR {
  
  inline def apply(OR: js.Array[Token]): OR = {
    val __obj = js.Dynamic.literal(OR = OR.asInstanceOf[js.Any])
    __obj.asInstanceOf[OR]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OR] (val x: Self) extends AnyVal {
    
    inline def setOR(value: js.Array[Token]): Self = StObject.set(x, "OR", value.asInstanceOf[js.Any])
    
    inline def setORVarargs(value: Token*): Self = StObject.set(x, "OR", js.Array(value*))
  }
}
