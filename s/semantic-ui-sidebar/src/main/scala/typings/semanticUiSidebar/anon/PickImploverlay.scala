package typings.semanticUiSidebar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ErrorSettings._Impl, 'overlay'> */
@js.native
trait PickImploverlay extends js.Object {
  var overlay: String = js.native
}

object PickImploverlay {
  @scala.inline
  def apply(overlay: String): PickImploverlay = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImploverlay]
  }
  @scala.inline
  implicit class PickImploverlayOps[Self <: PickImploverlay] (val x: Self) extends AnyVal {
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
    def setOverlay(value: String): Self = this.set("overlay", value.asInstanceOf[js.Any])
  }
  
}

