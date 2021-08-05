package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl, 'beginsWith'> */
trait PickImplbeginsWith extends StObject {
  
  var beginsWith: String
}
object PickImplbeginsWith {
  
  inline def apply(beginsWith: String): PickImplbeginsWith = {
    val __obj = js.Dynamic.literal(beginsWith = beginsWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbeginsWith]
  }
  
  extension [Self <: PickImplbeginsWith](x: Self) {
    
    inline def setBeginsWith(value: String): Self = StObject.set(x, "beginsWith", value.asInstanceOf[js.Any])
  }
}
