package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'showNoResults'> */
@js.native
trait PickImplshowNoResults extends StObject {
  
  var showNoResults: Boolean = js.native
}
object PickImplshowNoResults {
  
  @scala.inline
  def apply(showNoResults: Boolean): PickImplshowNoResults = {
    val __obj = js.Dynamic.literal(showNoResults = showNoResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplshowNoResults]
  }
  
  @scala.inline
  implicit class PickImplshowNoResultsMutableBuilder[Self <: PickImplshowNoResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShowNoResults(value: Boolean): Self = StObject.set(x, "showNoResults", value.asInstanceOf[js.Any])
  }
}
