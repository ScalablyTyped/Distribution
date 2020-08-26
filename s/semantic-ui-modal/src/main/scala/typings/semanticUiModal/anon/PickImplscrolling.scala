package typings.semanticUiModal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.Modal.ClassNameSettings._Impl, 'scrolling'> */
@js.native
trait PickImplscrolling extends js.Object {
  var scrolling: String = js.native
}

object PickImplscrolling {
  @scala.inline
  def apply(scrolling: String): PickImplscrolling = {
    val __obj = js.Dynamic.literal(scrolling = scrolling.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplscrolling]
  }
  @scala.inline
  implicit class PickImplscrollingOps[Self <: PickImplscrolling] (val x: Self) extends AnyVal {
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
    def setScrolling(value: String): Self = this.set("scrolling", value.asInstanceOf[js.Any])
  }
  
}

