package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.ClassNameSettings._Impl, 'focus'> */
trait PickImplfocus extends StObject {
  
  var focus: String
}
object PickImplfocus {
  
  inline def apply(focus: String): PickImplfocus = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfocus]
  }
  
  extension [Self <: PickImplfocus](x: Self) {
    
    inline def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
  }
}
