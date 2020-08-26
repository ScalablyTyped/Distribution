package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.DelaySettings._Impl, 'search'> */
@js.native
trait PickImplsearch extends js.Object {
  var search: Double = js.native
}

object PickImplsearch {
  @scala.inline
  def apply(search: Double): PickImplsearch = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsearch]
  }
  @scala.inline
  implicit class PickImplsearchOps[Self <: PickImplsearch] (val x: Self) extends AnyVal {
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
    def setSearch(value: Double): Self = this.set("search", value.asInstanceOf[js.Any])
  }
  
}

