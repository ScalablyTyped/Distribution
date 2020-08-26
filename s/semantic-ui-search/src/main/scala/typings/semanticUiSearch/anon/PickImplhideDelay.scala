package typings.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'hideDelay'> */
@js.native
trait PickImplhideDelay extends js.Object {
  var hideDelay: Double = js.native
}

object PickImplhideDelay {
  @scala.inline
  def apply(hideDelay: Double): PickImplhideDelay = {
    val __obj = js.Dynamic.literal(hideDelay = hideDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhideDelay]
  }
  @scala.inline
  implicit class PickImplhideDelayOps[Self <: PickImplhideDelay] (val x: Self) extends AnyVal {
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
    def setHideDelay(value: Double): Self = this.set("hideDelay", value.asInstanceOf[js.Any])
  }
  
}

