package typings.semanticUiPopup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'hoverable'> */
@js.native
trait PickImplhoverable extends js.Object {
  var hoverable: Boolean = js.native
}

object PickImplhoverable {
  @scala.inline
  def apply(hoverable: Boolean): PickImplhoverable = {
    val __obj = js.Dynamic.literal(hoverable = hoverable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhoverable]
  }
  @scala.inline
  implicit class PickImplhoverableOps[Self <: PickImplhoverable] (val x: Self) extends AnyVal {
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
    def setHoverable(value: Boolean): Self = this.set("hoverable", value.asInstanceOf[js.Any])
  }
  
}

