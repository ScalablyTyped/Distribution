package typings.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'showNoResults'> */
@js.native
trait PickImplshowNoResults extends js.Object {
  var showNoResults: Boolean = js.native
}

object PickImplshowNoResults {
  @scala.inline
  def apply(showNoResults: Boolean): PickImplshowNoResults = {
    val __obj = js.Dynamic.literal(showNoResults = showNoResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplshowNoResults]
  }
  @scala.inline
  implicit class PickImplshowNoResultsOps[Self <: PickImplshowNoResults] (val x: Self) extends AnyVal {
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
    def setShowNoResults(value: Boolean): Self = this.set("showNoResults", value.asInstanceOf[js.Any])
  }
  
}

