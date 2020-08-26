package typings.semanticUiVisibility.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'refreshOnResize'> */
@js.native
trait PickImplrefreshOnResize extends js.Object {
  var refreshOnResize: Boolean = js.native
}

object PickImplrefreshOnResize {
  @scala.inline
  def apply(refreshOnResize: Boolean): PickImplrefreshOnResize = {
    val __obj = js.Dynamic.literal(refreshOnResize = refreshOnResize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrefreshOnResize]
  }
  @scala.inline
  implicit class PickImplrefreshOnResizeOps[Self <: PickImplrefreshOnResize] (val x: Self) extends AnyVal {
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
    def setRefreshOnResize(value: Boolean): Self = this.set("refreshOnResize", value.asInstanceOf[js.Any])
  }
  
}

