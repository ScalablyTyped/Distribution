package typings.semanticUiProgress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.ClassNameSettings._Impl, 'active'> */
@js.native
trait PickImplactiveActive extends js.Object {
  var active: String = js.native
}

object PickImplactiveActive {
  @scala.inline
  def apply(active: String): PickImplactiveActive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplactiveActive]
  }
  @scala.inline
  implicit class PickImplactiveActiveOps[Self <: PickImplactiveActive] (val x: Self) extends AnyVal {
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
  }
  
}

