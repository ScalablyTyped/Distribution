package typings.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl, 'maxResults'> */
@js.native
trait PickImplmaxResultsMaxResults extends js.Object {
  
  var maxResults: String = js.native
}
object PickImplmaxResultsMaxResults {
  
  @scala.inline
  def apply(maxResults: String): PickImplmaxResultsMaxResults = {
    val __obj = js.Dynamic.literal(maxResults = maxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxResultsMaxResults]
  }
  
  @scala.inline
  implicit class PickImplmaxResultsMaxResultsOps[Self <: PickImplmaxResultsMaxResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxResults(value: String): Self = this.set("maxResults", value.asInstanceOf[js.Any])
  }
}
