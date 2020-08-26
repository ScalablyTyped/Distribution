package typings.semanticUiVisibility.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'refreshOnLoad'> */
@js.native
trait PickImplrefreshOnLoad extends js.Object {
  var refreshOnLoad: Boolean = js.native
}

object PickImplrefreshOnLoad {
  @scala.inline
  def apply(refreshOnLoad: Boolean): PickImplrefreshOnLoad = {
    val __obj = js.Dynamic.literal(refreshOnLoad = refreshOnLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrefreshOnLoad]
  }
  @scala.inline
  implicit class PickImplrefreshOnLoadOps[Self <: PickImplrefreshOnLoad] (val x: Self) extends AnyVal {
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
    def setRefreshOnLoad(value: Boolean): Self = this.set("refreshOnLoad", value.asInstanceOf[js.Any])
  }
  
}

