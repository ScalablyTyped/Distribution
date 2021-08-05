package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'easing'> */
trait PickImpleasing extends StObject {
  
  var easing: String
}
object PickImpleasing {
  
  inline def apply(easing: String): PickImpleasing = {
    val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpleasing]
  }
  
  extension [Self <: PickImpleasing](x: Self) {
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
  }
}
