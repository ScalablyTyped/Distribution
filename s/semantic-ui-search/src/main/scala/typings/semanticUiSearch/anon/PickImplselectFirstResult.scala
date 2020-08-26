package typings.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'selectFirstResult'> */
@js.native
trait PickImplselectFirstResult extends js.Object {
  var selectFirstResult: Boolean = js.native
}

object PickImplselectFirstResult {
  @scala.inline
  def apply(selectFirstResult: Boolean): PickImplselectFirstResult = {
    val __obj = js.Dynamic.literal(selectFirstResult = selectFirstResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplselectFirstResult]
  }
  @scala.inline
  implicit class PickImplselectFirstResultOps[Self <: PickImplselectFirstResult] (val x: Self) extends AnyVal {
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
    def setSelectFirstResult(value: Boolean): Self = this.set("selectFirstResult", value.asInstanceOf[js.Any])
  }
  
}

