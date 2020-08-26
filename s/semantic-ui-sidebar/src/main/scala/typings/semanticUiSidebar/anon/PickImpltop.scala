package typings.semanticUiSidebar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ClassNameSettings._Impl, 'top'> */
@js.native
trait PickImpltop extends js.Object {
  var top: String = js.native
}

object PickImpltop {
  @scala.inline
  def apply(top: String): PickImpltop = {
    val __obj = js.Dynamic.literal(top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltop]
  }
  @scala.inline
  implicit class PickImpltopOps[Self <: PickImpltop] (val x: Self) extends AnyVal {
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
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

