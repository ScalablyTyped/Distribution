package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl, 'standard'> */
trait PickImplstandard extends StObject {
  
  def standard(response: js.Any): String
  @JSName("standard")
  var standard_Original: js.Function1[/* response */ js.Any, String]
}
object PickImplstandard {
  
  inline def apply(standard: /* response */ js.Any => String): PickImplstandard = {
    val __obj = js.Dynamic.literal(standard = js.Any.fromFunction1(standard))
    __obj.asInstanceOf[PickImplstandard]
  }
  
  extension [Self <: PickImplstandard](x: Self) {
    
    inline def setStandard(value: /* response */ js.Any => String): Self = StObject.set(x, "standard", js.Any.fromFunction1(value))
  }
}
