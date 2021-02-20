package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl, 'maxResults'> */
@js.native
trait PickImplmaxResultsMaxResults extends StObject {
  
  var maxResults: String = js.native
}
object PickImplmaxResultsMaxResults {
  
  @scala.inline
  def apply(maxResults: String): PickImplmaxResultsMaxResults = {
    val __obj = js.Dynamic.literal(maxResults = maxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxResultsMaxResults]
  }
  
  @scala.inline
  implicit class PickImplmaxResultsMaxResultsMutableBuilder[Self <: PickImplmaxResultsMaxResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: String): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
  }
}
