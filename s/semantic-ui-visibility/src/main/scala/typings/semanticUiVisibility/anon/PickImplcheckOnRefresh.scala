package typings.semanticUiVisibility.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'checkOnRefresh'> */
@js.native
trait PickImplcheckOnRefresh extends js.Object {
  var checkOnRefresh: Boolean = js.native
}

object PickImplcheckOnRefresh {
  @scala.inline
  def apply(checkOnRefresh: Boolean): PickImplcheckOnRefresh = {
    val __obj = js.Dynamic.literal(checkOnRefresh = checkOnRefresh.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcheckOnRefresh]
  }
  @scala.inline
  implicit class PickImplcheckOnRefreshOps[Self <: PickImplcheckOnRefresh] (val x: Self) extends AnyVal {
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
    def setCheckOnRefresh(value: Boolean): Self = this.set("checkOnRefresh", value.asInstanceOf[js.Any])
  }
  
}

