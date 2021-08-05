package typings.semanticUiSearch.anon

import typings.semanticUiSearch.SemanticUI.Search.RegExpSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'regExp'> */
trait PickImplregExp extends StObject {
  
  var regExp: RegExpSettings
}
object PickImplregExp {
  
  inline def apply(regExp: RegExpSettings): PickImplregExp = {
    val __obj = js.Dynamic.literal(regExp = regExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplregExp]
  }
  
  extension [Self <: PickImplregExp](x: Self) {
    
    inline def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
  }
}
