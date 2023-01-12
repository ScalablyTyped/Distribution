package typings.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SEARCH
  extends StObject
     with QueryVerb {
  
  var SEARCH: js.Array[Token]
}
object SEARCH {
  
  inline def apply(SEARCH: js.Array[Token]): SEARCH = {
    val __obj = js.Dynamic.literal(SEARCH = SEARCH.asInstanceOf[js.Any])
    __obj.asInstanceOf[SEARCH]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SEARCH] (val x: Self) extends AnyVal {
    
    inline def setSEARCH(value: js.Array[Token]): Self = StObject.set(x, "SEARCH", value.asInstanceOf[js.Any])
    
    inline def setSEARCHVarargs(value: Token*): Self = StObject.set(x, "SEARCH", js.Array(value*))
  }
}
