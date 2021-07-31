package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl, 'noResults'> */
trait PickImplnoResults extends StObject {
  
  var noResults: String
}
object PickImplnoResults {
  
  @scala.inline
  def apply(noResults: String): PickImplnoResults = {
    val __obj = js.Dynamic.literal(noResults = noResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoResults]
  }
  
  @scala.inline
  implicit class PickImplnoResultsMutableBuilder[Self <: PickImplnoResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoResults(value: String): Self = StObject.set(x, "noResults", value.asInstanceOf[js.Any])
  }
}
